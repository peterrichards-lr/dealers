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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NearestDealerLocalService}.
 *
 * @author Peter Richards
 * @see NearestDealerLocalService
 * @generated
 */
public class NearestDealerLocalServiceWrapper
	implements NearestDealerLocalService,
			   ServiceWrapper<NearestDealerLocalService> {

	public NearestDealerLocalServiceWrapper(
		NearestDealerLocalService nearestDealerLocalService) {

		_nearestDealerLocalService = nearestDealerLocalService;
	}

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
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer addNearestDealer(
		com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return _nearestDealerLocalService.addNearestDealer(nearestDealer);
	}

	/**
	 * Creates a new nearest dealer with the primary key. Does not add the nearest dealer to the database.
	 *
	 * @param dealerId the primary key for the new nearest dealer
	 * @return the new nearest dealer
	 */
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer createNearestDealer(
		long dealerId) {

		return _nearestDealerLocalService.createNearestDealer(dealerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nearestDealerLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer deleteNearestDealer(
			long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nearestDealerLocalService.deleteNearestDealer(dealerId);
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
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer deleteNearestDealer(
		com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return _nearestDealerLocalService.deleteNearestDealer(nearestDealer);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nearestDealerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nearestDealerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _nearestDealerLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _nearestDealerLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _nearestDealerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _nearestDealerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _nearestDealerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.raybia.dealer.model.NearestDealer fetchNearestDealer(
		long dealerId) {

		return _nearestDealerLocalService.fetchNearestDealer(dealerId);
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistance(
				java.math.BigDecimal latitude, java.math.BigDecimal longitude,
				java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _nearestDealerLocalService.findByDistance(
			latitude, longitude, distance, distanceUnit, limit);
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistanceAndGroupId(
				long groupId, java.math.BigDecimal latitude,
				java.math.BigDecimal longitude, java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _nearestDealerLocalService.findByDistanceAndGroupId(
			groupId, latitude, longitude, distance, distanceUnit, limit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _nearestDealerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _nearestDealerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the nearest dealer with the primary key.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws PortalException if a nearest dealer with the primary key could not be found
	 */
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer getNearestDealer(
			long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nearestDealerLocalService.getNearestDealer(dealerId);
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
	@Override
	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
		getNearestDealers(int start, int end) {

		return _nearestDealerLocalService.getNearestDealers(start, end);
	}

	/**
	 * Returns the number of nearest dealers.
	 *
	 * @return the number of nearest dealers
	 */
	@Override
	public int getNearestDealersCount() {
		return _nearestDealerLocalService.getNearestDealersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _nearestDealerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _nearestDealerLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.raybia.dealer.model.NearestDealer updateNearestDealer(
		com.liferay.raybia.dealer.model.NearestDealer nearestDealer) {

		return _nearestDealerLocalService.updateNearestDealer(nearestDealer);
	}

	@Override
	public NearestDealerLocalService getWrappedService() {
		return _nearestDealerLocalService;
	}

	@Override
	public void setWrappedService(
		NearestDealerLocalService nearestDealerLocalService) {

		_nearestDealerLocalService = nearestDealerLocalService;
	}

	private NearestDealerLocalService _nearestDealerLocalService;

}