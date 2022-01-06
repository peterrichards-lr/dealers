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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.raybia.dealer.model.DistanceUnitOfMeasure;
import com.liferay.raybia.dealer.model.NearestDealer;

import java.math.BigDecimal;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for NearestDealer. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Peter Richards
 * @see NearestDealerServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface NearestDealerService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.raybia.dealer.service.impl.NearestDealerServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the nearest dealer remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link NearestDealerServiceUtil} if injection and service tracking are not available.
	 */
	public List<NearestDealer> findByDistance(
			BigDecimal latitude, BigDecimal longitude, BigDecimal distance,
			DistanceUnitOfMeasure distanceUnit, int limit)
		throws SystemException;

	public List<NearestDealer> findByDistanceAndGroupId(
			long groupId, BigDecimal latitude, BigDecimal longitude,
			BigDecimal distance, DistanceUnitOfMeasure distanceUnit, int limit)
		throws SystemException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

}