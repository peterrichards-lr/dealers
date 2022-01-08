/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.raybia.dealer.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.raybia.dealer.exception.NoSuchNearestDealerException;
import com.liferay.raybia.dealer.model.NearestDealer;
import com.liferay.raybia.dealer.model.impl.NearestDealerImpl;
import com.liferay.raybia.dealer.model.impl.NearestDealerModelImpl;
import com.liferay.raybia.dealer.service.persistence.NearestDealerPersistence;
import com.liferay.raybia.dealer.service.persistence.impl.constants.RaybiaPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the nearest dealer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Peter Richards
 * @generated
 */
@Component(service = NearestDealerPersistence.class)
public class NearestDealerPersistenceImpl
	extends BasePersistenceImpl<NearestDealer>
	implements NearestDealerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NearestDealerUtil</code> to access the nearest dealer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NearestDealerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public NearestDealerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("state", "state_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NearestDealer.class);

		setModelImplClass(NearestDealerImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the nearest dealer in the entity cache if it is enabled.
	 *
	 * @param nearestDealer the nearest dealer
	 */
	@Override
	public void cacheResult(NearestDealer nearestDealer) {
		entityCache.putResult(
			NearestDealerImpl.class, nearestDealer.getPrimaryKey(),
			nearestDealer);
	}

	/**
	 * Caches the nearest dealers in the entity cache if it is enabled.
	 *
	 * @param nearestDealers the nearest dealers
	 */
	@Override
	public void cacheResult(List<NearestDealer> nearestDealers) {
		for (NearestDealer nearestDealer : nearestDealers) {
			if (entityCache.getResult(
					NearestDealerImpl.class, nearestDealer.getPrimaryKey()) ==
						null) {

				cacheResult(nearestDealer);
			}
		}
	}

	/**
	 * Clears the cache for all nearest dealers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NearestDealerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nearest dealer.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NearestDealer nearestDealer) {
		entityCache.removeResult(NearestDealerImpl.class, nearestDealer);
	}

	@Override
	public void clearCache(List<NearestDealer> nearestDealers) {
		for (NearestDealer nearestDealer : nearestDealers) {
			entityCache.removeResult(NearestDealerImpl.class, nearestDealer);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NearestDealerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new nearest dealer with the primary key. Does not add the nearest dealer to the database.
	 *
	 * @param dealerId the primary key for the new nearest dealer
	 * @return the new nearest dealer
	 */
	@Override
	public NearestDealer create(long dealerId) {
		NearestDealer nearestDealer = new NearestDealerImpl();

		nearestDealer.setNew(true);
		nearestDealer.setPrimaryKey(dealerId);

		nearestDealer.setCompanyId(CompanyThreadLocal.getCompanyId());

		return nearestDealer;
	}

	/**
	 * Removes the nearest dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer that was removed
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	@Override
	public NearestDealer remove(long dealerId)
		throws NoSuchNearestDealerException {

		return remove((Serializable)dealerId);
	}

	/**
	 * Removes the nearest dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nearest dealer
	 * @return the nearest dealer that was removed
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	@Override
	public NearestDealer remove(Serializable primaryKey)
		throws NoSuchNearestDealerException {

		Session session = null;

		try {
			session = openSession();

			NearestDealer nearestDealer = (NearestDealer)session.get(
				NearestDealerImpl.class, primaryKey);

			if (nearestDealer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNearestDealerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(nearestDealer);
		}
		catch (NoSuchNearestDealerException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NearestDealer removeImpl(NearestDealer nearestDealer) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nearestDealer)) {
				nearestDealer = (NearestDealer)session.get(
					NearestDealerImpl.class, nearestDealer.getPrimaryKeyObj());
			}

			if (nearestDealer != null) {
				session.delete(nearestDealer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (nearestDealer != null) {
			clearCache(nearestDealer);
		}

		return nearestDealer;
	}

	@Override
	public NearestDealer updateImpl(NearestDealer nearestDealer) {
		boolean isNew = nearestDealer.isNew();

		if (!(nearestDealer instanceof NearestDealerModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(nearestDealer.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					nearestDealer);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in nearestDealer proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NearestDealer implementation " +
					nearestDealer.getClass());
		}

		NearestDealerModelImpl nearestDealerModelImpl =
			(NearestDealerModelImpl)nearestDealer;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (nearestDealer.getCreateDate() == null)) {
			if (serviceContext == null) {
				nearestDealer.setCreateDate(now);
			}
			else {
				nearestDealer.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!nearestDealerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				nearestDealer.setModifiedDate(now);
			}
			else {
				nearestDealer.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(nearestDealer);
			}
			else {
				nearestDealer = (NearestDealer)session.merge(nearestDealer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NearestDealerImpl.class, nearestDealer, false, true);

		if (isNew) {
			nearestDealer.setNew(false);
		}

		nearestDealer.resetOriginalValues();

		return nearestDealer;
	}

	/**
	 * Returns the nearest dealer with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	@Override
	public NearestDealer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNearestDealerException {

		NearestDealer nearestDealer = fetchByPrimaryKey(primaryKey);

		if (nearestDealer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNearestDealerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return nearestDealer;
	}

	/**
	 * Returns the nearest dealer with the primary key or throws a <code>NoSuchNearestDealerException</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer
	 * @throws NoSuchNearestDealerException if a nearest dealer with the primary key could not be found
	 */
	@Override
	public NearestDealer findByPrimaryKey(long dealerId)
		throws NoSuchNearestDealerException {

		return findByPrimaryKey((Serializable)dealerId);
	}

	/**
	 * Returns the nearest dealer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dealerId the primary key of the nearest dealer
	 * @return the nearest dealer, or <code>null</code> if a nearest dealer with the primary key could not be found
	 */
	@Override
	public NearestDealer fetchByPrimaryKey(long dealerId) {
		return fetchByPrimaryKey((Serializable)dealerId);
	}

	/**
	 * Returns all the nearest dealers.
	 *
	 * @return the nearest dealers
	 */
	@Override
	public List<NearestDealer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @return the range of nearest dealers
	 */
	@Override
	public List<NearestDealer> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nearest dealers
	 */
	@Override
	public List<NearestDealer> findAll(
		int start, int end,
		OrderByComparator<NearestDealer> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the nearest dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NearestDealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of nearest dealers
	 * @param end the upper bound of the range of nearest dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of nearest dealers
	 */
	@Override
	public List<NearestDealer> findAll(
		int start, int end, OrderByComparator<NearestDealer> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<NearestDealer> list = null;

		if (useFinderCache) {
			list = (List<NearestDealer>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEARESTDEALER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEARESTDEALER;

				sql = sql.concat(NearestDealerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NearestDealer>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the nearest dealers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NearestDealer nearestDealer : findAll()) {
			remove(nearestDealer);
		}
	}

	/**
	 * Returns the number of nearest dealers.
	 *
	 * @return the number of nearest dealers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NEARESTDEALER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "dealerId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEARESTDEALER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NearestDealerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the nearest dealer persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new NearestDealerModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", NearestDealer.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NearestDealerImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = RaybiaPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = RaybiaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = RaybiaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NEARESTDEALER =
		"SELECT nearestDealer FROM NearestDealer nearestDealer";

	private static final String _SQL_COUNT_NEARESTDEALER =
		"SELECT COUNT(nearestDealer) FROM NearestDealer nearestDealer";

	private static final String _ORDER_BY_ENTITY_ALIAS = "nearestDealer.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NearestDealer exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		NearestDealerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"state"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class NearestDealerModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			NearestDealerModelImpl nearestDealerModelImpl =
				(NearestDealerModelImpl)baseModel;

			long columnBitmask = nearestDealerModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(nearestDealerModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						nearestDealerModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(nearestDealerModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			NearestDealerModelImpl nearestDealerModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						nearestDealerModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = nearestDealerModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}