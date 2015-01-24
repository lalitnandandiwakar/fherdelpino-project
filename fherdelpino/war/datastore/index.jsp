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
<title>Hello App Engine</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>

<body>
	<form action="/DataStoreInsert" method="post">
		<div class="container-fluid">
			<h3 class="page-header">DataStore testing</h3>
			<!-- 		<div class="jumbotron"> -->
			<h5 class="page-header">Entity!</h5>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Kind</span> <input
					type="text" class="form-control" placeholder="TestEntity as example"
					aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_ENTITY_KIND%>">
			</div>
			<h5 class="page-header">Create key!</h5>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Kind</span> <input
					type="text" class="form-control" placeholder="Animal, Bebida_alcoholica"
					aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_KIND%>">
			</div>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Name</span> <input
					type="text" class="form-control" placeholder="Perro, Gato, Cerveza, Whisky"
					aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_NAME%>">
			</div>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Id</span> <input
					type="text" class="form-control" placeholder="Tiene que ser numerico"
					aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_ID%>">
			</div>
			<div class="input-group input-group-sm">
				<span class="input-group-addon" id="sizing-addon3">Parent</span> <input
					type="text" class="form-control" placeholder="Este no lo he implementado por que no le entiendo..."
					aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PARENT%>">
			</div>
			<!-- 		</div> -->

			<h5 class="page-header">Properties!</h5>
			<div class="row">
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Name</span> <input
							type="text" class="form-control" placeholder="Tamano"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_NAME + 1%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Value</span> <input
							type="text" class="form-control" placeholder="12"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_VALUE + 1%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Name</span> <input
							type="text" class="form-control" placeholder="Raza"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_NAME + 2%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Value</span> <input
							type="text" class="form-control" placeholder="Pastor aleman"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_VALUE + 2%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Name</span> <input
							type="text" class="form-control" placeholder="Marca"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_NAME + 3%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
				<div class="col-lg-6">
					<div class="input-group input-group-sm">
						<span class="input-group-addon" id="sizing-addon3">Value</span> <input
							type="text" class="form-control" placeholder="Modelo"
							aria-describedby="sizing-addon3" name="<%=FrontEndConstants.DATASTORE_PROP_VALUE + 3%>">
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->
			<br>
			<p>
				<button type="submit" class="btn btn-success">Enviar</button>
			</p>
		</div>

	</form>
</body>
</html>
