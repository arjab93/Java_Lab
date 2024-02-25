import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SumDiffCalc extends JFrame {
    JTextField num1, num2, result;
    JLabel n1, n2, rs;

    public SumDiffCalc() {
        setTitle("Sum and Difference Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

        // Create components
        n1 = new JLabel("1st num: ");
        num1 = new JTextField(10);
        n2 = new JLabel("2nd num: ");
        num2 = new JTextField(10);
        rs = new JLabel("Press and release: ");
        result = new JTextField(10);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(n1);
        panel.add(num1);
        panel.add(n2);
        panel.add(num2);
        panel.add(rs);
        panel.add(result);

        // Add panel to the frame
        add(panel);

        // Add MouseAdapter to handle mouse events
        result.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });
    }

    private void calculateSum() {
        try {
            double numb1 = Double.parseDouble(num1.getText());
            double numb2 = Double.parseDouble(num2.getText());
            double sum = numb1 + numb2;
            result.setText("Sum: " + sum);
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    private void calculateDifference() {
        try {
            double numb1 = Double.parseDouble(num1.getText());
            double numb2 = Double.parseDouble(num2.getText());
            double difference = numb1 - numb2;
            result.setText("Difference: " + difference);
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
            new SumDiffCalc();
    }
}
