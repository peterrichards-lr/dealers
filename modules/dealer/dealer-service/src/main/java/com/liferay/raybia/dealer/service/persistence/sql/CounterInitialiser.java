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

package com.liferay.raybia.dealer.service.persistence.sql;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerLocalService;

import java.util.List;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CounterInitialiser {

	@Activate
	public void initialiseCounter() {

		DynamicQuery dynamicQuery = _dealerLocalService.dynamicQuery()
				.setProjection(ProjectionFactoryUtil.max("dealerId"));

		List<Long> results = _dealerLocalService.dynamicQuery(dynamicQuery);

		if (!results.isEmpty()) {
			Long firstResult = results.get(0);
			if (firstResult != null) {
				long nextId = firstResult.longValue() + 1;
				_log.debug("Counter will be " + nextId);
				_counterLocalService.reset(Dealer.class.getName(), nextId);
			}
		}
	}

	// Liferay lifecycle service
	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED)
	private ModuleServiceLifecycle _portalInitialized;

	@Reference
	CounterLocalService _counterLocalService;

	@Reference
	private DealerLocalService _dealerLocalService;

	private static final Logger _log = LoggerFactory.getLogger(CounterInitialiser.class);
}
