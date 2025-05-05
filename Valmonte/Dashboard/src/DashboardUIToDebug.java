import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class dashboardUI{
    public static void main(String[] args) {
        new dashboardUI();
    }
        JFrame frame = new JFrame("Dashboard UI");
        
        CardLayout cardLayout = new CardLayout();

        JButton inventoryButton = new JButton("Inventory"),
                transactButton = new JButton("Transact"),
                ordersButton = new JButton("Orders"),
                accountButton = new JButton("Accounts"),
                userButton = new JButton("UserAdmin"),
                // Dashboard Buttons
                salesHistoryButton = new JButton("Sales History"),
                dbsearchButton = new JButton("Search"),
                dbrefreshButton = new JButton("Refresh"),
                ddButton1 = new JButton("V"),
                ddButton2 = new JButton("V");

        JPanel topBorder = new JPanel(),
                bottomBorder = new JPanel(),
                dbCardPanel = new JPanel(cardLayout),
                dbPanel = new JPanel(null),
                modulesPanel = new JPanel(null);
                
        JTextField dbSearchField = new JTextField(100);


        JLabel totalSalesLabel = new JLabel("Total Sales:"),
                totalOrdersLabel = new JLabel("Total Orders:"),
                totalInventoryLabel = new JLabel("Total Inventory:");

        String[] columnNames = {"Sale Invoice", "Customer Name","Quantity", "Total", "Order Status"};

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable salesTable = new JTable(tableModel);
        JScrollPane dbtabScrollPane = new JScrollPane(salesTable);
        
        
    public dashboardUI() {
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(880, 660);
        frame.setLocationRelativeTo(null);

//JButtons
{
        userButton.setBounds(20, 10, 120, 40);
        userButton.setForeground(Color.decode("#ffffff"));
        userButton.setBackground(Color.decode("#014518"));
        userButton.setLayout(null);

        inventoryButton.setBounds(322, 10, 120, 40);
        inventoryButton.setForeground(Color.decode("#ffffff"));
        inventoryButton.setBackground(Color.decode("#014518"));
        inventoryButton.setFocusable(false);
        inventoryButton.setLayout(null);
        // inventoryButton.addActionListener(this);

        transactButton.setBounds(462, 10, 120, 40);
        transactButton.setForeground(Color.decode("#ffffff"));
        transactButton.setBackground(Color.decode("#014518"));
        transactButton.setFocusable(false);
        transactButton.setLayout(null);
        // transactButton.addActionListener(this);

        ordersButton.setBounds(602, 10, 120, 40);
        ordersButton.setForeground(Color.decode("#ffffff"));
        ordersButton.setBackground(Color.decode("#014518"));
        ordersButton.setLayout(null);
        ordersButton.setFocusable(false);

        accountButton.setBounds(742, 10, 120, 40);
        accountButton.setForeground(Color.decode("#ffffff"));
        accountButton.setBackground(Color.decode("#014518"));
        accountButton.setLayout(null);
        accountButton.setFocusable(false);

        // New Window Button: dbPanel.setBounds(15, 100, 850, 65);
        dbsearchButton.setBounds(153, 13, 97, 40);
        dbsearchButton.setForeground(Color.decode("#ffffff"));
        dbsearchButton.setBackground(Color.decode("#014518"));
        dbsearchButton.setLayout(null);

        dbrefreshButton.setBounds(586, 13, 120, 40);
        dbrefreshButton.setForeground(Color.decode("#ffffff"));
        dbrefreshButton.setBackground(Color.decode("#014518"));
        dbrefreshButton.setLayout(null);

        salesHistoryButton.setBounds(718, 13, 120, 40);
        salesHistoryButton.setForeground(Color.decode("#ffffff"));
        salesHistoryButton.setBackground(Color.decode("#014518"));
        salesHistoryButton.setLayout(null);
        
        ddButton1.setBounds(94, 13, 47, 40);
        ddButton1.setBackground(Color.decode("#a39f9c"));
        ddButton1.setForeground(Color.decode("#000000"));
        ddButton1.setLayout(null);

        ddButton2.setBounds(528, 13, 47, 40);
        ddButton2.setBackground(Color.decode("#a39f9c"));
        ddButton2.setForeground(Color.decode("#000000"));
        ddButton1.setLayout(null);
}
//Panels
{
        modulesPanel.setBackground(Color.decode("#ff9933"));
        modulesPanel.setBounds(0, 30, 880, 60);
        modulesPanel.setLayout(null);
        modulesPanel.setOpaque(true);

        dbPanel.setBackground(Color.decode("#ff9933"));
        dbPanel.setBounds(15, 100, 850, 65);
        dbPanel.setLayout(null);
        dbPanel.setOpaque(true);

        topBorder.setBounds(0, 0, 880, 30);
        topBorder.setBackground(Color.decode("#ff9933"));
        topBorder.setLayout(null);
        topBorder.setOpaque(true);

        bottomBorder.setBounds(0, 630, 880, 30);
        bottomBorder.setBackground(Color.decode("#ff9933"));
        bottomBorder.setLayout(null);
        bottomBorder.setOpaque(true);
        
//dbCardPanel
        modulesPanel.add(userButton);
        modulesPanel.add(inventoryButton);
        modulesPanel.add(transactButton);
        modulesPanel.add(ordersButton);
        modulesPanel.add(accountButton);

        dbPanel.add(dbsearchButton);
        dbPanel.add(dbrefreshButton);
        dbPanel.add(salesHistoryButton);
        dbPanel.add(ddButton1);
        dbPanel.add(ddButton2);
        dbPanel.add(dbSearchField);
}
//JTextField
{
        dbSearchField.setBounds(250, 13, 166, 40); // Height changed to 45
        dbSearchField.setBackground(Color.decode("#ffffff"));
        dbSearchField.setForeground(Color.decode("#000000"));
        dbSearchField.setEnabled(true);
        dbSearchField.setEditable(true);
        dbSearchField.setLayout(null);
}
//ScrollPane
{
        dbtabScrollPane.setBounds(12, 175, 392, 455);
        dbCardPanel.add(dbtabScrollPane, "salesTable");
// Apply the custom header renderer to the table
salesTable.getTableHeader().setDefaultRenderer(new MultiLineHeaderRenderer());
//tableModel.setRow
// Updated rows without date, item, price, and payment method
tableModel.addRow(new Object[]{"S001", "Alice", 1, 500.0, "Completed"});
tableModel.addRow(new Object[]{"S002", "Bob", 2, 60000.0, "Completed"});
tableModel.addRow(new Object[]{"S003", "Charlie", 3, 750.0, "Completed"});
tableModel.addRow(new Object[]{"S004", "Diana", 1, 1000.0, "Completed"});
tableModel.addRow(new Object[]{"S005", "Evan", 1, 7000.0, "Pending"});
tableModel.addRow(new Object[]{"S006", "Faye", 2, 2400.0, "Completed"});
tableModel.addRow(new Object[]{"S007", "Gina", 1, 15000.0, "Completed"});
tableModel.addRow(new Object[]{"S008", "Harry", 2, 1000.0, "Completed"});
tableModel.addRow(new Object[]{"S009", "Ivy", 5, 1000.0, "Completed"});
tableModel.addRow(new Object[]{"S010", "Jack", 1, 8000.0, "Pending"});
tableModel.addRow(new Object[]{"S011", "Karen", 1, 25000.0, "Completed"});
tableModel.addRow(new Object[]{"S012", "Leo", 1, 1500.0, "Completed"});
tableModel.addRow(new Object[]{"S013", "Mona", 4, 400.0, "Completed"});
tableModel.addRow(new Object[]{"S014", "Nate", 1, 3200.0, "Completed"});
tableModel.addRow(new Object[]{"S015", "Olive", 1, 4000.0, "Completed"});
tableModel.addRow(new Object[]{"S016", "Paul", 2, 3600.0, "Completed"});
tableModel.addRow(new Object[]{"S017", "Quinn", 1, 2200.0, "Pending"});
tableModel.addRow(new Object[]{"S018", "Rose", 1, 12000.0, "Completed"});
tableModel.addRow(new Object[]{"S019", "Steve", 1, 3500.0, "Completed"});
tableModel.addRow(new Object[]{"S020", "Tina", 1, 1000.0, "Completed"});
tableModel.addRow(new Object[]{"S021", "Uma", 1, 4500.0, "Completed"});
tableModel.addRow(new Object[]{"S022", "Victor", 1, 9000.0, "Completed"});
tableModel.addRow(new Object[]{"S023", "Wendy", 1, 5500.0, "Completed"});
tableModel.addRow(new Object[]{"S024", "Xander", 2, 6000.0, "Completed"});
tableModel.addRow(new Object[]{"S025", "Yara", 2, 3600.0, "Completed"});
tableModel.addRow(new Object[]{"S026", "Zane", 1, 25000.0, "Pending"});
tableModel.addRow(new Object[]{"S027", "Ariel", 1, 7000.0, "Completed"});
tableModel.addRow(new Object[]{"S028", "Bryan", 2, 3000.0, "Completed"});
tableModel.addRow(new Object[]{"S029", "Cindy", 3, 2100.0, "Completed"});
tableModel.addRow(new Object[]{"S030", "Derek", 2, 500.0, "Completed"});
tableModel.addRow(new Object[]{"S031", "Ella", 1, 450.0, "Completed"});
tableModel.addRow(new Object[]{"S032", "Frank", 2, 1200.0, "Completed"});
tableModel.addRow(new Object[]{"S033", "Grace", 1, 800.0, "Completed"});
tableModel.addRow(new Object[]{"S034", "Hank", 3, 900.0, "Completed"});
tableModel.addRow(new Object[]{"S035", "Isabel", 2, 500.0, "Completed"});
tableModel.addRow(new Object[]{"S036", "Jake", 1, 1500.0, "Completed"});
}
/* 
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
        */
//CardLayout
{
        dbCardPanel.setLayout(null);
        dbCardPanel.setBounds(0, 30, 880, 600);
        dbCardPanel.add(dbPanel, "Dashboard");
        dbCardPanel.add(modulesPanel, "Modules");
        dbCardPanel.add(topBorder, "Top Border");
        dbCardPanel.add(bottomBorder, "Bottom Border");

        dbCardPanel.setBackground(Color.decode("#014518")); // Green background
        frame.setContentPane(dbCardPanel);
        frame.setVisible(true);
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
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == salesHistoryButton) {
                cardLayout.show(dbCardPanel, "sales");
        }
    }
        */

    // ... existing code ...

    // Inner class for Multi-Line Header Renderer
    class MultiLineHeaderRenderer extends JLabel implements TableCellRenderer {
        public MultiLineHeaderRenderer() {
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
            setOpaque(true);
            setBackground(Color.decode("#014518"));
            setForeground(Color.WHITE);
            setFont(new Font("Segoe UI", Font.BOLD, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value != null && value.toString().equals("Customer Name")) {
                setText("<html><center>Customer<br>Name</center></html>");
            } else {
                setText("<html><center>" + value.toString() + "</center></html>");
            }
            return this;
        }
    }
}


