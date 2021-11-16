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
 * Provides the remote service utility for Dealer. This utility wraps
 * <code>com.liferay.raybia.dealer.service.impl.DealerServiceImpl</code> and is
 * an access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed
 * remotely.
 *
 * @author Peter Richards
 * @see DealerService
 * @generated
 */
public class DealerServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to
	 * <code>com.liferay.raybia.dealer.service.impl.DealerServiceImpl</code> and
	 * rerun ServiceBuilder to regenerate this class.
	 */

	public static com.liferay.raybia.dealer.model.Dealer addDealer(long groupId,
			java.util.Map<java.util.Locale, String> nameMap, java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap, java.util.Map<java.util.Locale, String> stateMap,
			String postalCode, String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap, java.math.BigDecimal latitude,
			java.math.BigDecimal longitude, com.liferay.portal.kernel.service.ServiceContext serviceContext)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addDealer(groupId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress,
				phoneNumber, openingHoursMap, latitude, longitude, serviceContext);
	}

	public static com.liferay.raybia.dealer.model.Dealer deleteDealer(long dealerId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteDealer(dealerId);
	}

	public static com.liferay.raybia.dealer.model.Dealer getDealer(long dealerId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getDealer(dealerId);
	}

	public static java.util.List<com.liferay.raybia.dealer.model.Dealer> getDealersByGroupId(long groupId) {

		return getService().getDealersByGroupId(groupId);
	}

	public static java.util.List<com.liferay.raybia.dealer.model.Dealer> getDealersByKeywords(long groupId,
			String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<com.liferay.raybia.dealer.model.Dealer> orderByComparator) {

		return getService().getDealersByKeywords(groupId, keywords, start, end, orderByComparator);
	}

	public static long getDealersCountByKeywords(long groupId, String keywords) {

		return getService().getDealersCountByKeywords(groupId, keywords);
	}

	public static com.liferay.raybia.dealer.model.Dealer updateDealer(long dealerId,
			java.util.Map<java.util.Locale, String> nameMap, java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap, java.util.Map<java.util.Locale, String> stateMap,
			String postalCode, String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap, java.math.BigDecimal latitude,
			java.math.BigDecimal longitude, com.liferay.portal.kernel.service.ServiceContext serviceContext)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateDealer(dealerId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress,
				phoneNumber, openingHoursMap, latitude, longitude, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DealerService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DealerService, DealerService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DealerService.class);

		ServiceTracker<DealerService, DealerService> serviceTracker = new ServiceTracker<DealerService, DealerService>(
				bundle.getBundleContext(), DealerService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}