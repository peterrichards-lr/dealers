package com.liferay.raybia.headless.dealer.internal.resource.v1_0;

import com.liferay.headless.common.spi.service.context.ServiceContextRequestUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;
import com.liferay.portal.vulcan.util.SearchUtil;
import com.liferay.raybia.dealer.service.DealerLocalService;
import com.liferay.raybia.headless.dealer.dto.v1_0.Address;
import com.liferay.raybia.headless.dealer.dto.v1_0.Dealer;
import com.liferay.raybia.headless.dealer.dto.v1_0.Geolocation;
import com.liferay.raybia.headless.dealer.resource.v1_0.DealerResource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.ws.rs.BadRequestException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Peter Richards
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/dealer.properties", scope = ServiceScope.PROTOTYPE, service = DealerResource.class)
public class DealerResourceImpl extends BaseDealerResourceImpl {

	@Override
	public Page<Dealer> getDealersPage(@NotNull Long siteId, String search, Filter filter,
			Pagination pagination, Sort[] sorts) throws Exception {

		return SearchUtil.search(
				Collections.EMPTY_MAP,
				booleanQuery -> {
		}, filter, com.liferay.raybia.dealer.model.Dealer.class, search, pagination,
				queryConfig -> queryConfig.setSelectedFieldNames(Field.ENTRY_CLASS_PK), searchContext -> {
					searchContext.setCompanyId(contextCompany.getCompanyId());
					searchContext.setGroupIds(new long[] { siteId });
				},
				sorts,
				document -> toDealer(
						dealerLocalService.getDealer(GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK))))
				);
	}

	@Override
	public Dealer updateDealer(@NotNull Long dealerId, Dealer dealer) throws Exception {
		try {
			if (Validator.isNull(dealer)) {
				throw new BadRequestException("A dealer object is needed");
			}

			if (Validator.isNull(dealer.getAddress())) {
				throw new BadRequestException("A dealer needs address infomation");
			}

			if (Validator.isNull(dealer.getGeolocation()) || Validator.isNull(dealer.getGeolocation().getLatitude())
					|| Validator.isNull(dealer.getGeolocation().getLongitude())) {
				throw new BadRequestException("A dealer needs geolocation information");
			}

			com.liferay.raybia.dealer.model.Dealer d = dealerLocalService.updateDealer(dealerId,
					buildMap(dealer.getName()), buildMap(dealer.getAddress().getStreet()),
					buildMap(dealer.getAddress().getLocality()), buildMap(dealer.getAddress().getState()),
					dealer.getAddress().getPostalCode(), dealer.getEmailAddress(), dealer.getPhoneNumber(),
					buildMap(dealer.getOpeningHours()), BigDecimal.valueOf(dealer.getGeolocation().getLatitude()),
					BigDecimal.valueOf(dealer.getGeolocation().getLongitude()), _getServiceContext(null, "anyone"));

			return toDealer(d);
		} catch (Exception e) {
			_log.error("Error updating dealer: " + e.getMessage(), e);

			throw e;
		}
	}

	@Override
	public Dealer createDealer(Long siteId, Dealer dealer) throws Exception {
		try {
			if (Validator.isNull(dealer)) {
				throw new BadRequestException("A dealer object is needed");
			}

			if (Validator.isNull(dealer.getAddress())) {
				throw new BadRequestException("A dealer needs address infomation");
			}

			if (Validator.isNull(dealer.getGeolocation()) || Validator.isNull(dealer.getGeolocation().getLatitude())
					|| Validator.isNull(dealer.getGeolocation().getLongitude())) {
				throw new BadRequestException("A dealer needs geolocation information");
			}

			com.liferay.raybia.dealer.model.Dealer d = dealerLocalService.addDealer(siteId, buildMap(dealer.getName()),
					buildMap(dealer.getAddress().getStreet()), buildMap(dealer.getAddress().getLocality()),
					buildMap(dealer.getAddress().getState()), dealer.getAddress().getPostalCode(),
					dealer.getEmailAddress(), dealer.getPhoneNumber(), buildMap(dealer.getOpeningHours()),
					BigDecimal.valueOf(dealer.getGeolocation().getLatitude()),
					BigDecimal.valueOf(dealer.getGeolocation().getLongitude()), _getServiceContext(siteId, "anyone"));

			return toDealer(d);
		} catch (Exception e) {
			_log.error("Error creating dealer: " + e.getMessage(), e);

			throw e;
		}
	}

	@Override
	public Dealer getDealer(@NotNull Long dealerId) throws Exception {
		try {
			return toDealer(dealerLocalService.getDealer(dealerId));
		} catch (Exception e) {
			_log.error("Error getting dealer [" + dealerId + "]: " + e.getMessage(), e);
			throw e;
		}
	}

	private Map<Locale, String> buildMap(final String value) {
		final Locale defaultLocale = contextAcceptLanguage.getPreferredLocale();
		return LocalizedMapUtil.getLocalizedMap(defaultLocale, value, Collections.emptyMap());
	}

	private long _getTotalCount(Long siteId) {
		DynamicQuery dynamicQuery = dealerLocalService.dynamicQuery();

		dynamicQuery.add(RestrictionsFactoryUtil.eq("companyId", contextCompany.getCompanyId()));

		if (siteId != null) {
			dynamicQuery.add(RestrictionsFactoryUtil.eq("groupId", siteId));
		}

		return dealerLocalService.dynamicQueryCount(dynamicQuery);
	}

	private @GraphQLField List<Dealer> toDealers(List<com.liferay.raybia.dealer.model.Dealer> dealers) {
		if (dealers == null) {
			return Collections.emptyList();
		}
		List<Dealer> list = new ArrayList<>();

		for (com.liferay.raybia.dealer.model.Dealer d : dealers) {
			Dealer r = toDealer(d);
			list.add(r);
		}
		return list;
	}

	private static @GraphQLField Dealer toDealer(com.liferay.raybia.dealer.model.Dealer dealer) {
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

	private static @GraphQLField Address toAddress(com.liferay.raybia.dealer.model.Dealer dealer) {
		return new Address() {
			{
				street = dealer.getStreet();
				locality = dealer.getLocality();
				state = dealer.getState();
				postalCode = dealer.getPostalCode();
			}
		};
	};

	private static @GraphQLField Geolocation toGeolocation(com.liferay.raybia.dealer.model.Dealer dealer) {
		return new Geolocation() {
			{
				latitude = dealer.getLatitude().doubleValue();
				longitude = dealer.getLongitude().doubleValue();
			}
		};
	}

	protected ServiceContext _getServiceContext(Long groupId, String viewableBy) {
		ServiceContext serviceContext = ServiceContextRequestUtil.createServiceContext(new Long[0], new String[0], null,
				groupId, contextHttpServletRequest, viewableBy);
		serviceContext.setCompanyId(contextCompany.getCompanyId());

		// need the current user in the service context.
		// will get easier in newer version of the REST Builder plugin...
		// but for now, this is the only game in town.
		long userId = PrincipalThreadLocal.getUserId();

		serviceContext.setUserId(userId);

		return serviceContext;
	}

	@Reference
	private DealerLocalService dealerLocalService;

	private static final Logger _log = LoggerFactory.getLogger(DealerResourceImpl.class);
}