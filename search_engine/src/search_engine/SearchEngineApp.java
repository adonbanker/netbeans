/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_engine;
package com.example.searchengine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SearchEngineApp extends JFrame {

    private JTextField searchField;
    private JTextArea resultsArea;

    // Sample data to search
    private List<String> data;

    public SearchEngineApp() {
        setTitle("Simple Search Engine");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        loadData();
    }

    private void initComponents() {
        searchField = new JTextField(30);
        resultsArea = new JTextArea();
        resultsArea.setEditable(false);
        JButton searchButton = new JButton("Search");

        JPanel panel = new JPanel(new BorderLayout());
        JPanel searchPanel = new JPanel();
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        panel.add(searchPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(resultsArea), BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        add(panel);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add("Java programming language");
        data.add("Python programming language");
        data.add("JavaScript programming language");
        data.add("How to build a search engine");
        data.add("Simple Java GUI application");
        // Add more sample data as needed
    }

    private void performSearch() {
        String query = searchField.getText().toLowerCase();
        resultsArea.setText("");

        if (query.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a search query.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (String entry : data) {
            if (entry.toLowerCase().contains(query)) {
                resultsArea.append(entry + "\n");
            }
        }

        if (resultsArea.getText().isEmpty()) {
            resultsArea.setText("No results found.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchEngineApp().setVisible(true);
            }
        });
    }
}