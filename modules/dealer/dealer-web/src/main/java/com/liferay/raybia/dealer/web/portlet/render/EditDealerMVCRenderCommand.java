package com.liferay.raybia.dealer.web.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;

import javax.portlet.PortletException;
import javax.portlet.RenderParameters;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { "javax.portlet.name=" + DealerPortletKeys.DEALER,
		"mvc.command.name=" + MVCCommandNames.EDIT_DEALER }, service = MVCRenderCommand.class)
public class EditDealerMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		final long dealerId = ParamUtil.getLong(renderRequest, "dealerId", 0);

		Dealer dealer = null;

		if (dealerId > 0) {
			try {
				
				_log.debug("Displaying dealer for edit - " + dealerId);
				
				dealer = dealerService.getDealer(dealerId);
			} catch (PortalException e) {
				throw new PortletException(e);
			}
		} else {
			_log.debug("Ready to create new dealer");
		}

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Set back icon visible.

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		portletDisplay.setShowBackIcon(true);

		RenderParameters renderParameters = renderRequest.getRenderParameters();		

		String redirect = renderParameters.getValue("redirect");

		portletDisplay.setURLBack(redirect);

		// Set assignment to the request attributes.

		renderRequest.setAttribute("dealer", dealer);
		renderRequest.setAttribute("dealerClass", Dealer.class);

		return "/dealer/edit_dealer.jsp";	}

	@Reference
	private DealerService dealerService;
		
	private static final Logger _log = LoggerFactory.getLogger(EditDealerMVCRenderCommand.class);

}
