import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class dashboardUI implements ActionListener{


    public static void main(String[] args) {
        new dashboardMain();
    }
        JFrame frame = new JFrame("Dashboard UI");

        JButton inventoryButton = new JButton("Inventory"),
                transactButton = new JButton("Transact"),
                ordersButton = new JButton("Orders"),
                accountButton = new JButton("Accounts"),
                userButton = new JButton("UserAdmin"),
                // New Window Button
                salesHistoryButton = new JButton("Sales History"),
                dbsearchButton = new JButton("Search"),
                dbrefreshButton = new JButton("Refresh"),
                ddButton1 = new JButton("V"),
                ddButton2 = new JButton("V");

        JPanel modulesPanel = new JPanel(),
                dbPanel = new JPanel(),
                topBorder = new JPanel(),
                bottomBorder = new JPanel();

        JTextField dbSearchField = new JTextField(100);

        JLabel totalSalesLabel = new JLabel("Total Sales:"),
                totalOrdersLabel = new JLabel("Total Orders:"),
                totalInventoryLabel = new JLabel("Total Inventory:");
        
        JLayeredPane dbPane = new JLayeredPane(); 
    public dashboardUI() {
        
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(880, 660);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.decode("#014518"));
        frame.setLocationRelativeTo(null);


//JButtons
        userButton.setBounds(20, 40, 120, 40); // Height changed to 45
        userButton.setForeground(Color.decode("#ffffff"));
        userButton.setBackground(Color.decode("#014518"));
        userButton.setLayout(null);


        inventoryButton.setBounds(322, 40, 120, 40); // Height changed to 45
        inventoryButton.setForeground(Color.decode("#ffffff"));
        inventoryButton.setBackground(Color.decode("#014518"));
        inventoryButton.setFocusable(false);
        inventoryButton.setLayout(null);
        inventoryButton.addActionListener(this);


        transactButton.setBounds(462, 40, 120, 40); // Height changed to 45
        transactButton.setForeground(Color.decode("#ffffff"));
        transactButton.setBackground(Color.decode("#014518"));
        transactButton.setFocusable(false);
        transactButton.setLayout(null);
        transactButton.addActionListener(this);
        

        ordersButton.setBounds(602, 40, 120, 40); // Height changed to 45
        ordersButton.setForeground(Color.decode("#ffffff"));
        ordersButton.setBackground(Color.decode("#014518"));
        ordersButton.setLayout(null);
        ordersButton.setFocusable(false);


        accountButton.setBounds(742, 40, 120, 40); // Height changed to 45
        accountButton.setForeground(Color.decode("#ffffff"));
        accountButton.setBackground(Color.decode("#014518"));
        accountButton.setLayout(null);
        accountButton.setFocusable(false);


        // dbButtons
        dbsearchButton.setBounds(168, 113, 97, 40); // Height changed to 45
        dbsearchButton.setForeground(Color.decode("#ffffff"));
        dbsearchButton.setBackground(Color.decode("#014518"));
        dbsearchButton.setLayout(null);


        dbrefreshButton.setBounds(601, 113, 120, 40); // Height changed to 45
        dbrefreshButton.setForeground(Color.decode("#ffffff"));
        dbrefreshButton.setBackground(Color.decode("#014518"));
        dbrefreshButton.setLayout(null);


        salesHistoryButton.setBounds(733, 113, 120, 40); // Height changed to 45
        salesHistoryButton.setForeground(Color.decode("#ffffff"));
        salesHistoryButton.setBackground(Color.decode("#014518"));
        salesHistoryButton.setLayout(null);
        
        
        ddButton1.setBounds(109, 113, 47, 40); // Example position and size
        ddButton1.setBackground(Color.decode("#a39f9c"));
        ddButton1.setForeground(Color.decode("#000000"));
        ddButton1.setLayout(null);

        ddButton2.setBounds(543, 113, 47, 40); // Example position and size
        ddButton2.setBackground(Color.decode("#a39f9c"));
        ddButton2.setForeground(Color.decode("#000000"));
        ddButton1.setLayout(null);
//Panels
        modulesPanel.setBackground(Color.decode("#ff9933"));
        modulesPanel.setBounds(0, 30, 880, 60);
        modulesPanel.setLayout(null);

        dbPanel.setBackground(Color.decode("#ff9933"));
        dbPanel.setBounds(15, 100, 850, 65);
        dbPanel.setLayout(null);

        topBorder.setBounds(0, 0, 880, 30);
        topBorder.setBackground(Color.decode("#ff9933"));
        topBorder.setLayout(null);

        bottomBorder.setBounds(0, 630, 880, 30);
        bottomBorder.setBackground(Color.decode("#ff9933"));
        bottomBorder.setLayout(null);

        //JLayeredPane
        dbPane.setBounds(0, 0, 880, 660);
        //dbPane.add() 


//JTextField
        dbSearchField.setBounds(265, 113, 166, 40); // Height changed to 45
        dbSearchField.setBackground(Color.decode("#ffffff"));
        dbSearchField.setForeground(Color.decode("#000000"));
        dbSearchField.setEnabled(true);
        dbSearchField.setEditable(true);
        dbSearchField.setLayout(null);

//Frame settings
        // Adding buttons to the modules panel
        frame.add(userButton);
        frame.add(inventoryButton);
        frame.add(transactButton);
        frame.add(ordersButton);
        frame.add(accountButton);
        frame.add(ddButton1);
        frame.add(ddButton2);

        // Add JtextField to frame
        frame.add(dbSearchField);
        
        // Adding buttons to the db panel
        frame.add(dbsearchButton);
        frame.add(dbrefreshButton);
        frame.add(salesHistoryButton);
                //frame.add(reportButton);

        // Added Elements to the frame
        frame.add(modulesPanel);
        frame.add(dbPanel);
        frame.add(topBorder);
        frame.add(bottomBorder);

        
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == inventoryButton || e.getSource() == transactButton) {
                frame.dispose();
                SalesHistory salesHistory = new SalesHistory();
        }
    }


















        /*
    JFrame frame = new JFrame("Dashboard UI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(880, 660);
    frame.setVisible(true);
    frame.setResizable(true);

        java.awt.Container contentPane = frame.getContentPane();
        contentPane.setBackground(new Color(0x014518));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
        
        JButton button = new JButton("Click Me!");
        button.set                                                                                                                                                                                                                                                                                      Bounds(50, 50, 100, 30);
        button.setBackground(new Color(0xFF5733));
        button.setForeground(Color.WHITE);
        frame.add(button);

    }
         */
    }


}
