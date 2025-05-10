import javax.swing.*;
import java.awt.CardLayout;
import Dashboard.dashboardPanel;


public class main {
    private static final JFrame window = new JFrame();
    private static final CardLayout cardLayout = new CardLayout();
    private static final JPanel main_panel = new JPanel(cardLayout);


    public static void main(String[] args) {
        initWindow();
        modules();

        window.setVisible(true);
    }

    public static void addCard(JPanel card, String card_name) {
        main_panel.add(card, card_name);     // <-- same as your .add()
    }

    public static void changeCard(String card_name) {
        cardLayout.show(main_panel, card_name);  // <-- same as your .show()
    }

    private static void initWindow() {
        window.setSize(880, 660);
        window.setTitle("Atlas Inventory");
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setUndecorated(true);
        window.setLayout(new CardLayout());
        window.add(main_panel);
    }

    private static void modules(){
        dashboardPanel dashboard = new dashboardPanel();
        main_panel.add(dashboard);
        cardLayout.show(main_panel, "Dashboard");

        /* salesHistoryPanel saleshistory = new salesHistoryPanel();
        main_panel.add(salesHistory);
        cardLayout.show(main_panel, "Sales History");
         */
    }
}