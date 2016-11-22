<%@ include file="/WEB-INF/includes/jspWholeHead"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="<%=basepath %>"/>
<jsp:include page="./head.jsp" />
</head>

<body class="no-skin">
	<%-- #section:basics/navbar.layout --%>
	<%-- #导航条 --%>
	<div id="navbar" class="navbar navbar-default">
		<jsp:include page="./navbar.jsp" />
	</div>
	<%-- /导航条 --%>
	<%-- /section:basics/navbar.layout --%>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<%-- #section:basics/sidebar --%>
		<%-- #侧边栏 --%>
		<div id="sidebar" class="sidebar responsive ">
			<jsp:include page="./sidebar.jsp" />
		</div>
		<%-- /侧边栏 --%>
		<%-- /section:basics/sidebar --%>
		<div class="main-content">
			<div class="main-content-inner">
				<%-- #section:basics/content.breadcrumbs --%>
				<%-- #面包屑 --%>
				<div class="breadcrumbs" id="breadcrumbs">
					<jsp:include page="./breadcrumbs.jsp" />
				</div>
				<%-- /面包屑  --%>
				<%-- /section:basics/content.breadcrumbs --%>
				<div class="page-content">
					<%-- #section:settings.box --%>
					<%-- #设置 --%>
					<div class="ace-settings-container" id="ace-settings-container">
						<jsp:include page="./settings.jsp" />
					</div>
					<%-- /.ace-settings-container --%>
					<%-- /设置 --%>
					<%-- /section:settings.box --%>
					<%-- #内容体 --%>
					<div class="row">
						<div class="col-xs-12">
							<%-- PAGE CONTENT BEGINS --%>
							<div class="page-content-area" data-ajax-content="true">
								ajax content goes here
							</div>
							<!-- /.page-content-area -->
							<%-- PAGE CONTENT ENDS --%>
						</div>
						<%-- /.col --%>
					</div>
					<%-- /.row --%>
					<%-- /内容体 --%>
				</div>
				<%-- /.page-content --%>
			</div>
		</div>
		<%-- /.main-content --%>

		<%-- #页脚 --%>
		<div class="footer">
			<div class="footer-inner">
				<%-- #section:basics/footer --%>
				<div class="footer-content">
					<jsp:include page="./footer.jsp" />
				</div>
				<%-- /section:basics/footer --%>
			</div>
		</div>
		<%-- /页脚 --%>
		<%-- #滚动按钮 --%>
		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
		<%-- /滚动按钮 --%>
	</div>
	<%-- /.main-container --%>

	<%-- basic scripts --%>
	<jsp:include page="./script.jsp" />
</body>
</html>
