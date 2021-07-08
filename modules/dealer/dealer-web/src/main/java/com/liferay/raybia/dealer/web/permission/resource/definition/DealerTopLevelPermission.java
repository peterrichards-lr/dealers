package com.liferay.raybia.dealer.web.permission.resource.definition;

import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.raybia.dealer.constants.DealerConstants;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Peter Richards
 */
@Component(immediate = true)
public class DealerTopLevelPermission {

	public static boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {

		return _portletResourcePermission.contains(permissionChecker, groupId, actionId);
	}

	@Reference(target = "(resource.name=" + DealerConstants.RESOURCE_NAME + ")", unbind = "-")
	protected void setPortletResourcePermission(PortletResourcePermission portletResourcePermission) {

		_portletResourcePermission = portletResourcePermission;
	}

	private static PortletResourcePermission _portletResourcePermission;
}
