<%@ include file="/WEB-INF/includes/jspFragmentHead"%>
<!--[if !IE]> -->
<script type="text/javascript">
	window.jQuery || document.write("<script src='<%=assetsDir %>/js/jquery.js'>" + "<"+"/script>");
</script>
<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<%=assetsDir %>/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
	if ('ontouchstart' in document.documentElement)
		document.write("<script src='<%=assetsDir %>/js/jquery.mobile.custom.js'>"
						+ "<"+"/script>");
</script>
<script src="<%=assetsDir%>/js/bootstrap.js"></script>
<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
		  <script src="../assets/js/excanvas.js"></script>
<![endif]-->

<script src="<%=assetsDir%>/js/jquery-ui.js"></script>
<script src="<%=assetsDir%>/js/jquery-ui.custom.js"></script>
<script src="<%=assetsDir%>/js/jquery.ui.touch-punch.js"></script>
<script src="<%=assetsDir%>/js/jquery.easypiechart.js"></script>
<script src="<%=assetsDir%>/js/jquery.sparkline.js"></script>
<script src="<%=assetsDir%>/js/flot/jquery.flot.js"></script>
<script src="<%=assetsDir%>/js/flot/jquery.flot.pie.js"></script>
<script src="<%=assetsDir%>/js/flot/jquery.flot.resize.js"></script>
<!-- ace scripts -->
<script src="<%=assetsDir%>/js/ace/elements.scroller.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.colorpicker.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.fileinput.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.typeahead.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.wysiwyg.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.spinner.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.treeview.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.wizard.js"></script>
<script src="<%=assetsDir%>/js/ace/elements.aside.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.ajax-content.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.touch-drag.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.sidebar.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.sidebar-scroll-1.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.submenu-hover.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.widget-box.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.settings.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.settings-rtl.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.settings-skin.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.widget-on-reload.js"></script>
<script src="<%=assetsDir%>/js/ace/ace.searchbox-autocomplete.js"></script>