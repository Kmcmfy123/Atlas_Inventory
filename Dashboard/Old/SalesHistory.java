package Valmonte.Dashboard.Old;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SalesHistory extends JPanel{

    JPanel salesHistoryPanel = new JPanel(null);

    JButton backButton = new JButton("<");
    

    
    SalesHistory(){
        salesHistoryPanel.setBounds(30, 40, 820, 70);
        salesHistoryPanel.setBackground(Color.decode("#ff9933"));
        salesHistoryPanel.setLayout(null);


    }

    /*
    JFrame frame = new JFrame("Sales History");
    JLabel salesHistoryLabel = new JLabel("aaaa");
    JButton backButton = new JButton("<");
    public SalesHistory() {
        salesHistoryLabel.setBounds(50, 50, 200, 30);
        frame.add(salesHistoryLabel);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(880, 660);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.decode("#ff9933"));
        frame.setLocationRelativeTo(null);

        backButton.setBounds(0, 0, 50, 30);
        backButton.setBackground(Color.decode("#a39f9c"));
        backButton.setForeground(Color.decode("#ffffff"));
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);


        frame.add(backButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            frame.dispose();
            new dashboardUI();
        }
    }
    */
}
