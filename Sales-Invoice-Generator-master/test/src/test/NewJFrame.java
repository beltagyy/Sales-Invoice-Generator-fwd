
package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.FileChooserUI;
import test.Model.HeaderTableModel;
import test.Model.InvoiceHeader;
import test.Model.InvoiceLine;
import test.Model.LineTableModel;
import test.View.HeaderTableDialog;
import test.View.LineTableDialog;

/**
 *
 * @author Mohamed ElBeltagy
 */
public class NewJFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        invTableLb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        nInvBtn = new javax.swing.JButton();
        dInvBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InvDateTF = new javax.swing.JTextField();
        custNameTF = new javax.swing.JTextField();
        totalLb = new javax.swing.JLabel();
        invNumLb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        invItemBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem = new javax.swing.JMenuItem();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invTableLb.setText("Invoices Table");

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(headerTable);

        nInvBtn.setText("Create New Invoices");
        nInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nInvBtnActionPerformed(evt);
            }
        });

        dInvBtn.setText("Delete Invoices");
        dInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dInvBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setToolTipText("Invoces ");
        jScrollPane1.setName("Invoice Items"); // NOI18N

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        lineTable.setToolTipText("Invoice ");
        lineTable.setName("Invoice "); // NOI18N
        jScrollPane1.setViewportView(lineTable);
        lineTable.getAccessibleContext().setAccessibleName("Invoice ");
        lineTable.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("Invoice Number");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Total");

        totalLb.setText("350.50");

        invNumLb.setText("23");

        jLabel1.setText("Invoice Items");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvDateTF)
                            .addComponent(custNameTF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(invNumLb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(totalLb, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invNumLb)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addComponent(InvDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLb)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        invItemBtn.setText("Create Invouce Item");
        invItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invItemBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFileMenuItem.setText("Save File");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invTableLb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nInvBtn)
                .addGap(96, 96, 96)
                .addComponent(dInvBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(invItemBtn)
                .addGap(110, 110, 110)
                .addComponent(saveBtn)
                .addGap(47, 47, 47)
                .addComponent(cancelBtn)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(invTableLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nInvBtn)
                    .addComponent(dInvBtn)
                    .addComponent(cancelBtn)
                    .addComponent(invItemBtn)
                    .addComponent(saveBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        saveChange();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        try {
            // TODO add your handling code here:
            LoadFiles();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

    private void nInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nInvBtnActionPerformed
        // TODO add your handling code here:
        createInv();
    }//GEN-LAST:event_nInvBtnActionPerformed

    private void invItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invItemBtnActionPerformed
        // TODO add your handling code here:
        createInvItem();
    }//GEN-LAST:event_invItemBtnActionPerformed

    private void dInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dInvBtnActionPerformed
        // TODO add your handling code here:
        deleteInv();
    }//GEN-LAST:event_dInvBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        cancelChange();
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InvDateTF;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton dInvBtn;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton invItemBtn;
    private javax.swing.JLabel invNumLb;
    private javax.swing.JLabel invTableLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JButton nInvBtn;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JButton saveBtn;
    private javax.swing.JMenuItem saveFileMenuItem;
    private javax.swing.JLabel totalLb;
    // End of variables declaration//GEN-END:variables

    private ArrayList<InvoiceHeader> invoices = new ArrayList<>();
    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    HeaderTableModel headerModel;
    LineTableModel lineModel;
    HeaderTableDialog headerDialog;
    LineTableDialog LineDialog;
    InvoiceHeader newInvHader;
    File selectFile;
    InvoiceHeader invHeader1;
    InvoiceLine line1;

    private void createInv() {
        headerDialog = new HeaderTableDialog(this);
        headerDialog.setVisible(true);

    }

    private void LoadFiles() throws Exception {
        invoices.clear();

        JOptionPane.showMessageDialog(this, "please select invoice header file",
                "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            selectFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectFile);
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine()) != null) {

                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1];
                String custname = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custname);
                invoices.add(header);

            }
            br.close();
            fr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(this,
                    "please select invoice Lines file",
                    "Invoice Lines", JOptionPane.WARNING_MESSAGE);

            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

                selectFile = fc.getSelectedFile();
                fr = new FileReader(selectFile);
                br = new BufferedReader(fr);

                line = null;
                while ((line = br.readLine()) != null) {

                    String[] lineSegments = line.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1];
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);

                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                    header.addLine(invLine);

                }
                br.close();
                fr.close();
                headerModel = new HeaderTableModel(invoices);
                headerTable.setModel(headerModel);
                headerTable.validate();
            }

        }
    }

    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : invoices) {
            if (header.getNum() == num) {
                return header;
            }
        }
        return null;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        HeaderTableRowSelected();
    }

    private void HeaderTableRowSelected() {

        int selectedRowIndex = headerTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            InvoiceHeader row = headerModel.getInvoices().get(selectedRowIndex);
            custNameTF.setText(row.getCustName());
            InvDateTF.setText(row.getDate().toString());
            invNumLb.setText("" + row.getNum());
            totalLb.setText("" + row.getInvTotal());
            ArrayList<InvoiceLine> lines = row.getLines();
            lineModel = new LineTableModel(lines);
            lineTable.setModel(lineModel);
            lineModel.fireTableDataChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("okBtnDialog")) {
            createInvOKDialog();
        } else if (e.getActionCommand().equals("cancelBtnDialog")) {
            createInvCancelDialog();
        } else if (e.getActionCommand().equals("okBtnDialogL")) {
            createInvOKDialogLine();
        } else if (e.getActionCommand().equals("cancelBtnDialogL")) {
            createInvCancelDialogLine();
        }
    }

    private void createInvOKDialog() {
        String custName = headerDialog.getCustNameDialogTf().getText();
        String invDateStr = headerDialog.getInvDataDialogTf().getText();
        Date invDate = new Date();
        try {
            invDate = df.parse(invDateStr);
        } catch (ParseException ex) {
        }
        headerDialog.setVisible(false);
        int num = getMaxInvNum() + 1;
        newInvHader = new InvoiceHeader(num, invDate, custName);
        invoices.add(newInvHader);
        headerModel.fireTableDataChanged();

        System.out.println("check");
    }

    private void createInvCancelDialog() {
        headerDialog.setVisible(false);
    }

    private int getMaxInvNum() {
        int num = 0;
        for (InvoiceHeader header : invoices) {
            if (header.getNum() > num) {
                num = header.getNum();
            }

        }
        return num;
    }

    private void createInvOKDialogLine() {
        String itemName = LineDialog.getItemNameDialogTf().getText();
        String itemCountStr = LineDialog.getCountDialogTf().getText();
        String itemPriceStr = LineDialog.getPriceDialogTf().getText();
        LineDialog.setVisible(false);

        int itmeCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        invHeader1 = invoices.get(headerTable.getSelectedRow());
        InvoiceLine line1 = new InvoiceLine(itemName, itemPrice, itmeCount, invHeader1);
        invHeader1.addLine(line1);
        lineModel.fireTableDataChanged();
        headerModel.fireTableDataChanged();

    }

    private void createInvCancelDialogLine() {
        LineDialog.setVisible(false);
    }

    private void createInvItem() {
        LineDialog = new LineTableDialog(this);
        LineDialog.setVisible(true);
    }

    private void deleteInv() {
        invoices.remove(newInvHader);
        invHeader1.removeLine(line1);
        headerModel.fireTableDataChanged();
        lineModel.fireTableDataChanged();

    }

    private void cancelChange() {
        System.exit(0);
        System.out.println("close");

    }

    private void saveChange() {
        saveHeaderChange();
        saveLineChange();
    }

    private void saveHeaderChange() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("File Save");
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File savedFile = fc.getSelectedFile();

            try {
                FileWriter fw = new FileWriter(savedFile);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < headerTable.getRowCount(); i++) {
                    for (int j = 0; j < headerTable.getColumnCount(); j++) {
                        bw.write(headerTable.getValueAt(i, j).toString() + ",");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Save Header Table Done",
                        "Save Info", JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error",
                        "Error Info", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    private void saveLineChange() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("File Save");
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File savedFile = fc.getSelectedFile();

            try {
                FileWriter fw = new FileWriter(savedFile + ".csv");
                BufferedWriter bw = new BufferedWriter(fw);
                for (InvoiceHeader inv : invoices) {
                    for (InvoiceLine item : inv.getLines()) {
                        bw.write(inv.getNum() + "," + item.getProduct() + "," + item.getPrice() + "," + item.getCount());

                    }
                    bw.newLine();
                }

                JOptionPane.showMessageDialog(this, "Save Line Table Done", "Save Info", JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error",
                        "Error Info", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void saveFile() {

        saveChange();
    }
}
