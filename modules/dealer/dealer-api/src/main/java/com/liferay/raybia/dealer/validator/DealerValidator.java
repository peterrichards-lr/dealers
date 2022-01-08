package com.liferay.raybia.dealer.validator;

import com.liferay.raybia.dealer.exception.DealerValidationException;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

public interface DealerValidator {
	/**
	 * Validates a Dealer
	 * 
	 * @param nameMap
	 * @param streetMap
	 * @param localityMap
	 * @param stateMap
	 * @param postalCode
	 * @param emailAddress
	 * @param phoneNumber
	 * @param openingHours
	 * @param latitude
	 * @param longitude
	 * @throws DealerValidationException
	 */
	public void validate(final Map<Locale, String> nameMap,
			final Map<Locale, String> streetMap,
			final Map<Locale, String> localityMap,
			final Map<Locale, String> stateMap,
			final String postalCode,
			final String emailAddress,
			final String phoneNumber,
			final Map<Locale, String> openingHours,
			final BigDecimal latitude,
			final BigDecimal longitude,
			final int status)
			throws DealerValidationException;
}
