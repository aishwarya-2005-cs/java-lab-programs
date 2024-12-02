import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
    SwingDemo() {
        // Create jframe container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(300, 200);
        jfrm.setLayout(new GridLayout(6, 2, 5, 5)); // Using GridLayout for better arrangement

        // To terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text label
        JLabel jlab = new JLabel("Enter the divisor and dividend:");
       
        // Add text field for both numbers
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);

        // Calc button
        JButton button = new JButton("Calculate");

        // Labels for displaying results and error
        JLabel err = new JLabel("");
        JLabel alab = new JLabel("");  // A label for the divisor
        JLabel blab = new JLabel("");  // B label for the dividend
        JLabel anslab = new JLabel(""); // Answer label

        // Add components in a structured manner using GridLayout
        jfrm.add(jlab);
        jfrm.add(new JLabel(""));  // Empty label for layout spacing

        jfrm.add(new JLabel("Divisor (A):"));
        jfrm.add(ajtf);

        jfrm.add(new JLabel("Dividend (B):"));
        jfrm.add(bjtf);

        jfrm.add(button);
        jfrm.add(err);  // Error message label

        jfrm.add(alab);  // A value label
        jfrm.add(blab);  // B value label

        jfrm.add(anslab);  // Answer label

        // Add action listener to the Calculate button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    int a = Integer.parseInt(ajtf.getText());  // Read divisor
                    int b = Integer.parseInt(bjtf.getText());  // Read dividend
                   
                    if (b == 0) { // Handle division by zero
                        throw new ArithmeticException("B should be NON-zero!");
                    }
                   
                    int ans = a / b;  // Perform division
                    alab.setText("A = " + a);  // Display A value
                    blab.setText("B = " + b);  // Display B value
                    anslab.setText("Ans = " + ans);  // Display result
                    err.setText("");  // Clear error if valid input
                   
                } catch (NumberFormatException e) {
                    // Handle invalid integer input
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("Enter Only Integers!");
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText(e.getMessage());
                }
            }
        });

        // Display frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
System.out.println("K Aishwarya");
        // Create frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}