<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp example</title>
</head>
<body>
	<%
		List<String> styles = (List<String>) request.getAttribute("styles");

		for (String s : styles)
			out.print("<br>try: " + s);
	%>
	<br> Sizes:<br> 
	<%
	String[] sizes = request.getParameterValues("size");
	if (sizes != null)
		for (String s: request.getParameterValues("size"))
			out.print(s +"<br>"); %>
</body>
</html>