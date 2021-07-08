package com.liferay.raybia.headless.dealer.internal.resource.v1_0;

import com.liferay.portal.kernel.search.geolocation.GeoLocationPoint;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.postcodes.service.PostcodesService;
import com.liferay.raybia.dealer.model.DistanceUnitOfMeasure;
import com.liferay.raybia.dealer.service.NearestDealerLocalService;
import com.liferay.raybia.headless.dealer.dto.v1_0.Address;
import com.liferay.raybia.headless.dealer.dto.v1_0.Dealer;
import com.liferay.raybia.headless.dealer.dto.v1_0.Distance;
import com.liferay.raybia.headless.dealer.dto.v1_0.Geolocation;
import com.liferay.raybia.headless.dealer.dto.v1_0.NearestDealer;
import com.liferay.raybia.headless.dealer.resource.v1_0.NearestDealerResource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Peter Richards
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/nearest-dealer.properties", scope = ServiceScope.PROTOTYPE, service = NearestDealerResource.class)
public class NearestDealerResourceImpl extends BaseNearestDealerResourceImpl {
	@Override
	public Page<NearestDealer> getNearestDealersPage(@NotNull Double latitude, @NotNull Double longitude,
			Double radialDistance, String unitOfMeasure, Integer limit, Long siteId) throws Exception {
		DistanceUnitOfMeasure distanceUnit = Enum.valueOf(DistanceUnitOfMeasure.class, unitOfMeasure);

		List<com.liferay.raybia.dealer.model.NearestDealer> nearestDealers = siteId == null
				? nearestDealerService.findByDistance(BigDecimal.valueOf(latitude), BigDecimal.valueOf(longitude),
						BigDecimal.valueOf(radialDistance), distanceUnit, limit)
				: nearestDealerService.findByDistanceAndGroupId(siteId, BigDecimal.valueOf(latitude),
						BigDecimal.valueOf(longitude), BigDecimal.valueOf(radialDistance), distanceUnit, limit);

		return Page.of(toDealers(nearestDealers, distanceUnit));
	}

	@Override
	public Page<NearestDealer> getNearestDealersPostcodePage(String postcode, Double radialDistance,
			String unitOfMeasure, Integer limit, Long siteId) throws Exception {
		final GeoLocationPoint geoLocation = postcodesService.FindGeoLocation(postcode);
		if (Validator.isNull(geoLocation))
			return Page.of(Collections.emptyList());

		return getNearestDealersPage(geoLocation.getLatitude(), geoLocation.getLongitude(), radialDistance,
				unitOfMeasure, limit, siteId);
	}

	private @GraphQLField List<NearestDealer> toDealers(
			List<com.liferay.raybia.dealer.model.NearestDealer> nearestDealers, DistanceUnitOfMeasure unitOfMeasure) {
		if (nearestDealers == null) {
			return Collections.emptyList();
		}
		List<NearestDealer> list = new ArrayList<>();

		for (com.liferay.raybia.dealer.model.NearestDealer d : nearestDealers) {
			NearestDealer r = toNearestDealer(d, unitOfMeasure);
			list.add(r);
		}
		return list;
	}

	public static @GraphQLField NearestDealer toNearestDealer(
			com.liferay.raybia.dealer.model.NearestDealer nearestDealer, DistanceUnitOfMeasure unitOfMeasure) {
		return new NearestDealer() {
			{
				dealer = toDealer(nearestDealer, unitOfMeasure);
				distance = toDistance(nearestDealer, unitOfMeasure);
			}
		};
	}

	private static @GraphQLField Dealer toDealer(com.liferay.raybia.dealer.model.NearestDealer dealer,
			DistanceUnitOfMeasure unitOfMeasure) {
		return new Dealer() {
			{
				id = dealer.getDealerId();
				name = dealer.getName();
				address = toAddress(dealer);
				emailAddress = dealer.getEmailAddress();
				phoneNumber = dealer.getPhoneNumber();
				openingHours = dealer.getOpeningHours();
				geolocation = toGeolocation(dealer);
			}
		};
	}

	private static @GraphQLField Distance toDistance(com.liferay.raybia.dealer.model.NearestDealer dealer,
			DistanceUnitOfMeasure unitOfMeasure) {
		return new Distance() {
			{
				value = dealer.getDistance().doubleValue();
				unit = unitOfMeasure.name();
			}
		};
	}

	private static @GraphQLField Geolocation toGeolocation(com.liferay.raybia.dealer.model.NearestDealer dealer) {
		return new Geolocation() {
			{
				latitude = dealer.getLatitude().doubleValue();
				longitude = dealer.getLongitude().doubleValue();
			}
		};
	}

	private static @GraphQLField Address toAddress(com.liferay.raybia.dealer.model.NearestDealer dealer) {
		return new Address() {
			{
				street = dealer.getStreet();
				locality = dealer.getLocality();
				state = dealer.getState();
				postalCode = dealer.getPostalCode();
			}
		};
	};

	@Reference
	private NearestDealerLocalService nearestDealerService;

	@Reference
	private PostcodesService postcodesService;
}