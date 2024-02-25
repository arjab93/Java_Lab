import javax.swing.*;
import java.awt.*;

public class SimpleGroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        groupLayout.setAutoCreateGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
        );

        frame.pack();
        frame.setVisible(true);
    }
}
