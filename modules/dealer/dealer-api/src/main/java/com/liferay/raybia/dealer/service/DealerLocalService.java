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

package com.liferay.raybia.dealer.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.raybia.dealer.model.Dealer;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Dealer. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Peter Richards
 * @see DealerLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DealerLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.raybia.dealer.service.impl.DealerLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the dealer local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link DealerLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the dealer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Dealer addDealer(Dealer dealer);

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer addDealer(
			long groupId, Map<Locale, String> nameMap,
			Map<Locale, String> streetMap, Map<Locale, String> localityMap,
			Map<Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<Locale, String> openingHoursMap, BigDecimal latitude,
			BigDecimal longitude, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new dealer with the primary key. Does not add the dealer to the database.
	 *
	 * @param dealerId the primary key for the new dealer
	 * @return the new dealer
	 */
	@Transactional(enabled = false)
	public Dealer createDealer(long dealerId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the dealer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was removed
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.DELETE)
	public Dealer deleteDealer(Dealer dealer) throws PortalException;

	/**
	 * Deletes the dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer that was removed
	 * @throws PortalException if a dealer with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Dealer deleteDealer(long dealerId) throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dealer fetchDealer(long dealerId);

	/**
	 * Returns the dealer matching the UUID and group.
	 *
	 * @param uuid the dealer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dealer fetchDealerByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the dealer with the primary key.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer
	 * @throws PortalException if a dealer with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dealer getDealer(long dealerId) throws PortalException;

	/**
	 * Returns the dealer matching the UUID and group.
	 *
	 * @param uuid the dealer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dealer
	 * @throws PortalException if a matching dealer could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dealer getDealerByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of dealers
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealers(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByGroupId(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Dealer> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Dealer> orderByComparator);

	/**
	 * Returns all the dealers matching the UUID and company.
	 *
	 * @param uuid the UUID of the dealers
	 * @param companyId the primary key of the company
	 * @return the matching dealers, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of dealers matching the UUID and company.
	 *
	 * @param uuid the UUID of the dealers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dealers, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator);

	/**
	 * Returns the number of dealers.
	 *
	 * @return the number of dealers
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDealersCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getDealersCountByKeywords(long groupId, String keywords);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the dealer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Dealer updateDealer(Dealer dealer);

	@Indexable(type = IndexableType.REINDEX)
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public Dealer updateDealer(
			long dealerId, Map<Locale, String> nameMap,
			Map<Locale, String> streetMap, Map<Locale, String> localityMap,
			Map<Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<Locale, String> openingHoursMap, BigDecimal latitude,
			BigDecimal longitude, ServiceContext serviceContext)
		throws PortalException;

}