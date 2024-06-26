import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class CookieServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
           for (Cookie cookie : cookies) {
                PrintWriter out = response.getWriter();
                out.println("Cookie Name: " + cookie.getName() + ", Value: " + cookie.getValue());
            } 
        }
    }
}