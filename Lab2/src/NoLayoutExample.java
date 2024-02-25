import javax.swing.*;

public class NoLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout Example");
        JPanel panel = new JPanel(); // No layout manager set explicitly

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
