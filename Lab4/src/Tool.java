import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tool extends JFrame implements ActionListener, ItemListener {
    // toolbar
    static JToolBar tb;

    // buttons
    static JButton b1;
    static JButton b2; // added button2

    // create a frame
    static JFrame f;

    // create a combo box
    static JComboBox x;

    // create a label
    static JLabel l;

    public Tool() {
        // create a label
        l = new JLabel("nothing selected");

        // create a frame
        f = new JFrame("Arjab Toolbar ");

        // set layout for frame
        f.setLayout(new BorderLayout());

        // create a toolbar
        tb = new JToolBar();

        // create a panel
        JPanel p = new JPanel();

        // create a combobox
        x = new JComboBox(new String[] { "item 1", "item 2" });

        // add actionListener
        x.addItemListener(this);

        // create new buttons
        b1 = new JButton("button 1");
        b2 = new JButton("button 2"); // added button2

        // add ActionListener to them
        b1.addActionListener(this);
        b2.addActionListener(this); // added button2

        // add buttons
        p.add(b1);
        p.add(b2); // added button2

        // add menu to menu bar
        p.add(x);

        tb.add(p);

        // create a panel
        JPanel p1 = new JPanel();

        p1.add(l);

        // add toolbar to frame
        f.add(tb, BorderLayout.NORTH);
        f.add(p1, BorderLayout.CENTER);

        // set the size of the frame
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // if button is pressed
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l.setText("button 1 selected.");
        } else if (e.getSource() == b2) { // added button2
            l.setText("button 2 selected."); // added button2
        }
    }

    // if combo box is selected
    public void itemStateChanged(ItemEvent e) {
        l.setText(x.getSelectedItem() + " selected.");
    }

    public static void main(String args[]) {
        // create a object of class
        new Tool();
    }
}
