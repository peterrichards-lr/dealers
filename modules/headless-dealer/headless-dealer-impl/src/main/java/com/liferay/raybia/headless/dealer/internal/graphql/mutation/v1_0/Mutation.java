package com.liferay.raybia.headless.dealer.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.raybia.headless.dealer.dto.v1_0.Dealer;
import com.liferay.raybia.headless.dealer.resource.v1_0.DealerResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotEmpty;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setDealerResourceComponentServiceObjects(
		ComponentServiceObjects<DealerResource>
			dealerResourceComponentServiceObjects) {

		_dealerResourceComponentServiceObjects =
			dealerResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Creates a new dealer")
	public Dealer createDealer(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("dealer") Dealer dealer)
		throws Exception {

		return _applyComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> dealerResource.createDealer(
				Long.valueOf(siteKey), dealer));
	}

	@GraphQLField(
		description = "Deletes the dealer with the specified identifier"
	)
	public boolean deleteDealer(@GraphQLName("dealerId") Long dealerId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> dealerResource.deleteDealer(dealerId));

		return true;
	}

	@GraphQLField
	public Response deleteDealerBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> dealerResource.deleteDealerBatch(
				callbackURL, object));
	}

	@GraphQLField(
		description = "Updates the dealer with the specified identifier"
	)
	public Dealer updateDealer(
			@GraphQLName("dealerId") Long dealerId,
			@GraphQLName("dealer") Dealer dealer)
		throws Exception {

		return _applyComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> dealerResource.updateDealer(dealerId, dealer));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(DealerResource dealerResource)
		throws Exception {

		dealerResource.setContextAcceptLanguage(_acceptLanguage);
		dealerResource.setContextCompany(_company);
		dealerResource.setContextHttpServletRequest(_httpServletRequest);
		dealerResource.setContextHttpServletResponse(_httpServletResponse);
		dealerResource.setContextUriInfo(_uriInfo);
		dealerResource.setContextUser(_user);
		dealerResource.setGroupLocalService(_groupLocalService);
		dealerResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<DealerResource>
		_dealerResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}