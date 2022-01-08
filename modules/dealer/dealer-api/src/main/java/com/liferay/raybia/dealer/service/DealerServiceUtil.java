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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.raybia.dealer.model.Dealer;

import java.util.List;
import java.util.Map;

/**
 * Provides the remote service utility for Dealer. This utility wraps
 * <code>com.liferay.raybia.dealer.service.impl.DealerServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Peter Richards
 * @see DealerService
 * @generated
 */
public class DealerServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.raybia.dealer.service.impl.DealerServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Dealer addDealer(
			long groupId, Map<java.util.Locale, String> nameMap,
			Map<java.util.Locale, String> streetMap,
			Map<java.util.Locale, String> localityMap,
			Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			java.util.Date displayDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addDealer(
			groupId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			displayDate, serviceContext);
	}

	public static Dealer addDealer(
			long groupId, Map<java.util.Locale, String> nameMap,
			Map<java.util.Locale, String> streetMap,
			Map<java.util.Locale, String> localityMap,
			Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addDealer(
			groupId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			serviceContext);
	}

	public static Dealer deleteDealer(long dealerId) throws PortalException {
		return getService().deleteDealer(dealerId);
	}

	public static Dealer getDealer(long dealerId) throws PortalException {
		return getService().getDealer(dealerId);
	}

	public static List<Dealer> getDealersByGroupId(long groupId) {
		return getService().getDealersByGroupId(groupId);
	}

	public static List<Dealer> getDealersByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getService().getDealersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static long getDealersCountByKeywords(
		long groupId, String keywords) {

		return getService().getDealersCountByKeywords(groupId, keywords);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Dealer updateDealer(
			long dealerId, Map<java.util.Locale, String> nameMap,
			Map<java.util.Locale, String> streetMap,
			Map<java.util.Locale, String> localityMap,
			Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			java.util.Date displayDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			displayDate, serviceContext);
	}

	public static Dealer updateDealer(
			long dealerId, Map<java.util.Locale, String> nameMap,
			Map<java.util.Locale, String> streetMap,
			Map<java.util.Locale, String> localityMap,
			Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			serviceContext);
	}

	public static Dealer updateDealer(
			long dealerId, Map<java.util.Locale, String> nameMap,
			Map<java.util.Locale, String> streetMap,
			Map<java.util.Locale, String> localityMap,
			Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			Map<java.util.Locale, String> openingHoursMap,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, serviceContext);
	}

	public static DealerService getService() {
		return _service;
	}

	private static volatile DealerService _service;

}