import java.awt.event.*;
import javax.swing.*;
public class Example3 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Example 3");
        final JTextField tf=new JTextField();
        tf.setBounds(40,50, 140,20);
        JButton b=new JButton("Click for Arjab");
        b.setBounds(190,150,200,40);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hi I am Arjab.");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }
}  