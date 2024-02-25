import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating GridBagLayout and GridBagConstraints
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(gridBagLayout);

        // Adding buttons to the grid
        addButton(frame, "Button 1", 0, 0, gbc);
        addButton(frame, "Button 2", 1, 0, gbc);
        addButton(frame, "Button 3", 0, 1, gbc);
        addButton(frame, "Button 4", 1, 1, gbc);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void addButton(JFrame frame, String label, int x, int y, GridBagConstraints gbc) {
        JButton button = new JButton(label);
        gbc.gridx = x;
        gbc.gridy = y;
        frame.add(button, gbc);
    }
}
