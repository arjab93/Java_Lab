import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdditionSwingApp {
    private JFrame frame;
    private JTextField numField1;
    private JTextField numField2;
    private JButton addButton;
    private JLabel resultLabel;

    public AdditionSwingApp() {
        prepareGUI();
    }

    private void prepareGUI() {
        frame = new JFrame("Arjab Khadka");
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(4, 1));

        numField1 = new JTextField();
        numField2 = new JTextField();

        addButton = new JButton("Add");
        addButton.addActionListener(new ButtonClickListener());

        resultLabel = new JLabel("", JLabel.CENTER);

        frame.add(new JLabel("Enter Number 1:"));
        frame.add(numField1);
        frame.add(new JLabel("Enter Number 2:"));
        frame.add(numField2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Get input from text fields
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());

                // Perform addition
                double result = num1 + num2;

                // Display result
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdditionSwingApp();
            }
        });
    }
}
