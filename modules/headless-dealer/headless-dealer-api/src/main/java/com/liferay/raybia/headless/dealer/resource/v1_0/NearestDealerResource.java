package com.liferay.raybia.headless.dealer.resource.v1_0;

import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.raybia.headless.dealer.dto.v1_0.NearestDealer;

import java.util.Locale;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-dealers/v1.0
 *
 * @author Peter Richards
 * @generated
 */
@Generated("")
@ProviderType
public interface NearestDealerResource {

	public static Builder builder() {
		return FactoryHolder.factory.create();
	}

	public Page<NearestDealer> getNearestDealersPage(
			Double latitude, Double longitude, Double radialDistance,
			String unitOfMeasure, Integer limit, Long siteId)
		throws Exception;

	public Page<NearestDealer> getNearestDealersPostcodePage(
			String postcode, Double radialDistance, String unitOfMeasure,
			Integer limit, Long siteId)
		throws Exception;

	public default void setContextAcceptLanguage(
		AcceptLanguage contextAcceptLanguage) {
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany);

	public default void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {
	}

	public default void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {
	}

	public default void setContextUriInfo(UriInfo contextUriInfo) {
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser);

	public static class FactoryHolder {

		public static volatile Factory factory;

	}

	@ProviderType
	public interface Builder {

		public NearestDealerResource build();

		public Builder checkPermissions(boolean checkPermissions);

		public Builder httpServletRequest(
			HttpServletRequest httpServletRequest);

		public Builder preferredLocale(Locale preferredLocale);

		public Builder user(com.liferay.portal.kernel.model.User user);

	}

	@ProviderType
	public interface Factory {

		public Builder create();

	}

}