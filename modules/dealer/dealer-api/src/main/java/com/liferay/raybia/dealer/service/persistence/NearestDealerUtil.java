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

package com.liferay.raybia.dealer.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.raybia.dealer.model.NearestDealer;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the nearest dealer service. This utility wraps <code>com.liferay.raybia.dealer.service.persistence.impl.NearestDealerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Peter Richards
 * @see NearestDealerPersistence
 * @generated
 */
public class NearestDealerUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(NearestDealer nearestDealer) {
		getPersistence().clearCache(nearestDealer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, NearestDealer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NearestDealer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NearestDealer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NearestDealer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NearestDealer> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NearestDealer update(NearestDealer nearestDealer) {
		return getPersistence().update(nearestDealer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NearestDealer update(
		NearestDealer nearestDealer, ServiceContext serviceContext) {

		return getPersistence().update(nearestDealer, serviceContext);
	}

	/**
	 * Caches the nearest dealer in the entity cache if it is enabled.
	 *
	 * @param nearestDealer the nearest dealer
	 */
	public static void cacheResult(NearestDealer nearestDealer) {
		getPersistence().cacheResult(nearestDealer);
	}

	/**
	 * Caches the nearest dealers in the entity cache if it is enabled.
	 *
	 * @param nearestDealers the nearest dealers
	 */
	public static void cacheResult(List<NearestDealer> nearestDealers) {
		getPersistence().cacheResult(nearestDealers);
	}

	/**
	 * Creates a new nearest dealer with the primary key. Does not add the nearest dealer to the database.
	 *
	 * @param dealerId the primary key for the new nearest dealer
	 * @return the new nearest dealer
	 */
	public static NearestDealer create(long dealerId) {
		return getPersistence().create(dealerId);
	}

	/**
	 * Removes the nearest dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer that was removed
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	public static NearestDealer remove(long dealerId)
		throws com.liferay.raybia.dealer.exception.
			NoSuchNearestDealerException {

		return getPersistence().remove(dealerId);
	}

	public static NearestDealer updateImpl(NearestDealer nearestDealer) {
		return getPersistence().updateImpl(nearestDealer);
	}

	/**
	 * Returns the nearest dealer with the primary key or throws a <code>NoSuchNearestDealerException</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	public static NearestDealer findByPrimaryKey(long dealerId)
		throws com.liferay.raybia.dealer.exception.
			NoSuchNearestDealerException {

		return getPersistence().findByPrimaryKey(dealerId);
	}

	/**
	 * Returns the nearest dealer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer, or <code>null</code> if a nearest dealer with the primary key could not be found
	 */
	public static NearestDealer fetchByPrimaryKey(long dealerId) {
		return getPersistence().fetchByPrimaryKey(dealerId);
	}

	/**
	 * Returns all the nearest dealers.
	 *
	 * @return the nearest dealers
	 */
	public static List<NearestDealer> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @return the range of nearest dealers
	 */
	public static List<NearestDealer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nearest dealers
	 */
	public static List<NearestDealer> findAll(
		int start, int end,
		OrderByComparator<NearestDealer> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of nearest dealers
	 */
	public static List<NearestDealer> findAll(
		int start, int end, OrderByComparator<NearestDealer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the nearest dealers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of nearest dealers.
	 *
	 * @return the number of nearest dealers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NearestDealerPersistence getPersistence() {
		return _persistence;
	}

	private static volatile NearestDealerPersistence _persistence;

}