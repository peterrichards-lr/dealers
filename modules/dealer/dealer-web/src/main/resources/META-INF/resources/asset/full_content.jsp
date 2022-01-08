<%@ include file="/init.jsp"%>
<%
	AssetRenderer<?> assetRenderer = (AssetRenderer<?>) request.getAttribute(WebKeys.ASSET_RENDERER);

	String viewEntryURL = assetRenderer.getURLView(liferayPortletResponse, WindowState.MAXIMIZED);

	Dealer dealer = (Dealer) request.getAttribute("dealer");
%>
<aui:a cssClass="title-link" href="<%=viewEntryURL%>">
	<h3 class="title"><%=HtmlUtil.escape(dealer.getName(locale))%></h3>
</aui:a>
<div class="autofit-col autofit-col-expand">
	<%=HtmlUtil.escape(dealer.getName())%>
</div>
