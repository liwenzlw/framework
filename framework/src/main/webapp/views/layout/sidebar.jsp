<%@ include file="/WEB-INF/includes/jspFragmentHead"%>
<script type="text/javascript">
	try {
		ace.settings.check('sidebar', 'fixed')
	} catch (e) {
	}
</script>

<%-- #section:basics/sidebar --%>
<%-- #section:basics/sidebar.shortcuts --%>
<%-- #快捷键 --%>
<div class="sidebar-shortcuts" id="sidebar-shortcuts">
	<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
		<button class="btn btn-success">
			<i class="ace-icon fa fa-signal"></i>
		</button>
		<button class="btn btn-info">
			<i class="ace-icon fa fa-pencil"></i>
		</button>
		<button class="btn btn-warning">
			<i class="ace-icon fa fa-users"></i>
		</button>
		<button class="btn btn-danger">
			<i class="ace-icon fa fa-cogs"></i>
		</button>
	</div>

	<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
		<span class="btn btn-success"></span>
		<span class="btn btn-info"></span>
		<span class="btn btn-warning"></span>
		<span class="btn btn-danger"></span>
	</div>
</div>
<%-- /快捷键 --%>
<%-- /section:basics/sidebar.shortcuts --%>

<%-- #菜单列表 --%>
<ul class="nav nav-list">
	<li class="">
		<a data-url="page/index" href="views/layout/main.jsp#page/index"> 
			<i class="menu-icon fa fa-tachometer"></i> 
			<span class="menu-text"> Dashboard </span>
		</a>
		<b class="arrow"></b>
	</li>
	<li class="">
		<a data-url="page/calendar" href="views/layout/main.jsp#page/calendar"> 
			<i class="menu-icon fa fa-calendar"></i> 
			<span class="menu-text">
				Calendar 
				<%-- #section:basics/sidebar.Other notes --%>
				<%-- #徽章（提示信息）--%>
				<span class="badge badge-transparent tooltip-error" title="2 Important Events"> 
					<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
				</span> 
				<%-- /徽章徽章（提示信息） --%>
				<%-- /section:basics/sidebar.Other notes --%>
			</span>
		</a> 
		<b class="arrow"></b>
	</li>
	<%-- #section:basics/sidebar.Menu item --%>
	<%-- #菜单项 --%>
	<li class="">
		<a href="#" class="dropdown-toggle"> 
			<i class="menu-icon fa fa-file-o"></i> 
			<span class="menu-text"> <spring:message code="sidebar.otherPages"/>
				<%-- #section:basics/sidebar.Other notes --%>
				<%-- #徽章（普通） --%>
				<span class="badge badge-primary">5</span> 
				<%-- /徽章（普通） --%>
				<%-- /section:basics/sidebar.Other notes --%>
			</span> 
			<b class="arrow fa fa-angle-down"></b>
		</a> 
		<b class="arrow"></b>
		<ul class="submenu">
			<li class="">
				<a data-url="page/faq" href="views/layout/main.jsp#page/faq"> 
					<i class="menu-icon fa fa-caret-right"></i> <spring:message code="sidebar.otherPages.faq"/>
				</a> 
				<b class="arrow"></b>
			</li>
			<li class="">
				<a data-url="page/error-404" href="views/layout/main.jsp#page/error-404"> 
					<i class="menu-icon fa fa-caret-right"></i> <spring:message code="sidebar.otherPages.error404"/>
				</a> 
				<b class="arrow"></b>
			</li>
			<li class="">
				<a data-url="page/error-500" href="views/layout/main.jsp#page/error-500"> 
					<i class="menu-icon fa fa-caret-right"></i> <spring:message code="sidebar.otherPages.error500"/>
				</a> 
				<b class="arrow"></b>
			</li>
			<li class="">
				<a data-url="page/blank" href="views/layout/main.jsp#page/blank">
					<i class="menu-icon fa fa-caret-right"></i> <spring:message code="sidebar.otherPages.blankPage"/>
				</a> 
				<b class="arrow"></b>
			</li>
		</ul>
	</li>
	<%-- /菜单项 --%>
	<%-- /section:basics/sidebar.Menu item --%>
</ul>
<%-- /菜单列表 --%>

<%-- #section:basics/sidebar.Minimize Button --%>
<%-- #折叠展开按钮 --%>
<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
	<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
</div>
<%-- /折叠展开按钮 --%>
<%-- /section:basics/sidebar.Minimize Button --%>
<script type="text/javascript">
	try {
		ace.settings.check('sidebar', 'collapsed')
	} catch (e) {
	}
</script>