package com.liferay.raybia.headless.dealer.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.search.test.util.SearchTestRule;
import com.liferay.portal.test.log.CaptureAppender;
import com.liferay.portal.test.log.Log4JLoggerTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.raybia.headless.dealer.client.dto.v1_0.Dealer;
import com.liferay.raybia.headless.dealer.client.http.HttpInvoker;
import com.liferay.raybia.headless.dealer.client.pagination.Page;
import com.liferay.raybia.headless.dealer.client.pagination.Pagination;
import com.liferay.raybia.headless.dealer.client.resource.v1_0.DealerResource;
import com.liferay.raybia.headless.dealer.client.serdes.v1_0.DealerSerDes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Level;

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
public abstract class BaseDealerResourceTestCase {

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

		_dealerResource.setContextCompany(testCompany);

		DealerResource.Builder builder = DealerResource.builder();

		dealerResource = builder.locale(
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

		Dealer dealer1 = randomDealer();

		String json = objectMapper.writeValueAsString(dealer1);

		Dealer dealer2 = DealerSerDes.toDTO(json);

		Assert.assertTrue(equals(dealer1, dealer2));
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

		Dealer dealer = randomDealer();

		String json1 = objectMapper.writeValueAsString(dealer);
		String json2 = DealerSerDes.toJSON(dealer);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Dealer dealer = randomDealer();

		dealer.setEmailAddress(regex);
		dealer.setName(regex);
		dealer.setOpeningHours(regex);
		dealer.setPhoneNumber(regex);

		String json = DealerSerDes.toJSON(dealer);

		Assert.assertFalse(json.contains(regex));

		dealer = DealerSerDes.toDTO(json);

		Assert.assertEquals(regex, dealer.getEmailAddress());
		Assert.assertEquals(regex, dealer.getName());
		Assert.assertEquals(regex, dealer.getOpeningHours());
		Assert.assertEquals(regex, dealer.getPhoneNumber());
	}

	@Test
	public void testGetDealersPage() throws Exception {
		Page<Dealer> page = dealerResource.getDealersPage(
			null, RandomTestUtil.randomString(), null, Pagination.of(1, 2),
			null);

		Assert.assertEquals(0, page.getTotalCount());

		Dealer dealer1 = testGetDealersPage_addDealer(randomDealer());

		Dealer dealer2 = testGetDealersPage_addDealer(randomDealer());

		page = dealerResource.getDealersPage(
			null, null, null, Pagination.of(1, 2), null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(dealer1, dealer2), (List<Dealer>)page.getItems());
		assertValid(page);

		dealerResource.deleteDealer(dealer1.getId());

		dealerResource.deleteDealer(dealer2.getId());
	}

	@Test
	public void testGetDealersPageWithFilterDateTimeEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Dealer dealer1 = randomDealer();

		dealer1 = testGetDealersPage_addDealer(dealer1);

		for (EntityField entityField : entityFields) {
			Page<Dealer> page = dealerResource.getDealersPage(
				null, null, getFilterString(entityField, "between", dealer1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(dealer1),
				(List<Dealer>)page.getItems());
		}
	}

	@Test
	public void testGetDealersPageWithFilterStringEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		Dealer dealer1 = testGetDealersPage_addDealer(randomDealer());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Dealer dealer2 = testGetDealersPage_addDealer(randomDealer());

		for (EntityField entityField : entityFields) {
			Page<Dealer> page = dealerResource.getDealersPage(
				null, null, getFilterString(entityField, "eq", dealer1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(dealer1),
				(List<Dealer>)page.getItems());
		}
	}

	@Test
	public void testGetDealersPageWithPagination() throws Exception {
		Dealer dealer1 = testGetDealersPage_addDealer(randomDealer());

		Dealer dealer2 = testGetDealersPage_addDealer(randomDealer());

		Dealer dealer3 = testGetDealersPage_addDealer(randomDealer());

		Page<Dealer> page1 = dealerResource.getDealersPage(
			null, null, null, Pagination.of(1, 2), null);

		List<Dealer> dealers1 = (List<Dealer>)page1.getItems();

		Assert.assertEquals(dealers1.toString(), 2, dealers1.size());

		Page<Dealer> page2 = dealerResource.getDealersPage(
			null, null, null, Pagination.of(2, 2), null);

		Assert.assertEquals(3, page2.getTotalCount());

		List<Dealer> dealers2 = (List<Dealer>)page2.getItems();

		Assert.assertEquals(dealers2.toString(), 1, dealers2.size());

		Page<Dealer> page3 = dealerResource.getDealersPage(
			null, null, null, Pagination.of(1, 3), null);

		assertEqualsIgnoringOrder(
			Arrays.asList(dealer1, dealer2, dealer3),
			(List<Dealer>)page3.getItems());
	}

