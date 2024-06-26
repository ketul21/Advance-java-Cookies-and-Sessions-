import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;

public class SessionExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        out.println(session.isNew());
        out.println(session.getId());
        new Date(session.getCreationTime());
        new Date(session.getMaxInactiveInterval());
        session.setMaxInactiveInterval(6);
        session.setAttribute("user","SOHAM SARERIYA");
        out.println(session.getAttribute("user"));
        session.invalidate();
    }
}