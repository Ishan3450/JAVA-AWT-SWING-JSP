package counter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class counter extends HttpServlet
{
int c;
@Override
public void init()
{
c = 0;
}
public counter(){
super();
}
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
{
c++;
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><head><title>Counter</title></head<body><h1>Counter = " + c + "</h1></body></html>");

}
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
{
doGet(request,response);
}
}
