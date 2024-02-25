import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DBConnection dbConnection = new DBConnection();

    public HelloServlet() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the request to the input.html page
        request.getRequestDispatcher("input.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        // Retrieve values from the form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String password = request.getParameter("password");

        try {
            dbConnection.dbOperationInsert(name,email,country,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        dbConnection.dbConnectionRetrive(pw);

    }
}
