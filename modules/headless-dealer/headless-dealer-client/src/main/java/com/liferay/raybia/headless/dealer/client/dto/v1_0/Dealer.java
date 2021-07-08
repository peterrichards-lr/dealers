package com.liferay.raybia.headless.dealer.client.dto.v1_0;

import com.liferay.raybia.headless.dealer.client.function.UnsafeSupplier;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.DealerSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class Dealer implements Cloneable {

	public static Dealer toDTO(String json) {
		return DealerSerDes.toDTO(json);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAddress(
		UnsafeSupplier<Address, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Address address;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setEmailAddress(
		UnsafeSupplier<String, Exception> emailAddressUnsafeSupplier) {

		try {
			emailAddress = emailAddressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String emailAddress;

	public Geolocation getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Geolocation geolocation) {
		this.geolocation = geolocation;
	}

	public void setGeolocation(
		UnsafeSupplier<Geolocation, Exception> geolocationUnsafeSupplier) {

		try {
			geolocation = geolocationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Geolocation geolocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public void setOpeningHours(
		UnsafeSupplier<String, Exception> openingHoursUnsafeSupplier) {

		try {
			openingHours = openingHoursUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String openingHours;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPhoneNumber(
		UnsafeSupplier<String, Exception> phoneNumberUnsafeSupplier) {

		try {
			phoneNumber = phoneNumberUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String phoneNumber;

	@Override
	public Dealer clone() throws CloneNotSupportedException {
		return (Dealer)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Dealer)) {
			return false;
		}

		Dealer dealer = (Dealer)object;

		return Objects.equals(toString(), dealer.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DealerSerDes.toJSON(this);
	}

}