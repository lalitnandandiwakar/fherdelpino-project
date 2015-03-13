<%-- 
    Document   : index
    Created on : Jul 18, 2013, 7:50:51 PM
    Author     : delpinof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sl314.model.League"%>
<%@page import="com.soccer.leagues.Leagues"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Soccer leagues</title>
    </head>
    <body>
        <h1>Players</h1>
        <form name="RegisterForm" action="RegisterServlet" method="POST">
            Register to a league:
            <select name="league">
                <%                                       
                    for (League league : Leagues.getInstance().getAllLeagues()) {
                        out.println("<option>"+league.getTitle()+"</option>");
                    }
                %>
            </select>
            <input type="submit" value="Register" />
        </form>
            
        <h1>League Administrator </h1>
        Add a new league<br>
        <form action="AddNewLeagueServlet">
        </form>
    </body>
</html>
