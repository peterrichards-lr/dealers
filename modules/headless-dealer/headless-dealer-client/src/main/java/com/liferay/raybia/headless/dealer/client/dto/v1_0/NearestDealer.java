package com.liferay.raybia.headless.dealer.client.dto.v1_0;

import com.liferay.raybia.headless.dealer.client.function.UnsafeSupplier;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.NearestDealerSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class NearestDealer implements Cloneable, Serializable {

	public static NearestDealer toDTO(String json) {
		return NearestDealerSerDes.toDTO(json);
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void setDealer(
		UnsafeSupplier<Dealer, Exception> dealerUnsafeSupplier) {

		try {
			dealer = dealerUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Dealer dealer;

	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	public void setDistance(
		UnsafeSupplier<Distance, Exception> distanceUnsafeSupplier) {

		try {
			distance = distanceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Distance distance;

	@Override
	public NearestDealer clone() throws CloneNotSupportedException {
		return (NearestDealer)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NearestDealer)) {
			return false;
		}

		NearestDealer nearestDealer = (NearestDealer)object;

		return Objects.equals(toString(), nearestDealer.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return NearestDealerSerDes.toJSON(this);
	}

}