<%-- 
    Document   : welcome
    Created on : 26 Mar, 2022, 7:32:30 PM
    Author     : ISHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 16</title>
    </head>
    <body>
        <h2>Register Successfully...</h2>
        <% 
            String name = request.getParameter("name");
            String enroll = request.getParameter("enroll");
            String password = request.getParameter("password");
            
            out.println("Name : " + name + "<br>");
            out.println("Enroll : " + enroll + "<br>");
            out.println("Password : " + password + "<br>");
        %>
    </body>
</html>
