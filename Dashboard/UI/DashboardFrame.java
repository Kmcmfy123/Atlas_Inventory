import java.awt.CardLayout;


import javax.swing.JFrame;
import cards.SalesHistoryCards;
public class DashboardFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public DashboardFrame() {
        setTitle("Sales Management System");
        setSize(880, 660);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
    }
}
