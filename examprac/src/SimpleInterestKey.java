import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleInterestKey extends JFrame {
    JPanel panel;
    JTextField t1, t2, t3, t4;
    JLabel l1, l2, l3, l4;

    public SimpleInterestKey() {
        setTitle("SI Calculator");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Principal: ");
        l2 = new JLabel("Time: ");
        l3 = new JLabel("Rate: ");
        l4 = new JLabel("SI: ");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        panel = new JPanel();

        t4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                calculateSimpleInterest();
            }
        });

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        panel.add(l4);
        panel.add(t4);

        add(panel);
        setVisible(true);
    }

    private void calculateSimpleInterest() {
        try {
            float P = Float.parseFloat(t1.getText());
            float T = Float.parseFloat(t2.getText());
            float R = Float.parseFloat(t3.getText());

            float SI = (P * T * R) / 100;
//            JOptionPane.showMessageDialog(panel, "The simple interest is: " + SI);
            t4.setText(String.valueOf(SI));
        } catch (NumberFormatException ex) {
            t4.setText(""); // Clear result if there's an input error
        }
    }

    public static void main(String[] args) {
        new SimpleInterestKey();
    }
}
