package com.liferay.raybia.headless.dealer.client.resource.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.NearestDealer;
import com.liferay.raybia.headless.dealer.client.http.HttpInvoker;
import com.liferay.raybia.headless.dealer.client.pagination.Page;
import com.liferay.raybia.headless.dealer.client.problem.Problem;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.NearestDealerSerDes;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public interface NearestDealerResource {

	public static Builder builder() {
		return new Builder();
	}

	public Page<NearestDealer> getNearestDealersPage(
			Double latitude, Double longitude, Double radialDistance,
			String unitOfMeasure, Integer limit, Long siteId)
		throws Exception;

	public HttpInvoker.HttpResponse getNearestDealersPageHttpResponse(
			Double latitude, Double longitude, Double radialDistance,
			String unitOfMeasure, Integer limit, Long siteId)
		throws Exception;

	public Page<NearestDealer> getNearestDealersPostcodePage(
			String postcode, Double radialDistance, String unitOfMeasure,
			Integer limit, Long siteId)
		throws Exception;

	public HttpInvoker.HttpResponse getNearestDealersPostcodePageHttpResponse(
			String postcode, Double radialDistance, String unitOfMeasure,
			Integer limit, Long siteId)
		throws Exception;

	public static class Builder {

		public Builder authentication(String login, String password) {
			_login = login;
			_password = password;

			return this;
		}

		public NearestDealerResource build() {
			return new NearestDealerResourceImpl(this);
		}

		public Builder endpoint(String host, int port, String scheme) {
			_host = host;
			_port = port;
			_scheme = scheme;

			return this;
		}

		public Builder header(String key, String value) {
			_headers.put(key, value);

			return this;
		}

		public Builder locale(Locale locale) {
			_locale = locale;

			return this;
		}

		public Builder parameter(String key, String value) {
			_parameters.put(key, value);

			return this;
		}

		private Builder() {
		}

		private Map<String, String> _headers = new LinkedHashMap<>();
		private String _host = "localhost";
		private Locale _locale;
		private String _login = "test@liferay.com";
		private String _password = "test";
		private Map<String, String> _parameters = new LinkedHashMap<>();
		private int _port = 8080;
		private String _scheme = "http";

	}

	public static class NearestDealerResourceImpl
		implements NearestDealerResource {

		public Page<NearestDealer> getNearestDealersPage(
				Double latitude, Double longitude, Double radialDistance,
				String unitOfMeasure, Integer limit, Long siteId)
			throws Exception {

			HttpInvoker.HttpResponse httpResponse =
				getNearestDealersPageHttpResponse(
					latitude, longitude, radialDistance, unitOfMeasure, limit,
					siteId);

			String content = httpResponse.getContent();

			_logger.fine("HTTP response content: " + content);

			_logger.fine("HTTP response message: " + httpResponse.getMessage());
			_logger.fine(
				"HTTP response status code: " + httpResponse.getStatusCode());

			try {
				return Page.of(content, NearestDealerSerDes::toDTO);
			}
			catch (Exception e) {
				_logger.log(
					Level.WARNING,
					"Unable to process HTTP response: " + content, e);

				throw new Problem.ProblemException(Problem.toDTO(content));
			}
		}

		public HttpInvoker.HttpResponse getNearestDealersPageHttpResponse(
				Double latitude, Double longitude, Double radialDistance,
				String unitOfMeasure, Integer limit, Long siteId)
			throws Exception {

			HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

			if (_builder._locale != null) {
				httpInvoker.header(
					"Accept-Language", _builder._locale.toLanguageTag());
			}

			for (Map.Entry<String, String> entry :
					_builder._headers.entrySet()) {

				httpInvoker.header(entry.getKey(), entry.getValue());
			}

			for (Map.Entry<String, String> entry :
					_builder._parameters.entrySet()) {

				httpInvoker.parameter(entry.getKey(), entry.getValue());
			}

			httpInvoker.httpMethod(HttpInvoker.HttpMethod.GET);

			if (latitude != null) {
				httpInvoker.parameter("latitude", String.valueOf(latitude));
			}

			if (longitude != null) {
				httpInvoker.parameter("longitude", String.valueOf(longitude));
			}

			if (radialDistance != null) {
				httpInvoker.parameter(
					"radialDistance", String.valueOf(radialDistance));
			}

			if (unitOfMeasure != null) {
				httpInvoker.parameter(
					"unitOfMeasure", String.valueOf(unitOfMeasure));
			}

			if (limit != null) {
				httpInvoker.parameter("limit", String.valueOf(limit));
			}

			if (siteId != null) {
				httpInvoker.parameter("siteId", String.valueOf(siteId));
			}

			httpInvoker.path(
				_builder._scheme + "://" + _builder._host + ":" +
					_builder._port + "/o/headless-dealers/v1.0/nearestDealers");

			httpInvoker.userNameAndPassword(
				_builder._login + ":" + _builder._password);

			return httpInvoker.invoke();
		}

		public Page<NearestDealer> getNearestDealersPostcodePage(
				String postcode, Double radialDistance, String unitOfMeasure,
				Integer limit, Long siteId)
			throws Exception {

			HttpInvoker.HttpResponse httpResponse =
				getNearestDealersPostcodePageHttpResponse(
					postcode, radialDistance, unitOfMeasure, limit, siteId);

			String content = httpResponse.getContent();

			_logger.fine("HTTP response content: " + content);

			_logger.fine("HTTP response message: " + httpResponse.getMessage());
			_logger.fine(
				"HTTP response status code: " + httpResponse.getStatusCode());

			try {
				return Page.of(content, NearestDealerSerDes::toDTO);
			}
			catch (Exception e) {
				_logger.log(
					Level.WARNING,
					"Unable to process HTTP response: " + content, e);

				throw new Problem.ProblemException(Problem.toDTO(content));
			}
		}

		public HttpInvoker.HttpResponse
				getNearestDealersPostcodePageHttpResponse(
					String postcode, Double radialDistance,
					String unitOfMeasure, Integer limit, Long siteId)
			throws Exception {

			HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

			if (_builder._locale != null) {
				httpInvoker.header(
					"Accept-Language", _builder._locale.toLanguageTag());
			}

			for (Map.Entry<String, String> entry :
					_builder._headers.entrySet()) {

				httpInvoker.header(entry.getKey(), entry.getValue());
			}

			for (Map.Entry<String, String> entry :
					_builder._parameters.entrySet()) {

				httpInvoker.parameter(entry.getKey(), entry.getValue());
			}

			httpInvoker.httpMethod(HttpInvoker.HttpMethod.GET);

			if (radialDistance != null) {
				httpInvoker.parameter(
					"radialDistance", String.valueOf(radialDistance));
			}

			if (unitOfMeasure != null) {
				httpInvoker.parameter(
					"unitOfMeasure", String.valueOf(unitOfMeasure));
			}

			if (limit != null) {
				httpInvoker.parameter("limit", String.valueOf(limit));
			}

			if (siteId != null) {
				httpInvoker.parameter("siteId", String.valueOf(siteId));
			}

			httpInvoker.path(
				_builder._scheme + "://" + _builder._host + ":" +
					_builder._port +
						"/o/headless-dealers/v1.0/nearestDealers/{postcode}",
				postcode);

			httpInvoker.userNameAndPassword(
				_builder._login + ":" + _builder._password);

			return httpInvoker.invoke();
		}

		private NearestDealerResourceImpl(Builder builder) {
			_builder = builder;
		}

		private static final Logger _logger = Logger.getLogger(
			NearestDealerResource.class.getName());

		private Builder _builder;

	}

}