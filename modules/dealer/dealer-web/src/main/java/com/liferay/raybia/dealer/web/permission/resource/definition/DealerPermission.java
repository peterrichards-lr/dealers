package com.liferay.raybia.dealer.web.permission.resource.definition;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.raybia.dealer.model.Dealer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Peter Richards
 */
@Component(immediate = true, service = DealerPermission.class)
public class DealerPermission {
	public static boolean contains(PermissionChecker permissionChecker, Dealer dealer, String actionId)
			throws PortalException {

		return _dealerModelResourcePermission.contains(permissionChecker, dealer, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long dealerId, String actionId)
			throws PortalException {

		return _dealerModelResourcePermission.contains(permissionChecker, dealerId, actionId);
	}

	@Reference(target = "(model.class.name=com.liferay.raybia.dealer.model.Dealer)", unbind = "-")
	protected void setEntryModelPermission(ModelResourcePermission<Dealer> modelResourcePermission) {

		_dealerModelResourcePermission = modelResourcePermission;
	}

	private static ModelResourcePermission<Dealer> _dealerModelResourcePermission;
}
