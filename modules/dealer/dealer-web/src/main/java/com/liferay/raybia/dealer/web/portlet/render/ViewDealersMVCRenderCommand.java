package com.liferay.raybia.dealer.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;
import com.liferay.raybia.dealer.web.display.context.DealersManagementToolbarDisplayContext;
import com.liferay.raybia.dealer.web.permission.resource.definition.DealerPermission;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { "javax.portlet.name=" + DealerPortletKeys.DEALER,
		"mvc.command.name=" + MVCCommandNames.ROOT,
		"mvc.command.name=" + MVCCommandNames.VIEW_DEALERS }, service = MVCRenderCommand.class)
public class ViewDealersMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// Add assignment list related attributes.
		
		addDealerListAttributes(renderRequest);

		// Add Clay management toolbar related attributes.

		addManagementToolbarAttributes(renderRequest, renderResponse);

		renderRequest.setAttribute("dealerPermission", dealerPermission);

		_log.debug("Displaying available dealers");
		
		return "/view.jsp";
	}

	private void addManagementToolbarAttributes(RenderRequest renderRequest, RenderResponse renderResponse) {
		LiferayPortletRequest liferayPortletRequest = portal.getLiferayPortletRequest(renderRequest);

		LiferayPortletResponse liferayPortletResponse = portal.getLiferayPortletResponse(renderResponse);

		DealersManagementToolbarDisplayContext dealersManagementToolbarDisplayContext = new DealersManagementToolbarDisplayContext(
				 portal.getHttpServletRequest(renderRequest), liferayPortletRequest, liferayPortletResponse);

		renderRequest.setAttribute("dealersManagementToolbarDisplayContext",
				dealersManagementToolbarDisplayContext);
	}

	private void addDealerListAttributes(RenderRequest renderRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Resolve start and end for the search.

		int currentPage = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
				SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
				SearchContainer.DEFAULT_DELTA);

		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		// Get sorting options.
		// Notice that this doesn't really sort on name because the field is
		// stored in XML. In real world this search would be integrated to the
		// search engine to get localized sort options.

		String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "name");
		String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");

		// Create comparator

		OrderByComparator<Dealer> comparator = OrderByComparatorFactoryUtil.create("Dealer", orderByCol,
				!("asc").equals(orderByType));

		// Get keywords.
		// Notice that cleaning keywords is not implemented.

		String keywords = ParamUtil.getString(renderRequest, "keywords");

		// Call the service to get the list of assignments.

		List<Dealer> dealers = dealerService.getDealersByKeywords(themeDisplay.getScopeGroupId(),
				keywords, start, end, comparator);

		// Set request attributes.

		long dealerCount = dealerService.getDealersCountByKeywords(themeDisplay.getScopeGroupId(), keywords);
		
		renderRequest.setAttribute("dealers", dealers);
		renderRequest.setAttribute("dealerCount", dealerCount)	;
	}

	@Reference
	protected DealerService dealerService;

	@Reference
	private Portal portal;

	@Reference
	protected DealerPermission dealerPermission;
	
	private static final Logger _log = LoggerFactory.getLogger(ViewDealersMVCRenderCommand.class);
}
