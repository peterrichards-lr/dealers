package com.liferay.raybia.dealer.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.workflow.kaleo.definition.Assignment;
import com.liferay.raybia.dealer.exception.DealerValidationException;
import com.liferay.raybia.dealer.service.DealerService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.filter.MutableRenderParametersWrapper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { "javax.portlet.name=" + DealerPortletKeys.DEALER,
		"mvc.command.name=" + MVCCommandNames.EDIT_DEALER }, service = MVCActionCommand.class)
public class EditDealerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Assignment.class.getName(), actionRequest);

		// Get parameters from the request.

		long dealerId = ParamUtil.getLong(actionRequest, "dealerId");

		Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(actionRequest, "name");
		Map<Locale, String> streetMap = LocalizationUtil.getLocalizationMap(actionRequest, "street");
		Map<Locale, String> localityMap = LocalizationUtil.getLocalizationMap(actionRequest, "locality");
		Map<Locale, String> stateMap = LocalizationUtil.getLocalizationMap(actionRequest, "state");
		Map<Locale, String> openingHoursMap = LocalizationUtil.getLocalizationMap(actionRequest, "openingHours");

		String postalCode = ParamUtil.getString(actionRequest, "postalCode");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");

		Double latitude = ParamUtil.getDouble(actionRequest, "latitude");
		Double longitude = ParamUtil.getDouble(actionRequest, "longitude");

		try {

			// Call the service to update the assignment

			_log.debug("Updating dealer " + dealerId);
			
			dealerService.updateDealer(dealerId, nameMap, streetMap, localityMap, stateMap, postalCode, emailAddress, phoneNumber, openingHoursMap, BigDecimal.valueOf(latitude), BigDecimal.valueOf(longitude), serviceContext);

			sendRedirect(actionRequest, actionResponse);
		} catch (DealerValidationException ave) {
			ave.getErrors().forEach(key -> SessionErrors.add(actionRequest, key));
			MutableRenderParametersWrapper wrappier = new MutableRenderParametersWrapper(actionResponse.getRenderParameters());
			wrappier.setValue("mvcRenderCommandName", MVCCommandNames.EDIT_DEALER);

		} catch (PortalException pe) {
			SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
			MutableRenderParametersWrapper wrappier = new MutableRenderParametersWrapper(actionResponse.getRenderParameters());
			wrappier.setValue("mvcRenderCommandName", MVCCommandNames.EDIT_DEALER);
		}
	}

	@Reference
	private DealerService dealerService;

	private static final Logger _log = LoggerFactory.getLogger(EditDealerMVCActionCommand.class);

}
