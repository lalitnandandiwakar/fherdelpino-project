<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.util.FrontEndConstants"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<link
	href="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/v4.0.0/build/css/bootstrap-datetimepicker.css"
	rel="stylesheet">

<!-- Latest compiled and minified JavaScript -->
<script type="text/javascript"
	src="//code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
<script
	src="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/v4.0.0/src/js/bootstrap-datetimepicker.js"></script>
<!-- local javascript -->
<script type="text/javascript">
	$(function() {
		$('#datetimepicker1').datetimepicker();
	});
</script>
</head>

<body>
	<form action="/datastore/EmployeeInsertServlet" method="post">
		<div class="container-fluid">
			<h3 class="page-header">Employee testing</h3>
			<!-- 		<div class="jumbotron"> -->
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">First Name</span>
				<input type="text" class="form-control" placeholder="First Name"
					aria-describedby="sizing-addon3"
					name="<%=FrontEndConstants.DATASTORE_EMPLOYEE_FIRST_NAME%>">
			</div>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Last Name</span>
				<input type="text" class="form-control" placeholder="Last Name"
					aria-describedby="sizing-addon3"
					name="<%=FrontEndConstants.DATASTORE_EMPLOYEE_LAST_NAME%>">
			</div>
<!-- 			<div class="input-group input-group-sm"> -->
<!-- 				<span class="input-group-addon" id="sizing-addon3">Hire Date</span> -->
<!-- 				<input type="text" class="form-control" placeholder="Hire Date" -->
<!-- 					aria-describedby="sizing-addon3" -->
<%-- 					name="<%=FrontEndConstants.DATASTORE_EMPLOYEE_HIRE_DATE%>"> --%>
<!-- 			</div> -->
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Hire Date</span>
				<div class="input-group date" id="datetimepicker1">
					<input type="text" class="form-control"
						name="<%=FrontEndConstants.DATASTORE_EMPLOYEE_HIRE_DATE%>">
					<span class="input-group-addon"><span
						class="glyphicon glyphicon-calendar"></span> </span>
				</div>
			</div>
			<br>
			<p>
				<button type="submit" class="btn btn-success">Enviar</button>
			</p>
		</div>

	</form>
</body>
</html>
