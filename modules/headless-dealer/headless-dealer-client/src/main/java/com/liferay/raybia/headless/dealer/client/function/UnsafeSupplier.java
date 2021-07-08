package com.liferay.raybia.headless.dealer.client.function;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}