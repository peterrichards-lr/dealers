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
 * Provides the remote service utility for NearestDealer. This utility wraps
 * <code>com.liferay.raybia.dealer.service.impl.NearestDealerServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Peter Richards
 * @see NearestDealerService
 * @generated
 */
public class NearestDealerServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.raybia.dealer.service.impl.NearestDealerServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
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

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static NearestDealerService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NearestDealerService, NearestDealerService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NearestDealerService.class);

		ServiceTracker<NearestDealerService, NearestDealerService>
			serviceTracker =
				new ServiceTracker<NearestDealerService, NearestDealerService>(
					bundle.getBundleContext(), NearestDealerService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}