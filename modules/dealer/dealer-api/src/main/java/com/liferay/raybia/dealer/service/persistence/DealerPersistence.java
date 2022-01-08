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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.raybia.dealer.exception.NoSuchDealerException;
import com.liferay.raybia.dealer.model.Dealer;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dealer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Peter Richards
 * @see DealerUtil
 * @generated
 */
@ProviderType
public interface DealerPersistence extends BasePersistence<Dealer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DealerUtil} to access the dealer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dealers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByUuid(String uuid);

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
	public java.util.List<Dealer> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Dealer> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where uuid = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer[] findByUuid_PrevAndNext(
			long dealerId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of dealers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dealers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDealerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByUUID_G(String uuid, long groupId)
		throws NoSuchDealerException;

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the dealer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the dealer where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dealer that was removed
	 */
	public Dealer removeByUUID_G(String uuid, long groupId)
		throws NoSuchDealerException;

	/**
	 * Returns the number of dealers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dealers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByUuid_C_PrevAndNext(
			long dealerId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of dealers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dealers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the dealers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByGroupId(long groupId);

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
	public java.util.List<Dealer> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Dealer> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where groupId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer[] findByGroupId_PrevAndNext(
			long dealerId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByGroupId(long groupId);

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
	public java.util.List<Dealer> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Dealer> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the dealers before and after the current dealer in the ordered set of dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer[] filterFindByGroupId_PrevAndNext(
			long dealerId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of dealers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dealers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the dealers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByCompanyId(long companyId);

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
	public java.util.List<Dealer> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<Dealer> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the dealers before and after the current dealer in the ordered set where companyId = &#63;.
	 *
	 * @param dealerId the primary key of the current dealer
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer[] findByCompanyId_PrevAndNext(
			long dealerId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of dealers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dealers
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_LtD(long groupId, Date displayDate);

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
	public java.util.List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end);

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
	public java.util.List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_LtD(
		long groupId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_LtD_First(
			long groupId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_First(
		long groupId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_LtD_Last(
			long groupId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_Last(
		long groupId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_LtD_PrevAndNext(
			long dealerId, long groupId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate);

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
	public java.util.List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_LtD(
		long groupId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_LtD_PrevAndNext(
			long dealerId, long groupId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 */
	public void removeByG_LtD(long groupId, Date displayDate);

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public int countByG_LtD(long groupId, Date displayDate);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_LtD(long groupId, Date displayDate);

	/**
	 * Returns all the dealers where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_S(long groupId, int status);

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
	public java.util.List<Dealer> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_S_PrevAndNext(
			long dealerId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_S(long groupId, int status);

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
	public java.util.List<Dealer> filterFindByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_S_PrevAndNext(
			long dealerId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_S(long groupId, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_NotS(long groupId, int status);

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
	public java.util.List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_NotS_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_NotS_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByG_NotS_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_NotS_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_NotS_PrevAndNext(
			long dealerId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_NotS(long groupId, int status);

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
	public java.util.List<Dealer> filterFindByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_NotS_PrevAndNext(
			long dealerId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_NotS(long groupId, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_NotS(long groupId, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_NotS(long groupId, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_U(long companyId, long userId);

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
	public java.util.List<Dealer> findByC_U(
		long companyId, long userId, int start, int end);

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
	public java.util.List<Dealer> findByC_U(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_U(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_U_First(
			long companyId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_U_Last(
			long companyId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_U_PrevAndNext(
			long dealerId, long companyId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 */
	public void removeByC_U(long companyId, long userId);

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching dealers
	 */
	public int countByC_U(long companyId, long userId);

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_LtD(long companyId, Date displayDate);

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
	public java.util.List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end);

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
	public java.util.List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_LtD(
		long companyId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_LtD_First(
			long companyId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_First(
		long companyId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_LtD_Last(
			long companyId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_Last(
		long companyId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_LtD_PrevAndNext(
			long dealerId, long companyId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 */
	public void removeByC_LtD(long companyId, Date displayDate);

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public int countByC_LtD(long companyId, Date displayDate);

	/**
	 * Returns all the dealers where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_S(long companyId, int status);

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
	public java.util.List<Dealer> findByC_S(
		long companyId, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_S_PrevAndNext(
			long dealerId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_NotS(long companyId, int status);

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
	public java.util.List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_NotS_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_NotS_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByC_NotS_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_NotS_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_NotS_PrevAndNext(
			long dealerId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_NotS(long companyId, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_NotS(long companyId, int status);

	/**
	 * Returns all the dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByLtD_S(Date displayDate, int status);

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
	public java.util.List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByLtD_S(
		Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByLtD_S_First(
			Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByLtD_S_First(
		Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

	/**
	 * Returns the last dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer
	 * @throws NoSuchDealerException if a matching dealer could not be found
	 */
	public Dealer findByLtD_S_Last(
			Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByLtD_S_Last(
		Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByLtD_S_PrevAndNext(
			long dealerId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByLtD_S(Date displayDate, int status);

	/**
	 * Returns the number of dealers where displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByLtD_S(Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate);

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
	public java.util.List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end);

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
	public java.util.List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_U_LtD_First(
			long groupId, long userId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_LtD_First(
		long groupId, long userId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_U_LtD_Last(
			long groupId, long userId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_LtD_Last(
		long groupId, long userId, Date displayDate,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_U_LtD_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate);

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
	public java.util.List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_U_LtD(
		long groupId, long userId, Date displayDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_U_LtD_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 */
	public void removeByG_U_LtD(long groupId, long userId, Date displayDate);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the number of matching dealers
	 */
	public int countByG_U_LtD(long groupId, long userId, Date displayDate);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_LtD(
		long groupId, long userId, Date displayDate);

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_U_S_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_U_S_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching dealers
	 */
	public int countByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_U_NotS_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_U_NotS_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_U_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_U_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_D_S_First(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_D_S_First(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_D_S_Last(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_D_S_Last(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_D_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_D_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_D_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_D_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_D_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_D_S(long groupId, Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_GtD_S_First(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_GtD_S_First(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_GtD_S_Last(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_GtD_S_Last(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_GtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_GtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_GtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_GtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_GtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &gt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_GtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_LtD_S_First(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_S_First(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_LtD_S_Last(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_S_Last(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_LtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_LtD_S(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_LtD_S_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_LtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_LtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_LtD_S(long groupId, Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_LtD_NotS_First(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_NotS_First(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_LtD_NotS_Last(
			long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByG_LtD_NotS_Last(
		long groupId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> filterFindByG_LtD_NotS(
		long groupId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_LtD_NotS(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_LtD_NotS(long groupId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_LtD_NotS(
		long groupId, Date displayDate, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_U_S(
		long companyId, long userId, int status);

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
	public java.util.List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByC_U_S_First(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_S_First(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByC_U_S_Last(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_S_Last(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_U_S_PrevAndNext(
			long dealerId, long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByC_U_S(long companyId, long userId, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_U_S(long companyId, long userId, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status);

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
	public java.util.List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_U_NotS(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByC_U_NotS_First(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_NotS_First(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByC_U_NotS_Last(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_U_NotS_Last(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_U_NotS_PrevAndNext(
			long dealerId, long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByC_U_NotS(long companyId, long userId, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_U_NotS(long companyId, long userId, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_LtD_S(
		long companyId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByC_LtD_S_First(
			long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_S_First(
		long companyId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByC_LtD_S_Last(
			long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_S_Last(
		long companyId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_LtD_S_PrevAndNext(
			long dealerId, long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByC_LtD_S(long companyId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_LtD_S(long companyId, Date displayDate, int status);

	/**
	 * Returns all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end);

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
	public java.util.List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByC_LtD_NotS(
		long companyId, Date displayDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByC_LtD_NotS_First(
			long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the first dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_NotS_First(
		long companyId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByC_LtD_NotS_Last(
			long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns the last dealer in the ordered set where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public Dealer fetchByC_LtD_NotS_Last(
		long companyId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByC_LtD_NotS_PrevAndNext(
			long dealerId, long companyId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByC_LtD_NotS(
		long companyId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where companyId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByC_LtD_NotS(long companyId, Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end);

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
	public java.util.List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_U_LtD_S_First(
			long groupId, long userId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

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
	public Dealer fetchByG_U_LtD_S_First(
		long groupId, long userId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_U_LtD_S_Last(
			long groupId, long userId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

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
	public Dealer fetchByG_U_LtD_S_Last(
		long groupId, long userId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_U_LtD_S_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end);

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
	public java.util.List<Dealer> filterFindByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_U_LtD_S_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_LtD_S(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Returns all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers
	 */
	public java.util.List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status);

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
	public java.util.List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end);

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
	public java.util.List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

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
	public Dealer findByG_U_LtD_NotS_First(
			long groupId, long userId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

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
	public Dealer fetchByG_U_LtD_NotS_First(
		long groupId, long userId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer findByG_U_LtD_NotS_Last(
			long groupId, long userId, Date displayDate, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

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
	public Dealer fetchByG_U_LtD_NotS_Last(
		long groupId, long userId, Date displayDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] findByG_U_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Returns all the dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the matching dealers that the user has permission to view
	 */
	public java.util.List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status);

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
	public java.util.List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end);

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
	public java.util.List<Dealer> filterFindByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public Dealer[] filterFindByG_U_LtD_NotS_PrevAndNext(
			long dealerId, long groupId, long userId, Date displayDate,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Dealer>
				orderByComparator)
		throws NoSuchDealerException;

	/**
	 * Removes all the dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 */
	public void removeByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Returns the number of dealers where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers
	 */
	public int countByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Returns the number of dealers that the user has permission to view where groupId = &#63; and userId = &#63; and displayDate &lt; &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param displayDate the display date
	 * @param status the status
	 * @return the number of matching dealers that the user has permission to view
	 */
	public int filterCountByG_U_LtD_NotS(
		long groupId, long userId, Date displayDate, int status);

	/**
	 * Caches the dealer in the entity cache if it is enabled.
	 *
	 * @param dealer the dealer
	 */
	public void cacheResult(Dealer dealer);

	/**
	 * Caches the dealers in the entity cache if it is enabled.
	 *
	 * @param dealers the dealers
	 */
	public void cacheResult(java.util.List<Dealer> dealers);

	/**
	 * Creates a new dealer with the primary key. Does not add the dealer to the database.
	 *
	 * @param dealerId the primary key for the new dealer
	 * @return the new dealer
	 */
	public Dealer create(long dealerId);

	/**
	 * Removes the dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer that was removed
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer remove(long dealerId) throws NoSuchDealerException;

	public Dealer updateImpl(Dealer dealer);

	/**
	 * Returns the dealer with the primary key or throws a <code>NoSuchDealerException</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer
	 * @throws NoSuchDealerException if a dealer with the primary key could not be found
	 */
	public Dealer findByPrimaryKey(long dealerId) throws NoSuchDealerException;

	/**
	 * Returns the dealer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer, or <code>null</code> if a dealer with the primary key could not be found
	 */
	public Dealer fetchByPrimaryKey(long dealerId);

	/**
	 * Returns all the dealers.
	 *
	 * @return the dealers
	 */
	public java.util.List<Dealer> findAll();

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
	public java.util.List<Dealer> findAll(int start, int end);

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
	public java.util.List<Dealer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator);

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
	public java.util.List<Dealer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dealers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dealers.
	 *
	 * @return the number of dealers
	 */
	public int countAll();

}