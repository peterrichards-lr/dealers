package com.liferay.raybia.dealer.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;
import com.liferay.raybia.dealer.constants.DealerConstants;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerLocalService;

import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = ModelResourcePermissionDefinition.class)
public class DealerModelResourcePermissionDefinition implements ModelResourcePermissionDefinition<Dealer> {

	@Override
	public Dealer getModel(long dealerId) throws PortalException {
		return _dealerLocalService.getDealer(dealerId);
	}

	@Override
	public Class<Dealer> getModelClass() {
		return Dealer.class;
	}

	@Override
	public PortletResourcePermission getPortletResourcePermission() {
		return _portletResourcePermission;
	}

	@Override
	public long getPrimaryKey(Dealer dealer) {
		return dealer.getDealerId();
	}

	@Override
	public void registerModelResourcePermissionLogics(ModelResourcePermission<Dealer> modelResourcePermission,
			Consumer<ModelResourcePermissionLogic<Dealer>> modelResourcePermissionLogicConsumer) {
		modelResourcePermissionLogicConsumer.accept(new StagedModelPermissionLogic<>(_stagingPermission,
				DealerConstants.PORTLET_NAME, Dealer::getDealerId));
	}

	@Reference
	private DealerLocalService _dealerLocalService;

	@Reference(target = "(resource.name=" + DealerConstants.RESOURCE_NAME + ")")
	private PortletResourcePermission _portletResourcePermission;

	@Reference
	private StagingPermission _stagingPermission;
}
