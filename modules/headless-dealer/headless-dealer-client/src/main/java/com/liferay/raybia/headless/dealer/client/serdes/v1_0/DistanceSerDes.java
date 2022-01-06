package com.liferay.raybia.headless.dealer.client.serdes.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.Distance;
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
public class DistanceSerDes {

	public static Distance toDTO(String json) {
		DistanceJSONParser distanceJSONParser = new DistanceJSONParser();

		return distanceJSONParser.parseToDTO(json);
	}

	public static Distance[] toDTOs(String json) {
		DistanceJSONParser distanceJSONParser = new DistanceJSONParser();

		return distanceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Distance distance) {
		if (distance == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (distance.getUnit() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unit\": ");

			sb.append("\"");

			sb.append(_escape(distance.getUnit()));

			sb.append("\"");
		}

		if (distance.getValue() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"value\": ");

			sb.append(distance.getValue());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DistanceJSONParser distanceJSONParser = new DistanceJSONParser();

		return distanceJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Distance distance) {
		if (distance == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (distance.getUnit() == null) {
			map.put("unit", null);
		}
		else {
			map.put("unit", String.valueOf(distance.getUnit()));
		}

		if (distance.getValue() == null) {
			map.put("value", null);
		}
		else {
			map.put("value", String.valueOf(distance.getValue()));
		}

		return map;
	}

	public static class DistanceJSONParser extends BaseJSONParser<Distance> {

		@Override
		protected Distance createDTO() {
			return new Distance();
		}

		@Override
		protected Distance[] createDTOArray(int size) {
			return new Distance[size];
		}

		@Override
		protected void setField(
			Distance distance, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "unit")) {
				if (jsonParserFieldValue != null) {
					distance.setUnit((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "value")) {
				if (jsonParserFieldValue != null) {
					distance.setValue(
						Double.valueOf((String)jsonParserFieldValue));
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