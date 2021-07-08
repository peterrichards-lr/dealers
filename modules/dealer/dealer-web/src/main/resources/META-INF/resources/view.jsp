<%@ include file="/init.jsp" %>

<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message
            arguments='<%=SessionErrors.get(liferayPortletRequest, "serviceErrorDetails")%>'
            key="error.dealer-service-error"/>
</liferay-ui:error>
<liferay-ui:success key="dealerAdded"
                    message="dealer-added-successfully"/>
<liferay-ui:success key="dealerUpdated"
                    message="dealer-updated-successfully"/>
<liferay-ui:success key="dealerDeleted"
                    message="dealer-deleted-successfully"/>

<div class="container-fluid-1280">

    <h1>
        <liferay-ui:message key="dealers"/>
    </h1>

    <%-- Clay management toolbar. --%>

    <clay:management-toolbar disabled="${dealerCount eq 0}"
                             displayContext="${dealersManagementToolbarDisplayContext}"
                             itemsTotal="${dealerCount}" searchContainerId="dealerEntries"
                             selectable="false"/>

    <%-- Search container. --%>

    <liferay-ui:search-container emptyResultsMessage="no-dealers"
                                 id="dealerEntries" iteratorURL="${portletURL}"
                                 total="${dealerCount}">

        <liferay-ui:search-container-results results="${dealers}"/>

        <liferay-ui:search-container-row
                className="com.liferay.raybia.dealer.model.Dealer"
                modelVar="entry">

            <%@ include file="/dealer/entry_search_columns.jspf" %>

        </liferay-ui:search-container-row>

        <%-- Iterator / Paging --%>

        <liferay-ui:search-iterator
                displayStyle="${dealersManagementToolbarDisplayContext.getDisplayStyle()}"
                markupView="lexicon"/>
    </liferay-ui:search-container>
</div>