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
import com.liferay.raybia.dealer.exception.NoSuchNearestDealerException;
import com.liferay.raybia.dealer.model.NearestDealer;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the nearest dealer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Peter Richards
 * @see NearestDealerUtil
 * @generated
 */
@ProviderType
public interface NearestDealerPersistence
	extends BasePersistence<NearestDealer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NearestDealerUtil} to access the nearest dealer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the nearest dealer in the entity cache if it is enabled.
	 *
	 * @param nearestDealer the nearest dealer
	 */
	public void cacheResult(NearestDealer nearestDealer);

	/**
	 * Caches the nearest dealers in the entity cache if it is enabled.
	 *
	 * @param nearestDealers the nearest dealers
	 */
	public void cacheResult(java.util.List<NearestDealer> nearestDealers);

	/**
	 * Creates a new nearest dealer with the primary key. Does not add the nearest dealer to the database.
	 *
	 * @param dealerId the primary key for the new nearest dealer
	 * @return the new nearest dealer
	 */
	public NearestDealer create(long dealerId);

	/**
	 * Removes the nearest dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer that was removed
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	public NearestDealer remove(long dealerId)
		throws NoSuchNearestDealerException;

	public NearestDealer updateImpl(NearestDealer nearestDealer);

	/**
	 * Returns the nearest dealer with the primary key or throws a <code>NoSuchNearestDealerException</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	public NearestDealer findByPrimaryKey(long dealerId)
		throws NoSuchNearestDealerException;

	/**
	 * Returns the nearest dealer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer, or <code>null</code> if a nearest dealer with the primary key could not be found
	 */
	public NearestDealer fetchByPrimaryKey(long dealerId);

	/**
	 * Returns all the nearest dealers.
	 *
	 * @return the nearest dealers
	 */
	public java.util.List<NearestDealer> findAll();

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
	public java.util.List<NearestDealer> findAll(int start, int end);

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
	public java.util.List<NearestDealer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NearestDealer>
			orderByComparator);

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
	public java.util.List<NearestDealer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NearestDealer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the nearest dealers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of nearest dealers.
	 *
	 * @return the number of nearest dealers
	 */
	public int countAll();

}