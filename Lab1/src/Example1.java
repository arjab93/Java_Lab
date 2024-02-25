import javax.swing.*;
public class Example1 {
    public static void main(String[] args) {
        JFrame f=new JFrame("SetBounds Method Test");
        JButton b=new JButton("Arjab Khadka");
        b.setBounds(50,100,150,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}  