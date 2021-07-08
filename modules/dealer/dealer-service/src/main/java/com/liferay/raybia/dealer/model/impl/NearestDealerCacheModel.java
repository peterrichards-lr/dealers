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

package com.liferay.raybia.dealer.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.raybia.dealer.model.NearestDealer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing NearestDealer in entity cache.
 *
 * @author Peter Richards
 * @generated
 */
public class NearestDealerCacheModel
	implements CacheModel<NearestDealer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NearestDealerCacheModel)) {
			return false;
		}

		NearestDealerCacheModel nearestDealerCacheModel =
			(NearestDealerCacheModel)object;

		if (dealerId == nearestDealerCacheModel.dealerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dealerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{dealerId=");
		sb.append(dealerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", street=");
		sb.append(street);
		sb.append(", locality=");
		sb.append(locality);
		sb.append(", state=");
		sb.append(state);
		sb.append(", postalCode=");
		sb.append(postalCode);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", openingHours=");
		sb.append(openingHours);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append(", distance=");
		sb.append(distance);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NearestDealer toEntityModel() {
		NearestDealerImpl nearestDealerImpl = new NearestDealerImpl();

		nearestDealerImpl.setDealerId(dealerId);
		nearestDealerImpl.setGroupId(groupId);
		nearestDealerImpl.setCompanyId(companyId);
		nearestDealerImpl.setUserId(userId);

		if (userName == null) {
			nearestDealerImpl.setUserName("");
		}
		else {
			nearestDealerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nearestDealerImpl.setCreateDate(null);
		}
		else {
			nearestDealerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nearestDealerImpl.setModifiedDate(null);
		}
		else {
			nearestDealerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			nearestDealerImpl.setName("");
		}
		else {
			nearestDealerImpl.setName(name);
		}

		if (street == null) {
			nearestDealerImpl.setStreet("");
		}
		else {
			nearestDealerImpl.setStreet(street);
		}

		if (locality == null) {
			nearestDealerImpl.setLocality("");
		}
		else {
			nearestDealerImpl.setLocality(locality);
		}

		if (state == null) {
			nearestDealerImpl.setState("");
		}
		else {
			nearestDealerImpl.setState(state);
		}

		if (postalCode == null) {
			nearestDealerImpl.setPostalCode("");
		}
		else {
			nearestDealerImpl.setPostalCode(postalCode);
		}

		if (emailAddress == null) {
			nearestDealerImpl.setEmailAddress("");
		}
		else {
			nearestDealerImpl.setEmailAddress(emailAddress);
		}

		if (phoneNumber == null) {
			nearestDealerImpl.setPhoneNumber("");
		}
		else {
			nearestDealerImpl.setPhoneNumber(phoneNumber);
		}

		if (openingHours == null) {
			nearestDealerImpl.setOpeningHours("");
		}
		else {
			nearestDealerImpl.setOpeningHours(openingHours);
		}

		nearestDealerImpl.setLatitude(latitude);
		nearestDealerImpl.setLongitude(longitude);
		nearestDealerImpl.setDistance(distance);

		nearestDealerImpl.resetOriginalValues();

		return nearestDealerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		dealerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		street = objectInput.readUTF();
		locality = objectInput.readUTF();
		state = objectInput.readUTF();
		postalCode = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		openingHours = objectInput.readUTF();
		latitude = (BigDecimal)objectInput.readObject();
		longitude = (BigDecimal)objectInput.readObject();
		distance = (BigDecimal)objectInput.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(dealerId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (street == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street);
		}

		if (locality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locality);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (postalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postalCode);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (openingHours == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(openingHours);
		}

		objectOutput.writeObject(latitude);
		objectOutput.writeObject(longitude);
		objectOutput.writeObject(distance);
	}

	public long dealerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String street;
	public String locality;
	public String state;
	public String postalCode;
	public String emailAddress;
	public String phoneNumber;
	public String openingHours;
	public BigDecimal latitude;
	public BigDecimal longitude;
	public BigDecimal distance;

}