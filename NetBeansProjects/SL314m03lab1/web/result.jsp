<%-- 
    Document   : resut
    Created on : Jul 16, 2013, 8:10:29 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="com.wedding.AnniversaryRecord" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The anniversary name for the year ${anniversaryRecord.year} is ${anniversaryRecord.name}
        
        <h1><%
            AnniversaryRecord ar = (AnniversaryRecord)request.getAttribute("anniversaryRecord");
            
            out.print(ar.getName());
            %></h1>
    </body>
</html>
