package Dashboard;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;
import java.util.Arrays;


public class dashboardPanel extends JPanel {
    private JButton inventoryButton, transactButton, ordersButton, accountButton, userButton;
    private JButton salesHistoryButton, dbsearchButton, dbrefreshButton, ddButton1, ddButton2;
    private JPanel topBorder, bottomBorder, dbPanel, modulesPanel, dbCardPanel;
    private JTextField dbSearchField;
    private JLabel salesLabel, topSellingLabel, stockLabel;
    private JTable salesTable, totalSummaryTable, topSellingTable, stockLevelTable;
    private DefaultTableModel tableModel, salesTableModel , summaryTableModel , topSellingModel, stockLevelModel;
    private JTableHeader salesTableHeader;
    private JScrollPane dbtabScrollPane, topSellingScroll, stockScroll, summaryScroll;
    private TableColumn column;
    private TableCellRenderer headerRenderer;
    private Component headerComponent;
    private int headerWidth;
    private int maxDataWidth;
    private int row = 0;
    private TableCellRenderer cellRenderer;
    private Component cellComponent;

    public dashboardPanel() {
        // into Main
        initUI();
        loadSalesData();
    }

    public void initUI() {
        setLayout(null);
        dbCardPanel = new JPanel(null);
        add(dbCardPanel);

        salesLabel = new JLabel("Sales Summary");
        topSellingLabel = new JLabel("Top-Selling Items");
        stockLabel = new JLabel("Low Stock Items");


        topBorder = new JPanel(null);
        bottomBorder = new JPanel(null);
        dbPanel = new JPanel(null);
        modulesPanel = new JPanel(null);

        inventoryButton = new JButton("Inventory");
        transactButton = new JButton("Transact");
        ordersButton = new JButton("Orders");
        accountButton = new JButton("Accounts");
        userButton = new JButton("UserAdmin");
        salesHistoryButton = new JButton("Sales History");
        dbsearchButton = new JButton("Search");
        dbrefreshButton = new JButton("Refresh");
        ddButton1 = new JButton("V");
        ddButton2 = new JButton("V");

        dbSearchField = new JTextField(100);

        String[] columnNames1 = {"Sale ID", "Customer Name", "Quantity", "Total Price", "Order Status"};
        salesTableModel  = new DefaultTableModel(columnNames1, 0);
        salesTable = new JTable();
        salesTable.setModel(salesTableModel);

        String[] columnNames2 = {"Total Revenue", "Total Orders", "Total Quantity Sold"};
        summaryTableModel  = new DefaultTableModel(columnNames2, 0);
        totalSummaryTable = new JTable(summaryTableModel);
        totalSummaryTable.getTableHeader().setPreferredSize(new Dimension(0, 50));

        String[] columnNames3 = {"Item Name", "Total Quantity Sold", "Total Revenue"};
        topSellingModel  = new DefaultTableModel(columnNames3, 0);
        topSellingTable = new JTable(topSellingModel );
        topSellingTable.getTableHeader().setPreferredSize(new Dimension(0, 30));

        String[] columnNames4 = {"Item Name", "Item Type", "Location", "Stock"};
        stockLevelModel  = new DefaultTableModel(columnNames4, 0);
        stockLevelTable = new JTable(stockLevelModel );
        stockLevelTable.getTableHeader().setPreferredSize(new Dimension(0, 30));

        summaryScroll = new JScrollPane(totalSummaryTable);
        dbtabScrollPane = new JScrollPane(salesTable);
        topSellingScroll = new JScrollPane(topSellingTable);
        stockScroll = new JScrollPane(stockLevelTable);



        salesTableHeader = salesTable.getTableHeader();
        salesTableHeader.setPreferredSize(new Dimension(salesTableHeader.getPreferredSize().width, 50));

        salesTable.getTableHeader().setResizingAllowed(false);
        salesTable.getTableHeader().setReorderingAllowed(false);
        totalSummaryTable.getTableHeader().setResizingAllowed(false);
        totalSummaryTable.getTableHeader().setReorderingAllowed(false);
        topSellingTable.getTableHeader().setResizingAllowed(false);
        topSellingTable.getTableHeader().setReorderingAllowed(false);
        stockLevelTable.getTableHeader().setResizingAllowed(false);
        stockLevelTable.getTableHeader().setReorderingAllowed(false);



        salesLabel.setForeground(Color.decode("#ffffff"));
        salesLabel.setBackground(Color.decode("#014518"));
        topSellingLabel.setForeground(Color.decode("#ffffff"));
        topSellingLabel.setBackground(Color.decode("#014518"));
        stockLabel.setForeground(Color.decode("#ffffff"));
        stockLabel.setBackground(Color.decode("#014518"));
        dbCardPanel.setBackground(Color.decode("#014518"));
        modulesPanel.setBackground(Color.decode("#ff9933"));
        dbPanel.setBackground(Color.decode("#ff9933"));
        topBorder.setBackground(Color.decode("#ff9933"));
        bottomBorder.setBackground(Color.decode("#ff9933"));
        userButton.setForeground(Color.decode("#ffffff"));
        userButton.setBackground(Color.decode("#014518"));
        inventoryButton.setForeground(Color.decode("#ffffff"));
        inventoryButton.setBackground(Color.decode("#014518"));
        transactButton.setForeground(Color.decode("#ffffff"));
        transactButton.setBackground(Color.decode("#014518"));
        ordersButton.setForeground(Color.decode("#ffffff"));
        ordersButton.setBackground(Color.decode("#014518"));
        accountButton.setForeground(Color.decode("#ffffff"));
        accountButton.setBackground(Color.decode("#014518"));
        dbsearchButton.setForeground(Color.decode("#ffffff"));
        dbsearchButton.setBackground(Color.decode("#014518"));
        dbrefreshButton.setForeground(Color.decode("#ffffff"));
        dbrefreshButton.setBackground(Color.decode("#014518"));
        salesHistoryButton.setForeground(Color.decode("#ffffff"));
        salesHistoryButton.setBackground(Color.decode("#014518"));
        ddButton1.setBackground(Color.decode("#a39f9c"));
        ddButton1.setForeground(Color.decode("#000000"));
        ddButton2.setBackground(Color.decode("#a39f9c"));
        ddButton2.setForeground(Color.decode("#000000"));
        dbSearchField.setBackground(Color.decode("#ffffff"));
        dbSearchField.setForeground(Color.decode("#000000"));


        salesLabel.setBounds(635, 175, 100, 20);
        topSellingLabel.setBounds(635, 305, 150, 20);
        stockLabel.setBounds(635, 460, 100, 20);
        modulesPanel.setBounds(0, 30, 880, 60);
        dbPanel.setBounds(15, 100, 850, 65);
        dbCardPanel.setBounds(0, 0, 880, 660);
        topBorder.setBounds(0, 0, 880, 30);
        bottomBorder.setBounds(0, 630, 880, 30);
        userButton.setBounds(20, 10, 120, 40);
        inventoryButton.setBounds(322, 10, 120, 40);
        transactButton.setBounds(462, 10, 120, 40);
        ordersButton.setBounds(602, 10, 120, 40);
        accountButton.setBounds(742, 10, 120, 40);
        dbsearchButton.setBounds(153, 13, 97, 40);
        dbrefreshButton.setBounds(586, 13, 120, 40);
        salesHistoryButton.setBounds(718, 13, 120, 40);
        ddButton1.setBounds(94, 13, 47, 40);
        ddButton2.setBounds(528, 13, 47, 40);
        dbSearchField.setBounds(250, 13, 166, 40);
        dbtabScrollPane.setBounds(12, 175, 469, 455);
        topSellingScroll.setBounds(505, 330, 355, 125);
        stockScroll.setBounds(505, 485, 355, 135);
        totalSummaryTable.setBounds(505, 200, 355, 100);
        summaryScroll.setBounds(505, 200, 355, 100);

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


        // Add panels to dbCardPanel
        dbCardPanel.add(modulesPanel, "Modules");
        dbCardPanel.add(dbPanel, "Dashboard");
        dbCardPanel.add(topBorder, "Top Border");
        dbCardPanel.add(bottomBorder, "Bottom Border");
        dbCardPanel.add(dbtabScrollPane, "salesTable");
        dbCardPanel.add(topSellingScroll);
        dbCardPanel.add(stockScroll);
        dbCardPanel.add(summaryScroll);
        dbCardPanel.add(salesLabel);
        dbCardPanel.add(topSellingLabel);
        dbCardPanel.add(stockLabel);


        // Adjust column width based on header and content
        for (int i = 0; i < salesTable.getColumnCount(); i++) {
            column = salesTable.getColumnModel().getColumn(i);
            headerRenderer = salesTable.getTableHeader().getDefaultRenderer();
            headerComponent = headerRenderer.getTableCellRendererComponent(salesTable, column.getHeaderValue(), false, false, 0, i);

            headerWidth = headerComponent.getPreferredSize().width;
            maxDataWidth = 0;

            // Calculate the maximum width of the data in this column
            for (row = 0; row < salesTable.getRowCount(); row++) {
                cellRenderer = salesTable.getCellRenderer(row, i);
                cellComponent = cellRenderer.getTableCellRendererComponent(salesTable, salesTable.getValueAt(row, i), false, false, row, i);
                maxDataWidth = Math.max(maxDataWidth, cellComponent.getPreferredSize().width);
            }
            // Set the column width to fit the larger of the header or data width
            column.setPreferredWidth(Math.max(headerWidth, maxDataWidth) + 10); // Adding a little padding
        }

        inventoryButton.addActionListener(e -> showInventory());
        transactButton.addActionListener(e -> showTransact());
        ordersButton.addActionListener(e -> showOrders());
        accountButton.addActionListener(e -> showAccount());
        userButton.addActionListener(e -> showUserAdmin());
        salesHistoryButton.addActionListener(e -> {
            System.out.println("Sales History button clicked!"); // Debugging line
            loadSalesData(); // Ensure this is called
        });
        dbsearchButton.addActionListener(e -> searchInDatabase());
        dbrefreshButton.addActionListener(e -> refreshDatabase());
    }

