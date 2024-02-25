import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("")
public class showDBData extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public showDBData() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "root", "");

            displayRecords(con, pw, request);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void displayRecords(Connection con, PrintWriter pw, HttpServletRequest request) throws SQLException {
        pw.println("<h1>Hello, records in the database are listed below: </h1>");
        String sql = "select id, Name, Email, Country from users";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            pw.println("No records found in the table.");
        } else {
            displayRecordTable(pw, rs);
        }
    }

    private static void displayRecordTable(PrintWriter pw, ResultSet rs) throws SQLException {
        pw.println("<style>");
        pw.println("table {");
        pw.println("    width: 100%;");
        pw.println("    border-collapse: collapse;");
        pw.println("    margin-top: 20px;");
        pw.println("}");

        pw.println("th, td {");
        pw.println("    padding: 12px;");
        pw.println("    border: 1px solid #ddd;");
        pw.println("    text-align: left;");
        pw.println("}");

        pw.println("th {");
        pw.println("    background-color: #4caf50;");
        pw.println("    color: white;");
        pw.println("}");
        pw.println("</style>");

        pw.println("<table>");
        pw.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Country</th></tr>");

        do {
            pw.println("<tr>");
            pw.println("<td>" + rs.getString(1) + "</td>");
            pw.println("<td>" + rs.getString(2) + "</td>");
            pw.println("<td>" + rs.getString(3) + "</td>");
            pw.println("<td>" + rs.getString(4) + "</td>");
            pw.println("</tr>");
        } while (rs.next());

        pw.println("</table>");

    }


}
