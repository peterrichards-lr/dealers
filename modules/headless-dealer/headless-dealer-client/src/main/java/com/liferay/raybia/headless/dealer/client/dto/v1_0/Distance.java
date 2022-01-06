package com.liferay.raybia.headless.dealer.client.dto.v1_0;

import com.liferay.raybia.headless.dealer.client.function.UnsafeSupplier;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.DistanceSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class Distance implements Cloneable, Serializable {

	public static Distance toDTO(String json) {
		return DistanceSerDes.toDTO(json);
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setUnit(UnsafeSupplier<String, Exception> unitUnsafeSupplier) {
		try {
			unit = unitUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String unit;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void setValue(
		UnsafeSupplier<Double, Exception> valueUnsafeSupplier) {

		try {
			value = valueUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double value;

	@Override
	public Distance clone() throws CloneNotSupportedException {
		return (Distance)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Distance)) {
			return false;
		}

		Distance distance = (Distance)object;

		return Objects.equals(toString(), distance.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DistanceSerDes.toJSON(this);
	}

}