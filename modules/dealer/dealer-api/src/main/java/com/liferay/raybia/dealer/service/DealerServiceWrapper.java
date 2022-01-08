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
 * Provides a wrapper for {@link DealerService}.
 *
 * @author Peter Richards
 * @see DealerService
 * @generated
 */
public class DealerServiceWrapper
	implements DealerService, ServiceWrapper<DealerService> {

	public DealerServiceWrapper(DealerService dealerService) {
		_dealerService = dealerService;
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer addDealer(
			long groupId, java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			java.util.Date displayDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.addDealer(
			groupId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			displayDate, serviceContext);
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer addDealer(
			long groupId, java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.addDealer(
			groupId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			serviceContext);
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer deleteDealer(long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.deleteDealer(dealerId);
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer getDealer(long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.getDealer(dealerId);
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.Dealer>
		getDealersByGroupId(long groupId) {

		return _dealerService.getDealersByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.raybia.dealer.model.Dealer>
		getDealersByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.raybia.dealer.model.Dealer> orderByComparator) {

		return _dealerService.getDealersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public long getDealersCountByKeywords(long groupId, String keywords) {
		return _dealerService.getDealersCountByKeywords(groupId, keywords);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dealerService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer updateDealer(
			long dealerId, java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			java.util.Date displayDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			displayDate, serviceContext);
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer updateDealer(
			long dealerId, java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, latitude, longitude,
			serviceContext);
	}

	@Override
	public com.liferay.raybia.dealer.model.Dealer updateDealer(
			long dealerId, java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dealerService.updateDealer(
			dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
			emailAddress, phoneNumber, openingHoursMap, serviceContext);
	}

	@Override
	public DealerService getWrappedService() {
		return _dealerService;
	}

	@Override
	public void setWrappedService(DealerService dealerService) {
		_dealerService = dealerService;
	}

	private DealerService _dealerService;

}