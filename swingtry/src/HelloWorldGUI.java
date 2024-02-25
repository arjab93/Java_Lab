import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGUI extends JFrame {
    JTextField textField;

    public HelloWorldGUI() {
        setTitle("Hello World GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create components
        textField = new JTextField(20);
        JButton button = new JButton("Display");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello World");
            }
        });

//        // Add components to the content pane
//        JPanel p = new JPanel();
//        p.add(textField);
//        p.add(button);
//        add(p);

        setLayout(new FlowLayout());
        add(textField);
        add(button);


        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorldGUI();
    }
}
