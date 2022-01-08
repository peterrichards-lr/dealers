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
import com.liferay.raybia.dealer.model.Dealer;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dealer service. This utility wraps <code>com.liferay.raybia.dealer.service.persistence.impl.DealerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Peter Richards
 * @see DealerPersistence
 * @generated
 */
public class DealerUtil {

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
	public static void clearCache(Dealer dealer) {
		getPersistence().clearCache(dealer);
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
	public static Map<Serializable, Dealer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Dealer> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dealer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dealer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Dealer update(Dealer dealer) {
		return getPersistence().update(dealer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Dealer update(Dealer dealer, ServiceContext serviceContext) {
		return getPersistence().update(dealer, serviceContext);
	}

	/**
	 * Returns all the dealers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dealers
	 */
	public static List<Dealer> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the dealers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByUuid_First(
			String uuid, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUuid_First(
		String uuid, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByUuid_Last(
			String uuid, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUuid_Last(
		String uuid, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where uuid = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByUuid_PrevAndNext(
			long dealerId, String uuid,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_PrevAndNext(
			dealerId, uuid, orderByComparator);
	}

	/**
	 * Removes all the dealers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of dealers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dealers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDealerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByUUID_G(String uuid, long groupId)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the dealer where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dealer that was removed
	 */
	public static Dealer removeByUUID_G(String uuid, long groupId)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of dealers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dealers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dealers
	 */
	public static List<Dealer> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByUuid_C_PrevAndNext(
			long dealerId, String uuid, long companyId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByUuid_C_PrevAndNext(
			dealerId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the dealers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dealers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the dealers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dealers
	 */
	public static List<Dealer> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByGroupId_First(
			long groupId, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByGroupId_First(
		long groupId, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByGroupId_Last(
			long groupId, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByGroupId_Last(
		long groupId, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByGroupId_PrevAndNext(
			long dealerId, long groupId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByGroupId_PrevAndNext(
			dealerId, groupId, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByGroupId_PrevAndNext(
			long dealerId, long groupId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			dealerId, groupId, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of dealers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dealers
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the dealers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dealers
	 */
	public static List<Dealer> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByCompanyId_First(
			long companyId, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByCompanyId_First(
		long companyId, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByCompanyId_Last(
			long companyId, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByCompanyId_Last(
		long companyId, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByCompanyId_PrevAndNext(
			long dealerId, long companyId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByCompanyId_PrevAndNext(
			dealerId, companyId, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of dealers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dealers
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_LtD(long groupId, Date displayDate) {
		return getPersistence().findByG_LtD(groupId, displayDate);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end) {

		return getPersistence().findByG_LtD(groupId, displayDate, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_LtD(
			groupId, displayDate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_LtD(
			groupId, displayDate, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_First(
			long groupId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_First(
			groupId, displayDate, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_First(
		long groupId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_First(
			groupId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_Last(
			long groupId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_Last(
			groupId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_Last(
		long groupId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_Last(
			groupId, displayDate, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_LtD_PrevAndNext(
			long dealerId, long groupId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_PrevAndNext(
			dealerId, groupId, displayDate, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate) {

		return getPersistence().filterFindByG_LtD(groupId, displayDate);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate, int start, int end) {

		return getPersistence().filterFindByG_LtD(
			groupId, displayDate, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_LtD(
			groupId, displayDate, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_LtD_PrevAndNext(
			long dealerId, long groupId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_LtD_PrevAndNext(
			dealerId, groupId, displayDate, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 */
	public static void removeByG_LtD(long groupId, Date displayDate) {
		getPersistence().removeByG_LtD(groupId, displayDate);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public static int countByG_LtD(long groupId, Date displayDate) {
		return getPersistence().countByG_LtD(groupId, displayDate);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_LtD(long groupId, Date displayDate) {
		return getPersistence().filterCountByG_LtD(groupId, displayDate);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_S_First(
			long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_S_First(
		long groupId, int status, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_S_Last(
			long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_S_Last(
		long groupId, int status, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_S_PrevAndNext(
			long dealerId, long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_S_PrevAndNext(
			dealerId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_S(long groupId, int status) {
		return getPersistence().filterFindByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_S_PrevAndNext(
			long dealerId, long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_S_PrevAndNext(
			dealerId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_NotS(long groupId, int status) {
		return getPersistence().findByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_NotS_First(
			long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_NotS_First(
		long groupId, int status, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_NotS_Last(
			long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_NotS_Last(
		long groupId, int status, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_NotS_PrevAndNext(
			long dealerId, long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_NotS_PrevAndNext(
			dealerId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_NotS(long groupId, int status) {
		return getPersistence().filterFindByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_NotS_PrevAndNext(
			long dealerId, long groupId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_NotS_PrevAndNext(
			dealerId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_NotS(long groupId, int status) {
		getPersistence().removeByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_NotS(long groupId, int status) {
		return getPersistence().countByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_NotS(long groupId, int status) {
		return getPersistence().filterCountByG_NotS(groupId, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_U(long companyId, long userId) {
		return getPersistence().findByC_U(companyId, userId);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_U(
		long companyId, long userId, int start, int end) {

		return getPersistence().findByC_U(companyId, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U(
		long companyId, long userId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_U(
			companyId, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U(
		long companyId, long userId, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_U(
			companyId, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_First(
			long companyId, long userId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_First(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_First(
		long companyId, long userId,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_First(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_Last(
			long companyId, long userId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_Last(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_Last(
		long companyId, long userId,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_Last(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_U_PrevAndNext(
			long dealerId, long companyId, long userId,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_PrevAndNext(
			dealerId, companyId, userId, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 */
	public static void removeByC_U(long companyId, long userId) {
		getPersistence().removeByC_U(companyId, userId);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching dealers
	 */
	public static int countByC_U(long companyId, long userId) {
		return getPersistence().countByC_U(companyId, userId);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_LtD(long companyId, Date displayDate) {
		return getPersistence().findByC_LtD(companyId, displayDate);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end) {

		return getPersistence().findByC_LtD(companyId, displayDate, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_LtD(
			companyId, displayDate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_LtD(
			companyId, displayDate, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_First(
			long companyId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_First(
			companyId, displayDate, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_First(
		long companyId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_First(
			companyId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_Last(
			long companyId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_Last(
			companyId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_Last(
		long companyId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_Last(
			companyId, displayDate, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_LtD_PrevAndNext(
			long dealerId, long companyId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_PrevAndNext(
			dealerId, companyId, displayDate, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 */
	public static void removeByC_LtD(long companyId, Date displayDate) {
		getPersistence().removeByC_LtD(companyId, displayDate);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public static int countByC_LtD(long companyId, Date displayDate) {
		return getPersistence().countByC_LtD(companyId, displayDate);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_S(long companyId, int status) {
		return getPersistence().findByC_S(companyId, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_S(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_S(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_S_First(
			long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_S_Last(
			long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_S_PrevAndNext(
			long dealerId, long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_S_PrevAndNext(
			dealerId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_NotS(long companyId, int status) {
		return getPersistence().findByC_NotS(companyId, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_NotS(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_NotS_First(
			long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_NotS_First(
		long companyId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_NotS_Last(
			long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_NotS_Last(
		long companyId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_NotS_PrevAndNext(
			long dealerId, long companyId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_NotS_PrevAndNext(
			dealerId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_NotS(long companyId, int status) {
		getPersistence().removeByC_NotS(companyId, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_NotS(long companyId, int status) {
		return getPersistence().countByC_NotS(companyId, status);
	}

	/**
	 * Returns all the dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByLtD_S(Date displayDate, int status) {
		return getPersistence().findByLtD_S(displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end) {

		return getPersistence().findByLtD_S(displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByLtD_S(
			displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByLtD_S(
			displayDate, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByLtD_S_First(
			Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByLtD_S_First(
			displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByLtD_S_First(
		Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByLtD_S_First(
			displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByLtD_S_Last(
			Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByLtD_S_Last(
			displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByLtD_S_Last(
		Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByLtD_S_Last(
			displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByLtD_S_PrevAndNext(
			long dealerId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByLtD_S_PrevAndNext(
			dealerId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByLtD_S(Date displayDate, int status) {
		getPersistence().removeByLtD_S(displayDate, status);
	}

	/**
	 * Returns the number of dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByLtD_S(Date displayDate, int status) {
		return getPersistence().countByLtD_S(displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate) {

		return getPersistence().findByG_U_LtD(groupId, userId, displayDate);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end) {

		return getPersistence().findByG_U_LtD(
			groupId, userId, displayDate, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_LtD(
			groupId, userId, displayDate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_U_LtD(
			groupId, userId, displayDate, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_First(
			long groupId, long userId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_First(
			groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_First(
		long groupId, long userId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_First(
			groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_Last(
			long groupId, long userId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_Last(
			groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_Last(
		long groupId, long userId, Date displayDate,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_Last(
			groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_U_LtD_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_PrevAndNext(
			dealerId, groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate) {

		return getPersistence().filterFindByG_U_LtD(
			groupId, userId, displayDate);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end) {

		return getPersistence().filterFindByG_U_LtD(
			groupId, userId, displayDate, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_LtD(
			groupId, userId, displayDate, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_U_LtD_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_U_LtD_PrevAndNext(
			dealerId, groupId, userId, displayDate, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 */
	public static void removeByG_U_LtD(
		long groupId, long userId, Date displayDate) {

		getPersistence().removeByG_U_LtD(groupId, userId, displayDate);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public static int countByG_U_LtD(
		long groupId, long userId, Date displayDate) {

		return getPersistence().countByG_U_LtD(groupId, userId, displayDate);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_LtD(
		long groupId, long userId, Date displayDate) {

		return getPersistence().filterCountByG_U_LtD(
			groupId, userId, displayDate);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_S_First(
			long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_S_First(
		long groupId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_S_Last(
			long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_S_Last(
		long groupId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_U_S_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_S_PrevAndNext(
			dealerId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_U_S_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_U_S_PrevAndNext(
			dealerId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterFindByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().findByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching dealers
	 */
	public static int countByG_U_S(long groupId, long userId, int[] statuses) {
		return getPersistence().countByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterCountByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_NotS_First(
			long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_NotS_Last(
			long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_U_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_NotS_PrevAndNext(
			dealerId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_U_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_U_NotS_PrevAndNext(
			dealerId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_NotS(long groupId, long userId, int status) {
		getPersistence().removeByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_U_NotS(long groupId, long userId, int status) {
		return getPersistence().countByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().findByG_D_S(groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByG_D_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_D_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_D_S(
			groupId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_D_S_First(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_D_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_D_S_First(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_D_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_D_S_Last(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_D_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_D_S_Last(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_D_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_D_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_D_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterFindByG_D_S(groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().filterFindByG_D_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_D_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_D_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_D_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_D_S(
		long groupId, Date displayDate, int status) {

		getPersistence().removeByG_D_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_D_S(long groupId, Date displayDate, int status) {
		return getPersistence().countByG_D_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_D_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterCountByG_D_S(
			groupId, displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().findByG_GtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByG_GtD_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_GtD_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_GtD_S(
			groupId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_GtD_S_First(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_GtD_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_GtD_S_First(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_GtD_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_GtD_S_Last(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_GtD_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_GtD_S_Last(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_GtD_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_GtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_GtD_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterFindByG_GtD_S(
			groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().filterFindByG_GtD_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_GtD_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_GtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_GtD_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_GtD_S(
		long groupId, Date displayDate, int status) {

		getPersistence().removeByG_GtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_GtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().countByG_GtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_GtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterCountByG_GtD_S(
			groupId, displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().findByG_LtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByG_LtD_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_LtD_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_LtD_S(
			groupId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_S_First(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_S_First(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_S_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_S_Last(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_S_Last(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_S_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_LtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterFindByG_LtD_S(
			groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().filterFindByG_LtD_S(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_LtD_S(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_LtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_LtD_S_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_LtD_S(
		long groupId, Date displayDate, int status) {

		getPersistence().removeByG_LtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_LtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().countByG_LtD_S(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_LtD_S(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterCountByG_LtD_S(
			groupId, displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status) {

		return getPersistence().findByG_LtD_NotS(groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByG_LtD_NotS(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_LtD_NotS(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_LtD_NotS(
			groupId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_NotS_First(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_NotS_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_NotS_First(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_NotS_First(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_LtD_NotS_Last(
			long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_NotS_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_LtD_NotS_Last(
		long groupId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_LtD_NotS_Last(
			groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_LtD_NotS_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterFindByG_LtD_NotS(
			groupId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end) {

		return getPersistence().filterFindByG_LtD_NotS(
			groupId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_LtD_NotS(
			groupId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_LtD_NotS_PrevAndNext(
			dealerId, groupId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_LtD_NotS(
		long groupId, Date displayDate, int status) {

		getPersistence().removeByG_LtD_NotS(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_LtD_NotS(
		long groupId, Date displayDate, int status) {

		return getPersistence().countByG_LtD_NotS(groupId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_LtD_NotS(
		long groupId, Date displayDate, int status) {

		return getPersistence().filterCountByG_LtD_NotS(
			groupId, displayDate, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_U_S(
		long companyId, long userId, int status) {

		return getPersistence().findByC_U_S(companyId, userId, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end) {

		return getPersistence().findByC_U_S(
			companyId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_U_S(
			companyId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_U_S(
			companyId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_S_First(
			long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_S_First(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_S_First(
		long companyId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_S_First(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_S_Last(
			long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_S_Last(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_S_Last(
		long companyId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_S_Last(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_U_S_PrevAndNext(
			long dealerId, long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_S_PrevAndNext(
			dealerId, companyId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByC_U_S(long companyId, long userId, int status) {
		getPersistence().removeByC_U_S(companyId, userId, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_U_S(long companyId, long userId, int status) {
		return getPersistence().countByC_U_S(companyId, userId, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status) {

		return getPersistence().findByC_U_NotS(companyId, userId, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end) {

		return getPersistence().findByC_U_NotS(
			companyId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_U_NotS(
			companyId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_U_NotS(
			companyId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_NotS_First(
			long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_NotS_First(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_NotS_First(
		long companyId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_NotS_First(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_U_NotS_Last(
			long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_NotS_Last(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_U_NotS_Last(
		long companyId, long userId, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_U_NotS_Last(
			companyId, userId, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_U_NotS_PrevAndNext(
			long dealerId, long companyId, long userId, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_U_NotS_PrevAndNext(
			dealerId, companyId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByC_U_NotS(
		long companyId, long userId, int status) {

		getPersistence().removeByC_U_NotS(companyId, userId, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_U_NotS(long companyId, long userId, int status) {
		return getPersistence().countByC_U_NotS(companyId, userId, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status) {

		return getPersistence().findByC_LtD_S(companyId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByC_LtD_S(
			companyId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_LtD_S(
			companyId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_LtD_S(
			companyId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_S_First(
			long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_S_First(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_S_First(
		long companyId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_S_First(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_S_Last(
			long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_S_Last(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_S_Last(
		long companyId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_S_Last(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_LtD_S_PrevAndNext(
			long dealerId, long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_S_PrevAndNext(
			dealerId, companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByC_LtD_S(
		long companyId, Date displayDate, int status) {

		getPersistence().removeByC_LtD_S(companyId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_LtD_S(
		long companyId, Date displayDate, int status) {

		return getPersistence().countByC_LtD_S(companyId, displayDate, status);
	}

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status) {

		return getPersistence().findByC_LtD_NotS(
			companyId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end) {

		return getPersistence().findByC_LtD_NotS(
			companyId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByC_LtD_NotS(
			companyId, displayDate, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end,
		OrderByComparator<Dealer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_LtD_NotS(
			companyId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_NotS_First(
			long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_NotS_First(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_NotS_First(
		long companyId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_NotS_First(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByC_LtD_NotS_Last(
			long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_NotS_Last(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByC_LtD_NotS_Last(
		long companyId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByC_LtD_NotS_Last(
			companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByC_LtD_NotS_PrevAndNext(
			long dealerId, long companyId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByC_LtD_NotS_PrevAndNext(
			dealerId, companyId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByC_LtD_NotS(
		long companyId, Date displayDate, int status) {

		getPersistence().removeByC_LtD_NotS(companyId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByC_LtD_NotS(
		long companyId, Date displayDate, int status) {

		return getPersistence().countByC_LtD_NotS(
			companyId, displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().findByG_U_LtD_S(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end) {

		return getPersistence().findByG_U_LtD_S(
			groupId, userId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_LtD_S(
			groupId, userId, displayDate, status, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_LtD_S(
			groupId, userId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_S_First(
			long groupId, long userId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_S_First(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_S_First(
		long groupId, long userId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_S_First(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_S_Last(
			long groupId, long userId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_S_Last(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_S_Last(
		long groupId, long userId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_S_Last(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_U_LtD_S_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_S_PrevAndNext(
			dealerId, groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().filterFindByG_U_LtD_S(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end) {

		return getPersistence().filterFindByG_U_LtD_S(
			groupId, userId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_LtD_S(
			groupId, userId, displayDate, status, start, end,
			orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_U_LtD_S_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_U_LtD_S_PrevAndNext(
			dealerId, groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status) {

		getPersistence().removeByG_U_LtD_S(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().countByG_U_LtD_S(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().filterCountByG_U_LtD_S(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().findByG_U_LtD_NotS(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end) {

		return getPersistence().findByG_U_LtD_NotS(
			groupId, userId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findByG_U_LtD_NotS(
			groupId, userId, displayDate, status, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dealers
	 */
	public static List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_LtD_NotS(
			groupId, userId, displayDate, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_NotS_First(
			long groupId, long userId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_NotS_First(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_NotS_First(
		long groupId, long userId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_NotS_First(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public static Dealer findByG_U_LtD_NotS_Last(
			long groupId, long userId, Date displayDate, int status,
			OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_NotS_Last(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchByG_U_LtD_NotS_Last(
		long groupId, long userId, Date displayDate, int status,
		OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().fetchByG_U_LtD_NotS_Last(
			groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] findByG_U_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByG_U_LtD_NotS_PrevAndNext(
			dealerId, groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().filterFindByG_U_LtD_NotS(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns a range of all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end) {

		return getPersistence().filterFindByG_U_LtD_NotS(
			groupId, userId, displayDate, status, start, end);
	}

	/**
	 * Returns an ordered range of all the dealers that the user has permissions to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dealers that the user has permission to view
	 */
	public static List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().filterFindByG_U_LtD_NotS(
			groupId, userId, displayDate, status, start, end,
			orderByComparator);
	}

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer[] filterFindByG_U_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status, OrderByComparator<Dealer> orderByComparator)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().filterFindByG_U_LtD_NotS_PrevAndNext(
			dealerId, groupId, userId, displayDate, status, orderByComparator);
	}

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public static void removeByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status) {

		getPersistence().removeByG_U_LtD_NotS(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public static int countByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().countByG_U_LtD_NotS(
			groupId, userId, displayDate, status);
	}

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public static int filterCountByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status) {

		return getPersistence().filterCountByG_U_LtD_NotS(
			groupId, userId, displayDate, status);
	}

	/**
	 * Caches the dealer in the entity cache if it is enabled.
	 *
	 * @param dealer the dealer
	 */
	public static void cacheResult(Dealer dealer) {
		getPersistence().cacheResult(dealer);
	}

	/**
	 * Caches the dealers in the entity cache if it is enabled.
	 *
	 * @param dealers the dealers
	 */
	public static void cacheResult(List<Dealer> dealers) {
		getPersistence().cacheResult(dealers);
	}

	/**
	 * Creates a new dealer with the primary key. Does not add the dealer to the database.
	 *
	 * @param dealerId the primary key for the new dealer
	 * @return the new dealer
	 */
	public static Dealer create(long dealerId) {
		return getPersistence().create(dealerId);
	}

	/**
	 * Removes the dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer that was removed
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer remove(long dealerId)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().remove(dealerId);
	}

	public static Dealer updateImpl(Dealer dealer) {
		return getPersistence().updateImpl(dealer);
	}

	/**
	 * Returns the dealer with the primary key or throws a <code>NoSuchDealerException</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public static Dealer findByPrimaryKey(long dealerId)
		throws com.liferay.raybia.dealer.exception.NoSuchDealerException {

		return getPersistence().findByPrimaryKey(dealerId);
	}

	/**
	 * Returns the dealer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer, or <code>null</code> if a dealer with the primary key could not be found
	 */
	public static Dealer fetchByPrimaryKey(long dealerId) {
		return getPersistence().fetchByPrimaryKey(dealerId);
	}

	/**
	 * Returns all the dealers.
	 *
	 * @return the dealers
	 */
	public static List<Dealer> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of dealers
	 */
	public static List<Dealer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dealers
	 */
	public static List<Dealer> findAll(
		int start, int end, OrderByComparator<Dealer> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dealers
	 */
	public static List<Dealer> findAll(
		int start, int end, OrderByComparator<Dealer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dealers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dealers.
	 *
	 * @return the number of dealers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DealerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DealerPersistence, DealerPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DealerPersistence.class);

		ServiceTracker<DealerPersistence, DealerPersistence> serviceTracker =
			new ServiceTracker<DealerPersistence, DealerPersistence>(
				bundle.getBundleContext(), DealerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}