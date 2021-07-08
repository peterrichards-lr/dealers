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