package g;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApplication {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Login Application");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create panels for components
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JPanel buttonPanel = new JPanel();

        // Add components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");

        // Add action listeners for buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("user") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });

        // Add components to panels
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);

        // Add panels to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}