package com.liferay.raybia.headless.dealer.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
@GraphQLName("Address")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Address")
public class Address {

	public static Address toDTO(String json) {
		return ObjectMapperUtil.readValue(Address.class, json);
	}

	@Schema(description = "The locality, i.e. the borough, town or city")
	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@JsonIgnore
	public void setLocality(
		UnsafeSupplier<String, Exception> localityUnsafeSupplier) {

		try {
			locality = localityUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The locality, i.e. the borough, town or city")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String locality;

	@Schema(description = "The postal code")
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonIgnore
	public void setPostalCode(
		UnsafeSupplier<String, Exception> postalCodeUnsafeSupplier) {

		try {
			postalCode = postalCodeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The postal code")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String postalCode;

	@Schema(description = "The state or county")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonIgnore
	public void setState(
		UnsafeSupplier<String, Exception> stateUnsafeSupplier) {

		try {
			state = stateUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The state or county")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String state;

	@Schema(description = "The street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@JsonIgnore
	public void setStreet(
		UnsafeSupplier<String, Exception> streetUnsafeSupplier) {

		try {
			street = streetUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The street")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String street;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Address)) {
			return false;
		}

		Address address = (Address)object;

		return Objects.equals(toString(), address.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (locality != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locality\": ");

			sb.append("\"");

			sb.append(_escape(locality));

			sb.append("\"");
		}

		if (postalCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalCode\": ");

			sb.append("\"");

			sb.append(_escape(postalCode));

			sb.append("\"");
		}

		if (state != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(state));

			sb.append("\"");
		}

		if (street != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"street\": ");

			sb.append("\"");

			sb.append(_escape(street));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		defaultValue = "com.liferay.raybia.headless.dealer.dto.v1_0.Address",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		return string.replaceAll("\"", "\\\\\"");
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\":");

			Object value = entry.getValue();

			Class<?> clazz = value.getClass();

			if (clazz.isArray()) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(value);
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}