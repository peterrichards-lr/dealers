package com.liferay.raybia.headless.dealer.client.serdes.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.Geolocation;
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
public class GeolocationSerDes {

	public static Geolocation toDTO(String json) {
		GeolocationJSONParser geolocationJSONParser =
			new GeolocationJSONParser();

		return geolocationJSONParser.parseToDTO(json);
	}

	public static Geolocation[] toDTOs(String json) {
		GeolocationJSONParser geolocationJSONParser =
			new GeolocationJSONParser();

		return geolocationJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Geolocation geolocation) {
		if (geolocation == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (geolocation.getLatitude() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"latitude\": ");

			sb.append(geolocation.getLatitude());
		}

		if (geolocation.getLongitude() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"longitude\": ");

			sb.append(geolocation.getLongitude());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		GeolocationJSONParser geolocationJSONParser =
			new GeolocationJSONParser();

		return geolocationJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Geolocation geolocation) {
		if (geolocation == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (geolocation.getLatitude() == null) {
			map.put("latitude", null);
		}
		else {
			map.put("latitude", String.valueOf(geolocation.getLatitude()));
		}

		if (geolocation.getLongitude() == null) {
			map.put("longitude", null);
		}
		else {
			map.put("longitude", String.valueOf(geolocation.getLongitude()));
		}

		return map;
	}

	public static class GeolocationJSONParser
		extends BaseJSONParser<Geolocation> {

		@Override
		protected Geolocation createDTO() {
			return new Geolocation();
		}

		@Override
		protected Geolocation[] createDTOArray(int size) {
			return new Geolocation[size];
		}

		@Override
		protected void setField(
			Geolocation geolocation, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "latitude")) {
				if (jsonParserFieldValue != null) {
					geolocation.setLatitude(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "longitude")) {
				if (jsonParserFieldValue != null) {
					geolocation.setLongitude(
						Double.valueOf((String)jsonParserFieldValue));
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