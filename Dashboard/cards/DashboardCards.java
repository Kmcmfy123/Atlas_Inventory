package Valmonte.Dashboard.cards;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DashboardCards implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton inventoryButton;
    private JButton transactButton;
    private JButton salesHistoryButton;

    public DashboardCards(CardLayout cardLayout,
                                JPanel cardPanel,
                                JButton inventoryButton,
                                JButton transactButton,
                                JButton salesHistoryButton) {
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
        this.inventoryButton = inventoryButton;
        this.transactButton = transactButton;
        this.salesHistoryButton = salesHistoryButton;

        this.inventoryButton.addActionListener(this);
        this.transactButton.addActionListener(this);
        this.salesHistoryButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == inventoryButton) {
            cardLayout.show(cardPanel, "inventory");
        } else if (source == transactButton) {
            cardLayout.show(cardPanel, "transact");
        } else if (source == salesHistoryButton) {
            cardLayout.show(cardPanel, "sales");
        }
    }
}
