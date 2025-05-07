package Valmonte.Dashboard.UI;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class SalesHistoryCards extends JPanel {
    private JTable salesTable;
    private CardLayout cardLayout = new CardLayout();
    private JPanel shCardPanel = new JPanel(cardLayout),
            reportPanel = new JPanel(),
            salesHistoryPanel = new JPanel();


    JPanel topBorder = new JPanel(),
            bottomBorder = new JPanel(),
            salesHistoryPanel = new JPanel(),
    JButton reportButton = new JButton("Report"),
            shsearchButton = new JButton("Search"),
            shRefreshButton = new JButton("Refresh");
    JComboBox<String> shComboBox = new JComboBox<>(new String[]{"All", "Date", "Item", "Quantity", "Price"}),
            shComboBox2 = new JComboBox<>(new String[]{"All", "Date", "Item", "Quantity", "Price"});
    JTextField shTextField = new JTextField(200);

    public SalesHistoryCards() {
        setBackground(Colors.BLACK);
        setLayout(null);
        // Placeholder sales data
        String[] columns = {"Date", "Item", "Quantity", "Price"};
        Object[][] data = {
                {"2025-05-01", "Item A", 2, "$20.00"},
                {"2025-05-01", "Item B", 1, "$15.00"},
                {"2025-05-02", "Item C", 3, "$30.00"},
        };

        salesTable = new JTable(data, columns);
        JTableHeader header = salesTable.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer());

        JScrollPane scrollPane = new JScrollPane(salesTable);
        add(scrollPane, BorderLayout.CENTER);
        
    }
}
