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

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Peter Richards
 * @generated
 */
@ProviderType
public interface NearestDealerFinder {

	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
		findByDistance(
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			java.math.BigDecimal distance,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure distanceUnit,
			int limit);

	public java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
		findByDistanceAndGroupId(
			long groupId, java.math.BigDecimal latitude,
			java.math.BigDecimal longitude, java.math.BigDecimal distance,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure distanceUnit,
			int limit);

}