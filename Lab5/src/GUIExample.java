import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arjab Khadka");
        frame.setLayout(new FlowLayout());  // Use FlowLayout for centering

        // ToolBar
        JToolBar toolbar = new JToolBar();
        JButton toolbarButton = new JButton("Toolbar Button");
        toolbar.add(toolbarButton);

        // Option Dialogs
        JButton optionDialogButton = new JButton("Show Option Dialog");
        optionDialogButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(frame, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frame, "User clicked Yes");
            } else {
                JOptionPane.showMessageDialog(frame, "User clicked No");
            }
        });

        // File Choosers
        JButton fileChooserButton = new JButton("Open File Chooser");
        fileChooserButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(frame, "Selected file: " + fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

        // Color Choosers
        JButton colorChooserButton = new JButton("Open Color Chooser");
        colorChooserButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(frame, "Choose a Color", Color.RED);
            if (selectedColor != null) {
                JOptionPane.showMessageDialog(frame, "Selected color: " + selectedColor);
            }
        });

        // Internal Frames
        JDesktopPane desktopPane = new JDesktopPane();
        JButton internalFrameButton = new JButton("Open Internal Frame");
        internalFrameButton.addActionListener(e -> {
            JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
            internalFrame.setBounds(50, 50, 200, 150);
            internalFrame.setVisible(true);
            desktopPane.add(internalFrame);
        });

        // Tables
        String[] columnNames = {"Name", "Age", "Country"};
        Object[][] data = {
                {"John", 25, "USA"},
                {"Alice", 30, "Canada"},
                {"Bob", 22, "UK"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Trees
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        root.add(node1);
        root.add(node2);
        JTree tree = new JTree(root);

        // Tooltips
        JButton tooltipButton = new JButton("Hover me");
        tooltipButton.setToolTipText("This is a button");

        // Add components to the frame
        frame.add(toolbar);
        frame.add(optionDialogButton);
        frame.add(fileChooserButton);
        frame.add(colorChooserButton);
        frame.add(internalFrameButton);
        frame.add(tableScrollPane);
        frame.add(new JScrollPane(tree));
        frame.add(tooltipButton);
        frame.add(desktopPane);

        // Set frame properties
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
