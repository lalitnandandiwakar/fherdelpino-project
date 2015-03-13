<%-- 
    Document   : index
    Created on : Jul 29, 2013, 7:42:27 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <form action="<%=response.encodeURL("CookieTest")%>" method="POST">
        
            Enter your name: <input type="text" name="name"/>
            <input type="submit" value="send"/>
        </form>
    </body>
</html>
