<%-- 
    Document   : error
    Created on : Jul 23, 2013, 7:45:48 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Errors!</h1>
        <ul>
        <%
            List<String> lista = (ArrayList<String>) request.getAttribute("errors");
            for (String s : lista) {
                out.write("<li>" + s + "</li>");
            }
         %>
        </ul>
    </body>
</html>
