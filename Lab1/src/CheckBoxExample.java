import javax.swing.*;
public class CheckBoxExample
{
    CheckBoxExample(){
        JFrame f= new JFrame("CheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("Python");
        checkBox1.setBounds(100,50, 80,80);
        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100,100, 80,80);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckBoxExample();
    }}  