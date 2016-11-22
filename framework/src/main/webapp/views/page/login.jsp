<%@ include file="/WEB-INF/includes/jspWholeHead"%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<base href="<%=basepath %>"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		
		<title><spring:message code="login.title"/></title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="<%=assetsDir %>/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=assetsDir %>/css/font-awesome.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="<%=assetsDir %>/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="<%=assetsDir %>/css/ace.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=assetsDir %>/css/ace-part2.css" />
		<![endif]-->
		<link rel="stylesheet" href="<%=assetsDir %>/css/ace-rtl.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=assetsDir %>/css/ace-ie.css" />
		<![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="<%=assetsDir %>/js/html5shiv.js"></script>
		<script src="<%=assetsDir %>/js/respond.js"></script>
		<![endif]-->
	</head>

	<body class="login-layout">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<i class="ace-icon fa fa-leaf green"></i>
									<span class="red"><spring:message code="login.brand"/></span>
									<span class="white" id="id-text2"><spring:message code="login.application"/></span>
								</h1>
								<h4 class="blue" id="id-company-text"><spring:message code="login.copyright"/></h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee green"></i>
												<spring:message code="login.information"/>
											</h4>
											<div class="space-6"></div>

											<form id="login-form" action="./views/page/login.jsp" method="post">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" name="username" data-required placeholder="<spring:message code="login.username.placeholder"/>" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" name="password" data-required placeholder="<spring:message code="login.password.placeholder"/>" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">
														<label class="inline">
															<input type="checkbox" name="rememberMe" class="ace" />
															<span class="lbl"> <spring:message code="login.rememberMe"/></span>
														</label>

														<button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
															<i class="ace-icon fa fa-key"></i>
															<span class="bigger-110"><spring:message code="login.button.login"/></span>
														</button>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>

											<div class="social-or-login center">
												<span class="bigger-110"><spring:message code="login.loginUse"/></span>
											</div>

											<div class="space-6"></div>

											<div class="social-login center">
												<a class="btn btn-primary">
													<i class="ace-icon fa fa-facebook"></i>
												</a>

												<a class="btn btn-info">
													<i class="ace-icon fa fa-twitter"></i>
												</a>

												<a class="btn btn-danger">
													<i class="ace-icon fa fa-google-plus"></i>
												</a>
											</div>
										</div><!-- /.widget-main -->

										<div class="toolbar clearfix">
											<div>
												<a href="#" data-target="#forgot-box" class="forgot-password-link">
													<i class="ace-icon fa fa-arrow-left"></i>
													<spring:message code="login.toolbar.forgetPassword"/>
												</a>
											</div>

											<div>
												<a href="#" data-target="#signup-box" class="user-signup-link">
													<spring:message code="login.want.register"/>
													<i class="ace-icon fa fa-arrow-right"></i>
												</a>
											</div>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->

								<div id="forgot-box" class="forgot-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header red lighter bigger">
												<i class="ace-icon fa fa-key"></i>
												<spring:message code="login.retrieve.password"/>
											</h4>

											<div class="space-6"></div>
											<p>
												<spring:message code="login.retrieve.password.tipInfo"/>
											</p>

											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" class="form-control" placeholder="<spring:message code="login.button.email"/>" />
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>

													<div class="clearfix">
														<button type="button" class="width-35 pull-right btn btn-sm btn-danger">
															<i class="ace-icon fa fa-lightbulb-o"></i>
															<span class="bigger-110"><spring:message code="login.button.sendMail"/></span>
														</button>
													</div>
												</fieldset>
											</form>
										</div><!-- /.widget-main -->

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												<spring:message code="login.back.login"/>
												<i class="ace-icon fa fa-arrow-right"></i>
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.forgot-box -->

								<div id="signup-box" class="signup-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users blue"></i>
												<spring:message code="user.registration"/>
											</h4>

											<div class="space-6"></div>
												<p><spring:message code="registration.information"/></p>
											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" class="form-control" placeholder="<spring:message code="registration.email.placeholder"/>" />
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="<spring:message code="registration.username.placeholder"/>" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="<spring:message code="registration.password.placeholder"/>" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="<spring:message code="registration.password.repeat.placeholder"/>" />
															<i class="ace-icon fa fa-retweet"></i>
														</span>
													</label>

													<label class="block">
														<input type="checkbox" class="ace" />
														<span class="lbl">
															<spring:message code="registration.agreement.accept"/>
															<a href="#"><spring:message code="registration.agreement"/></a>
														</span>
													</label>

													<div class="space-24"></div>

													<div class="clearfix">
														<button type="reset" class="width-30 pull-left btn btn-sm">
															<i class="ace-icon fa fa-refresh"></i>
															<span class="bigger-110"><spring:message code="registration.button.reset"/></span>
														</button>

														<button type="button" class="width-65 pull-right btn btn-sm btn-success">
															<span class="bigger-110"><spring:message code="registration.button.register"/></span>
															<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
														</button>
													</div>
												</fieldset>
											</form>
										</div>

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
												<spring:message code="registration.back.login"/>
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.signup-box -->
							</div><!-- /.position-relative -->

							<div class="navbar-fixed-top align-right">
								<br />
								&nbsp;
								<a id="btn-login-dark" href="#"><spring:message code="skin.dark"/></a>
								&nbsp;
								<span class="blue">/</span>
								&nbsp;
								<a id="btn-login-blur" href="#"><spring:message code="skin.blur"/></a>
								&nbsp;
								<span class="blue">/</span>
								&nbsp;
								<a id="btn-login-light" href="#"><spring:message code="skin.light"/></a>
								&nbsp; &nbsp; &nbsp;
							</div>
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='<%=assetsDir %>/js/jquery.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<%=assetsDir %>/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<%=assetsDir %>/js/jquery.mobile.custom.js'>"+"<"+"/script>");
		</script>
		<script type="text/javascript" src="<%=assetsDir %>/js/jquery-validate.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			 $(document).on('click', '.toolbar a[data-target]', function(e) {
				e.preventDefault();
				var target = $(this).data('target');
				$('.widget-box.visible').removeClass('visible');//hide others
				$(target).addClass('visible');//show target
			 });
			});
			
			jQuery(function($){
				$('#login-form').validate({
					onChange : true,
					onBlur : true,
					onKeyup : true,
					onSubmit : true,
					eachValidField : function() {
						$(this).closest('label').removeClass('has-error').addClass('has-success');
					},
					eachInvalidField : function() {
						$(this).closest('label').removeClass('has-success').addClass('has-error');
					}
				});
			});
			
			//you don't need this, just used for changing background
			jQuery(function($) {
			 $('#btn-login-dark').on('click', function(e) {
				$('body').attr('class', 'login-layout');
				$('#id-text2').attr('class', 'white');
				$('#id-company-text').attr('class', 'blue');
				
				e.preventDefault();
			 });
			 $('#btn-login-light').on('click', function(e) {
				$('body').attr('class', 'login-layout light-login');
				$('#id-text2').attr('class', 'grey');
				$('#id-company-text').attr('class', 'blue');
				
				e.preventDefault();
			 });
			 $('#btn-login-blur').on('click', function(e) {
				$('body').attr('class', 'login-layout blur-login');
				$('#id-text2').attr('class', 'white');
				$('#id-company-text').attr('class', 'light-blue');
				
				e.preventDefault();
			 });
			 
			});
		</script>
	</body>
</html>
