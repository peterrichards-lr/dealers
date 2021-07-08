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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.raybia.dealer.model.DistanceUnitOfMeasure;
import com.liferay.raybia.dealer.model.NearestDealer;
import com.liferay.raybia.dealer.service.base.NearestDealerLocalServiceBaseImpl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the nearest dealer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.raybia.dealer.service.NearestDealerLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Peter Richards
 * @see NearestDealerLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.liferay.raybia.dealer.model.NearestDealer", service = AopService.class)
public class NearestDealerLocalServiceImpl extends NearestDealerLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.liferay.raybia.dealer.service.NearestDealerLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.liferay.raybia.dealer.service.NearestDealerLocalServiceUtil</code>.
	 */

	@Override
	public NearestDealer addNearestDealer(NearestDealer NearestDealer) {
		throw new UnsupportedOperationException("NearestDealer cannot be persisted.");
	}

	@Override
	public NearestDealer createNearestDealer(long dealerId) {
		throw new UnsupportedOperationException("NearestDealer cannot be created.");
	}

	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj) throws PortalException {
		throw new UnsupportedOperationException("NearestDealer cannot be created.");
	}

	@Override
	public NearestDealer deleteNearestDealer(NearestDealer nearestDealer) {
		throw new UnsupportedOperationException("NearestDealer cannot be deleted.");
	}

	@Override
	public NearestDealer deleteNearestDealer(long dealerId) throws PortalException {
		throw new UnsupportedOperationException("NearestDealer cannot be deleted.");
	}

	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel) throws PortalException {
		throw new UnsupportedOperationException("NearestDealer cannot be deleted.");
	}

	@Override
	public NearestDealer fetchNearestDealer(long dealerId) {
		throw new UnsupportedOperationException("NearestDealer cannot be fetched.");
	}

	public List<NearestDealer> findByDistance(BigDecimal latitude, BigDecimal longitude, BigDecimal distance,
			DistanceUnitOfMeasure distanceUnit, int limit) throws SystemException {

		return nearestDealerFinder.findByDistance(latitude, longitude, distance, distanceUnit, limit);
	}

	public List<NearestDealer> findByDistanceAndGroupId(long groupId, BigDecimal latitude, BigDecimal longitude,
			BigDecimal distance, DistanceUnitOfMeasure distanceUnit, int limit) throws SystemException {

		return nearestDealerFinder.findByDistanceAndGroupId(groupId, latitude, longitude, distance, distanceUnit,
				limit);
	}
}