    public void loadSalesData() {
        // Clear the table
        salesTableModel.setRowCount(0);

        String query = """
        SELECT s.sale_id, s.customer_name, 
               SUM(si.quantity) AS total_quantity, 
               s.total_price, 
               'Completed' AS order_status
        FROM sales s
        JOIN sale_items si ON s.sale_id = si.sale_id
        GROUP BY s.sale_id
        ORDER BY s.sale_id DESC
    """;

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0321", "root", "password_123");
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            int rowCount = 0; // Track how many rows have been added
            System.out.println("Executing query: " + query); // Print query for verification

            while (rs.next() && rowCount < 55) { // Limit to 55 rows
                // Print the values retrieved from the ResultSet
                System.out.println("Sale ID: " + rs.getInt("sale_id"));
                System.out.println("Customer Name: " + rs.getString("customer_name"));
                System.out.println("Total Quantity: " + rs.getInt("total_quantity"));
                System.out.println("Total Price: " + rs.getBigDecimal("total_price"));
                System.out.println("Order Status: " + rs.getString("order_status"));

                // Add row to table model
                Object[] row = new Object[5];
                row[0] = "SI" + rs.getInt("sale_id"); // Sale ID
                row[1] = rs.getString("customer_name"); // Customer Name
                row[2] = rs.getInt("total_quantity"); // Quantity
                row[3] = rs.getBigDecimal("total_price"); // Total Price
                row[4] = rs.getString("order_status"); // Order Status

                salesTableModel.insertRow(0, row); // Add the row
                rowCount++; // Increment the row count

                // Print row count to verify
                System.out.println("Number of rows added: " + salesTable.getRowCount());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading sales data: " + e.getMessage());
        }
    }





