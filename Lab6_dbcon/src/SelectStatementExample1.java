import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatementExample1 {
    public static void main(String[] args) {
        System.out.println("Inside the Main function");
        String url = "jdbc:mysql://localhost:3306/java1";
        String dusername = "root";
        String dpassword = "";

        try (Connection connection = DriverManager.getConnection(url, dusername, dpassword);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select id, name, email, country, password from Users")) {

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                String password = rs.getString("password");
                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
            }

            // Insert operation
            String insertQuery = "INSERT INTO Users (id, name, email, country, password) VALUES (DEFAULT, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
                pstmt.setString(1, "Arjab");
                pstmt.setString(2, "arjab@example.com");
                pstmt.setString(3, "UK");
                pstmt.setString(4, "securepass");
                int rowsInserted = pstmt.executeUpdate();
                System.out.println(rowsInserted + " rows inserted.");
            }

            // Update operation
            String updateQuery = "UPDATE Users SET country = ? WHERE id = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
                pstmt.setString(1, "AUS");
                pstmt.setInt(2, 3); // Assuming 123 is the ID you want to update
                int rowsUpdated = pstmt.executeUpdate();
                System.out.println(rowsUpdated + " rows updated.");
            }

            // Delete operation
            String deleteQuery = "DELETE FROM Users WHERE id = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, 5); // Assuming 123 is the ID you want to delete
                int rowsDeleted = pstmt.executeUpdate();
                System.out.println(rowsDeleted + " rows deleted.");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred while connecting MySQL database");
            e.printStackTrace();
        } finally {
            System.out.println("Finally Done, Phew ! ");
        }
    }

    // printSQLException method remains unchanged
    public static void printSQLException(SQLException ex) {
        // ...
    }
}
