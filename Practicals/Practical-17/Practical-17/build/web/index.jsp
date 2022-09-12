<%-- 
    Document   : index
    Created on : 26 Mar, 2022, 7:50:44 PM
    Author     : ISHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 17</title>
    </head>
    <body>
        <form action="welcome.jsp" action="post">
                <input type="text" name="uname" placeholder="Enter Username"/>
                <input type="password" name="pwd" placeholder="Enter Password"/>
                <input type="submit" value="login" />
        </form>
    </body>
</html>
