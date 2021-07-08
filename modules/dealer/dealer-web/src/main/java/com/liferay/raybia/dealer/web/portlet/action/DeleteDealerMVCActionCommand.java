package com.liferay.raybia.dealer.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.raybia.dealer.service.DealerService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { "javax.portlet.name=" + DealerPortletKeys.DEALER,
		"mvc.command.name=" + MVCCommandNames.DELETE_DEALER }, service = MVCActionCommand.class)
public class DeleteDealerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		 
		long dealerId = ParamUtil.getLong(actionRequest, "dealerId");

		try {
			_log.debug("Deleting dealer - " + dealerId);

			dealerService.deleteDealer(dealerId);
		} catch (PortalException pe) {
			SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
		}
	}

	@Reference
	private DealerService dealerService;
	
	private static final Logger _log = LoggerFactory.getLogger(DeleteDealerMVCActionCommand.class);
}
