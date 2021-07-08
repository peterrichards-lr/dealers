<%@ include file="/init.jsp" %>

<c:set var="dealer" value="${SEARCH_CONTAINER_RESULT_ROW.object}"/>

<liferay-ui:icon-menu markupView="lexicon">

    <%-- View action. --%>

    <c:if
            test="${dealerPermission.contains(permissionChecker, dealer.dealerId, 'VIEW' )}">
        <portlet:renderURL var="viewDealerURL">
            <portlet:param name="mvcRenderCommandName"
                           value="<%=MVCCommandNames.VIEW_DEALER%>"/>
            <portlet:param name="redirect" value="${currentURL}"/>
            <portlet:param name="dealerId" value="${dealer.dealerId}"/>
        </portlet:renderURL>

        <liferay-ui:icon message="view" url="${viewDealerURL}"/>
    </c:if>

    <%-- Edit action. --%>

    <c:if
            test="${dealerPermission.contains(permissionChecker, dealer.dealerId, 'UPDATE' )}">
        <portlet:renderURL var="editDealerURL">
            <portlet:param name="mvcRenderCommandName"
                           value="<%=MVCCommandNames.EDIT_DEALER%>"/>
            <portlet:param name="redirect" value="${currentURL}"/>
            <portlet:param name="dealerId" value="${dealer.dealerId}"/>
        </portlet:renderURL>

        <liferay-ui:icon message="edit" url="${editDealerURL}"/>
    </c:if>

    <%-- Permissions action. --%>

    <c:if
            test="${dealerPermission.contains(permissionChecker, dealer.dealerId, 'PERMISSIONS')}">

        <liferay-security:permissionsURL
                modelResource="com.liferay.raybia.dealer.model.Dealer"
                modelResourceDescription="${dealer.getName(locale)}"
                resourcePrimKey="${dealer.dealerId}" var="permissionsURL"/>

        <liferay-ui:icon message="permissions" url="${permissionsURL}"/>
    </c:if>

    <%-- Delete action. --%>

    <c:if
            test="${dealerPermission.contains(permissionChecker, dealer.dealerId, 'DELETE')}">
        <portlet:actionURL name="<%=MVCCommandNames.DELETE_DEALER%>"
                           var="deleteDealerURL">
            <portlet:param name="redirect" value="${currentURL}"/>
            <portlet:param name="dealerId" value="${dealer.dealerId}"/>
        </portlet:actionURL>

        <liferay-ui:icon-delete url="${deleteDealerURL}"/>
    </c:if>
</liferay-ui:icon-menu>