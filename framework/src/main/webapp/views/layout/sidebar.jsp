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
		<span class="btn btn-success"></span> <span class="btn btn-info"></span>
		<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
	</div>
</div>
<%-- /快捷键 --%>
<%-- /section:basics/sidebar.shortcuts --%>

<%-- #菜单列表 --%>
<ul class="nav nav-list">
	<c:set var="menuPrefix" value="menu:id" scope="page" />
	<c:forEach items="${menus}" var="menu">
		<shiro:hasPermission name="${fn:replace(menuPrefix,'id',menu.menuId)}">
			<li class="">
				<a class="dropdown-toggle"
					data-url="${menu.menuUrl}"
					href="portal/main#${menu.menuUrl}"> 
					<i class="menu-icon fa ${menu.menuIcon}"></i> 
					<span class="menu-text"> ${menu.menuName} </span> 
					<c:if test="${fn:length(menu.subMenus)>0 }">
						<b class="arrow fa fa-angle-down"></b>
					</c:if>
				</a>
				<b class="arrow"></b> 
				<c:if test="${fn:length(menu.subMenus)>0 }">
					<ul class="submenu">
						<c:forEach items="${menu.subMenus}" var="subMenu">
							<shiro:hasPermission name="${fn:replace(menuPrefix,'id',subMenu.menuId)}">
								<li class="">
									<a data-url="${subMenu.menuUrl}" href="portal/main#${subMenu.menuUrl}"> 
									<i class="menu-icon fa ${subMenu.menuIcon}"></i>
									${subMenu.menuName}
									</a> 
									<b class="arrow"></b>
								</li>
							</shiro:hasPermission>
						</c:forEach>
					</ul>
				</c:if>
			</li>
		</shiro:hasPermission>
	</c:forEach>
	<%-- /section:basics/sidebar.Menu item --%>
</ul>
<%-- /菜单列表 --%>

<%-- #section:basics/sidebar.Minimize Button --%>
<%-- #折叠展开按钮 --%>
<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
	<i class="ace-icon fa fa-angle-double-left"
		data-icon1="ace-icon fa fa-angle-double-left"
		data-icon2="ace-icon fa fa-angle-double-right"></i>
</div>
<%-- /折叠展开按钮 --%>
<%-- /section:basics/sidebar.Minimize Button --%>
<script type="text/javascript">
	try {
		ace.settings.check('sidebar', 'collapsed')
	} catch (e) {
	}
</script>