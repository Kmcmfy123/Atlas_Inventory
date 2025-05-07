package cards;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SalesHistoryCards extends JPanel {
    public static void main(String[] args) {
        new SalesHistoryCards();
    }
    public SalesHistoryCards() {
        setLayout(new BorderLayout());
        setBackground(new Color(0xF0F0F0)); // Set background color to light gray

        JPanel topPanel = new JPanel(null);
        topPanel.setBackground(Color.decode("#ff9933")); // Set background color to light gray
        topPanel.setPreferredSize(new Dimension(880, 60));

        JLabel filterLabel = new JLabel("Filter Report");
        filterLabel.setBounds(440, 105, 301, 21);
        JButton reportBtn = new JButton("Report");
        JButton searchBtn = new JButton("Search");
        JTextField searchField = new JTextField();
        JTextField secondField = new JTextField();
        JComboBox<String> dropdown = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        JButton refreshBtn = new JButton("Refresh");

        // Positioning
        reportBtn.setBounds(50, 55, 96, 40);
        searchBtn.setBounds(163, 55, 96, 40);
        searchField.setBounds(230, 10, 200, 40);
        secondField.setBounds(440, 10, 150, 40);
        dropdown.setBounds(525, 65, 47, 40);
        refreshBtn.setBounds(736, 55, 96, 40);

        for (JButton btn : new JButton[]{reportBtn, searchBtn, refreshBtn}) {
            btn.setForeground(Color.decode("#ffffff"));
            btn.setBackground(Color.decode("#014518"));
        }
        dropdown.setBackground(Color.decode("#ffffff"));
        dropdown.setForeground(Color.decode("#014518"));

        topPanel.add(reportBtn);
        topPanel.add(searchBtn);
        topPanel.add(searchField);
        topPanel.add(secondField);
        topPanel.add(dropdown);
        topPanel.add(refreshBtn);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(new JTable()), BorderLayout.CENTER);
    }
}
