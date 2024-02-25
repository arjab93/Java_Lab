import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieRentalSystemForm extends JFrame {

    JTextField idField, titleField, genreField, languageField, lengthField;
    JLabel idLabel, titleLabel, genreLabel, languageLabel, lengthLabel;

    public MovieRentalSystemForm() {
        setTitle("Movie Rental System Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        idLabel = new JLabel("ID:");
        titleLabel = new JLabel("Title:");
        genreLabel = new JLabel("Genre:");
        languageLabel = new JLabel("Language:");
        lengthLabel = new JLabel("Length:");

        idField = new JTextField(10);
        titleField = new JTextField(10);
        genreField = new JTextField(10);
        languageField = new JTextField(10);
        lengthField = new JTextField(10);

        JButton okButton = new JButton("OK");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertData();
            }
        });

        setLayout(new GridLayout(6, 2, 10, 10));
        add(idLabel);
        add(idField);
        add(titleLabel);
        add(titleField);
        add(genreLabel);
        add(genreField);
        add(languageLabel);
        add(languageField);
        add(lengthLabel);
        add(lengthField);
        add(okButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void insertData() {
        try {
            // JDBC connection parameters
            String url = "jdbc:mysql://localhost:3306/MovieRentalSystem";
            String username = "root";
            String password = "";

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement
            String sql = "INSERT INTO Movie (id, title, genre, language, length) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set values for the prepared statement
            preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
            preparedStatement.setString(2, titleField.getText());
            preparedStatement.setString(3, genreField.getText());
            preparedStatement.setString(4, languageField.getText());
            preparedStatement.setInt(5, Integer.parseInt(lengthField.getText()));

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to insert data.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MovieRentalSystemForm());
    }
}
