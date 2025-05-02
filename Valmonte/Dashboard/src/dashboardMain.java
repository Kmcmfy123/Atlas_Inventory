

public class dashboardMain extends dashboardUI {

    

    
/*
    public void dashboardPanels() {
        setSize(400, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
// Logo
        ImageIcon originalIcon = new ImageIcon("Resources/atlasfeedslogo.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150,
                150, Image.SCALE_SMOOTH); // Width x Height
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        JLabel logoLabel = new JLabel(resizedIcon);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(logoLabel, BorderLayout.NORTH);
// Login Form Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30,
                40));
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        centerPanel.add(new JLabel("Email"));
        centerPanel.add(emailField);
        centerPanel.add(new JLabel("Password"));
        centerPanel.add(passwordField);
        add(centerPanel, BorderLayout.CENTER);
// Buttons
        JPanel buttonPanel = new JPanel();
        JButton loginBtn = new JButton("Login");
        JButton registerBtn = new JButton("Register");
        loginBtn.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            User user = Auth.login(email, password); // Use Auth class to
            verify
            if (user != null) {
                new UserDashboard(user); // Load dashboard with user info
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!");
            }
        });
        registerBtn.addActionListener(e -> {
            new RegistrationFrame();
            dispose();
        });
        buttonPanel.add(loginBtn);
        buttonPanel.add(registerBtn);
        add(buttonPanel, BorderLayout.SOUTH);
        setTitle(true);
    }
*/
    }
