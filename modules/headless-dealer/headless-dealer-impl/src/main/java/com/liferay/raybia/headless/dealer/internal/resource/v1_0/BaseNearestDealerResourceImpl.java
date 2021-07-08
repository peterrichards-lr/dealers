package com.liferay.raybia.headless.dealer.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegate;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.ActionUtil;
import com.liferay.portal.vulcan.util.TransformUtil;
import com.liferay.raybia.headless.dealer.dto.v1_0.NearestDealer;
import com.liferay.raybia.headless.dealer.resource.v1_0.NearestDealerResource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotNull;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseNearestDealerResourceImpl
	implements NearestDealerResource, EntityModelResource,
			   VulcanBatchEngineTaskItemDelegate<NearestDealer> {

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-dealers/v1.0/nearestDealers'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Operation(
		description = "Returns the dealers which are nearest to a given geolocation"
	)
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.QUERY, name = "latitude"),
			@Parameter(in = ParameterIn.QUERY, name = "longitude"),
			@Parameter(in = ParameterIn.QUERY, name = "radialDistance"),
			@Parameter(in = ParameterIn.QUERY, name = "unitOfMeasure"),
			@Parameter(in = ParameterIn.QUERY, name = "limit"),
			@Parameter(in = ParameterIn.QUERY, name = "siteId")
		}
	)
	@Path("/nearestDealers")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "NearestDealer")})
	public Page<NearestDealer> getNearestDealersPage(
			@NotNull @Parameter(hidden = true) @QueryParam("latitude") Double
				latitude,
			@NotNull @Parameter(hidden = true) @QueryParam("longitude") Double
				longitude,
			@DefaultValue("25") @Parameter(hidden = true)
			@QueryParam("radialDistance") Double radialDistance,
			@DefaultValue("MILES") @Parameter(hidden = true)
			@QueryParam("unitOfMeasure") String unitOfMeasure,
			@DefaultValue("5") @Parameter(hidden = true) @QueryParam("limit")
				Integer limit,
			@Parameter(hidden = true) @QueryParam("siteId") Long siteId)
		throws Exception {

		return Page.of(Collections.emptyList());
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-dealers/v1.0/nearestDealers/{postcode}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Operation(
		description = "Returns the dealers which are nearest to a given postcode"
	)
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "postcode"),
			@Parameter(in = ParameterIn.QUERY, name = "radialDistance"),
			@Parameter(in = ParameterIn.QUERY, name = "unitOfMeasure"),
			@Parameter(in = ParameterIn.QUERY, name = "limit"),
			@Parameter(in = ParameterIn.QUERY, name = "siteId")
		}
	)
	@Path("/nearestDealers/{postcode}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "NearestDealer")})
	public Page<NearestDealer> getNearestDealersPostcodePage(
			@NotNull @Parameter(hidden = true) @PathParam("postcode") String
				postcode,
			@DefaultValue("25") @Parameter(hidden = true)
			@QueryParam("radialDistance") Double radialDistance,
			@DefaultValue("MILES") @Parameter(hidden = true)
			@QueryParam("unitOfMeasure") String unitOfMeasure,
			@DefaultValue("5") @Parameter(hidden = true) @QueryParam("limit")
				Integer limit,
			@Parameter(hidden = true) @QueryParam("siteId") Long siteId)
		throws Exception {

		return Page.of(Collections.emptyList());
	}

	@Override
	@SuppressWarnings("PMD.UnusedLocalVariable")
	public void create(
			java.util.Collection<NearestDealer> nearestDealers,
			Map<String, Serializable> parameters)
		throws Exception {
	}

	@Override
	public void delete(
			java.util.Collection<NearestDealer> nearestDealers,
			Map<String, Serializable> parameters)
		throws Exception {
	}

	@Override
	public EntityModel getEntityModel(Map<String, List<String>> multivaluedMap)
		throws Exception {

		return getEntityModel(
			new MultivaluedHashMap<String, Object>(multivaluedMap));
	}

	@Override
	public EntityModel getEntityModel(MultivaluedMap multivaluedMap)
		throws Exception {

		return null;
	}

	@Override
	public Page<NearestDealer> read(
			Filter filter, Pagination pagination, Sort[] sorts,
			Map<String, Serializable> parameters, String search)
		throws Exception {

		return getNearestDealersPage(
			(Double)parameters.get("latitude"),
			(Double)parameters.get("longitude"),
			(Double)parameters.get("radialDistance"),
			(String)parameters.get("unitOfMeasure"),
			(Integer)parameters.get("limit"), (Long)parameters.get("siteId"));
	}

	@Override
	public void setLanguageId(String languageId) {
		this.contextAcceptLanguage = new AcceptLanguage() {

			@Override
			public List<Locale> getLocales() {
				return null;
			}

			@Override
			public String getPreferredLanguageId() {
				return languageId;
			}

			@Override
			public Locale getPreferredLocale() {
				return LocaleUtil.fromLanguageId(languageId);
			}

		};
	}

	@Override
	public void update(
			java.util.Collection<NearestDealer> nearestDealers,
			Map<String, Serializable> parameters)
		throws Exception {
	}

	public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
		this.contextAcceptLanguage = contextAcceptLanguage;
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany) {

		this.contextCompany = contextCompany;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {

		this.contextHttpServletRequest = contextHttpServletRequest;
	}

	public void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {

		this.contextHttpServletResponse = contextHttpServletResponse;
	}

	public void setContextUriInfo(UriInfo contextUriInfo) {
		this.contextUriInfo = contextUriInfo;
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser) {

		this.contextUser = contextUser;
	}

	protected Map<String, String> addAction(
		String actionName, GroupedModel groupedModel, String methodName) {

		return ActionUtil.addAction(
			actionName, getClass(), groupedModel, methodName,
			contextScopeChecker, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, Long id, String methodName, Long ownerId,
		String permissionName, Long siteId) {

		return ActionUtil.addAction(
			actionName, getClass(), id, methodName, contextScopeChecker,
			ownerId, permissionName, siteId, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, String methodName, String permissionName,
		Long siteId) {

		return addAction(
			actionName, siteId, methodName, null, permissionName, siteId);
	}

	protected <T, R> List<R> transform(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transform(collection, unsafeFunction);
	}

	protected <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		return TransformUtil.transform(array, unsafeFunction, clazz);
	}

	protected <T, R> R[] transformToArray(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction, Class<?> clazz) {

		return TransformUtil.transformToArray(
			collection, unsafeFunction, clazz);
	}

	protected <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transformToList(array, unsafeFunction);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected com.liferay.portal.kernel.model.Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected HttpServletResponse contextHttpServletResponse;
	protected Object contextScopeChecker;
	protected UriInfo contextUriInfo;
	protected com.liferay.portal.kernel.model.User contextUser;
	protected GroupLocalService groupLocalService;
	protected ResourceActionLocalService resourceActionLocalService;
	protected ResourcePermissionLocalService resourcePermissionLocalService;
	protected RoleLocalService roleLocalService;
	protected VulcanBatchEngineImportTaskResource
		vulcanBatchEngineImportTaskResource;

}