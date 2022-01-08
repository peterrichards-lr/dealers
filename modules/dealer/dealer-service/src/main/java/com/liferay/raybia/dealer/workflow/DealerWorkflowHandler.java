package com.liferay.raybia.dealer.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerLocalService;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    property = {"model.class.name=com.liferay.raybia.dealer.model.Dealer"},
	    service = WorkflowHandler.class
	)
public class DealerWorkflowHandler extends BaseWorkflowHandler<Dealer> {

	@Override
	public String getClassName() {
		return Dealer.class.getName();
	}

	@Override
	public String getType(Locale locale) {
		return ResourceActionsUtil.getModelResource(locale, getClassName());
	}

	@Override
	public Dealer updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
		long userId = GetterUtil.getLong(
		        (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		    long classPK = GetterUtil.getLong(
		        (String)workflowContext.get(
		            WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

		    ServiceContext serviceContext = (ServiceContext)workflowContext.get(
		        "serviceContext");

		    return _dealerLocalService.updateStatus(
		        userId, classPK, status, serviceContext, workflowContext);
	}
	
	@Reference
	private DealerLocalService _dealerLocalService;

}
