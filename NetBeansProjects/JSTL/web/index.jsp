<%-- 
    Document   : index
    Created on : Jul 31, 2013, 8:15:37 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="/WEB-INF/tlds/MiTld"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <f:Saludo name="${param.name}" />
        <f:Fibonacci number="${param.number}"/>
    </body>
</html>
