
package test.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mohamed ElBeltagy
 */
public class LineTableModel extends AbstractTableModel {

    String[] colsName = {"Item Name", "Item Price", "Count", "Total"};
    ArrayList<InvoiceLine> invoices;

    public LineTableModel(ArrayList<InvoiceLine> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        if (this.invoices == null) {
            this.invoices = new ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public String getColumnName(int column) {
        return colsName[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getColumnCount() {
        return colsName.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        InvoiceLine inv = invoices.get(row);
        switch (column) {
            case 0:
                return inv.getProduct();
            case 1:
                return inv.getPrice();
            case 2:
                return inv.getCount();
            case 3:
                return inv.getLineTotal();
        }
        return null;
    }

    public ArrayList<InvoiceLine> getInvoices() {
        return invoices;
    }

}
