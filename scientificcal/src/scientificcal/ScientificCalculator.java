/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;

public class ScientificCalculator extends JFrame implements ActionListener {

    private final JTextField display;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "log",
                "sqrt", "pow", "C", "Exit"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 15));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "=":
                    display.setText(evaluate(display.getText()));
                    break;
                case "C":
                    display.setText("");
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                case "sin":
                    display.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(display.getText())))));
                    break;
                case "cos":
                    display.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(display.getText())))));
                    break;
                case "tan":
                    display.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(display.getText())))));
                    break;
                case "log":
                    display.setText(String.valueOf(Math.log10(Double.parseDouble(display.getText()))));
                    break;
                case "sqrt":
                    display.setText(String.valueOf(Math.sqrt(Double.parseDouble(display.getText()))));
                    break;
                case "pow":
                    String base = JOptionPane.showInputDialog(this, "Enter base:");
                    String exponent = JOptionPane.showInputDialog(this, "Enter exponent:");
                    display.setText(String.valueOf(Math.pow(Double.parseDouble(base), Double.parseDouble(exponent))));
                    break;
                default:
                    display.setText(display.getText() + command);
            }
        } catch (NumberFormatException ex) {
            display.setText("Error");
        }
    }

    private String evaluate(String expression) {
        try {
            return String.valueOf(new ScriptEngineManager().getEngineByName("JavaScript").eval(expression));
        } catch (Exception e) {
            return "Error";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScientificCalculator::new);
    }
}