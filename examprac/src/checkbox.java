import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JCheckBox c1 = new JCheckBox("check 1");
        JCheckBox c2 = new JCheckBox("check 2");

        // Create labels to display checkbox status
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        // Add ItemListener to checkboxes to update label text
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label1.setText("Checkbox 1 is checked");
                } else {
                    label1.setText("Checkbox 1 is unchecked");
                }
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label2.setText("Checkbox 2 is checked");
                } else {
                    label2.setText("Checkbox 2 is unchecked");
                }
            }
        });

        JPanel p = new JPanel();
        p.add(c1);
        p.add(label1); // Add label for checkbox 1
        p.add(c2);
        p.add(label2); // Add label for checkbox 2

        f.add(p);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
