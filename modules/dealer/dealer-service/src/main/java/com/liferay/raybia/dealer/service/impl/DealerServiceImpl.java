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
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.raybia.dealer.constants.DealerConstants;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.base.DealerServiceBaseImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the dealer remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.raybia.dealer.service.DealerService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Peter Richards
 * @see DealerServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=raybia",
		"json.web.service.context.path=Dealer" }, service = AopService.class)
public class DealerServiceImpl extends DealerServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.liferay.raybia.dealer.service.DealerServiceUtil</code> to access
	 * the dealer remote service.
	 */

	public Dealer addDealer(final long groupId, final Map<Locale, String> nameMap, final Map<Locale, String> streetMap,
			final Map<Locale, String> localityMap, final Map<Locale, String> stateMap, final String postalCode,
			final String emailAddress, final String phoneNumber, final Map<Locale, String> openingHoursMap,
			final BigDecimal latitude, final BigDecimal longitude, final ServiceContext serviceContext)
			throws PortalException {
		// Check permissions.

		_portletResourcePermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

		return dealerLocalService.addDealer(groupId, nameMap, streetMap, localityMap, stateMap, postalCode,
				emailAddress, phoneNumber, openingHoursMap, latitude, longitude, serviceContext);
	}

	public Dealer updateDealer(final long dealerId, final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap, final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap, final String postalCode, final String emailAddress,
			final String phoneNumber, final Map<Locale, String> openingHoursMap, final BigDecimal latitude,
			final BigDecimal longitude, final ServiceContext serviceContext) throws PortalException {
		// Check permissions.

		_dealerModelResourcePermission.check(getPermissionChecker(), dealerId, ActionKeys.UPDATE);

		return dealerLocalService.updateDealer(dealerId, nameMap, streetMap, localityMap, stateMap, postalCode,
				emailAddress, phoneNumber, openingHoursMap, latitude, longitude, serviceContext);
	}

	public Dealer deleteDealer(final long dealerId) throws PortalException {
		// Check permissions.

		_dealerModelResourcePermission.check(getPermissionChecker(), dealerId, ActionKeys.DELETE);

		Dealer dealer = dealerLocalService.getDealer(dealerId);

		return dealerLocalService.deleteDealer(dealer);
	}

	public Dealer getDealer(long dealerId) throws PortalException {

		Dealer dealer = dealerLocalService.getDealer(dealerId);

		// Check permissions.

		_dealerModelResourcePermission.check(getPermissionChecker(), dealer, ActionKeys.VIEW);

		return dealer;
	}

	public List<Dealer> getDealersByGroupId(long groupId) {
		return dealerPersistence.findByGroupId(groupId);
	}

	public List<Dealer> getDealersByKeywords(long groupId, String keywords, int start, int end,
			OrderByComparator<Dealer> orderByComparator) {

		return dealerLocalService.getDealersByKeywords(groupId, keywords, start, end, orderByComparator);
	}

	public long getDealersCountByKeywords(long groupId, String keywords) {

		return dealerLocalService.getDealersCountByKeywords(groupId, keywords);
	}

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(model.class.name=com.liferay.raybia.dealer.model.Dealer)")
	private volatile ModelResourcePermission<Dealer> _dealerModelResourcePermission;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(resource.name="
			+ DealerConstants.RESOURCE_NAME + ")")
	private volatile PortletResourcePermission _portletResourcePermission;
}