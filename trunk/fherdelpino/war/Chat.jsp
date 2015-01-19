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
</head>

<body>

	<%
		String guestbookName = request.getParameter("guestbookName");
		if (guestbookName == null) {
			guestbookName = "default";
		}
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