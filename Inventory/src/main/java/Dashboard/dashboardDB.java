package Dashboard;

import java.sql.*;

public class dashboardDB {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db0321";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password_123";

    // Method to get the connection to the database
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Method to load sales data from the database
    public static ResultSet loadSalesData() {
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
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to load sales summary data
    public static ResultSet loadSalesSummaryData() {
        String query = """
            SELECT 
                COUNT(s.sale_id) AS total_orders, 
                SUM(s.total_price) AS total_revenue, 
                SUM(si.quantity) AS total_quantity_sold
            FROM 
                sales s
            JOIN 
                sale_items si ON s.sale_id = si.sale_id
            WHERE 
                s.order_status = 'Completed'
        """;
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
