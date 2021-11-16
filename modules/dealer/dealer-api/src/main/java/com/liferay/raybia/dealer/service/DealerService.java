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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.raybia.dealer.model.Dealer;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Dealer. Methods of this service are
 * expected to have security checks based on the propagated JAAS credentials
 * because this service can be accessed remotely.
 *
 * @author Peter Richards
 * @see DealerServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor = { PortalException.class, SystemException.class })
public interface DealerService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to
	 * <code>com.liferay.raybia.dealer.service.impl.DealerServiceImpl</code> and
	 * rerun ServiceBuilder to automatically copy the method declarations to this
	 * interface. Consume the dealer remote service via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link
	 * DealerServiceUtil} if injection and service tracking are not available.
	 */

	public Dealer addDealer(long groupId, Map<Locale, String> nameMap, Map<Locale, String> streetMap,
			Map<Locale, String> localityMap, Map<Locale, String> stateMap, String postalCode, String emailAddress,
			String phoneNumber, Map<Locale, String> openingHoursMap, BigDecimal latitude, BigDecimal longitude,
			ServiceContext serviceContext) throws PortalException;

	public Dealer deleteDealer(long dealerId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dealer getDealer(long dealerId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dealer> getDealersByKeywords(long groupId, String keywords, int start, int end,
			OrderByComparator<Dealer> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getDealersCountByKeywords(long groupId, String keywords);

	public Dealer updateDealer(long dealerId, Map<Locale, String> nameMap, Map<Locale, String> streetMap,
			Map<Locale, String> localityMap, Map<Locale, String> stateMap, String postalCode, String emailAddress,
			String phoneNumber, Map<Locale, String> openingHoursMap, BigDecimal latitude, BigDecimal longitude,
			ServiceContext serviceContext) throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

}