package com.liferay.raybia.headless.dealer.client.serdes.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.Dealer;
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
public class DealerSerDes {

	public static Dealer toDTO(String json) {
		DealerJSONParser dealerJSONParser = new DealerJSONParser();

		return dealerJSONParser.parseToDTO(json);
	}

	public static Dealer[] toDTOs(String json) {
		DealerJSONParser dealerJSONParser = new DealerJSONParser();

		return dealerJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Dealer dealer) {
		if (dealer == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (dealer.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append(String.valueOf(dealer.getAddress()));
		}

		if (dealer.getEmailAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddress\": ");

			sb.append("\"");

			sb.append(_escape(dealer.getEmailAddress()));

			sb.append("\"");
		}

		if (dealer.getGeolocation() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"geolocation\": ");

			sb.append(String.valueOf(dealer.getGeolocation()));
		}

		if (dealer.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(dealer.getId());
		}

		if (dealer.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(dealer.getName()));

			sb.append("\"");
		}

		if (dealer.getOpeningHours() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"openingHours\": ");

			sb.append("\"");

			sb.append(_escape(dealer.getOpeningHours()));

			sb.append("\"");
		}

		if (dealer.getPhoneNumber() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"phoneNumber\": ");

			sb.append("\"");

			sb.append(_escape(dealer.getPhoneNumber()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DealerJSONParser dealerJSONParser = new DealerJSONParser();

		return dealerJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Dealer dealer) {
		if (dealer == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (dealer.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(dealer.getAddress()));
		}

		if (dealer.getEmailAddress() == null) {
			map.put("emailAddress", null);
		}
		else {
			map.put("emailAddress", String.valueOf(dealer.getEmailAddress()));
		}

		if (dealer.getGeolocation() == null) {
			map.put("geolocation", null);
		}
		else {
			map.put("geolocation", String.valueOf(dealer.getGeolocation()));
		}

		if (dealer.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(dealer.getId()));
		}

		if (dealer.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(dealer.getName()));
		}

		if (dealer.getOpeningHours() == null) {
			map.put("openingHours", null);
		}
		else {
			map.put("openingHours", String.valueOf(dealer.getOpeningHours()));
		}

		if (dealer.getPhoneNumber() == null) {
			map.put("phoneNumber", null);
		}
		else {
			map.put("phoneNumber", String.valueOf(dealer.getPhoneNumber()));
		}

		return map;
	}

	public static class DealerJSONParser extends BaseJSONParser<Dealer> {

		@Override
		protected Dealer createDTO() {
			return new Dealer();
		}

		@Override
		protected Dealer[] createDTOArray(int size) {
			return new Dealer[size];
		}

		@Override
		protected void setField(
			Dealer dealer, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					dealer.setAddress(
						AddressSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "emailAddress")) {
				if (jsonParserFieldValue != null) {
					dealer.setEmailAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "geolocation")) {
				if (jsonParserFieldValue != null) {
					dealer.setGeolocation(
						GeolocationSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					dealer.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					dealer.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "openingHours")) {
				if (jsonParserFieldValue != null) {
					dealer.setOpeningHours((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "phoneNumber")) {
				if (jsonParserFieldValue != null) {
					dealer.setPhoneNumber((String)jsonParserFieldValue);
				}
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
			sb.append("\": ");

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
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}