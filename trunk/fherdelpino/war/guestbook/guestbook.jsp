<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.google.appengine.api.users.User"%>
<%@ page import="com.google.appengine.api.users.UserService"%>
<%@ page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@ page import="java.util.List"%>
<%@ page import="com.google.appengine.api.datastore.DatastoreService"%>
<%@ page
	import="com.google.appengine.api.datastore.DatastoreServiceFactory"%>
<%@ page import="com.google.appengine.api.datastore.Entity"%>
<%@ page import="com.google.appengine.api.datastore.FetchOptions"%>
<%@ page import="com.google.appengine.api.datastore.Key"%>
<%@ page import="com.google.appengine.api.datastore.KeyFactory"%>
<%@ page import="com.google.appengine.api.datastore.Query"%>
<%@ page import="com.example.util.*"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String guestbookName = request.getParameter("guestbookName");
	if (guestbookName == null) {
		guestbookName = Constants.GUESTBOOK_DEFAULT;
	}
	pageContext.setAttribute("guestbookName", guestbookName);
%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script>
	$(document).ready(function() {
		auto_refresh();
	});

	function auto_refresh() {
		$('#show').load('<%="Chat.jsp?guestbookName=" + guestbookName%>');
	}

	var refreshId = setInterval(auto_refresh, 3000);
</script>
</head>

<body>

	<%
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user != null) {
			pageContext.setAttribute("user", user);
	%>

	<p>
		Hola, ${fn:escapeXml(user.nickname)}! <a
			href="<%=userService.createLogoutURL(request.getRequestURI())%>"><button
				type="button" class="btn btn-danger">Log out</button></a>
	</p>
	<%
		} else {
	%>
	<p>
		Primero! <a
			href="<%=userService.createLoginURL(request.getRequestURI())%>"><button
				type="button" class="btn btn-success">Logueate</button></a> para que
		aparezca tu nombre cuando escribas.

	</p>
	<%
		}
	%>
	<BR>

	<form action="/sign" method="post">

		<div class="row">
			<div class="col-lg-6">
				<div class="input-group">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit">Enviar</button>
					</span> <input type="text" name="content" class="form-control"
						placeholder="Escribe...">
				</div>
			</div>
		</div>

		<input type="hidden" name="guestbookName"
			value="${fn:escapeXml(guestbookName)}" />

	</form>

	<div id="show"></div>

</body>
</html>