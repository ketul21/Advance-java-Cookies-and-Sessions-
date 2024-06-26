import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class CookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie myCookie = new Cookie("MyName", "SOHAM");
        response.addCookie(myCookie);
        
        Cookie myCookie1 = new Cookie("MyName1", "KENIN");
        response.addCookie(myCookie1);
       
        Cookie myCookie2 = new Cookie("MyName2", "ANCHITA");
        response.addCookie(myCookie2);
        
        Cookie myCookie3 = new Cookie("MyName3", "ANAND");
        response.addCookie(myCookie3);
    }
}