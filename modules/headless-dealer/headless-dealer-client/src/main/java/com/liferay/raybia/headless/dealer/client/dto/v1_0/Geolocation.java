package com.liferay.raybia.headless.dealer.client.dto.v1_0;

import com.liferay.raybia.headless.dealer.client.function.UnsafeSupplier;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.GeolocationSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class Geolocation implements Cloneable, Serializable {

	public static Geolocation toDTO(String json) {
		return GeolocationSerDes.toDTO(json);
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLatitude(
		UnsafeSupplier<Double, Exception> latitudeUnsafeSupplier) {

		try {
			latitude = latitudeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double latitude;

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setLongitude(
		UnsafeSupplier<Double, Exception> longitudeUnsafeSupplier) {

		try {
			longitude = longitudeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double longitude;

	@Override
	public Geolocation clone() throws CloneNotSupportedException {
		return (Geolocation)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Geolocation)) {
			return false;
		}

		Geolocation geolocation = (Geolocation)object;

		return Objects.equals(toString(), geolocation.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return GeolocationSerDes.toJSON(this);
	}

}