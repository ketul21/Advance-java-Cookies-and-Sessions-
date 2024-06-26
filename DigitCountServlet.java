import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DigitCountServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberParam = request.getParameter("number");
        int number = Integer.parseInt(numberParam);
        int count = 0;
        
        while (number != 0) {
            number /= 10;
            count++;
        }
        
        response.setContentType("text/html");
        response.getWriter().println("<h1>Number of Digits: " + count + "</h1>");
    }
}
