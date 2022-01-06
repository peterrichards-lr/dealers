package com.liferay.raybia.headless.dealer.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.raybia.headless.dealer.client.dto.v1_0.NearestDealer;
import com.liferay.raybia.headless.dealer.client.http.HttpInvoker;
import com.liferay.raybia.headless.dealer.client.pagination.Page;
import com.liferay.raybia.headless.dealer.client.resource.v1_0.NearestDealerResource;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.NearestDealerSerDes;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtilsBean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Peter Richards
 * @generated
 */
@Generated("")
public abstract class BaseNearestDealerResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_nearestDealerResource.setContextCompany(testCompany);

		NearestDealerResource.Builder builder = NearestDealerResource.builder();

		nearestDealerResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		NearestDealer nearestDealer1 = randomNearestDealer();

		String json = objectMapper.writeValueAsString(nearestDealer1);

		NearestDealer nearestDealer2 = NearestDealerSerDes.toDTO(json);

		Assert.assertTrue(equals(nearestDealer1, nearestDealer2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		NearestDealer nearestDealer = randomNearestDealer();

		String json1 = objectMapper.writeValueAsString(nearestDealer);
		String json2 = NearestDealerSerDes.toJSON(nearestDealer);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		NearestDealer nearestDealer = randomNearestDealer();

		String json = NearestDealerSerDes.toJSON(nearestDealer);

		Assert.assertFalse(json.contains(regex));

		nearestDealer = NearestDealerSerDes.toDTO(json);
	}

	@Test
	public void testGetNearestDealersPage() throws Exception {
		Page<NearestDealer> page = nearestDealerResource.getNearestDealersPage(
			null, null, null, RandomTestUtil.randomString(), null, null);

		long totalCount = page.getTotalCount();

		NearestDealer nearestDealer1 =
			testGetNearestDealersPage_addNearestDealer(randomNearestDealer());

		NearestDealer nearestDealer2 =
			testGetNearestDealersPage_addNearestDealer(randomNearestDealer());

		page = nearestDealerResource.getNearestDealersPage(
			null, null, null, null, null, null);

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(nearestDealer1, (List<NearestDealer>)page.getItems());
		assertContains(nearestDealer2, (List<NearestDealer>)page.getItems());
		assertValid(page);
	}

	protected NearestDealer testGetNearestDealersPage_addNearestDealer(
			NearestDealer nearestDealer)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetNearestDealersPage() throws Exception {
		Assert.assertTrue(false);
	}

	@Test
	public void testGetNearestDealersPostcodePage() throws Exception {
		String postcode = testGetNearestDealersPostcodePage_getPostcode();
		String irrelevantPostcode =
			testGetNearestDealersPostcodePage_getIrrelevantPostcode();

		Page<NearestDealer> page =
			nearestDealerResource.getNearestDealersPostcodePage(
				postcode, null, RandomTestUtil.randomString(), null, null);

		Assert.assertEquals(0, page.getTotalCount());

		if (irrelevantPostcode != null) {
			NearestDealer irrelevantNearestDealer =
				testGetNearestDealersPostcodePage_addNearestDealer(
					irrelevantPostcode, randomIrrelevantNearestDealer());

			page = nearestDealerResource.getNearestDealersPostcodePage(
				irrelevantPostcode, null, null, null, null);

			Assert.assertEquals(1, page.getTotalCount());

			assertEquals(
				Arrays.asList(irrelevantNearestDealer),
				(List<NearestDealer>)page.getItems());
			assertValid(page);
		}

		NearestDealer nearestDealer1 =
			testGetNearestDealersPostcodePage_addNearestDealer(
				postcode, randomNearestDealer());

		NearestDealer nearestDealer2 =
			testGetNearestDealersPostcodePage_addNearestDealer(
				postcode, randomNearestDealer());

		page = nearestDealerResource.getNearestDealersPostcodePage(
			postcode, null, null, null, null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(nearestDealer1, nearestDealer2),
			(List<NearestDealer>)page.getItems());
		assertValid(page);
	}

	protected NearestDealer testGetNearestDealersPostcodePage_addNearestDealer(
			String postcode, NearestDealer nearestDealer)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected String testGetNearestDealersPostcodePage_getPostcode()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected String testGetNearestDealersPostcodePage_getIrrelevantPostcode()
		throws Exception {

		return null;
	}

	protected void assertContains(
		NearestDealer nearestDealer, List<NearestDealer> nearestDealers) {

		boolean contains = false;

		for (NearestDealer item : nearestDealers) {
			if (equals(nearestDealer, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			nearestDealers + " does not contain " + nearestDealer, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		NearestDealer nearestDealer1, NearestDealer nearestDealer2) {

		Assert.assertTrue(
			nearestDealer1 + " does not equal " + nearestDealer2,
			equals(nearestDealer1, nearestDealer2));
	}

	protected void assertEquals(
		List<NearestDealer> nearestDealers1,
		List<NearestDealer> nearestDealers2) {

		Assert.assertEquals(nearestDealers1.size(), nearestDealers2.size());

		for (int i = 0; i < nearestDealers1.size(); i++) {
			NearestDealer nearestDealer1 = nearestDealers1.get(i);
			NearestDealer nearestDealer2 = nearestDealers2.get(i);

			assertEquals(nearestDealer1, nearestDealer2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<NearestDealer> nearestDealers1,
		List<NearestDealer> nearestDealers2) {

		Assert.assertEquals(nearestDealers1.size(), nearestDealers2.size());

		for (NearestDealer nearestDealer1 : nearestDealers1) {
			boolean contains = false;

			for (NearestDealer nearestDealer2 : nearestDealers2) {
				if (equals(nearestDealer1, nearestDealer2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				nearestDealers2 + " does not contain " + nearestDealer1,
				contains);
		}
	}

	protected void assertValid(NearestDealer nearestDealer) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("dealer", additionalAssertFieldName)) {
				if (nearestDealer.getDealer() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("distance", additionalAssertFieldName)) {
				if (nearestDealer.getDistance() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<NearestDealer> page) {
		boolean valid = false;

		java.util.Collection<NearestDealer> nearestDealers = page.getItems();

		int size = nearestDealers.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.liferay.raybia.headless.dealer.dto.v1_0.NearestDealer.
						class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		NearestDealer nearestDealer1, NearestDealer nearestDealer2) {

		if (nearestDealer1 == nearestDealer2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("dealer", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						nearestDealer1.getDealer(),
						nearestDealer2.getDealer())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("distance", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						nearestDealer1.getDistance(),
						nearestDealer2.getDistance())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_nearestDealerResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_nearestDealerResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, NearestDealer nearestDealer) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("dealer")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("distance")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected NearestDealer randomNearestDealer() throws Exception {
		return new NearestDealer() {
			{
			}
		};
	}

	protected NearestDealer randomIrrelevantNearestDealer() throws Exception {
		NearestDealer randomIrrelevantNearestDealer = randomNearestDealer();

		return randomIrrelevantNearestDealer;
	}

	protected NearestDealer randomPatchNearestDealer() throws Exception {
		return randomNearestDealer();
	}

	protected NearestDealerResource nearestDealerResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseNearestDealerResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private
		com.liferay.raybia.headless.dealer.resource.v1_0.NearestDealerResource
			_nearestDealerResource;

}