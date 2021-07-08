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

package com.liferay.raybia.dealer.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.raybia.dealer.service.DealerServiceUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * <code>DealerServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.raybia.dealer.model.DealerSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.raybia.dealer.model.Dealer</code>, that is translated to a
 * <code>com.liferay.raybia.dealer.model.DealerSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Peter Richards
 * @see DealerServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DealerServiceSoap {

	public static com.liferay.raybia.dealer.model.DealerSoap addDealer(
			long groupId, String[] nameMapLanguageIds, String[] nameMapValues,
			String[] streetMapLanguageIds, String[] streetMapValues,
			String[] localityMapLanguageIds, String[] localityMapValues,
			String[] stateMapLanguageIds, String[] stateMapValues,
			String postalCode, String emailAddress, String phoneNumber,
			String[] openingHoursMapLanguageIds, String[] openingHoursMapValues,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(
				nameMapLanguageIds, nameMapValues);
			Map<Locale, String> streetMap = LocalizationUtil.getLocalizationMap(
				streetMapLanguageIds, streetMapValues);
			Map<Locale, String> localityMap =
				LocalizationUtil.getLocalizationMap(
					localityMapLanguageIds, localityMapValues);
			Map<Locale, String> stateMap = LocalizationUtil.getLocalizationMap(
				stateMapLanguageIds, stateMapValues);
			Map<Locale, String> openingHoursMap =
				LocalizationUtil.getLocalizationMap(
					openingHoursMapLanguageIds, openingHoursMapValues);

			com.liferay.raybia.dealer.model.Dealer returnValue =
				DealerServiceUtil.addDealer(
					groupId, nameMap, streetMap, localityMap, stateMap,
					postalCode, emailAddress, phoneNumber, openingHoursMap,
					latitude, longitude, serviceContext);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.raybia.dealer.model.DealerSoap updateDealer(
			long dealerId, String[] nameMapLanguageIds, String[] nameMapValues,
			String[] streetMapLanguageIds, String[] streetMapValues,
			String[] localityMapLanguageIds, String[] localityMapValues,
			String[] stateMapLanguageIds, String[] stateMapValues,
			String postalCode, String emailAddress, String phoneNumber,
			String[] openingHoursMapLanguageIds, String[] openingHoursMapValues,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(
				nameMapLanguageIds, nameMapValues);
			Map<Locale, String> streetMap = LocalizationUtil.getLocalizationMap(
				streetMapLanguageIds, streetMapValues);
			Map<Locale, String> localityMap =
				LocalizationUtil.getLocalizationMap(
					localityMapLanguageIds, localityMapValues);
			Map<Locale, String> stateMap = LocalizationUtil.getLocalizationMap(
				stateMapLanguageIds, stateMapValues);
			Map<Locale, String> openingHoursMap =
				LocalizationUtil.getLocalizationMap(
					openingHoursMapLanguageIds, openingHoursMapValues);

			com.liferay.raybia.dealer.model.Dealer returnValue =
				DealerServiceUtil.updateDealer(
					dealerId, nameMap, streetMap, localityMap, stateMap,
					postalCode, emailAddress, phoneNumber, openingHoursMap,
					latitude, longitude, serviceContext);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.raybia.dealer.model.DealerSoap deleteDealer(
			long dealerId)
		throws RemoteException {

		try {
			com.liferay.raybia.dealer.model.Dealer returnValue =
				DealerServiceUtil.deleteDealer(dealerId);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.raybia.dealer.model.DealerSoap getDealer(
			long dealerId)
		throws RemoteException {

		try {
			com.liferay.raybia.dealer.model.Dealer returnValue =
				DealerServiceUtil.getDealer(dealerId);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.raybia.dealer.model.DealerSoap[]
			getDealersByGroupId(long groupId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.raybia.dealer.model.Dealer> returnValue =
				DealerServiceUtil.getDealersByGroupId(groupId);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.raybia.dealer.model.DealerSoap[]
			getDealersByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.raybia.dealer.model.Dealer> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<com.liferay.raybia.dealer.model.Dealer> returnValue =
				DealerServiceUtil.getDealersByKeywords(
					groupId, keywords, start, end, orderByComparator);

			return com.liferay.raybia.dealer.model.DealerSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getDealersCountByKeywords(long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue = DealerServiceUtil.getDealersCountByKeywords(
				groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DealerServiceSoap.class);

}