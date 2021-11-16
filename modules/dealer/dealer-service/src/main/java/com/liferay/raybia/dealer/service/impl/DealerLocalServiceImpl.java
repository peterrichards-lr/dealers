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
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.base.DealerLocalServiceBaseImpl;
import com.liferay.raybia.dealer.validator.DealerValidator;

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

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer addDealer(final long groupId, final Map<Locale, String> nameMap, final Map<Locale, String> streetMap,
			final Map<Locale, String> localityMap, final Map<Locale, String> stateMap, final String postalCode,
			final String emailAddress, final String phoneNumber, final Map<Locale, String> openingHoursMap,
			final BigDecimal latitude, final BigDecimal longitude, final ServiceContext serviceContext)
			throws PortalException {

		_dealerValidator.validate(nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude);

		final Group group = groupLocalService.getGroup(groupId);
		final long companyId = group.getCompanyId();
		final long userId = serviceContext.getUserId();

		final long dealerId = counterLocalService.increment(getModelClassName());

		final Date current = new Date();

		Dealer dealer = createDealer(dealerId);

		dealer.setCompanyId(companyId);
		dealer.setGroupId(groupId);
		dealer.setUserId(userId);

		final User user = userLocalService.fetchUser(userId);
		if (user != null) {
			dealer.setUserName(user.getFullName());
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

		dealer = super.addDealer(dealer);

		resourceLocalService.addResources(companyId, groupId, userId, Dealer.class.getName(), dealer.getDealerId(),
				false, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());

		return dealer;
	}

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer updateDealer(final long dealerId, final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap, final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap, final String postalCode, final String emailAddress,
			final String phoneNumber, final Map<Locale, String> openingHoursMap, final BigDecimal latitude,
			final BigDecimal longitude, final ServiceContext serviceContext) throws PortalException {

		_dealerValidator.validate(nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude);

		Dealer dealer = getDealer(dealerId);

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

		dealer = super.updateDealer(dealer);

		return dealer;
	}

	@Indexable(type = IndexableType.DELETE)
	public Dealer deleteDealer(Dealer dealer) throws PortalException {

		resourceLocalService.deleteResource(dealer, ResourceConstants.SCOPE_INDIVIDUAL);

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

	private static final Logger _log = LoggerFactory.getLogger(DealerLocalServiceImpl.class);
}