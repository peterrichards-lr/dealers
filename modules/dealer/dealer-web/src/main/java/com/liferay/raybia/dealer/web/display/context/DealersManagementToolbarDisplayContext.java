package com.liferay.raybia.dealer.web.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.display.context.BaseManagementToolbarDisplayContext;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.CreationMenu;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.ViewTypeItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.ViewTypeItemList;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortalPreferences;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;
import com.liferay.raybia.dealer.web.permission.resource.definition.DealerTopLevelPermission;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.filter.MutableRenderParametersWrapper;
import javax.servlet.http.HttpServletRequest;

public class DealersManagementToolbarDisplayContext extends BaseManagementToolbarDisplayContext {

	public DealersManagementToolbarDisplayContext(HttpServletRequest httpServletRequest,
			LiferayPortletRequest liferayPortletRequest, LiferayPortletResponse liferayPortletResponse) {
		
		super(httpServletRequest, liferayPortletRequest, liferayPortletResponse);
		
		portalPreferences = PortletPreferencesFactoryUtil.getPortalPreferences(liferayPortletRequest);

		themeDisplay = (ThemeDisplay) httpServletRequest.getAttribute(WebKeys.THEME_DISPLAY);
	}

	public CreationMenu getCreationMenu() {

		// Check if user has permissions to add dealers.

		if (!DealerTopLevelPermission.contains(themeDisplay.getPermissionChecker(),
				themeDisplay.getScopeGroupId(), "ADD_ENTRY")) {

			return null;
		}

		// Create the menu.

		return new CreationMenu() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3557292267626965203L;

			{
				addDropdownItem(dropdownItem -> {
					dropdownItem.setHref(liferayPortletResponse.createRenderURL(), "mvcRenderCommandName",
							MVCCommandNames.EDIT_DEALER, "redirect", currentURLObj.toString());
					dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "add-dealer"));
				});
			}
		};
	}

	@Override
	public String getClearResultsURL() {
		return getSearchActionURL();
	}

	public String getDisplayStyle() {

		String displayStyle = ParamUtil.getString(httpServletRequest, "displayStyle");

		if (Validator.isNull(displayStyle)) {
			displayStyle = portalPreferences.getValue(DealerPortletKeys.DEALER, "dealers-display-style",
					"descriptive");
		} else {
			portalPreferences.setValue(DealerPortletKeys.DEALER, "dealers-display-style", displayStyle);

			httpServletRequest.setAttribute(WebKeys.SINGLE_PAGE_APPLICATION_CLEAR_CACHE, Boolean.TRUE);
		}

		return displayStyle;
	}

	public String getOrderByCol() {

		return ParamUtil.getString(httpServletRequest, "orderByCol", "name");
	}

	public String getOrderByType() {

		return ParamUtil.getString(httpServletRequest, "orderByType", "asc");
	}

	@Override
	public String getSearchActionURL() {

		PortletURL searchURL = liferayPortletResponse.createRenderURL();

		searchURL.setProperty("mvcRenderCommandName", MVCCommandNames.VIEW_DEALERS);

		String navigation = ParamUtil.getString(httpServletRequest, "navigation", "entries");

		MutableRenderParametersWrapper wrapper = new MutableRenderParametersWrapper(searchURL.getRenderParameters());
		
		wrapper.setValue("navigation", navigation);
		wrapper.setValue("orderByCol", getOrderByCol());
		wrapper.setValue("orderByType", getOrderByType());

		return searchURL.toString();
	}

	@Override
	public List<ViewTypeItem> getViewTypeItems() {
		PortletURL portletURL = liferayPortletResponse.createRenderURL();

		MutableRenderParametersWrapper wrapper = new MutableRenderParametersWrapper(portletURL.getRenderParameters());
		
		wrapper.setValue("mvcRenderCommandName", MVCCommandNames.VIEW_DEALERS);

		int delta = ParamUtil.getInteger(httpServletRequest, SearchContainer.DEFAULT_DELTA_PARAM);

		if (delta > 0) {
			wrapper.setValue("delta", String.valueOf(delta));
		}

		String orderByCol = ParamUtil.getString(httpServletRequest, "orderByCol", "name");
		String orderByType = ParamUtil.getString(httpServletRequest, "orderByType", "asc");

		wrapper.setValue("orderByCol", orderByCol);
		wrapper.setValue("orderByType", orderByType);

		int cur = ParamUtil.getInteger(httpServletRequest, SearchContainer.DEFAULT_CUR_PARAM);

		if (cur > 0) {
			wrapper.setValue("cur", String.valueOf(cur));
		}

		return new ViewTypeItemList(portletURL, getDisplayStyle()) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8921045955069886586L;

			{
				addCardViewTypeItem();

				addListViewTypeItem();

				addTableViewTypeItem();
			}
		};
	}

	/**
	 * Return the option items for the sort column menu.
	 *
	 * @return options list for the sort column menu
	 */
	@Override
	protected List<DropdownItem> getOrderByDropdownItems() {
		return new DropdownItemList() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 236283787161793099L;

			{
				add(dropdownItem -> {
					dropdownItem.setActive("name".equals(getOrderByCol()));
					dropdownItem.setHref(_getCurrentSortingURL(), "orderByCol", "name");
					dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "name"));
				});

				add(dropdownItem -> {
					dropdownItem.setActive("createDate".equals(getOrderByCol()));
					dropdownItem.setHref(_getCurrentSortingURL(), "orderByCol", "createDate");
					dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "create-date"));
				});
			}
		};
	}

	private PortletURL _getCurrentSortingURL() throws PortletException {
		PortletURL sortingURL = PortletURLUtil.clone(currentURLObj, liferayPortletResponse);

		MutableRenderParametersWrapper wrapper = new MutableRenderParametersWrapper(sortingURL.getRenderParameters());

		wrapper.setValue("mvcRenderCommandName", MVCCommandNames.VIEW_DEALERS);

		// Reset current page.

		wrapper.setValue(SearchContainer.DEFAULT_CUR_PARAM, "0");

		String keywords = ParamUtil.getString(httpServletRequest, "keywords");

		if (Validator.isNotNull(keywords)) {
			wrapper.setValue("keywords", keywords);
		}

		return sortingURL;
	}
	
	private final PortalPreferences portalPreferences;
	private final ThemeDisplay themeDisplay;
}
