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

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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
</head>

<body>

	<%
		String guestbookName = request.getParameter("guestbookName");
		if (guestbookName == null) {
			guestbookName = "default";
		}
		pageContext.setAttribute("guestbookName", guestbookName);
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user != null) {
			pageContext.setAttribute("user", user);
	%>

	<p>
		Hola, ${fn:escapeXml(user.nickname)}! (<a
			href="<%=userService.createLogoutURL(request.getRequestURI())%>">log
			out</a>.)
	</p>
	<%
		} else {
	%>
	<p>
		Primero! <a
			href="<%=userService.createLoginURL(request.getRequestURI())%>">logueate</a> para que aparezca tu nombre cuando escribas.
	</p>
	<%
		}
	%>
<BR>
<!-- 	<form action="/guestbook.jsp" method="get"> -->
<!-- 		<div> -->
<!-- 			<input type="text" name="guestbookName" -->
<%-- 				value="${fn:escapeXml(guestbookName)}" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<input type="submit" value="Cambiar Guestbook" /> -->
<!-- 		</div> -->
<!-- 	</form> -->

	<form action="/sign" method="post">
		<div>
			<textarea name="content" rows="3" cols="60"></textarea>
		</div>
		<div>
			<input type="submit" value="Postear en Guestbook" />
		</div>
		<input type="hidden" name="guestbookName"
			value="${fn:escapeXml(guestbookName)}" />
	</form>

	<%
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
		// Run an ancestor query to ensure we see the most up-to-date
		// view of the Greetings belonging to the selected Guestbook.
		Query query = new Query("Greeting", guestbookKey).addSort("date",
				Query.SortDirection.DESCENDING);
		List<Entity> greetings = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(20));
		if (greetings.isEmpty()) {
	%>
	<p>El Guestbook no tiene mensajes.</p>
	<%
		} else {
	%>
	<H2>Posts en el Guestbook:</H2>
	<%
		for (Entity greeting : greetings) {
				pageContext.setAttribute("greeting_content",
						greeting.getProperty("content"));
				if (greeting.getProperty("user") == null) {
	%>
	<p>Anonimo posteo:</p>
	<%
		} else {
					pageContext.setAttribute("greeting_user",
							greeting.getProperty("user"));
	%>
	<p>
		<b>${fn:escapeXml(greeting_user.nickname)}</b> posteo:
	</p>
	<%
		}
	%>
	<blockquote>${fn:escapeXml(greeting_content)}</blockquote>
	<%
		}
		}
	%>





</body>
</html>