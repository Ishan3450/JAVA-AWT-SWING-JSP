<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 17</title>
    </head>
    <body>
        <%
            String uname = request.getParameter("uname");
            String pwd = request.getParameter("pwd");
            
            try{
//                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from student where uname='" + uname + "' and password='" + pwd + "'");
//                ResultSet rs = stmt.executeQuery("select * from student");
                int temp = 0;
                while(rs.next()){
                    out.println("Login Successfull...");
                    temp = 1;
                }
                
                if(temp == 0){
                    out.println("Invalid username or password....");
                }
            }catch(Exception e){}
        %>
    </body>
</html>
