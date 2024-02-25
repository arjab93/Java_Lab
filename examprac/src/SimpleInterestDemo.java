import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SimpleInterestDemo extends JFrame{
    JPanel panel;
    JTextField t1, t2, t3, t4;
    JLabel l1,l2,l3,l4;
    JButton button;

    public SimpleInterestDemo() {
        setTitle("SI Calculator");
        setSize(800,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1= new JLabel("Principal: ");
        l2= new JLabel("Time: ");
        l3= new JLabel("Rate: ");
        l4= new JLabel("SI: ");

        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);

        button = new JButton("Calculate");

        panel = new JPanel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float P,T,R,I;
                P = Float.parseFloat(t1.getText());
                T = Float.parseFloat(t2.getText());
                R = Float.parseFloat(t3.getText());

                I = (P*T*R)/100;
                t4.setText(String.valueOf(I));
            }
        });

        panel.add(l1);
        panel.add(t1);

        panel.add(l2);
        panel.add(t2);

        panel.add(l3);
        panel.add(t3);

        panel.add(button);

        panel.add(l4);
        panel.add(t4);

        add(panel);
    }
    public static void main(String[] args){
        new SimpleInterestDemo();
    }

}


