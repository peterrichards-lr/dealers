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

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.raybia.dealer.service.http.NearestDealerServiceSoap}.
 *
 * @author Peter Richards
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class NearestDealerSoap implements Serializable {

	public static NearestDealerSoap toSoapModel(NearestDealer model) {
		NearestDealerSoap soapModel = new NearestDealerSoap();

		soapModel.setDealerId(model.getDealerId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setStreet(model.getStreet());
		soapModel.setLocality(model.getLocality());
		soapModel.setState(model.getState());
		soapModel.setPostalCode(model.getPostalCode());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setOpeningHours(model.getOpeningHours());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setDistance(model.getDistance());

		return soapModel;
	}

	public static NearestDealerSoap[] toSoapModels(NearestDealer[] models) {
		NearestDealerSoap[] soapModels = new NearestDealerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NearestDealerSoap[][] toSoapModels(NearestDealer[][] models) {
		NearestDealerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NearestDealerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NearestDealerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NearestDealerSoap[] toSoapModels(List<NearestDealer> models) {
		List<NearestDealerSoap> soapModels = new ArrayList<NearestDealerSoap>(
			models.size());

		for (NearestDealer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NearestDealerSoap[soapModels.size()]);
	}

	public NearestDealerSoap() {
	}

	public long getPrimaryKey() {
		return _dealerId;
	}

	public void setPrimaryKey(long pk) {
		setDealerId(pk);
	}

	public long getDealerId() {
		return _dealerId;
	}

	public void setDealerId(long dealerId) {
		_dealerId = dealerId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getStreet() {
		return _street;
	}

	public void setStreet(String street) {
		_street = street;
	}

	public String getLocality() {
		return _locality;
	}

	public void setLocality(String locality) {
		_locality = locality;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getPostalCode() {
		return _postalCode;
	}

	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getOpeningHours() {
		return _openingHours;
	}

	public void setOpeningHours(String openingHours) {
		_openingHours = openingHours;
	}

	public BigDecimal getLatitude() {
		return _latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		_latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return _longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		_longitude = longitude;
	}

	public BigDecimal getDistance() {
		return _distance;
	}

	public void setDistance(BigDecimal distance) {
		_distance = distance;
	}

	private long _dealerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _street;
	private String _locality;
	private String _state;
	private String _postalCode;
	private String _emailAddress;
	private String _phoneNumber;
	private String _openingHours;
	private BigDecimal _latitude;
	private BigDecimal _longitude;
	private BigDecimal _distance;

}