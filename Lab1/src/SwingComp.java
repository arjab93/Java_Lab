import javax.swing.*;
import java.awt.event.*;

public class SwingComp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 30);

        // JPasswordField
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 60, 150, 30);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");
        checkBox.setBounds(20, 100, 150, 30);

        // JComboBox
        String[] options = {"Java", "C++", "Python"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(20, 140, 150, 30);

        // JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setBounds(20, 180, 150, 30);

        // JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);

        // JScrollPane for JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(200, 20, 150, 150);

        // Add components to the frame
        frame.add(textField);
        frame.add(passwordField);
        frame.add(checkBox);
        frame.add(comboBox);
        frame.add(slider);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
