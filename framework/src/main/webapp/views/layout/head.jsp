<%@ include file="/WEB-INF/includes/jspFragmentHead" %>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />

<title><spring:message code="index-title" /></title>

<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="<%=assetsDir %>/css/bootstrap.css" />
<link rel="stylesheet" href="<%=assetsDir %>/css/font-awesome.css" />

<!-- text fonts -->
<link rel="stylesheet" href="<%=assetsDir %>/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet" href="<%=assetsDir %>/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
	<link rel="stylesheet" href="<%=assetsDir %>/css/ace-part2.css" class="ace-main-stylesheet" />
<![endif]-->

<!--[if lte IE 9]>
  <link rel="stylesheet" href="<%=assetsDir %>/css/ace-ie.css" />
<![endif]-->

<!-- ace settings handler -->
<script src="<%=assetsDir %>/js/ace-extra.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lte IE 8]>
<script src="<%=assetsDir %>/js/html5shiv.js"></script>
<script src="<%=assetsDir %>/js/respond.js"></script>
<![endif]-->