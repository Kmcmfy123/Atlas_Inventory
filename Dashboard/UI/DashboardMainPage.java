package Valmonte.Dashboard.UI;


import javax.swing.*;

import Valmonte.Dashboard.UI.Colors;

import java.awt.*;
import java.awt.event.ActionListener;

public class DashboardMainPage extends JPanel {
    public JButton inventoryButton = new JButton("Inventory");
    public JButton transactButton = new JButton("Transact");
    public JButton salesHistoryButton = new JButton("Sales History");

    public DashboardMainPage(ActionListener listener) {
        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Colors.HEADER_COLOR);
        headerPanel.setPreferredSize(new Dimension(880, 60));

        inventoryButton.setBackground(Colors.BUTTON_COLOR);
        inventoryButton.setForeground(Color.WHITE);
        inventoryButton.addActionListener(listener);

        transactButton.setBackground(Colors.BUTTON_COLOR);
        transactButton.setForeground(Color.WHITE);
        transactButton.addActionListener(listener);

        salesHistoryButton.setBackground(Colors.BUTTON_COLOR);
        salesHistoryButton.setForeground(Color.WHITE);
        salesHistoryButton.addActionListener(listener);

        headerPanel.add(inventoryButton);
        headerPanel.add(transactButton);
        headerPanel.add(salesHistoryButton);

        add(headerPanel, BorderLayout.NORTH);
    }
}
