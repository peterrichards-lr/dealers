<%@ include file="/init.jsp" %>

<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message key="error.dealer-service-error"
                        arguments='<%=SessionErrors.get(liferayPortletRequest, "serviceErrorDetails")%>'/>
</liferay-ui:error>

<%-- Generate add / edit action URL and set title. --%>

<c:choose>
    <c:when test="${not empty dealer}">
        <portlet:actionURL var="dealerActionURL"
                           name="<%=MVCCommandNames.EDIT_DEALER%>">
            <portlet:param name="redirect" value="${param.redirect}"/>
        </portlet:actionURL>

        <c:set var="editTitle" value="edit-dealer"/>
    </c:when>
    <c:otherwise>
        <portlet:actionURL var="dealerActionURL"
                           name="<%=MVCCommandNames.ADD_DEALER%>">
            <portlet:param name="redirect" value="${param.redirect}"/>
        </portlet:actionURL>

        <c:set var="editTitle" value="add-dealer"/>
    </c:otherwise>
</c:choose>

<div class="container-fluid-1280 edit-dealer">

    <h1>
        <liferay-ui:message key="${editTitle}"/>
    </h1>

    <aui:model-context bean="${dealer}" model="${dealerClass}"/>

    <aui:form action="${dealerActionURL}" name="fm">
        <aui:input name="uuid" field="uuid" type="hidden"/>
        <aui:input name="dealerId" field="dealerId" type="hidden"/>

        <aui:fieldset-group markupView="lexicon">

            <aui:fieldset>

                <aui:input name="name" required="true"/>
                <liferay-ui:error key="dealerNameEmpty"
                                  message="error.dealer-name-empty"/>

            </aui:fieldset>

            <aui:fieldset>

                <aui:row>
                    <aui:col width="50">
                        <aui:input name="street"/>

                        <aui:input name="locality"/>

                        <aui:input name="state" required="true"/>
                        <liferay-ui:error key="dealerStateEmpty"
                                          message="error.dealer-state-empty"/>

                        <aui:input name="postalCode" required="true"/>
                        <liferay-ui:error key="dealerPostalCodeEmpty"
                                          message="error.dealer-postalcode-empty"/>
                        <liferay-ui:error key="dealerPostalCodeInvalid"
                                          message="error.dealer-postalcode-invlaid"/>
                    </aui:col>

                    <aui:col width="50">
                        <aui:field-wrapper label="location" cssClass="geolocation-field">
                            <div class="form-group">
                                <aui:input name="geolocation" type="hidden"/>
                                <div id="CoordinatesContainer">
                                    <div>
                                        <clay:icon symbol="geolocation"/>

                                        <div class="glyphicon glyphicon-map-marker"
                                             id="<portlet:namespace />Location"></div>
                                    </div>

                                    <liferay-map:map-display name="geolocation" geolocation="true"
                                                             latitude="${dealer.latitude}"
                                                             longitude="${dealer.longitude}"/>


                                    <aui:script require="map-common/js/MapBase.es as MapBase">
                                        var geolocationField = {
                                        init: function () {
                                        Liferay.MapBase.get('<portlet:namespace/>geolocation', function (map) {
                                        map.on(
                                        'positionChange',
                                        geolocationField.onPositionChange,
                                        geolocationField
                                        );
                                        });
                                        },
                                        onPositionChange: function (event) {
                                        var latitudeInputName = '<portlet:namespace/>latitude';
                                        var latitudeNode = document.querySelector('[name="' + latitudeInputName + '"]');

                                        var longitudeInputName = '<portlet:namespace/>longitude';
                                        var longitudeNode = document.querySelector('[name="' + longitudeInputName + '"]');

                                        var locationInputName = '<portlet:namespace/>Location';

                                        var location = event.newVal.location;

                                        if (latitudeNode) {
                                        latitudeNode.setAttribute(
                                        'value', location.lat);
                                        }
                                        if (longitudeNode) {
                                        longitudeNode.setAttribute(
                                        'value', location.lng);
                                        }

                                        var locationNode = document.getElementById(locationInputName);

                                        if (locationNode) {
                                        locationNode.innerHTML = event.newVal.address;
                                        }
                                        },
                                        };

                                        geolocationField.init();
                                    </aui:script>

                                    <aui:input name="latitude" type="hidden"
                                               value="${dealer.latitude}"/>
                                    <aui:input name="longitude" type="hidden"
                                               value="${dealer.longitude}"/>
                                </div>
                            </div>
                        </aui:field-wrapper>
                    </aui:col>
                </aui:row>
            </aui:fieldset>

            <aui:fieldset>

                <aui:row>
                    <aui:col width="50">

                        <aui:input name="emailAddress"/>
                        <liferay-ui:error key="dealerEmailAddressInvalid"
                                          message="error.dealer-emailAddress-invalid"/>

                        <aui:input name="phoneNumber"/>
                        <liferay-ui:error key="dealerPhoneNumberInvalid"
                                          message="error.dealer-phoneNumber-invlaid"/>
                    </aui:col>

                    <aui:col width="50">


                        <aui:input name="openingHours" type="textarea" localized="true"/>
                    </aui:col>
                </aui:row>

            </aui:fieldset>

        </aui:fieldset-group>

        <%--Buttons. --%>

        <aui:button-row>
            <aui:button cssClass="btn btn-primary" type="submit"/>
            <aui:button cssClass="btn btn-secondary" onClick="${param.redirect}"
                        type="cancel"/>
        </aui:button-row>
    </aui:form>

</div>