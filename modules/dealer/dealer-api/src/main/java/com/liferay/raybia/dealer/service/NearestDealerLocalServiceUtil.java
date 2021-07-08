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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for NearestDealer. This utility wraps
 * <code>com.liferay.raybia.dealer.service.impl.NearestDealerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Peter Richards
 * @see NearestDealerLocalService
 * @generated
 */
public class NearestDealerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.raybia.dealer.service.impl.NearestDealerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the nearest dealer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NearestDealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param nearestDealer the nearest dealer
	 * @return the nearest dealer that was added
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
		addNearestDealer(
			com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return getService().addNearestDealer(nearestDealer);
	}

	/**
	 * Creates a new nearest dealer with the primary key. Does not add the nearest dealer to the database.
	 *
	 * @param dealerId the primary key for the new nearest dealer
	 * @return the new nearest dealer
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
		createNearestDealer(long dealerId) {

		return getService().createNearestDealer(dealerId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the nearest dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NearestDealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer that was removed
	 * @throws PortalException if a nearest dealer with the primary key could not be found
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
			deleteNearestDealer(long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNearestDealer(dealerId);
	}

	/**
	 * Deletes the nearest dealer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NearestDealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param nearestDealer the nearest dealer
	 * @return the nearest dealer that was removed
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
		deleteNearestDealer(
			com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return getService().deleteNearestDealer(nearestDealer);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.raybia.dealer.model.NearestDealer
		fetchNearestDealer(long dealerId) {

		return getService().fetchNearestDealer(dealerId);
	}

	public static java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistance(
				java.math.BigDecimal latitude, java.math.BigDecimal longitude,
				java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().findByDistance(
			latitude, longitude, distance, distanceUnit, limit);
	}

	public static java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistanceAndGroupId(
				long groupId, java.math.BigDecimal latitude,
				java.math.BigDecimal longitude, java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().findByDistanceAndGroupId(
			groupId, latitude, longitude, distance, distanceUnit, limit);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the nearest dealer with the primary key.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws PortalException if a nearest dealer with the primary key could not be found
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
			getNearestDealer(long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNearestDealer(dealerId);
	}

	/**
	 * Returns a range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.raybia.dealer.model.impl.NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @return the range of nearest dealers
	 */
	public static java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
		getNearestDealers(int start, int end) {

		return getService().getNearestDealers(start, end);
	}

	/**
	 * Returns the number of nearest dealers.
	 *
	 * @return the number of nearest dealers
	 */
	public static int getNearestDealersCount() {
		return getService().getNearestDealersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the nearest dealer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NearestDealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param nearestDealer the nearest dealer
	 * @return the nearest dealer that was updated
	 */
	public static com.liferay.raybia.dealer.model.NearestDealer
		updateNearestDealer(
			com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return getService().updateNearestDealer(nearestDealer);
	}

	public static NearestDealerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NearestDealerLocalService, NearestDealerLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			NearestDealerLocalService.class);

		ServiceTracker<NearestDealerLocalService, NearestDealerLocalService>
			serviceTracker =
				new ServiceTracker
					<NearestDealerLocalService, NearestDealerLocalService>(
						bundle.getBundleContext(),
						NearestDealerLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}