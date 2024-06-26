import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertData extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String connectionURL = "jdbc:mysql://localhost:3306/mydatabase";
        Connection connection;
        try {
            String name = request.getParameter("data");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, "root", "");
            PreparedStatement pst = connection.prepareStatement("insert into mytable(name) values(?)");
            pst.setString(1, name);

            int i = pst.executeUpdate();
            if (i != 0) {
                pw.println("<br>Record has been inserted");
            } else {
                pw.println("Failed to insert the data");
            }
        } catch (Exception e) {
            e.printStackTrace();
            pw.println(e);
        }
    }

}
