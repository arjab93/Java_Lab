import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arjab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating GridBagLayout and GridBagConstraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(gbl);

        // Adding buttons directly to the JFrame
        addButton(frame, "Button 1", 0, 0, gbc);
        addButton(frame, "Button 2", 1, 0, gbc);
        addButton(frame, "Button 3", 0, 1, gbc);
        addButton(frame, "Button 4", 1, 1, gbc);
        addButton(frame, "Button 6", 0, 2, gbc);
        addButton(frame, "Button 7", 1, 2, gbc);
        addButton(frame, "Button 8", 2, 2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        addButton(frame, "Button 5", 0, 3, gbc);

        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addButton(JFrame frame, String label, int x, int y, GridBagConstraints gbc) {
        JButton button = new JButton(label);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = x;
        gbc.gridy = y;
        frame.add(button, gbc);
    }
}
