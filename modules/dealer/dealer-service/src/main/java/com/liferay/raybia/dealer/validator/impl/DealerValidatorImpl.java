package com.liferay.raybia.dealer.validator.impl;

import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.postcodes.exception.PostcodeValidationException;
import com.liferay.postcodes.validator.PostcodeValidator;
import com.liferay.raybia.dealer.exception.DealerValidationException;
import com.liferay.raybia.dealer.validator.DealerValidator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = DealerValidator.class)
public class DealerValidatorImpl implements DealerValidator {

	@Override
	public void validate(Map<Locale, String> nameMap, Map<Locale, String> streetMap, Map<Locale, String> localityMap,
			Map<Locale, String> stateMap, String postalCode, String emailAddress, String phoneNumber,
			Map<Locale, String> openingHoursMap, BigDecimal latitude, BigDecimal longitude)
			throws DealerValidationException {

		List<String> errors = new ArrayList<>();

		if (!isDealerValid(nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber,
				openingHoursMap, latitude, longitude, errors)) {
			throw new DealerValidationException(errors);
		}

	}

	private boolean isDealerValid(Map<Locale, String> nameMap, Map<Locale, String> streetMap,
			Map<Locale, String> localityMap, Map<Locale, String> stateMap, String postalCode, String emailAddress,
			String phoneNumber, Map<Locale, String> openingHoursMap, BigDecimal latitude, BigDecimal longitude,
			List<String> errors) {

		boolean result = true;

		result &= isNameValid(nameMap, errors);
		result &= isStreetValid(streetMap, errors);
		result &= isLocalityValid(localityMap, errors);
		result &= isStateValid(stateMap, errors);
		result &= isPostalCodeValid(postalCode, errors);
		result &= isEmailAddressValid(emailAddress, errors);
		result &= isPhoneNumberValid(phoneNumber, errors);
		result &= isOpenHoursValid(openingHoursMap, errors);
		result &= isLatitudeValid(latitude, errors);
		result &= isLongitudeValid(longitude, errors);

		return result;
	}

	private boolean isLongitudeValid(BigDecimal longitude, List<String> errors) {
		if (Validator.isNull(longitude)) {
			errors.add("dealerLongitudeEmpty");
			return false;
		}

		// Longitude must a number between -180 and 180
		final BigDecimal rangeValue = BigDecimal.valueOf(180);
		if (longitude.abs().compareTo(rangeValue) <= 0)
			return true;

		errors.add("dealerLongitudeInvalid");
		return false;
	}

	private boolean isLatitudeValid(BigDecimal latitude, List<String> errors) {
		if (Validator.isNull(latitude)) {
			errors.add("dealerLatitudeEmpty");
			return false;
		}

		// Latitude must be a number between -90 and 90
		final BigDecimal rangeValue = BigDecimal.valueOf(90);
		if (latitude.abs().compareTo(rangeValue) <= 0)
			return true;

		errors.add("dealerLatitudeInvalid");
		return false;
	}

	private boolean isOpenHoursValid(Map<Locale, String> stateMap, List<String> errors) {
		return true;
	}

	private boolean isPhoneNumberValid(String phoneNumber, List<String> errors) {
		if (Validator.isBlank(phoneNumber))
			return true;

		if (Validator.isPhoneNumber(phoneNumber))
			return true;
		
		errors.add("phoneNumberInvalid");
		return false;
	}

	private boolean isEmailAddressValid(String emailAddress, List<String> errors) {
		if (Validator.isBlank(emailAddress))
			return true;

		if (Validator.isEmailAddress(emailAddress))
			return true;

		errors.add("emailAddressInvalid");
		return false;
	}

	private boolean isStateValid(Map<Locale, String> stateMap, List<String> errors) {
		boolean result = true;

		// Verify the map has something

		if (MapUtil.isEmpty(stateMap)) {
			errors.add("dealerStateEmpty");
			result = false;
		} else {

			// Get the default locale.

			Locale defaultLocale = LocaleUtil.getSiteDefault();

			if ((Validator.isBlank(stateMap.get(defaultLocale)))) {
				errors.add("dealerStateEmpty");
				result = false;
			}
		}
		return result;
	}

	private boolean isPostalCodeValid(String postalCode, List<String> errors) {
		if (Validator.isBlank(postalCode)) {
			errors.add("dealerPostalCodeEmpty");
			return false;
		}

		try {
			postcodeValidator.validate(postalCode);
			return true;
		} catch (PostcodeValidationException pve) {
			errors.add("dealerPostalCodeInvalid");
			return false;
		}
	}

	private boolean isNameValid(Map<Locale, String> nameMap, List<String> errors) {
		boolean result = true;

		// Verify the map has something

		if (MapUtil.isEmpty(nameMap)) {
			errors.add("dealerNameEmpty");
			result = false;
		} else {

			// Get the default locale.

			Locale defaultLocale = LocaleUtil.getSiteDefault();

			if ((Validator.isBlank(nameMap.get(defaultLocale)))) {
				errors.add("dealerNameEmpty");
				result = false;
			}
		}
		return result;
	}

	private boolean isStreetValid(Map<Locale, String> streetMap, List<String> errors) {
		return true;
	}

	private boolean isLocalityValid(Map<Locale, String> localityMap, List<String> errors) {
		return true;
	}

	@Reference
	private PostcodeValidator postcodeValidator;
}
