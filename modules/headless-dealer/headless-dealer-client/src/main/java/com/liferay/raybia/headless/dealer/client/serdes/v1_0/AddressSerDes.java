package com.liferay.raybia.headless.dealer.client.serdes.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.Address;
import com.liferay.raybia.headless.dealer.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public class AddressSerDes {

	public static Address toDTO(String json) {
		AddressJSONParser addressJSONParser = new AddressJSONParser();

		return addressJSONParser.parseToDTO(json);
	}

	public static Address[] toDTOs(String json) {
		AddressJSONParser addressJSONParser = new AddressJSONParser();

		return addressJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Address address) {
		if (address == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (address.getLocality() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locality\": ");

			sb.append("\"");

			sb.append(_escape(address.getLocality()));

			sb.append("\"");
		}

		if (address.getPostalCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalCode\": ");

			sb.append("\"");

			sb.append(_escape(address.getPostalCode()));

			sb.append("\"");
		}

		if (address.getState() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(address.getState()));

			sb.append("\"");
		}

		if (address.getStreet() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"street\": ");

			sb.append("\"");

			sb.append(_escape(address.getStreet()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AddressJSONParser addressJSONParser = new AddressJSONParser();

		return addressJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Address address) {
		if (address == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (address.getLocality() == null) {
			map.put("locality", null);
		}
		else {
			map.put("locality", String.valueOf(address.getLocality()));
		}

		if (address.getPostalCode() == null) {
			map.put("postalCode", null);
		}
		else {
			map.put("postalCode", String.valueOf(address.getPostalCode()));
		}

		if (address.getState() == null) {
			map.put("state", null);
		}
		else {
			map.put("state", String.valueOf(address.getState()));
		}

		if (address.getStreet() == null) {
			map.put("street", null);
		}
		else {
			map.put("street", String.valueOf(address.getStreet()));
		}

		return map;
	}

	public static class AddressJSONParser extends BaseJSONParser<Address> {

		@Override
		protected Address createDTO() {
			return new Address();
		}

		@Override
		protected Address[] createDTOArray(int size) {
			return new Address[size];
		}

		@Override
		protected void setField(
			Address address, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "locality")) {
				if (jsonParserFieldValue != null) {
					address.setLocality((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "postalCode")) {
				if (jsonParserFieldValue != null) {
					address.setPostalCode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "state")) {
				if (jsonParserFieldValue != null) {
					address.setState((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "street")) {
				if (jsonParserFieldValue != null) {
					address.setStreet((String)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}