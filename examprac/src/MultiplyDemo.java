import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplyDemo extends JFrame{

    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton but;

    public MultiplyDemo() {

        l1 = new JLabel("First Number:");
        t1 = new JTextField();

        l2 = new JLabel("Second Number:");
        t2 = new JTextField();

        but = new JButton("Multiply");
        t3 = new JTextField();

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(but);
        add(t3);

        setSize(400, 300);
        setLayout(new GridLayout(3, 2));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    but.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int mult = num1 * num2;
            t3.setText(String.valueOf(mult));
        }
    });

    }

    public static void main(String[] args) {
        new MultiplyDemo();
    }
}
