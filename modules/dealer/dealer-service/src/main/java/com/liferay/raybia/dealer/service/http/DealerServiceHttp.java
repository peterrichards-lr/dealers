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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.raybia.dealer.service.DealerServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>DealerServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Peter Richards
 * @see DealerServiceSoap
 * @generated
 */
public class DealerServiceHttp {

	public static com.liferay.raybia.dealer.model.Dealer addDealer(
			HttpPrincipal httpPrincipal, long groupId,
			java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "addDealer",
				_addDealerParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, nameMap, streetMap, localityMap, stateMap,
				postalCode, emailAddress, phoneNumber, openingHoursMap,
				latitude, longitude, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.raybia.dealer.model.Dealer)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.raybia.dealer.model.Dealer updateDealer(
			HttpPrincipal httpPrincipal, long dealerId,
			java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> streetMap,
			java.util.Map<java.util.Locale, String> localityMap,
			java.util.Map<java.util.Locale, String> stateMap, String postalCode,
			String emailAddress, String phoneNumber,
			java.util.Map<java.util.Locale, String> openingHoursMap,
			java.math.BigDecimal latitude, java.math.BigDecimal longitude,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "updateDealer",
				_updateDealerParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dealerId, nameMap, streetMap, localityMap, stateMap,
				postalCode, emailAddress, phoneNumber, openingHoursMap,
				latitude, longitude, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.raybia.dealer.model.Dealer)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.raybia.dealer.model.Dealer deleteDealer(
			HttpPrincipal httpPrincipal, long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "deleteDealer",
				_deleteDealerParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dealerId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.raybia.dealer.model.Dealer)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.raybia.dealer.model.Dealer getDealer(
			HttpPrincipal httpPrincipal, long dealerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "getDealer",
				_getDealerParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dealerId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.raybia.dealer.model.Dealer)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.raybia.dealer.model.Dealer>
		getDealersByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "getDealersByGroupId",
				_getDealersByGroupIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.raybia.dealer.model.Dealer>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.raybia.dealer.model.Dealer>
		getDealersByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.raybia.dealer.model.Dealer> orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "getDealersByKeywords",
				_getDealersByKeywordsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.raybia.dealer.model.Dealer>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static long getDealersCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				DealerServiceUtil.class, "getDealersCountByKeywords",
				_getDealersCountByKeywordsParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DealerServiceHttp.class);

	private static final Class<?>[] _addDealerParameterTypes0 = new Class[] {
		long.class, java.util.Map.class, java.util.Map.class,
		java.util.Map.class, java.util.Map.class, String.class, String.class,
		String.class, java.util.Map.class, java.math.BigDecimal.class,
		java.math.BigDecimal.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateDealerParameterTypes1 = new Class[] {
		long.class, java.util.Map.class, java.util.Map.class,
		java.util.Map.class, java.util.Map.class, String.class, String.class,
		String.class, java.util.Map.class, java.math.BigDecimal.class,
		java.math.BigDecimal.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteDealerParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getDealerParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getDealersByGroupIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getDealersByKeywordsParameterTypes5 =
		new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getDealersCountByKeywordsParameterTypes6 =
		new Class[] {long.class, String.class};

}