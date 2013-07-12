<%-- 
    Document   : index
    Created on : Jul 11, 2013, 7:16:59 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" media="screen">
            <%@include file="estilo.css" %>
        </style>
    </head>
    <body>
        <table >
            <tr class="colortr">
                <td><h3> Nombre </h3></td>
                <td><h3> Apellido </h3></td>
                <td><h3> Fecha de nacimiento </h3></td>
                <td><h3> Edad </h3></td>
                
            </tr>
            <tr>
                <td><%= request.getParameter("nombre") %></td>
                <td><%= request.getParameter("apellido") %></td>
                <td><%= request.getParameter("fecha") %></td>
                <td><%= request.getParameter("edad") %></td>
            </tr>           
        </table>      
    </body>
</html>
