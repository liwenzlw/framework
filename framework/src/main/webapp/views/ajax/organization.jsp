<%@ include file="/WEB-INF/includes/jspFragmentHead"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<title>组织管理 - Ace Admin</title>

<div class="page-header">
	<button id="organization-add-button" class="btn btn-info btn-sm">
		<i class="ace-icon fa glyphicon-plus align-top bigger-125"></i> 新增
	</button>
</div>
<div id="organization-add-dialog-form" title="Create new user">
	<form>
		<fieldset>
			<label for="name">Name</label> <input type="text" name="name"
				id="name" value="Jane Smith"
				class="text ui-widget-content ui-corner-all">
			<!-- Allow form submission with keyboard without duplicating the dialog button -->
		</fieldset>
	</form>
</div>
<script>
	$("#organization-add-dialog-form").dialog({
		autoOpen : false,
		modal : true,
		resizable : false
	});
	$("#organization-add-button").click(function() {
		$("#organization-add-dialog-form").dialog("open");
	});
</script>






<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->

		<!-- PAGE CONTENT ENDS -->
	</div>
	<!-- /.col -->
</div>
<!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [ null, null ]
	$('.page-content-area').ace_ajax('loadScripts', scripts, function() {
		//inline scripts related to this page
	});
</script>
