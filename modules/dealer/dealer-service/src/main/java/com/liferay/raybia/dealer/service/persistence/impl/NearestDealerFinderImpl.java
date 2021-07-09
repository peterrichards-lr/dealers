package com.liferay.raybia.dealer.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.raybia.dealer.model.DistanceUnitOfMeasure;
import com.liferay.raybia.dealer.model.NearestDealer;
import com.liferay.raybia.dealer.model.impl.NearestDealerImpl;
import com.liferay.raybia.dealer.service.persistence.NearestDealerFinder;

import java.math.BigDecimal;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = NearestDealerFinder.class)
public class NearestDealerFinderImpl extends NearestDealerFinderBaseImpl
    implements NearestDealerFinder
    {

	@Override
	public List<NearestDealer> findByDistance(BigDecimal latitude, BigDecimal longitude, BigDecimal distance,
			DistanceUnitOfMeasure distanceUnit, int limit) {
		Session session = null;
	    try {
	        session = openSession();

	        String sql = _customSQL.get(getClass(),
	            FIND_BY_DISTANCE);

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("nearestDealer", NearestDealerImpl.class);

	        QueryPos qPos = QueryPos.getInstance(q);
	        
	        qPos.add(distanceUnit.getValue());
	        qPos.add(latitude);
	        qPos.add(longitude);
	        qPos.add(latitude); // Latitude is used twice in the query
	        qPos.add(distance);

	        return (List<NearestDealer>) QueryUtil.list(q, getDialect(), 0, limit);
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }

	    return null;
	}
	
	@Override
	public List<NearestDealer> findByDistanceAndGroupId(long groupId, BigDecimal latitude, BigDecimal longitude, BigDecimal distance,
			DistanceUnitOfMeasure distanceUnit, int limit) {
		Session session = null;
	    try {
	        session = openSession();

	        String sql = _customSQL.get(getClass(),
	            FIND_BY_DISTANCE_AND_GROUP_ID);

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("nearestDealer", NearestDealerImpl.class);

	        QueryPos qPos = QueryPos.getInstance(q);
	        
	        qPos.add(distanceUnit.getValue());
	        qPos.add(latitude);
	        qPos.add(longitude);
	        qPos.add(latitude); // Latitude is used twice in the query
	        qPos.add(groupId);
	        qPos.add(distance);

	        return (List<NearestDealer>) QueryUtil.list(q, getDialect(), 0, limit);
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }

	    return null;
	}
	
	public static final String FIND_BY_DISTANCE =
			NearestDealerFinder.class.getName() +
		        ".findByDistance";

	public static final String FIND_BY_DISTANCE_AND_GROUP_ID =
			NearestDealerFinder.class.getName() +
		        ".findByDistanceAndGroupId";

	@Reference
	private CustomSQL _customSQL;
}