    // Example of how to add a row to the table based on data from your order database
    private void addRowToTable(String saleInvoice, String customerName, int quantity, double total, String orderStatus) {
        // Insert data into your table model
        Object[] rowData = {saleInvoice, customerName, quantity, total, orderStatus};
        tableModel.addRow(rowData);
    }

    public void refreshDatabase() {
        System.out.println("Refreshing database...");

        // Clear the existing rows
        tableModel.setRowCount(0);

        // Database connection setup
        String dbUrl = "jdbc:mysql://localhost:3306/dbm0321";  // Adjust the URL
        String dbUser = "root";  // Your DB username
        String dbPassword = "password_123";  // Your DB password

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT * FROM orders";  // Adjust this query to your needs
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            int rowCount = 0;
            while (rs.next() && rowCount < 55) {
                System.out.println("Processing row " + rowCount); // Debugging line
                Object[] row = new Object[5];
                row[0] = "SI" + rs.getInt("sale_id");
                row[1] = rs.getString("customer_name");
                row[2] = rs.getInt("total_quantity");
                row[3] = rs.getBigDecimal("total_price");
                row[4] = rs.getString("order_status");

                System.out.println("Adding row to table: " + Arrays.toString(row)); // Debugging line

                // Insert the row at the top
                salesTableModel.insertRow(0, row);
                rowCount++;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Action listener methods
    private void showInventory() {
        System.out.println("Inventory clicked!");
        // Logic to show inventory panel
    }

    private void showTransact() {
        System.out.println("Transact clicked!");
        // Logic to show transact panel
    }

    private void showOrders() {
        System.out.println("Orders clicked!");
        // Logic to show orders panel
    }

    private void showAccount() {
        System.out.println("Account clicked!");
        // Logic to show account panel
    }

    private void showUserAdmin() {
        System.out.println("UserAdmin clicked!");
        // Logic to show user admin panel
    }

    private void showSalesHistory() {
        System.out.println("Sales History clicked!");
        // Logic to show sales history
    }

    private void searchInDatabase() {
        String searchQuery = dbSearchField.getText();
        System.out.println("Search query: " + searchQuery);
        // Logic to search in the database based on the search query
    }




    // Getters for components (if needed for interaction from other classes)
    public JButton getInventoryButton() {
        return inventoryButton;
    }

    public JButton getTransactButton() {
        return transactButton;
    }

    public JButton getOrdersButton() {
        return ordersButton;
    }

    public JButton getAccountButton() {
        return accountButton;
    }

    public JButton getUserButton() {
        return userButton;
    }

    public JButton getSalesHistoryButton() {
        return salesHistoryButton;
    }

    public JButton getDbSearchButton() {
        return dbsearchButton;
    }

    public JButton getDbRefreshButton() {
        return dbrefreshButton;
    }

    public JTextField getDbSearchField() {
        return dbSearchField;
    }

}