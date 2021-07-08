# Dealers

This is an example of how Liferay's Service and REST builders can be used to create a headless API for a custom dealer entity

This repository has two modules:

1. modules/dealer - contains the dealer-api, dealer-service modules created using the Service Builder. A third dealer-web module contains a MVC portlet which is used to administer the dealers.
2. modules/headless-dealer - contains the headless API and supporting modules.

## Build

This modules have a dependency on https://github.com/peterrichards-lr/postcodes.

The easiest way to build is to add a libs and add the Postcodes API to this folder. This has been tested against version 1.0.0.

## Usage

In order to use these modules you will need to deploy the Postcodes API and service implementation to the deploy folder of the Liferay instance. This has been tested against version 1.0.0.
