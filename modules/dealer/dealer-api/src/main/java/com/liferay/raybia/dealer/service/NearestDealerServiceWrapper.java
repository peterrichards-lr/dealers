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
 * Provides a wrapper for {@link NearestDealerService}.
 *
 * @author Peter Richards
 * @see NearestDealerService
 * @generated
 */
public class NearestDealerServiceWrapper implements NearestDealerService, ServiceWrapper<NearestDealerService> {

	public NearestDealerServiceWrapper(NearestDealerService nearestDealerService) {

		_nearestDealerService = nearestDealerService;
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer> findByDistance(java.math.BigDecimal latitude,
			java.math.BigDecimal longitude, java.math.BigDecimal distance,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure distanceUnit, int limit)
			throws com.liferay.portal.kernel.exception.SystemException {

		return _nearestDealerService.findByDistance(latitude, longitude, distance, distanceUnit, limit);
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer> findByDistanceAndGroupId(long groupId,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude, java.math.BigDecimal distance,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure distanceUnit, int limit)
			throws com.liferay.portal.kernel.exception.SystemException {

		return _nearestDealerService.findByDistanceAndGroupId(groupId, latitude, longitude, distance, distanceUnit,
				limit);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _nearestDealerService.getOSGiServiceIdentifier();
	}

	@Override
	public NearestDealerService getWrappedService() {
		return _nearestDealerService;
	}

	@Override
	public void setWrappedService(NearestDealerService nearestDealerService) {
		_nearestDealerService = nearestDealerService;
	}

	private NearestDealerService _nearestDealerService;

}