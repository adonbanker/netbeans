/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dh;

/**
 *
 * @author Adon Banker
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banking implements ActionListener {
  private final JFrame mainFrame;
  private final JTextField inputField;
  private final JLabel balanceLabel;
  private int balance = 0;

  public Banking() {

    mainFrame = new JFrame("Simple Bank Application");
    mainFrame.setVisible(true);
    mainFrame.setSize(400, 400);
    mainFrame.setFont(new Font("Arial",Font.BOLD,18));
    mainFrame.setLayout(new FlowLayout());

    inputField = new JTextField(10);
    balanceLabel = new JLabel("Current balance: " + balance);
    JButton depositButton = new JButton("Deposit");
    JButton withdrawButton = new JButton("Withdraw");

    mainFrame.add(inputField);
    mainFrame.add(depositButton);
    mainFrame.add(withdrawButton);
    mainFrame.add(balanceLabel);

    depositButton.addActionListener(this);
    withdrawButton.addActionListener(this);

    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int amount = Integer.parseInt(inputField.getText());
    if (e.getActionCommand().equals("Deposit")) {
      balance += amount;
    } else {
      balance -= amount;
    }
    balanceLabel.setText("Current balance: " + balance);
    inputField.setText("");
  }

  public static void main(String[] args) {
      Banking banking = new Banking();
  }
}