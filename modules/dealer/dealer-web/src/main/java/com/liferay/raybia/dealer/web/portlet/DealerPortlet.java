package com.liferay.raybia.dealer.web.portlet;

import com.liferay.raybia.dealer.web.constants.DealerPortletKeys;
import com.liferay.raybia.dealer.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author prich
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.raybia",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Dealer Admin",
		"javax.portlet.init-param.template-path=" + MVCCommandNames.ROOT,
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DealerPortletKeys.DEALER,
		"javax.portlet.version=3.0",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DealerPortlet extends MVCPortlet {
}