<%-- 
    Document   : index
    Created on : Jul 10, 2013, 8:36:17 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= "Hola mi primer JSP"+ new java.util.Date() %></h1>
        <h2><%= request.getParameter("name") %></h2>
        
    </body>
</html>
