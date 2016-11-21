<%@ include file="/WEB-INF/includes/jspHead"%>


<title><spring:message code="error.404.title" /></title>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->

		<!-- #section:pages/error -->
		<div class="error-container">
			<div class="well">
				<h1 class="grey lighter smaller">
					<span class="blue bigger-125"> <i
						class="ace-icon fa fa-sitemap"></i> 404
					</span> <spring:message code="error.404.information"/>
				</h1>

				<hr />
				<h3 class="lighter smaller"><spring:message code="error.404.information.detail"/></h3>

				<div>
					<div class="space"></div>
					<h4 class="smaller"><spring:message code="error.404.read"/></h4>

					<ul class="list-unstyled spaced inline bigger-110 margin-15">
						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 
						<spring:message code="error.404.urlError"/>
						</li>
						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 
						<spring:message code="error.404.faq"/>
						</li>

						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 
						<spring:message code="error.404.tellUs"/>
						</li>
					</ul>
				</div>

				<hr />
				<div class="space"></div>

				<div class="center">
					<a href="javascript:history.back()" class="btn btn-grey"> <i
						class="ace-icon fa fa-arrow-left"></i> <spring:message code="error.404.back"/>
					</a> <a href="#" class="btn btn-primary"> <i
						class="ace-icon fa fa-tachometer"></i> <spring:message code="error.404.home"/>
					</a>
				</div>
			</div>
		</div>

		<!-- /section:pages/error -->

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
