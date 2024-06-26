/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Lenovo
 */
public class servlet1 extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        String name = req.getParameter("uname");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Welcome " + name);
    }
}
