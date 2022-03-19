
package test.Model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed ElBeltagy
 */
public class HeaderTableModel extends DefaultTableModel {

    String[] colsName = {"No.", "Date", "Customer Name", "Total"};
    ArrayList<InvoiceHeader> invoices;

    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {

        this.invoices = invoices;

    }

    @Override
    public int getColumnCount() {
        return colsName.length; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getColsName(int column) {
        return colsName[column];
    }

    @Override
    public int getRowCount() {
        if (this.invoices == null) {
            this.invoices = new ArrayList<>();
        }
        return invoices.size(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValueAt(int row, int column) {
        InvoiceHeader inv = invoices.get(row);
        switch (column) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCustName();
            case 2:
                return inv.getDate();
            case 3:
                return inv.getInvTotal();
        }
        return null;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}
