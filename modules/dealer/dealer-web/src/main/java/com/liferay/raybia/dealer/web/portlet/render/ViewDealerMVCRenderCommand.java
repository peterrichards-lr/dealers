package com.liferay.raybia.dealer.web.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;

import java.text.DateFormat;

import javax.portlet.PortletException;
import javax.portlet.RenderParameters;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { "javax.portlet.name=" + DealerPortletKeys.DEALER,
		"mvc.command.name=" + MVCCommandNames.VIEW_DEALER }, service = MVCRenderCommand.class)
public class ViewDealerMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long dealerId = ParamUtil.getLong(renderRequest, "dealerId", 0);

		// Call the service to get the assignment.

		Dealer dealer;
		try {
			_log.debug("Displaying dealer for view - " + dealerId);
			
			dealer = dealerService.getDealer(dealerId);
		} catch (PortalException e) {
			throw new PortletException(e);
		}

		DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat("EEEEE, MMMMM dd, yyyy",
				renderRequest.getLocale());

		// Set attributes to the request.

		renderRequest.setAttribute("dealer", dealer);
		renderRequest.setAttribute("createDate", dateFormat.format(dealer.getCreateDate()));

		// Set back icon visible.

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		RenderParameters renderParameters = renderRequest.getRenderParameters();		

		String redirect = renderParameters.getValue("redirect");

		portletDisplay.setShowBackIcon(true);
		portletDisplay.setURLBack(redirect);
		
		return "/dealer/view_dealer.jsp";
	}
	
	@Reference
	private DealerService dealerService;
	
	private static final Logger _log = LoggerFactory.getLogger(ViewDealerMVCRenderCommand.class);

}
