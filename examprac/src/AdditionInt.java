import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class AdditionInt extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1;

    public AdditionInt() {

        l1 = new JLabel("First Number:");
        t1 = new JTextField();

        l2 = new JLabel("Second Number:");
        t2 = new JTextField();

        b1 = new JButton("Sum");
        t3 = new JTextField();

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);

        setSize(250, 150);
        setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        t3.setText(String.valueOf(sum));
    };


    public static void main(String[] args) {
        new AdditionInt();
    }
}
