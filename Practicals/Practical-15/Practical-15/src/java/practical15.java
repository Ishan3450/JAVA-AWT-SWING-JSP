
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ISHAN
 */
public class practical15 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //Creating Session
            HttpSession hs = request.getSession();
            hs.setAttribute("name", "IshanJagani");
            out.println("Session Variable is Created...");

            // creating cookies 
            Cookie cookie = new Cookie("myname", "ishan");
            cookie.setMaxAge(24 * 60 * 60);
            out.println("Cookie is Created...");

            out.println("</html>");
        }
    }

}
