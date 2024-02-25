import javax.swing.*;
import java.awt.event.*;

public class IconMenuItemExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon Menu Item Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Create a menu item with an icon
        JMenuItem openItem = new JMenuItem("Open");
        Icon openIcon = new ImageIcon("C:\\Users\\LEGION\\Downloads\\Lab - 4 - Files"); // Provide the path to your icon image
        openItem.setIcon(openIcon);

        fileMenu.add(openItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
