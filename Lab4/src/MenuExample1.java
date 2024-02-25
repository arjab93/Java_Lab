import javax.swing.*;

class MenuExample1 {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    MenuExample1() {
        JFrame f = new JFrame("Arjab Khadka");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");

        i1 = new JMenuItem("Item 1");
        i1.setEnabled(true);
        i2 = new JMenuItem("Item 2");
        i2.setEnabled(true);
        i3 = new JMenuItem("Item 3");
        i3.setEnabled(true);

        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        // Add an icon to Item 1
        ImageIcon icon = new ImageIcon("C:\\Users\\LEGION\\Downloads\\java\\icon.png"); // Provide the path to your icon image
        i1.setIcon(icon);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MenuExample1();
    }
}
