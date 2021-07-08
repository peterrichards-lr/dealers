<%@ include file="/init.jsp" %>
<%
    Dealer dealer = (Dealer) request.getAttribute("dealer");
    String points = "{ \"type\": \"Feature\", \"geometry\": {\"type\": \"Point\", \"coordinates\": [ " + dealer.getLongitude() + "," + dealer.getLatitude() + "] } }";
%>
<div class="view-dealer">

    <h1>${dealer.getName(locale)}</h1>

    <div class="view-dealer container">
        <div class="view-dealer address">
            <aui:fieldset cssClass="address-group" label="address">
                <% if (!Validator.isBlank(dealer.getStreet(locale))) { %>
                <%=dealer.getStreet(locale)%><br/>
                <% } %>
                <% if (!Validator.isBlank(dealer.getLocality(locale))) { %>
                <%=dealer.getLocality(locale)%><br/>
                <% } %>
                <%=dealer.getState(locale) %><br/>
                ${dealer.postalCode}<br/>
            </aui:fieldset>
        </div>
        <div class="view-dealer contact">
            <aui:fieldset cssClass="contact-group" label="contact">
                <% if (!Validator.isBlank(dealer.getPhoneNumber())) { %>
                ${dealer.phoneNumber}<br/>
                <% } %>
                <% if (!Validator.isBlank(dealer.getEmailAddress())) { %>
                ${dealer.emailAddress}<br/>
                <% } %>
            </aui:fieldset>
        </div>
        <div class="view-dealer map">
            <aui:fieldset cssClass="location-group" label="location">
                <liferay-map:map-display
                        name="geolocation"
                        geolocation="false"
                        points="<%=points%>"
                        latitude="${dealer.latitude}"
                        longitude="${dealer.longitude}"/></dd>
            </aui:fieldset>
        </div>
        <div class="view-dealer opening-hours">
            <aui:fieldset cssClass="opening-hours-group" label="opening-hours">
                <%=dealer.getOpeningHours(locale)%>
            </aui:fieldset>
        </div>
        <div class="view-dealer created">
            <aui:fieldset cssClass="view-dealer address-group" label="created">
                <dd>${dealer.userName}</dd>
                <dd>${createDate}</dd>
            </aui:fieldset>
        </div>
    </div>

</div>