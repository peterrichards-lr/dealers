package com.liferay.raybia.dealer.web.asset.model;

import com.liferay.asset.display.page.portlet.AssetDisplayPageFriendlyURLProvider;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.asset.util.AssetHelper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;
import com.liferay.raybia.dealer.web.permission.resource.definition.DealerPermission;
import java.util.Locale;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Asset renderer for dealers.
 *
 * @author liferay
 */
public class DealerAssetRenderer extends BaseJSPAssetRenderer<Dealer> {

	public DealerAssetRenderer(Dealer dealer) {
		_dealer = dealer;
	}

	@Override
	public Dealer getAssetObject() {
		return _dealer;
	}

	@Override
	public String getClassName() {
		return Dealer.class.getName();
	}

	@Override
	public long getClassPK() {
		return _dealer.getDealerId();
	}

	@Override
	public long getGroupId() {
		return _dealer.getGroupId();
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		if (template.equals(TEMPLATE_ABSTRACT) || template.equals(TEMPLATE_FULL_CONTENT)) {
			return "/asset/" + template + ".jsp";
		}
		return null;
	}

	@Override
	public int getStatus() {
		return _dealer.getStatus();
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		int abstractLength = AssetHelper.ASSET_ENTRY_ABSTRACT_LENGTH;
		String summary = HtmlUtil.stripHtml(StringUtil.shorten(_dealer.getName(), abstractLength));
		return summary;
	}

	@Override
	public String getTitle(Locale locale) {
		return _dealer.getName(locale);
	}

	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse) throws Exception {
		Group group = GroupLocalServiceUtil.fetchGroup(_dealer.getGroupId());
		if (group.isCompany()) {
			ThemeDisplay themeDisplay = (ThemeDisplay) liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
			group = themeDisplay.getScopeGroup();
		}
		PortletURL portletURL = PortalUtil.getControlPanelPortletURL(liferayPortletRequest, group,
				DealerPortletKeys.DEALER, 0, 0, PortletRequest.RENDER_PHASE);
		portletURL.setParameter("mvcRenderCommandName", MVCCommandNames.EDIT_DEALER);
		portletURL.setParameter("DealerId", String.valueOf(_dealer.getDealerId()));
		portletURL.setParameter("showback", Boolean.FALSE.toString());
		return portletURL;
	}

	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		return super.getURLView(liferayPortletResponse, windowState);
	}

	@Override
	public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
		if (_assetDisplayPageFriendlyURLProvider != null) {
			ThemeDisplay themeDisplay = (ThemeDisplay) liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);

			String friendlyURL = _assetDisplayPageFriendlyURLProvider.getFriendlyURL(getClassName(), getClassPK(),
					themeDisplay);
			if (Validator.isNotNull(friendlyURL)) {
				return friendlyURL;
			}
		}

		try {
			long plid = PortalUtil.getPlidFromPortletId(_dealer.getGroupId(), DealerPortletKeys.DEALER);
			PortletURL portletURL;
			if (plid == LayoutConstants.DEFAULT_PLID) {
				portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(liferayPortletRequest),
						DealerPortletKeys.DEALER, PortletRequest.RENDER_PHASE);
			} else {
				portletURL = PortletURLFactoryUtil.getPortletURLFactory().create(liferayPortletRequest,
						DealerPortletKeys.DEALER, plid, PortletRequest.RENDER_PHASE);
			}
			portletURL.setParameter("mvcRenderCommandName", MVCCommandNames.VIEW_DEALER);
			portletURL.setParameter("DealerId", String.valueOf(_dealer.getDealerId()));
			String currentUrl = PortalUtil.getCurrentURL(liferayPortletRequest);
			portletURL.setParameter("redirect", currentUrl);
			return portletURL.toString();
		} catch (PortalException pe) {
		} catch (SystemException se) {
		}
		return null;
	}

	@Override
	public long getUserId() {
		return _dealer.getUserId();
	}

	@Override
	public String getUserName() {
		return _dealer.getUserName();
	}

	@Override
	public String getUuid() {
		return _dealer.getUserUuid();
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) throws PortalException {
		return DealerPermission.contains(permissionChecker, _dealer, ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) throws PortalException {
		return DealerPermission.contains(permissionChecker, _dealer, ActionKeys.VIEW);
	}

	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
		request.setAttribute("Dealer", _dealer);
		return super.include(request, response, template);
	}

	public void setAssetDisplayPageFriendlyURLProvider(
			AssetDisplayPageFriendlyURLProvider assetDisplayPageFriendlyURLProvider) {
		_assetDisplayPageFriendlyURLProvider = assetDisplayPageFriendlyURLProvider;
	}

	private AssetDisplayPageFriendlyURLProvider _assetDisplayPageFriendlyURLProvider;
	private Dealer _dealer;
}