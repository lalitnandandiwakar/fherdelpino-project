<%-- 
    Document   : simple
    Created on : Jul 11, 2013, 8:13:27 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animal lover's page</title>
    </head>
    <body>
        <h1>Hello Animal Lover</h1>
        <p>
            Your favorite animal is a <%= request.getParameter("favoriteAnimal")%>
            Wow, mine too!
        </p>
    </body>
</html>
