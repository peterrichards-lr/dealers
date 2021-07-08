package com.liferay.raybia.headless.dealer.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.raybia.headless.dealer.dto.v1_0.Dealer;
import com.liferay.raybia.headless.dealer.dto.v1_0.NearestDealer;
import com.liferay.raybia.headless.dealer.resource.v1_0.DealerResource;
import com.liferay.raybia.headless.dealer.resource.v1_0.NearestDealerResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotEmpty;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class Query {

	public static void setDealerResourceComponentServiceObjects(
		ComponentServiceObjects<DealerResource>
			dealerResourceComponentServiceObjects) {

		_dealerResourceComponentServiceObjects =
			dealerResourceComponentServiceObjects;
	}

	public static void setNearestDealerResourceComponentServiceObjects(
		ComponentServiceObjects<NearestDealerResource>
			nearestDealerResourceComponentServiceObjects) {

		_nearestDealerResourceComponentServiceObjects =
			nearestDealerResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dealers(filter: ___, page: ___, pageSize: ___, search: ___, siteKey: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Returns all the dealers")
	public DealerPage dealers(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> new DealerPage(
				dealerResource.getDealersPage(
					Long.valueOf(siteKey), search,
					_filterBiFunction.apply(dealerResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(dealerResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dealer(dealerId: ___){id, name, address, emailAddress, phoneNumber, openingHours, geolocation}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Returns the dealer with the specified identifier"
	)
	public Dealer dealer(@GraphQLName("dealerId") Long dealerId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			dealerResource -> dealerResource.getDealer(dealerId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {nearestDealers(latitude: ___, limit: ___, longitude: ___, radialDistance: ___, siteKey: ___, unitOfMeasure: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Returns the dealers which are nearest to a given geolocation"
	)
	public NearestDealerPage nearestDealers(
			@GraphQLName("latitude") Double latitude,
			@GraphQLName("longitude") Double longitude,
			@GraphQLName("radialDistance") Double radialDistance,
			@GraphQLName("unitOfMeasure") String unitOfMeasure,
			@GraphQLName("limit") Integer limit,
			@GraphQLName("siteKey") @NotEmpty String siteKey)
		throws Exception {

		return _applyComponentServiceObjects(
			_nearestDealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			nearestDealerResource -> new NearestDealerPage(
				nearestDealerResource.getNearestDealersPage(
					latitude, longitude, radialDistance, unitOfMeasure, limit,
					Long.valueOf(siteKey))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {nearestDealersPostcode(limit: ___, postcode: ___, radialDistance: ___, siteKey: ___, unitOfMeasure: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Returns the dealers which are nearest to a given postcode"
	)
	public NearestDealerPage nearestDealersPostcode(
			@GraphQLName("postcode") String postcode,
			@GraphQLName("radialDistance") Double radialDistance,
			@GraphQLName("unitOfMeasure") String unitOfMeasure,
			@GraphQLName("limit") Integer limit,
			@GraphQLName("siteKey") @NotEmpty String siteKey)
		throws Exception {

		return _applyComponentServiceObjects(
			_nearestDealerResourceComponentServiceObjects,
			this::_populateResourceContext,
			nearestDealerResource -> new NearestDealerPage(
				nearestDealerResource.getNearestDealersPostcodePage(
					postcode, radialDistance, unitOfMeasure, limit,
					Long.valueOf(siteKey))));
	}

	@GraphQLName("DealerPage")
	public class DealerPage {

		public DealerPage(Page dealerPage) {
			actions = dealerPage.getActions();
			items = dealerPage.getItems();
			lastPage = dealerPage.getLastPage();
			page = dealerPage.getPage();
			pageSize = dealerPage.getPageSize();
			totalCount = dealerPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Dealer> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("NearestDealerPage")
	public class NearestDealerPage {

		public NearestDealerPage(Page nearestDealerPage) {
			actions = nearestDealerPage.getActions();
			items = nearestDealerPage.getItems();
			lastPage = nearestDealerPage.getLastPage();
			page = nearestDealerPage.getPage();
			pageSize = nearestDealerPage.getPageSize();
			totalCount = nearestDealerPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<NearestDealer> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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

	private void _populateResourceContext(DealerResource dealerResource)
		throws Exception {

		dealerResource.setContextAcceptLanguage(_acceptLanguage);
		dealerResource.setContextCompany(_company);
		dealerResource.setContextHttpServletRequest(_httpServletRequest);
		dealerResource.setContextHttpServletResponse(_httpServletResponse);
		dealerResource.setContextUriInfo(_uriInfo);
		dealerResource.setContextUser(_user);
	}

	private void _populateResourceContext(
			NearestDealerResource nearestDealerResource)
		throws Exception {

		nearestDealerResource.setContextAcceptLanguage(_acceptLanguage);
		nearestDealerResource.setContextCompany(_company);
		nearestDealerResource.setContextHttpServletRequest(_httpServletRequest);
		nearestDealerResource.setContextHttpServletResponse(
			_httpServletResponse);
		nearestDealerResource.setContextUriInfo(_uriInfo);
		nearestDealerResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<DealerResource>
		_dealerResourceComponentServiceObjects;
	private static ComponentServiceObjects<NearestDealerResource>
		_nearestDealerResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.Company _company;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}