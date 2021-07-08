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

package com.liferay.raybia.dealer.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Dealer service. Represents a row in the &quot;Raybia_Dealer&quot; database table, with each column mapped to a property of this class.
 *
 * @author Peter Richards
 * @see DealerModel
 * @generated
 */
@ImplementationClassName("com.liferay.raybia.dealer.model.impl.DealerImpl")
@ProviderType
public interface Dealer extends DealerModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.raybia.dealer.model.impl.DealerImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Dealer, Long> DEALER_ID_ACCESSOR =
		new Accessor<Dealer, Long>() {

			@Override
			public Long get(Dealer dealer) {
				return dealer.getDealerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Dealer> getTypeClass() {
				return Dealer.class;
			}

		};

}