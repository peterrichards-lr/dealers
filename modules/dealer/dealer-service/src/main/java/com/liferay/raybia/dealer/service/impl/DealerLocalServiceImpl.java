/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.raybia.dealer.service.impl;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.base.DealerLocalServiceBaseImpl;
import com.liferay.raybia.dealer.validator.DealerValidator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the dealer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.raybia.dealer.service.DealerLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Peter Richards
 * @see DealerLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.liferay.raybia.dealer.model.Dealer", service = AopService.class)
public class DealerLocalServiceImpl extends DealerLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.liferay.raybia.dealer.service.DealerLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.liferay.raybia.dealer.service.DealerLocalServiceUtil</code>.
	 */

	public Dealer addDealer(final long groupId, final Map<Locale, String> nameMap, final Map<Locale, String> streetMap,
			final Map<Locale, String> localityMap, final Map<Locale, String> stateMap, final String postalCode,
			final String emailAddress, final String phoneNumber, final Map<Locale, String> openingHoursMap,
			final BigDecimal latitude, final BigDecimal longitude, final ServiceContext serviceContext)
			throws PortalException {
		return addDealer(groupId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude, new Date(), serviceContext);
	}

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer addDealer(final long groupId, final Map<Locale, String> nameMap, final Map<Locale, String> streetMap,
			final Map<Locale, String> localityMap, final Map<Locale, String> stateMap, final String postalCode,
			final String emailAddress, final String phoneNumber, final Map<Locale, String> openingHoursMap,
			final BigDecimal latitude, final BigDecimal longitude, final Date displayDate,
			final ServiceContext serviceContext) throws PortalException {

		final int status = WorkflowConstants.STATUS_DRAFT;

		_dealerValidator.validate(nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude, status);

		final Group group = groupLocalService.getGroup(groupId);
		final long companyId = group.getCompanyId();
		final long userId = serviceContext.getUserId();
		final Date current = new Date();
		final long dealerId = counterLocalService.increment(getModelClassName());

		Dealer dealer = createDealer(dealerId);

		dealer.setCompanyId(companyId);
		dealer.setGroupId(groupId);
		dealer.setUserId(userId);

		final User user = userLocalService.fetchUser(userId);
		if (user != null) {
			dealer.setUserName(user.getFullName());
			dealer.setStatusByUserName(user.getFullName());
		}

		dealer.setCreateDate(serviceContext.getCreateDate(current));
		dealer.setModifiedDate(serviceContext.getModifiedDate(current));
		dealer.setNameMap(nameMap);
		dealer.setStreetMap(streetMap);
		dealer.setLocalityMap(localityMap);
		dealer.setStateMap(stateMap);
		dealer.setPostalCode(postalCode);
		dealer.setEmailAddress(emailAddress);
		dealer.setPhoneNumber(phoneNumber);
		dealer.setOpeningHoursMap(openingHoursMap);
		dealer.setLatitude(latitude);
		dealer.setLongitude(longitude);
		dealer.setDisplayDate(displayDate);

		dealer.setStatus(status);
		dealer.setStatusByUserId(userId);
		dealer.setStatusDate(serviceContext.getModifiedDate(null));

		dealer = super.addDealer(dealer);

		resourceLocalService.addResources(companyId, groupId, userId, Dealer.class.getName(), dealer.getDealerId(),
				false, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());

		// Asset
		updateAsset(userId, dealer, serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(),
				serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		WorkflowHandlerRegistryUtil.startWorkflowInstance(dealer.getCompanyId(), dealer.getGroupId(),
				dealer.getUserId(), Dealer.class.getName(), dealer.getPrimaryKey(), dealer, serviceContext);

		return dealer;
	}

	public Dealer updateDealer(final long dealerId, final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap, final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap, final String postalCode, final String emailAddress,
			final String phoneNumber, final Map<Locale, String> openingHoursMap, final ServiceContext serviceContext)
			throws PortalException {

		Dealer dealer = dealerPersistence.findByPrimaryKey(dealerId);

		return updateDealer(dealerId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, dealer.getLatitude(), dealer.getLongitude(), dealer.getDisplayDate(), serviceContext);
	}

	public Dealer updateDealer(final long dealerId, final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap, final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap, final String postalCode, final String emailAddress,
			final String phoneNumber, final Map<Locale, String> openingHoursMap, final BigDecimal latitude,
			final BigDecimal longitude, final ServiceContext serviceContext) throws PortalException {

		Dealer dealer = dealerPersistence.findByPrimaryKey(dealerId);

		return updateDealer(dealerId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude, dealer.getDisplayDate(), serviceContext);
	}

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer updateDealer(final long dealerId, final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap, final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap, final String postalCode, final String emailAddress,
			final String phoneNumber, final Map<Locale, String> openingHoursMap, final BigDecimal latitude,
			final BigDecimal longitude, final Date displayDate, final ServiceContext serviceContext)
			throws PortalException {

		final long userId = serviceContext.getUserId();

		Dealer dealer = getDealer(dealerId);

		int status = dealer.getStatus();

		if (!dealer.isPending() && !dealer.isDraft()) {
			status = WorkflowConstants.STATUS_DRAFT;
		}

		_dealerValidator.validate(nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude, status);

		dealer.setModifiedDate(new Date());
		dealer.setNameMap(nameMap);
		dealer.setStreetMap(streetMap);
		dealer.setLocalityMap(localityMap);
		dealer.setStateMap(stateMap);
		dealer.setPostalCode(postalCode);
		dealer.setEmailAddress(emailAddress);
		dealer.setPhoneNumber(phoneNumber);
		dealer.setOpeningHoursMap(openingHoursMap);
		dealer.setLatitude(latitude);
		dealer.setLongitude(longitude);
		dealer.setStatus(status);

		dealer = super.updateDealer(dealer);

		// Asset

		updateAsset(userId, dealer, serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(),
				serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		WorkflowHandlerRegistryUtil.startWorkflowInstance(dealer.getCompanyId(), dealer.getGroupId(), userId,
				Dealer.class.getName(), dealer.getDealerId(), dealer, serviceContext);

		return dealer;
	}

	@Override
	public void updateAsset(long userId, Dealer entry, long[] assetCategoryIds, String[] assetTagNames,
			long[] assetLinkEntryIds, Double priority) throws PortalException {

		boolean visible = false;

		if (entry.isApproved()) {
			visible = true;
		}

		String summary = HtmlUtil.extractText(StringUtil.shorten(entry.getState(), 500));

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, entry.getGroupId(), entry.getCreateDate(),
				entry.getModifiedDate(), Dealer.class.getName(), entry.getDealerId(), entry.getUuid(), 0,
				assetCategoryIds, assetTagNames, true, visible, null, null, null, null, ContentTypes.TEXT_HTML,
				entry.getName(), null, summary, null, null, 0, 0, priority);

		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), assetLinkEntryIds,
				AssetLinkConstants.TYPE_RELATED);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Dealer updateStatus(long userId, long dealerId, int status, ServiceContext serviceContext,
			Map<String, Serializable> workflowContext) throws PortalException {

		User user = userLocalService.getUser(userId);
		Date now = new Date();

		Dealer dealer = dealerPersistence.findByPrimaryKey(dealerId);

		_dealerValidator.validate(dealer.getNameMap(), dealer.getStreetMap(), dealer.getLocalityMap(),
				dealer.getStateMap(), dealer.getPostalCode(), dealer.getEmailAddress(), dealer.getPhoneNumber(),
				dealer.getOpeningHoursMap(), dealer.getLatitude(), dealer.getLongitude(), status);

		dealer.setStatus(status);
		dealer.setStatusByUserId(user.getUserId());
		dealer.setStatusByUserName(user.getFullName());
		dealer.setStatusDate(serviceContext.getModifiedDate(now));

		if (status == WorkflowConstants.STATUS_APPROVED) {

			assetEntryLocalService.updateEntry(Dealer.class.getName(), dealerId, dealer.getDisplayDate(), null, true,
					true);
		}

		else {

			assetEntryLocalService.updateVisible(Dealer.class.getName(), dealerId, false);
		}

		return dealer;
	}

	@Indexable(type = IndexableType.DELETE)
	public Dealer deleteDealer(Dealer dealer) throws PortalException {

		resourceLocalService.deleteResource(dealer, ResourceConstants.SCOPE_INDIVIDUAL);

		// Asset

		assetEntryLocalService.deleteEntry(BlogsEntry.class.getName(), dealer.getDealerId());

		workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(dealer.getCompanyId(), dealer.getGroupId(),
				Dealer.class.getName(), dealer.getDealerId());

		return super.deleteDealer(dealer);
	}

	public List<Dealer> getDealersByGroupId(long groupId) {

		return dealerPersistence.findByGroupId(groupId);
	}

	public List<Dealer> getDealersByGroupId(long groupId, int start, int end) {

		return dealerPersistence.findByGroupId(groupId, start, end);
	}

	public List<Dealer> getDealersByGroupId(long groupId, int start, int end,
			OrderByComparator<Dealer> orderByComparator) {

		return dealerPersistence.findByGroupId(groupId, start, end, orderByComparator);
	}

	public List<Dealer> getDealersByKeywords(long groupId, String keywords, int start, int end,
			OrderByComparator<Dealer> orderByComparator) {

		return dealerLocalService.dynamicQuery(getKeywordSearchDynamicQuery(groupId, keywords), start, end,
				orderByComparator);
	}

	public long getDealersCountByKeywords(long groupId, String keywords) {
		return dealerLocalService.dynamicQueryCount(getKeywordSearchDynamicQuery(groupId, keywords));
	}

	private DynamicQuery getKeywordSearchDynamicQuery(long groupId, String keywords) {

		DynamicQuery dynamicQuery = dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery = RestrictionsFactoryUtil.disjunction();

			disjunctionQuery.add(RestrictionsFactoryUtil.like("name", "%" + keywords + "%"));
			dynamicQuery.add(disjunctionQuery);
		}

		return dynamicQuery;
	}

	@Override
	public Dealer addDealer(Dealer dealer) {
		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		throw new UnsupportedOperationException("Not supported.");
	}

	@Reference
	private DealerValidator _dealerValidator;

	private static final Logger _logger = LoggerFactory.getLogger(DealerLocalServiceImpl.class);
}