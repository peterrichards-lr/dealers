package com.liferay.raybia.dealer.web.asset.model;

import com.liferay.asset.display.page.portlet.AssetDisplayPageFriendlyURLProvider;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactory;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.raybia.dealer.constants.DealerConstants;
import com.liferay.raybia.dealer.model.Dealer;
import com.liferay.raybia.dealer.service.DealerLocalService;
import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.ServletContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Asset renderer factory component for Dealers.
 *
 * @author liferay
 */
@Component(immediate = true, property = "javax.portlet.name="
		+ DealerPortletKeys.DEALER, service = AssetRendererFactory.class)
public class DealerAssetRendererFactory extends BaseAssetRendererFactory<Dealer> {
	public static final String CLASS_NAME = Dealer.class.getName();
	public static final String TYPE = "Dealer";

	public DealerAssetRendererFactory() {
		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(DealerPortletKeys.DEALER);
		setSearchable(true);
	}

	@Override
	public AssetRenderer<Dealer> getAssetRenderer(long classPK, int type) throws PortalException {
		Dealer Dealer = _DealerLocalService.getDealer(classPK);
		DealerAssetRenderer DealerAssetRenderer = new DealerAssetRenderer(Dealer);
		DealerAssetRenderer.setAssetDisplayPageFriendlyURLProvider(_assetDisplayPageFriendlyURLProvider);
		DealerAssetRenderer.setAssetRendererType(type);
		DealerAssetRenderer.setServletContext(_servletContext);
		return DealerAssetRenderer;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public PortletURL getURLAdd(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, long classTypeId) {
		PortletURL portletURL = _portal.getControlPanelPortletURL(liferayPortletRequest,
				getGroup(liferayPortletRequest), DealerPortletKeys.DEALER, 0, 0, PortletRequest.RENDER_PHASE);
		portletURL.setParameter("mvcRenderCommandName", MVCCommandNames.EDIT_DEALER);
		return portletURL;
	}

	@Override
	public PortletURL getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) {
		LiferayPortletURL liferayPortletURL = liferayPortletResponse.createLiferayPortletURL(DealerPortletKeys.DEALER,
				PortletRequest.RENDER_PHASE);
		try {
			liferayPortletURL.setWindowState(windowState);
		} catch (WindowStateException wse) {
		}
		return liferayPortletURL;
	}

	@Override
	public boolean hasAddPermission(PermissionChecker permissionChecker, long groupId, long classTypeId)
			throws Exception {
		return _portletResourcePermission.contains(permissionChecker, groupId, ActionKeys.ADD_ENTRY);
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker, long classPK, String actionId) throws Exception {
		return _DealerModelResourcePermission.contains(permissionChecker, classPK, actionId);
	}

	@Reference
	private AssetDisplayPageFriendlyURLProvider _assetDisplayPageFriendlyURLProvider;

	@Reference
	private DealerLocalService _DealerLocalService;
	@Reference(target = "(model.class.name=com.liferay.training.gradebook.model.Dealer)")
	private ModelResourcePermission<Dealer> _DealerModelResourcePermission;
	@Reference
	private Portal _portal;
	@Reference(target = "(resource.name=" + DealerConstants.RESOURCE_NAME + ")")
	private PortletResourcePermission _portletResourcePermission;
	@Reference
	private PortletURLFactory _portletURLFactory;
	@Reference(target = "(osgi.web.symbolicname=com.liferay.training.gradebook.web)")
	private ServletContext _servletContext;
}
