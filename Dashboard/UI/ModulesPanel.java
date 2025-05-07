package Valmonte.Dashboard.UI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModulesPanel extends JPanel {
    public ModulesPanel() {
        setBackground(new Color(0xF0F0F0)); // Set background color to light gray
        setLayout(new FlowLayout());
        add(new JLabel("Modules"));
    }
}
