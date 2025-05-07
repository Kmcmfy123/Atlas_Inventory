package Valmonte.Dashboard.Old;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.util.Date;

public class SalesReprot {

    public static void generateSalesReport(JTable salesTable) {
        try {
            // Create Document instance for PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("SalesHistoryReport.pdf"));
            document.open();

            // Add Title to PDF
            document.add(new Paragraph("Sales History Report"));
            document.add(new Paragraph("Generated on: " + new Date().toString()));
            document.add(Chunk.NEWLINE);

            // Create a table with 5 columns (Sale Invoice, Customer Name, Quantity, Total, Order Status)
            PdfPTable pdfTable = new PdfPTable(5);
            pdfTable.addCell("Sale Invoice");
            pdfTable.addCell("Customer Name");
            pdfTable.addCell("Quantity");
            pdfTable.addCell("Total");
            pdfTable.addCell("Order Status");

            // Loop through the sales table to add each row to the PDF
            DefaultTableModel model = (DefaultTableModel) salesTable.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                pdfTable.addCell(model.getValueAt(i, 0).toString());  // Sale Invoice
                pdfTable.addCell(model.getValueAt(i, 1).toString());  // Customer Name
                pdfTable.addCell(model.getValueAt(i, 2).toString());  // Quantity
                pdfTable.addCell(model.getValueAt(i, 3).toString());  // Total
                pdfTable.addCell(model.getValueAt(i, 4).toString());  // Order Status
            }

            // Add table to document
            document.add(pdfTable);
            document.close();

            // Notify the user that the report was generated successfully
            JOptionPane.showMessageDialog(null, "Sales Report generated: SalesHistoryReport.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
