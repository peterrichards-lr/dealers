package com.liferay.raybia.dealer.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.PortletResourcePermissionDefinition;
import com.liferay.raybia.dealer.constants.DealerConstants;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = PortletResourcePermissionDefinition.class)
public class DealerPortletResourcePermissionDefinition implements PortletResourcePermissionDefinition {

	@Override
	public PortletResourcePermissionLogic[] getPortletResourcePermissionLogics() {
		return new PortletResourcePermissionLogic[] {
				new StagedPortletPermissionLogic(_stagingPermission, DealerConstants.PORTLET_NAME) };
	}

	@Override
	public String getResourceName() {
		return DealerConstants.RESOURCE_NAME;
	}

	@Reference
	private StagingPermission _stagingPermission;
}
