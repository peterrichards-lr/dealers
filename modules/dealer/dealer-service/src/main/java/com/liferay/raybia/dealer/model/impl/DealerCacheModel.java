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
import com.liferay.raybia.dealer.model.Dealer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing Dealer in entity cache.
 *
 * @author Peter Richards
 * @generated
 */
public class DealerCacheModel implements CacheModel<Dealer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DealerCacheModel)) {
			return false;
		}

		DealerCacheModel dealerCacheModel = (DealerCacheModel)object;

		if (dealerId == dealerCacheModel.dealerId) {
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
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dealerId=");
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
		sb.append(", displayDate=");
		sb.append(displayDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dealer toEntityModel() {
		DealerImpl dealerImpl = new DealerImpl();

		if (uuid == null) {
			dealerImpl.setUuid("");
		}
		else {
			dealerImpl.setUuid(uuid);
		}

		dealerImpl.setDealerId(dealerId);
		dealerImpl.setGroupId(groupId);
		dealerImpl.setCompanyId(companyId);
		dealerImpl.setUserId(userId);

		if (userName == null) {
			dealerImpl.setUserName("");
		}
		else {
			dealerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dealerImpl.setCreateDate(null);
		}
		else {
			dealerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dealerImpl.setModifiedDate(null);
		}
		else {
			dealerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			dealerImpl.setName("");
		}
		else {
			dealerImpl.setName(name);
		}

		if (street == null) {
			dealerImpl.setStreet("");
		}
		else {
			dealerImpl.setStreet(street);
		}

		if (locality == null) {
			dealerImpl.setLocality("");
		}
		else {
			dealerImpl.setLocality(locality);
		}

		if (state == null) {
			dealerImpl.setState("");
		}
		else {
			dealerImpl.setState(state);
		}

		if (postalCode == null) {
			dealerImpl.setPostalCode("");
		}
		else {
			dealerImpl.setPostalCode(postalCode);
		}

		if (emailAddress == null) {
			dealerImpl.setEmailAddress("");
		}
		else {
			dealerImpl.setEmailAddress(emailAddress);
		}

		if (phoneNumber == null) {
			dealerImpl.setPhoneNumber("");
		}
		else {
			dealerImpl.setPhoneNumber(phoneNumber);
		}

		if (openingHours == null) {
			dealerImpl.setOpeningHours("");
		}
		else {
			dealerImpl.setOpeningHours(openingHours);
		}

		dealerImpl.setLatitude(latitude);
		dealerImpl.setLongitude(longitude);

		if (displayDate == Long.MIN_VALUE) {
			dealerImpl.setDisplayDate(null);
		}
		else {
			dealerImpl.setDisplayDate(new Date(displayDate));
		}

		dealerImpl.setStatus(status);
		dealerImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			dealerImpl.setStatusByUserName("");
		}
		else {
			dealerImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			dealerImpl.setStatusDate(null);
		}
		else {
			dealerImpl.setStatusDate(new Date(statusDate));
		}

		dealerImpl.resetOriginalValues();

		return dealerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		uuid = objectInput.readUTF();

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
		displayDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

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
		objectOutput.writeLong(displayDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
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
	public long displayDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}