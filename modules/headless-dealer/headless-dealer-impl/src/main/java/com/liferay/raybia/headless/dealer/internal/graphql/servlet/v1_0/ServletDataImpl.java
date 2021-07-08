package com.liferay.raybia.headless.dealer.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;
import com.liferay.raybia.headless.dealer.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.raybia.headless.dealer.internal.graphql.query.v1_0.Query;
import com.liferay.raybia.headless.dealer.resource.v1_0.DealerResource;
import com.liferay.raybia.headless.dealer.resource.v1_0.NearestDealerResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Peter Richards
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setDealerResourceComponentServiceObjects(
			_dealerResourceComponentServiceObjects);

		Query.setDealerResourceComponentServiceObjects(
			_dealerResourceComponentServiceObjects);
		Query.setNearestDealerResourceComponentServiceObjects(
			_nearestDealerResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/headless-dealers-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<DealerResource>
		_dealerResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<NearestDealerResource>
		_nearestDealerResourceComponentServiceObjects;

}