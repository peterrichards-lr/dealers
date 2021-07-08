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
import com.liferay.raybia.dealer.service.NearestDealerServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>NearestDealerServiceUtil</code> service
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
 * @see NearestDealerServiceSoap
 * @generated
 */
public class NearestDealerServiceHttp {

	public static java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistance(
				HttpPrincipal httpPrincipal, java.math.BigDecimal latitude,
				java.math.BigDecimal longitude, java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				NearestDealerServiceUtil.class, "findByDistance",
				_findByDistanceParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, latitude, longitude, distance, distanceUnit, limit);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.raybia.dealer.model.NearestDealer>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.raybia.dealer.model.NearestDealer>
			findByDistanceAndGroupId(
				HttpPrincipal httpPrincipal, long groupId,
				java.math.BigDecimal latitude, java.math.BigDecimal longitude,
				java.math.BigDecimal distance,
				com.liferay.raybia.dealer.model.DistanceUnitOfMeasure
					distanceUnit,
				int limit)
		throws com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				NearestDealerServiceUtil.class, "findByDistanceAndGroupId",
				_findByDistanceAndGroupIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, latitude, longitude, distance, distanceUnit,
				limit);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.raybia.dealer.model.NearestDealer>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NearestDealerServiceHttp.class);

	private static final Class<?>[] _findByDistanceParameterTypes0 =
		new Class[] {
			java.math.BigDecimal.class, java.math.BigDecimal.class,
			java.math.BigDecimal.class,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure.class,
			int.class
		};
	private static final Class<?>[] _findByDistanceAndGroupIdParameterTypes1 =
		new Class[] {
			long.class, java.math.BigDecimal.class, java.math.BigDecimal.class,
			java.math.BigDecimal.class,
			com.liferay.raybia.dealer.model.DistanceUnitOfMeasure.class,
			int.class
		};

}