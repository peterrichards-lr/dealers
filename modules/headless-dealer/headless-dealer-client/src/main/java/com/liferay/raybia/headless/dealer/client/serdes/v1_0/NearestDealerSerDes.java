package com.liferay.raybia.headless.dealer.client.serdes.v1_0;

import com.liferay.raybia.headless.dealer.client.dto.v1_0.NearestDealer;
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
public class NearestDealerSerDes {

	public static NearestDealer toDTO(String json) {
		NearestDealerJSONParser nearestDealerJSONParser =
			new NearestDealerJSONParser();

		return nearestDealerJSONParser.parseToDTO(json);
	}

	public static NearestDealer[] toDTOs(String json) {
		NearestDealerJSONParser nearestDealerJSONParser =
			new NearestDealerJSONParser();

		return nearestDealerJSONParser.parseToDTOs(json);
	}

	public static String toJSON(NearestDealer nearestDealer) {
		if (nearestDealer == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (nearestDealer.getDealer() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dealer\": ");

			sb.append(String.valueOf(nearestDealer.getDealer()));
		}

		if (nearestDealer.getDistance() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"distance\": ");

			sb.append(String.valueOf(nearestDealer.getDistance()));
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		NearestDealerJSONParser nearestDealerJSONParser =
			new NearestDealerJSONParser();

		return nearestDealerJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(NearestDealer nearestDealer) {
		if (nearestDealer == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (nearestDealer.getDealer() == null) {
			map.put("dealer", null);
		}
		else {
			map.put("dealer", String.valueOf(nearestDealer.getDealer()));
		}

		if (nearestDealer.getDistance() == null) {
			map.put("distance", null);
		}
		else {
			map.put("distance", String.valueOf(nearestDealer.getDistance()));
		}

		return map;
	}

	public static class NearestDealerJSONParser
		extends BaseJSONParser<NearestDealer> {

		@Override
		protected NearestDealer createDTO() {
			return new NearestDealer();
		}

		@Override
		protected NearestDealer[] createDTOArray(int size) {
			return new NearestDealer[size];
		}

		@Override
		protected void setField(
			NearestDealer nearestDealer, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dealer")) {
				if (jsonParserFieldValue != null) {
					nearestDealer.setDealer(
						DealerSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "distance")) {
				if (jsonParserFieldValue != null) {
					nearestDealer.setDistance(
						DistanceSerDes.toDTO((String)jsonParserFieldValue));
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