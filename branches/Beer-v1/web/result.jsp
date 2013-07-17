<%-- 
    Document   : result
    Created on : Jul 15, 2013, 8:10:56 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Las cervezas que debes tomar son:</h1>
        <%
            List<String> lista = (ArrayList<String>) request.getAttribute("chelas");

            for (String s : lista) 
                out.println("<br> Cerveza " + s);
            
            
        %>

    </body>
</html>
