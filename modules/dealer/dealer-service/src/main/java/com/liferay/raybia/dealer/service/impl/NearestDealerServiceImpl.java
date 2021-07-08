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

package com.liferay.raybia.dealer.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.raybia.dealer.model.DistanceUnitOfMeasure;
import com.liferay.raybia.dealer.model.NearestDealer;
import com.liferay.raybia.dealer.service.base.NearestDealerServiceBaseImpl;

import java.math.BigDecimal;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the nearest dealer remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.raybia.dealer.service.NearestDealerService</code>
 * interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Peter Richards
 * @see NearestDealerServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=dealer",
		"json.web.service.context.path=NearestDealer" }, service = AopService.class)
public class NearestDealerServiceImpl extends NearestDealerServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.liferay.raybia.dealer.service.NearestDealerServiceUtil</code> to
	 * access the nearest dealer remote service.
	 */
	public List<NearestDealer> findByDistance(BigDecimal latitude, BigDecimal longitude, BigDecimal distance,
			DistanceUnitOfMeasure distanceUnit, int limit) throws SystemException {

		return nearestDealerLocalService.findByDistance(latitude, longitude, distance, distanceUnit, limit);
	}

	public List<NearestDealer> findByDistanceAndGroupId(long groupId, BigDecimal latitude, BigDecimal longitude,
			BigDecimal distance, DistanceUnitOfMeasure distanceUnit, int limit) throws SystemException {

		return nearestDealerLocalService.findByDistanceAndGroupId(groupId, latitude, longitude, distance, distanceUnit,
				limit);
	}
}