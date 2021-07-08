package com.liferay.raybia.headless.dealer.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Peter Richards
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/headless-dealers",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=Raybia.Headless.Dealer"
	},
	service = Application.class
)
@Generated("")
public class HeadlerssDealerApplication extends Application {
}