	@Test
	public void testGetDealersPageWithSortDateTime() throws Exception {
		testGetDealersPageWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, dealer1, dealer2) -> {
				BeanUtils.setProperty(
					dealer1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetDealersPageWithSortInteger() throws Exception {
		testGetDealersPageWithSort(
			EntityField.Type.INTEGER,
			(entityField, dealer1, dealer2) -> {
				BeanUtils.setProperty(dealer1, entityField.getName(), 0);
				BeanUtils.setProperty(dealer2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetDealersPageWithSortString() throws Exception {
		testGetDealersPageWithSort(
			EntityField.Type.STRING,
			(entityField, dealer1, dealer2) -> {
				Class<?> clazz = dealer1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						dealer1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						dealer2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanUtils.setProperty(
						dealer1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanUtils.setProperty(
						dealer2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanUtils.setProperty(
						dealer1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanUtils.setProperty(
						dealer2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetDealersPageWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, Dealer, Dealer, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Dealer dealer1 = randomDealer();
		Dealer dealer2 = randomDealer();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, dealer1, dealer2);
		}

		dealer1 = testGetDealersPage_addDealer(dealer1);

		dealer2 = testGetDealersPage_addDealer(dealer2);

		for (EntityField entityField : entityFields) {
			Page<Dealer> ascPage = dealerResource.getDealersPage(
				null, null, null, Pagination.of(1, 2),
				entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(dealer1, dealer2),
				(List<Dealer>)ascPage.getItems());

			Page<Dealer> descPage = dealerResource.getDealersPage(
				null, null, null, Pagination.of(1, 2),
				entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(dealer2, dealer1),
				(List<Dealer>)descPage.getItems());
		}
	}

	protected Dealer testGetDealersPage_addDealer(Dealer dealer)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetDealersPage() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"dealers",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 2);
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject dealersJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/dealers");

		Assert.assertEquals(0, dealersJSONObject.get("totalCount"));

		Dealer dealer1 = testGraphQLDealer_addDealer();
		Dealer dealer2 = testGraphQLDealer_addDealer();

		dealersJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/dealers");

		Assert.assertEquals(2, dealersJSONObject.get("totalCount"));

		assertEqualsIgnoringOrder(
			Arrays.asList(dealer1, dealer2),
			Arrays.asList(
				DealerSerDes.toDTOs(dealersJSONObject.getString("items"))));
	}

	@Test
	public void testCreateDealer() throws Exception {
		Dealer randomDealer = randomDealer();

		Dealer postDealer = testCreateDealer_addDealer(randomDealer);

		assertEquals(randomDealer, postDealer);
		assertValid(postDealer);
	}

	protected Dealer testCreateDealer_addDealer(Dealer dealer)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteDealer() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		Dealer dealer = testDeleteDealer_addDealer();

		assertHttpResponseStatusCode(
			204, dealerResource.deleteDealerHttpResponse(dealer.getId()));

		assertHttpResponseStatusCode(
			404, dealerResource.getDealerHttpResponse(dealer.getId()));

		assertHttpResponseStatusCode(
			404, dealerResource.getDealerHttpResponse(0L));
	}

	protected Dealer testDeleteDealer_addDealer() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteDealer() throws Exception {
		Dealer dealer = testGraphQLDealer_addDealer();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteDealer",
						new HashMap<String, Object>() {
							{
								put("dealerId", dealer.getId());
							}
						})),
				"JSONObject/data", "Object/deleteDealer"));

		try (CaptureAppender captureAppender =
				Log4JLoggerTestUtil.configureLog4JLogger(
					"graphql.execution.SimpleDataFetcherExceptionHandler",
					Level.WARN)) {

			JSONArray errorsJSONArray = JSONUtil.getValueAsJSONArray(
				invokeGraphQLQuery(
					new GraphQLField(
						"dealer",
						new HashMap<String, Object>() {
							{
								put("dealerId", dealer.getId());
							}
						},
						new GraphQLField("id"))),
				"JSONArray/errors");

			Assert.assertTrue(errorsJSONArray.length() > 0);
		}
	}

	@Test
	public void testGetDealer() throws Exception {
		Dealer postDealer = testGetDealer_addDealer();

		Dealer getDealer = dealerResource.getDealer(postDealer.getId());

		assertEquals(postDealer, getDealer);
		assertValid(getDealer);
	}

	protected Dealer testGetDealer_addDealer() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetDealer() throws Exception {
		Dealer dealer = testGraphQLDealer_addDealer();

		Assert.assertTrue(
			equals(
				dealer,
				DealerSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"dealer",
								new HashMap<String, Object>() {
									{
										put("dealerId", dealer.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/dealer"))));
	}

	@Test
	public void testGraphQLGetDealerNotFound() throws Exception {
		Long irrelevantDealerId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"dealer",
						new HashMap<String, Object>() {
							{
								put("dealerId", irrelevantDealerId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	@Test
	public void testUpdateDealer() throws Exception {
		Dealer postDealer = testUpdateDealer_addDealer();

		Dealer randomDealer = randomDealer();

		Dealer putDealer = dealerResource.updateDealer(
			postDealer.getId(), randomDealer);

		assertEquals(randomDealer, putDealer);
		assertValid(putDealer);

		Dealer getDealer = dealerResource.getDealer(putDealer.getId());

		assertEquals(randomDealer, getDealer);
		assertValid(getDealer);
	}

	protected Dealer testUpdateDealer_addDealer() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected Dealer testGraphQLDealer_addDealer() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Dealer dealer1, Dealer dealer2) {
		Assert.assertTrue(
			dealer1 + " does not equal " + dealer2, equals(dealer1, dealer2));
	}

	protected void assertEquals(List<Dealer> dealers1, List<Dealer> dealers2) {
		Assert.assertEquals(dealers1.size(), dealers2.size());

		for (int i = 0; i < dealers1.size(); i++) {
			Dealer dealer1 = dealers1.get(i);
			Dealer dealer2 = dealers2.get(i);

			assertEquals(dealer1, dealer2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Dealer> dealers1, List<Dealer> dealers2) {

		Assert.assertEquals(dealers1.size(), dealers2.size());

		for (Dealer dealer1 : dealers1) {
			boolean contains = false;

			for (Dealer dealer2 : dealers2) {
				if (equals(dealer1, dealer2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				dealers2 + " does not contain " + dealer1, contains);
		}
	}

	protected void assertValid(Dealer dealer) {
		boolean valid = true;

		if (dealer.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (dealer.getAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("emailAddress", additionalAssertFieldName)) {
				if (dealer.getEmailAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("geolocation", additionalAssertFieldName)) {
				if (dealer.getGeolocation() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (dealer.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("openingHours", additionalAssertFieldName)) {
				if (dealer.getOpeningHours() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("phoneNumber", additionalAssertFieldName)) {
				if (dealer.getPhoneNumber() == null) {
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

	protected void assertValid(Page<Dealer> page) {
		boolean valid = false;

		java.util.Collection<Dealer> dealers = page.getItems();

		int size = dealers.size();

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

		for (Field field :
				ReflectionUtil.getDeclaredFields(
					com.liferay.raybia.headless.dealer.dto.v1_0.Dealer.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (Field field : fields) {
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
					ReflectionUtil.getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Dealer dealer1, Dealer dealer2) {
		if (dealer1 == dealer2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						dealer1.getAddress(), dealer2.getAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("emailAddress", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						dealer1.getEmailAddress(), dealer2.getEmailAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("geolocation", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						dealer1.getGeolocation(), dealer2.getGeolocation())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(dealer1.getId(), dealer2.getId())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(dealer1.getName(), dealer2.getName())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("openingHours", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						dealer1.getOpeningHours(), dealer2.getOpeningHours())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("phoneNumber", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						dealer1.getPhoneNumber(), dealer2.getPhoneNumber())) {

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
		}

		return true;
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_dealerResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_dealerResource;

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
		EntityField entityField, String operator, Dealer dealer) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("address")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("emailAddress")) {
			sb.append("'");
			sb.append(String.valueOf(dealer.getEmailAddress()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("geolocation")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("name")) {
			sb.append("'");
			sb.append(String.valueOf(dealer.getName()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("openingHours")) {
			sb.append("'");
			sb.append(String.valueOf(dealer.getOpeningHours()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("phoneNumber")) {
			sb.append("'");
			sb.append(String.valueOf(dealer.getPhoneNumber()));
			sb.append("'");

			return sb.toString();
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

	protected Dealer randomDealer() throws Exception {
		return new Dealer() {
			{
				emailAddress =
					StringUtil.toLowerCase(RandomTestUtil.randomString()) +
						"@liferay.com";
				id = RandomTestUtil.randomLong();
				name = StringUtil.toLowerCase(RandomTestUtil.randomString());
				openingHours = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				phoneNumber = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected Dealer randomIrrelevantDealer() throws Exception {
		Dealer randomIrrelevantDealer = randomDealer();

		return randomIrrelevantDealer;
	}

	protected Dealer randomPatchDealer() throws Exception {
		return randomDealer();
	}

	protected DealerResource dealerResource;
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
					sb.append(":");
					sb.append(entry.getValue());
					sb.append(",");
				}

				sb.setLength(sb.length() - 1);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(",");
				}

				sb.setLength(sb.length() - 1);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final Log _log = LogFactoryUtil.getLog(
		BaseDealerResourceTestCase.class);

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
	private com.liferay.raybia.headless.dealer.resource.v1_0.DealerResource
		_dealerResource;

}