import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    private List<User> userList = new ArrayList<>();
    public void dbOperationInsert(String name, String email, String country, String password) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/java1";
        String dusername = "root";
        String dpassword = "";

        try (Connection connection = DriverManager.getConnection(url, dusername, dpassword);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select id, name, email, country, password from users")) {


            // Insert operation
            String insertQuery = "INSERT INTO Users (id, name, email, country, password) VALUES (DEFAULT, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, country);
                pstmt.setString(4, password);
                int rowsInserted = pstmt.executeUpdate();
                System.out.println(rowsInserted + " rows inserted.");
            }


        } catch (SQLException e) {
            System.out.println("An error occurred while connecting MySQL database");
            e.printStackTrace();
        } finally {
            System.out.println("Finally Done, Phew ! ");
        }
    }

    public void dbConnectionRetrive(PrintWriter pw) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java1";
            String dusername = "root";
            String dpassword = "";
            // Assuming 'connection' is a valid Connection object
            String sql = "SELECT id, name, email, country, password FROM users";

            try (Connection connection = DriverManager.getConnection(url, dusername, dpassword);
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet rs = preparedStatement.executeQuery()) {

                while (rs.next()) {
                    int userId = rs.getInt("id");
                    String userName = rs.getString("name");
                    String userEmail = rs.getString("email");
                    String userCountry = rs.getString("country");
                    String userPassword = rs.getString("password");
                    userList.add(new User(userId, userName, userEmail, userCountry, userPassword));
                }

                for (var user : userList) {
                    pw.println("<p>Id: " + user.getId() +
                            " Name: " + user.getName() +
                            " Email: " + user.getEmail() +
                            " Country: " + user.getCountry() +
                            " Password: " + user.getPassword() +
                            "</p>");
                    System.out.println("Id: " + user.getId() +
                            " Name: " + user.getName() +
                            " Email: " + user.getEmail() +
                            " Country: " + user.getCountry() +
                            " Password: " + user.getPassword() +
                            " ");
                }

            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error retrieving data from the database: " + e.getMessage());
            // Handle the exception as needed
        }
    }
}
