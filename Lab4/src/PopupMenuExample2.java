import javax.swing.*;
import java.awt.event.*;

class PopupMenuExample2 {
    PopupMenuExample2() {
        final JFrame f = new JFrame("Arjab Khadka");

        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        JTextArea textArea = new JTextArea();
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupmenu.show(textArea, e.getX(), e.getY());
                }
            }
        });

        f.add(textArea);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new PopupMenuExample2();
    }
}
