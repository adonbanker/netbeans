/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Banking extends JFrame {
    private static class User {
        private String username;
        private String password;
        private double balance;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
            this.balance = 0;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }
    }

    private Map<String, User> users = new HashMap<>();
    private User currentUser;
    private JLabel balanceLabel;
    private JTextField amountField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel mainPanel;

    public Banking() {
        createLoginUI();
    }

    private void createLoginUI() {
        setTitle("Bank of Java - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(5, 1));

        loginPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        loginPanel.add(usernameField);

        loginPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        loginPanel.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
        loginPanel.add(registerButton);

        add(loginPanel);
    }

    private void createMainUI() {
        setTitle("Bank of Java - Banking");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1));

        balanceLabel = new JLabel("Your current balance is $" + currentUser.getBalance());
        mainPanel.add(balanceLabel);

        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });
        mainPanel.add(checkBalanceButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });
        mainPanel.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });
        mainPanel.add(withdrawButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });
        mainPanel.add(logoutButton);

        amountField = new JTextField();
        mainPanel.add(new JLabel("Enter amount:"));
        mainPanel.add(amountField);

        add(mainPanel);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            JOptionPane.showMessageDialog(this, "Login successful!");
            getContentPane().removeAll();
            createMainUI();
            revalidate();
            repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    }

    private void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (users.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "Username already taken. Please choose another.");
        } else {
            User newUser = new User(username, password);
            users.put(username, newUser);
            JOptionPane.showMessageDialog(this, "Registration successful! You can now log in.");
        }
    }

    private void checkBalance() {
        balanceLabel.setText("Your current balance is $" + currentUser.getBalance());
    }

    private void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            currentUser.deposit(amount);
            JOptionPane.showMessageDialog(this, "$" + amount + " has been deposited to your account.");
            checkBalance();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount entered. Please enter a valid number.");
        }
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (currentUser.withdraw(amount)) {
                JOptionPane.showMessageDialog(this, "$" + amount + " has been withdrawn from your account.");
                checkBalance();
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient funds.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount entered. Please enter a valid number.");
        }
    }

    private void logout() {
        currentUser = null;
        getContentPane().removeAll();
        createLoginUI();
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Banking ex = new Banking();
                ex.setVisible(true);
            }
        });
    }
}