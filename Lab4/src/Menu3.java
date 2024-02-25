import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu3 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    public Menu3(){
        prepareGUI();
    }
    public static void main(String[] args){
        Menu3 menu3obj = new Menu3();
        menu3obj.showCheckBoxDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Arjab Khadka");
        mainFrame.setSize(600,300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showCheckBoxDemo() {
        headerLabel.setText("Favorite Sports");

        final JCheckBox footballCheckBox = new JCheckBox("Football");
        final JCheckBox tennisCheckBox = new JCheckBox("Tennis");
        final JCheckBox rugbyCheckBox = new JCheckBox("Rugby");
        final JCheckBox cricketCheckBox = new JCheckBox("Cricket");
        final JCheckBox racingCheckBox = new JCheckBox("Racing");

        // Set mnemonics for keyboard shortcuts
        footballCheckBox.setMnemonic(KeyEvent.VK_F);
        tennisCheckBox.setMnemonic(KeyEvent.VK_T);
        rugbyCheckBox.setMnemonic(KeyEvent.VK_R);
        cricketCheckBox.setMnemonic(KeyEvent.VK_C);
        racingCheckBox.setMnemonic(KeyEvent.VK_A);  // 'A' for Racing

        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String checkBoxText = ((JCheckBox) e.getSource()).getText();
                statusLabel.setText(checkBoxText + " Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        };

        footballCheckBox.addItemListener(itemListener);
        tennisCheckBox.addItemListener(itemListener);
        rugbyCheckBox.addItemListener(itemListener);
        cricketCheckBox.addItemListener(itemListener);
        racingCheckBox.addItemListener(itemListener);

        controlPanel.add(footballCheckBox);
        controlPanel.add(tennisCheckBox);
        controlPanel.add(rugbyCheckBox);
        controlPanel.add(cricketCheckBox);
        controlPanel.add(racingCheckBox);

        mainFrame.setVisible(true);
    }

}