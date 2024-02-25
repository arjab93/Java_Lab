import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("input.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "root", "");
            insertRecord(con, name, email, country, password);
            displayRecords(con, pw, request);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void insertRecord(Connection con, String name, String email, String country, String password) throws Exception {
        PreparedStatement stmt = con.prepareStatement("insert into users values(DEFAULT,?,?,?,?)");
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setString(3, country);
        stmt.setString(4, password);
        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");
    }

    public void displayRecords(Connection con, PrintWriter pw, HttpServletRequest request) throws SQLException {
        pw.println("<h1>Hello, records in the database are listed below: </h1>");
        String sql = "select id, Name, Email, Country from users";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            pw.println("No records found in the table.");
        } else {
            displayRecordTable(pw, rs);

            // Display checkboxes below the table
            displayCheckbox(pw, request);

            // Display radio option below the table
            displayRadioOption(pw, request);
        }
    }

    private static void displayRecordTable(PrintWriter pw, ResultSet rs) throws SQLException {
//        pw.println("<table border='1'>");
//        pw.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Country</th></tr>");
//
//        do {
//            pw.println("<tr>");
//            pw.println("<td>" + rs.getString(1) + "</td>");
//            pw.println("<td>" + rs.getString(2) + "</td>");
//            pw.println("<td>" + rs.getString(3) + "</td>");
//            pw.println("<td>" + rs.getString(4) + "</td>");
//            pw.println("</tr>");
//        } while (rs.next());
//
//        pw.println("</table>");
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

    private static void displayRadioOption(PrintWriter pw, HttpServletRequest request) {
        String radioOption = request.getParameter("gender");
        if (radioOption != null) {
            pw.println("<p>Selected Radio Option: " + radioOption + "</p>");
        } else {
            pw.println("<p>No Radio Option selected.</p>");
        }
    }

    private static void displayCheckbox(PrintWriter pw, HttpServletRequest request) {
        String[] checkboxValue = request.getParameterValues("interests");
        if (checkboxValue.length != 0){
            pw.println("Selected Checkbox: ");
            for (var val : checkboxValue){
                pw.println(val);
            }
        }
        else {
            pw.println("No checkbox selected");
        }
    }
}
