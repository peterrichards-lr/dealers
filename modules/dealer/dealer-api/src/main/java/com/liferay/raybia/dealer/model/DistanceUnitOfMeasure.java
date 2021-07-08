package com.liferay.raybia.dealer.model;

import java.math.BigDecimal;

public enum DistanceUnitOfMeasure {
	MILES (new BigDecimal("3961")),
	KILOMETERS (new BigDecimal("6373")),
	METERS (new BigDecimal("6373000")),
	FEET (new BigDecimal(("20914080")))
	;

	private final BigDecimal value;
	
	private DistanceUnitOfMeasure(final BigDecimal value) {
		this.value = value;
	}
	
	public BigDecimal getValue() {
		return value;
	}
}
