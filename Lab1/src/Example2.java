import javax.swing.*;
public class Example2 {
    JFrame f;
    Example2(){
        f=new JFrame();
        JRadioButton r1=new JRadioButton("A) Arjab");
        JRadioButton r2=new JRadioButton("B) Khadka");
//        r1.setBounds(75,50,100,30);
//        r2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        JPanel p = new JPanel();
        p.add(r1);p.add(r2);
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Example2();
    }
}