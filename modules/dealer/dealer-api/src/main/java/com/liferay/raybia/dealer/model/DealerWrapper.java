/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.raybia.dealer.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Dealer}.
 * </p>
 *
 * @author Peter Richards
 * @see Dealer
 * @generated
 */
public class DealerWrapper
	extends BaseModelWrapper<Dealer> implements Dealer, ModelWrapper<Dealer> {

	public DealerWrapper(Dealer dealer) {
		super(dealer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dealerId", getDealerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("street", getStreet());
		attributes.put("locality", getLocality());
		attributes.put("state", getState());
		attributes.put("postalCode", getPostalCode());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("openingHours", getOpeningHours());
		attributes.put("latitude", getLatitude());
		attributes.put("longitude", getLongitude());
		attributes.put("displayDate", getDisplayDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dealerId = (Long)attributes.get("dealerId");

		if (dealerId != null) {
			setDealerId(dealerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String street = (String)attributes.get("street");

		if (street != null) {
			setStreet(street);
		}

		String locality = (String)attributes.get("locality");

		if (locality != null) {
			setLocality(locality);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String postalCode = (String)attributes.get("postalCode");

		if (postalCode != null) {
			setPostalCode(postalCode);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String openingHours = (String)attributes.get("openingHours");

		if (openingHours != null) {
			setOpeningHours(openingHours);
		}

		BigDecimal latitude = (BigDecimal)attributes.get("latitude");

		if (latitude != null) {
			setLatitude(latitude);
		}

		BigDecimal longitude = (BigDecimal)attributes.get("longitude");

		if (longitude != null) {
			setLongitude(longitude);
		}

		Date displayDate = (Date)attributes.get("displayDate");

		if (displayDate != null) {
			setDisplayDate(displayDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Dealer cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the company ID of this dealer.
	 *
	 * @return the company ID of this dealer
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this dealer.
	 *
	 * @return the create date of this dealer
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dealer ID of this dealer.
	 *
	 * @return the dealer ID of this dealer
	 */
	@Override
	public long getDealerId() {
		return model.getDealerId();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the display date of this dealer.
	 *
	 * @return the display date of this dealer
	 */
	@Override
	public Date getDisplayDate() {
		return model.getDisplayDate();
	}

	/**
	 * Returns the email address of this dealer.
	 *
	 * @return the email address of this dealer
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this dealer.
	 *
	 * @return the group ID of this dealer
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the latitude of this dealer.
	 *
	 * @return the latitude of this dealer
	 */
	@Override
	public BigDecimal getLatitude() {
		return model.getLatitude();
	}

	/**
	 * Returns the locality of this dealer.
	 *
	 * @return the locality of this dealer
	 */
	@Override
	public String getLocality() {
		return model.getLocality();
	}

	/**
	 * Returns the localized locality of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized locality of this dealer
	 */
	@Override
	public String getLocality(java.util.Locale locale) {
		return model.getLocality(locale);
	}

	/**
	 * Returns the localized locality of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized locality of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getLocality(java.util.Locale locale, boolean useDefault) {
		return model.getLocality(locale, useDefault);
	}

	/**
	 * Returns the localized locality of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized locality of this dealer
	 */
	@Override
	public String getLocality(String languageId) {
		return model.getLocality(languageId);
	}

	/**
	 * Returns the localized locality of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized locality of this dealer
	 */
	@Override
	public String getLocality(String languageId, boolean useDefault) {
		return model.getLocality(languageId, useDefault);
	}

	@Override
	public String getLocalityCurrentLanguageId() {
		return model.getLocalityCurrentLanguageId();
	}

	@Override
	public String getLocalityCurrentValue() {
		return model.getLocalityCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized localities of this dealer.
	 *
	 * @return the locales and localized localities of this dealer
	 */
	@Override
	public Map<java.util.Locale, String> getLocalityMap() {
		return model.getLocalityMap();
	}

	/**
	 * Returns the longitude of this dealer.
	 *
	 * @return the longitude of this dealer
	 */
	@Override
	public BigDecimal getLongitude() {
		return model.getLongitude();
	}

	/**
	 * Returns the modified date of this dealer.
	 *
	 * @return the modified date of this dealer
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this dealer.
	 *
	 * @return the name of this dealer
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the localized name of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this dealer
	 */
	@Override
	public String getName(java.util.Locale locale) {
		return model.getName(locale);
	}

	/**
	 * Returns the localized name of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getName(java.util.Locale locale, boolean useDefault) {
		return model.getName(locale, useDefault);
	}

	/**
	 * Returns the localized name of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this dealer
	 */
	@Override
	public String getName(String languageId) {
		return model.getName(languageId);
	}

	/**
	 * Returns the localized name of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this dealer
	 */
	@Override
	public String getName(String languageId, boolean useDefault) {
		return model.getName(languageId, useDefault);
	}

	@Override
	public String getNameCurrentLanguageId() {
		return model.getNameCurrentLanguageId();
	}

	@Override
	public String getNameCurrentValue() {
		return model.getNameCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized names of this dealer.
	 *
	 * @return the locales and localized names of this dealer
	 */
	@Override
	public Map<java.util.Locale, String> getNameMap() {
		return model.getNameMap();
	}

	/**
	 * Returns the opening hours of this dealer.
	 *
	 * @return the opening hours of this dealer
	 */
	@Override
	public String getOpeningHours() {
		return model.getOpeningHours();
	}

	/**
	 * Returns the localized opening hours of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized opening hours of this dealer
	 */
	@Override
	public String getOpeningHours(java.util.Locale locale) {
		return model.getOpeningHours(locale);
	}

	/**
	 * Returns the localized opening hours of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized opening hours of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getOpeningHours(java.util.Locale locale, boolean useDefault) {
		return model.getOpeningHours(locale, useDefault);
	}

	/**
	 * Returns the localized opening hours of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized opening hours of this dealer
	 */
	@Override
	public String getOpeningHours(String languageId) {
		return model.getOpeningHours(languageId);
	}

	/**
	 * Returns the localized opening hours of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized opening hours of this dealer
	 */
	@Override
	public String getOpeningHours(String languageId, boolean useDefault) {
		return model.getOpeningHours(languageId, useDefault);
	}

	@Override
	public String getOpeningHoursCurrentLanguageId() {
		return model.getOpeningHoursCurrentLanguageId();
	}

	@Override
	public String getOpeningHoursCurrentValue() {
		return model.getOpeningHoursCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized opening hourses of this dealer.
	 *
	 * @return the locales and localized opening hourses of this dealer
	 */
	@Override
	public Map<java.util.Locale, String> getOpeningHoursMap() {
		return model.getOpeningHoursMap();
	}

	/**
	 * Returns the phone number of this dealer.
	 *
	 * @return the phone number of this dealer
	 */
	@Override
	public String getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the postal code of this dealer.
	 *
	 * @return the postal code of this dealer
	 */
	@Override
	public String getPostalCode() {
		return model.getPostalCode();
	}

	/**
	 * Returns the primary key of this dealer.
	 *
	 * @return the primary key of this dealer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this dealer.
	 *
	 * @return the state of this dealer
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the localized state of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized state of this dealer
	 */
	@Override
	public String getState(java.util.Locale locale) {
		return model.getState(locale);
	}

	/**
	 * Returns the localized state of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized state of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getState(java.util.Locale locale, boolean useDefault) {
		return model.getState(locale, useDefault);
	}

	/**
	 * Returns the localized state of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized state of this dealer
	 */
	@Override
	public String getState(String languageId) {
		return model.getState(languageId);
	}

	/**
	 * Returns the localized state of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized state of this dealer
	 */
	@Override
	public String getState(String languageId, boolean useDefault) {
		return model.getState(languageId, useDefault);
	}

	@Override
	public String getStateCurrentLanguageId() {
		return model.getStateCurrentLanguageId();
	}

	@Override
	public String getStateCurrentValue() {
		return model.getStateCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized states of this dealer.
	 *
	 * @return the locales and localized states of this dealer
	 */
	@Override
	public Map<java.util.Locale, String> getStateMap() {
		return model.getStateMap();
	}

	/**
	 * Returns the status of this dealer.
	 *
	 * @return the status of this dealer
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this dealer.
	 *
	 * @return the status by user ID of this dealer
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this dealer.
	 *
	 * @return the status by user name of this dealer
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this dealer.
	 *
	 * @return the status by user uuid of this dealer
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this dealer.
	 *
	 * @return the status date of this dealer
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the street of this dealer.
	 *
	 * @return the street of this dealer
	 */
	@Override
	public String getStreet() {
		return model.getStreet();
	}

	/**
	 * Returns the localized street of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized street of this dealer
	 */
	@Override
	public String getStreet(java.util.Locale locale) {
		return model.getStreet(locale);
	}

	/**
	 * Returns the localized street of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized street of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getStreet(java.util.Locale locale, boolean useDefault) {
		return model.getStreet(locale, useDefault);
	}

	/**
	 * Returns the localized street of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized street of this dealer
	 */
	@Override
	public String getStreet(String languageId) {
		return model.getStreet(languageId);
	}

	/**
	 * Returns the localized street of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized street of this dealer
	 */
	@Override
	public String getStreet(String languageId, boolean useDefault) {
		return model.getStreet(languageId, useDefault);
	}

	@Override
	public String getStreetCurrentLanguageId() {
		return model.getStreetCurrentLanguageId();
	}

	@Override
	public String getStreetCurrentValue() {
		return model.getStreetCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized streets of this dealer.
	 *
	 * @return the locales and localized streets of this dealer
	 */
	@Override
	public Map<java.util.Locale, String> getStreetMap() {
		return model.getStreetMap();
	}

	/**
	 * Returns the user ID of this dealer.
	 *
	 * @return the user ID of this dealer
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this dealer.
	 *
	 * @return the user name of this dealer
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this dealer.
	 *
	 * @return the user uuid of this dealer
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this dealer.
	 *
	 * @return the uuid of this dealer
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this dealer is approved.
	 *
	 * @return <code>true</code> if this dealer is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this dealer is denied.
	 *
	 * @return <code>true</code> if this dealer is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this dealer is a draft.
	 *
	 * @return <code>true</code> if this dealer is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this dealer is expired.
	 *
	 * @return <code>true</code> if this dealer is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this dealer is inactive.
	 *
	 * @return <code>true</code> if this dealer is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this dealer is incomplete.
	 *
	 * @return <code>true</code> if this dealer is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this dealer is pending.
	 *
	 * @return <code>true</code> if this dealer is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this dealer is scheduled.
	 *
	 * @return <code>true</code> if this dealer is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets the company ID of this dealer.
	 *
	 * @param companyId the company ID of this dealer
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this dealer.
	 *
	 * @param createDate the create date of this dealer
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dealer ID of this dealer.
	 *
	 * @param dealerId the dealer ID of this dealer
	 */
	@Override
	public void setDealerId(long dealerId) {
		model.setDealerId(dealerId);
	}

	/**
	 * Sets the display date of this dealer.
	 *
	 * @param displayDate the display date of this dealer
	 */
	@Override
	public void setDisplayDate(Date displayDate) {
		model.setDisplayDate(displayDate);
	}

	/**
	 * Sets the email address of this dealer.
	 *
	 * @param emailAddress the email address of this dealer
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this dealer.
	 *
	 * @param groupId the group ID of this dealer
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the latitude of this dealer.
	 *
	 * @param latitude the latitude of this dealer
	 */
	@Override
	public void setLatitude(BigDecimal latitude) {
		model.setLatitude(latitude);
	}

	/**
	 * Sets the locality of this dealer.
	 *
	 * @param locality the locality of this dealer
	 */
	@Override
	public void setLocality(String locality) {
		model.setLocality(locality);
	}

	/**
	 * Sets the localized locality of this dealer in the language.
	 *
	 * @param locality the localized locality of this dealer
	 * @param locale the locale of the language
	 */
	@Override
	public void setLocality(String locality, java.util.Locale locale) {
		model.setLocality(locality, locale);
	}

	/**
	 * Sets the localized locality of this dealer in the language, and sets the default locale.
	 *
	 * @param locality the localized locality of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setLocality(
		String locality, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setLocality(locality, locale, defaultLocale);
	}

	@Override
	public void setLocalityCurrentLanguageId(String languageId) {
		model.setLocalityCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized localities of this dealer from the map of locales and localized localities.
	 *
	 * @param localityMap the locales and localized localities of this dealer
	 */
	@Override
	public void setLocalityMap(Map<java.util.Locale, String> localityMap) {
		model.setLocalityMap(localityMap);
	}

	/**
	 * Sets the localized localities of this dealer from the map of locales and localized localities, and sets the default locale.
	 *
	 * @param localityMap the locales and localized localities of this dealer
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setLocalityMap(
		Map<java.util.Locale, String> localityMap,
		java.util.Locale defaultLocale) {

		model.setLocalityMap(localityMap, defaultLocale);
	}

	/**
	 * Sets the longitude of this dealer.
	 *
	 * @param longitude the longitude of this dealer
	 */
	@Override
	public void setLongitude(BigDecimal longitude) {
		model.setLongitude(longitude);
	}

	/**
	 * Sets the modified date of this dealer.
	 *
	 * @param modifiedDate the modified date of this dealer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this dealer.
	 *
	 * @param name the name of this dealer
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the localized name of this dealer in the language.
	 *
	 * @param name the localized name of this dealer
	 * @param locale the locale of the language
	 */
	@Override
	public void setName(String name, java.util.Locale locale) {
		model.setName(name, locale);
	}

	/**
	 * Sets the localized name of this dealer in the language, and sets the default locale.
	 *
	 * @param name the localized name of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setName(
		String name, java.util.Locale locale, java.util.Locale defaultLocale) {

		model.setName(name, locale, defaultLocale);
	}

	@Override
	public void setNameCurrentLanguageId(String languageId) {
		model.setNameCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized names of this dealer from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this dealer
	 */
	@Override
	public void setNameMap(Map<java.util.Locale, String> nameMap) {
		model.setNameMap(nameMap);
	}

	/**
	 * Sets the localized names of this dealer from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this dealer
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setNameMap(
		Map<java.util.Locale, String> nameMap, java.util.Locale defaultLocale) {

		model.setNameMap(nameMap, defaultLocale);
	}

	/**
	 * Sets the opening hours of this dealer.
	 *
	 * @param openingHours the opening hours of this dealer
	 */
	@Override
	public void setOpeningHours(String openingHours) {
		model.setOpeningHours(openingHours);
	}

	/**
	 * Sets the localized opening hours of this dealer in the language.
	 *
	 * @param openingHours the localized opening hours of this dealer
	 * @param locale the locale of the language
	 */
	@Override
	public void setOpeningHours(String openingHours, java.util.Locale locale) {
		model.setOpeningHours(openingHours, locale);
	}

	/**
	 * Sets the localized opening hours of this dealer in the language, and sets the default locale.
	 *
	 * @param openingHours the localized opening hours of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setOpeningHours(
		String openingHours, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setOpeningHours(openingHours, locale, defaultLocale);
	}

	@Override
	public void setOpeningHoursCurrentLanguageId(String languageId) {
		model.setOpeningHoursCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized opening hourses of this dealer from the map of locales and localized opening hourses.
	 *
	 * @param openingHoursMap the locales and localized opening hourses of this dealer
	 */
	@Override
	public void setOpeningHoursMap(
		Map<java.util.Locale, String> openingHoursMap) {

		model.setOpeningHoursMap(openingHoursMap);
	}

	/**
	 * Sets the localized opening hourses of this dealer from the map of locales and localized opening hourses, and sets the default locale.
	 *
	 * @param openingHoursMap the locales and localized opening hourses of this dealer
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setOpeningHoursMap(
		Map<java.util.Locale, String> openingHoursMap,
		java.util.Locale defaultLocale) {

		model.setOpeningHoursMap(openingHoursMap, defaultLocale);
	}

	/**
	 * Sets the phone number of this dealer.
	 *
	 * @param phoneNumber the phone number of this dealer
	 */
	@Override
	public void setPhoneNumber(String phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the postal code of this dealer.
	 *
	 * @param postalCode the postal code of this dealer
	 */
	@Override
	public void setPostalCode(String postalCode) {
		model.setPostalCode(postalCode);
	}

	/**
	 * Sets the primary key of this dealer.
	 *
	 * @param primaryKey the primary key of this dealer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this dealer.
	 *
	 * @param state the state of this dealer
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the localized state of this dealer in the language.
	 *
	 * @param state the localized state of this dealer
	 * @param locale the locale of the language
	 */
	@Override
	public void setState(String state, java.util.Locale locale) {
		model.setState(state, locale);
	}

	/**
	 * Sets the localized state of this dealer in the language, and sets the default locale.
	 *
	 * @param state the localized state of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setState(
		String state, java.util.Locale locale, java.util.Locale defaultLocale) {

		model.setState(state, locale, defaultLocale);
	}

	@Override
	public void setStateCurrentLanguageId(String languageId) {
		model.setStateCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized states of this dealer from the map of locales and localized states.
	 *
	 * @param stateMap the locales and localized states of this dealer
	 */
	@Override
	public void setStateMap(Map<java.util.Locale, String> stateMap) {
		model.setStateMap(stateMap);
	}

	/**
	 * Sets the localized states of this dealer from the map of locales and localized states, and sets the default locale.
	 *
	 * @param stateMap the locales and localized states of this dealer
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setStateMap(
		Map<java.util.Locale, String> stateMap,
		java.util.Locale defaultLocale) {

		model.setStateMap(stateMap, defaultLocale);
	}

	/**
	 * Sets the status of this dealer.
	 *
	 * @param status the status of this dealer
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this dealer.
	 *
	 * @param statusByUserId the status by user ID of this dealer
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this dealer.
	 *
	 * @param statusByUserName the status by user name of this dealer
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this dealer.
	 *
	 * @param statusByUserUuid the status by user uuid of this dealer
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this dealer.
	 *
	 * @param statusDate the status date of this dealer
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the street of this dealer.
	 *
	 * @param street the street of this dealer
	 */
	@Override
	public void setStreet(String street) {
		model.setStreet(street);
	}

	/**
	 * Sets the localized street of this dealer in the language.
	 *
	 * @param street the localized street of this dealer
	 * @param locale the locale of the language
	 */
	@Override
	public void setStreet(String street, java.util.Locale locale) {
		model.setStreet(street, locale);
	}

	/**
	 * Sets the localized street of this dealer in the language, and sets the default locale.
	 *
	 * @param street the localized street of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setStreet(
		String street, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setStreet(street, locale, defaultLocale);
	}

	@Override
	public void setStreetCurrentLanguageId(String languageId) {
		model.setStreetCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized streets of this dealer from the map of locales and localized streets.
	 *
	 * @param streetMap the locales and localized streets of this dealer
	 */
	@Override
	public void setStreetMap(Map<java.util.Locale, String> streetMap) {
		model.setStreetMap(streetMap);
	}

	/**
	 * Sets the localized streets of this dealer from the map of locales and localized streets, and sets the default locale.
	 *
	 * @param streetMap the locales and localized streets of this dealer
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setStreetMap(
		Map<java.util.Locale, String> streetMap,
		java.util.Locale defaultLocale) {

		model.setStreetMap(streetMap, defaultLocale);
	}

	/**
	 * Sets the user ID of this dealer.
	 *
	 * @param userId the user ID of this dealer
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this dealer.
	 *
	 * @param userName the user name of this dealer
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this dealer.
	 *
	 * @param userUuid the user uuid of this dealer
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this dealer.
	 *
	 * @param uuid the uuid of this dealer
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected DealerWrapper wrap(Dealer dealer) {
		return new DealerWrapper(dealer);
	}

}