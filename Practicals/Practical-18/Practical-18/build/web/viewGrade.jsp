<%-- 
    Document   : viewGrade
    Created on : 26 Mar, 2022, 8:45:34 PM
    Author     : ISHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 18</title>
    </head>
    <body>
        <% 
            int java = Integer.parseInt(request.getParameter("java"));
            int php = Integer.parseInt(request.getParameter("php"));
            int android = Integer.parseInt(request.getParameter("android"));
            int wns = Integer.parseInt(request.getParameter("wns"));
            int project = Integer.parseInt(request.getParameter("project"));
            
            int total = java + php + android + wns + project;
            double average = total / 5;
            
if(average > 9.0 && average < 10.0){
            out.println("Grade : A");
}else if(average > 8.0 && average < 9.0){
            out.println("Grade : B");
}else if(average > 7.0 && average << 6.0){
            out.println("Grade : C");
}else{
            out.println("Grade : D");
}
        %>
    </body>
</html>
