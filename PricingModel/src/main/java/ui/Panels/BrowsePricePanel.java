/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Panels;

import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

/**
 *
 * @author Poojith K
 */
public class BrowsePricePanel extends javax.swing.JPanel {

    private Business business;

    /**
     * Creates new form BrowsePricePanel
     */
    public BrowsePricePanel(Business business) {
        this.business = business;
        initComponents();
        populateTable();
        populateSupplierFilter();

    }

    public void refreshTable() {
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PriceTabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SearchTxt = new javax.swing.JTextField();
        SupplierFilterBox = new javax.swing.JComboBox<>();
        SearchBtn = new javax.swing.JButton();
        ClearFiltersBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        PriceTabel.setBackground(new java.awt.Color(102, 204, 255));
        PriceTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Supplier Name", "Actual Price", "Target Price ", "Sales Frequency ", "Total Sales Revenue"
            }
        ));
        jScrollPane1.setViewportView(PriceTabel);

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setText("Back");

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Search products");

        SearchTxt.setBackground(new java.awt.Color(102, 204, 255));

        SupplierFilterBox.setBackground(new java.awt.Color(102, 204, 255));
        SupplierFilterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SearchBtn.setBackground(new java.awt.Color(102, 204, 255));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ClearFiltersBtn.setBackground(new java.awt.Color(102, 204, 255));
        ClearFiltersBtn.setText("Clear Filters");
        ClearFiltersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFiltersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupplierFilterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn)
                            .addComponent(ClearFiltersBtn))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SupplierFilterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ClearFiltersBtn)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        applyFilters();
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ClearFiltersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFiltersBtnActionPerformed
        // TODO add your handling code here:
        clearFilters();
    }//GEN-LAST:event_ClearFiltersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearFiltersBtn;
    private javax.swing.JTable PriceTabel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JComboBox<String> SupplierFilterBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) PriceTabel.getModel();
        model.setRowCount(0);

        for (Supplier supplier : business.getSupplierDirectory().getSuplierList()) {
            for (Product product : supplier.getProductCatalog().getProductList()) {

                double actualPrice = product.getActualPrice();
                double targetPrice = product.getTargetPrice();

                double totalSalesRevenue = targetPrice * product.getSalesVolume();

                Object[] row = {
                    product.getName(),
                    supplier.getName(),
                    product.getFloorPrice(),
                    targetPrice,
                    product.getSalesVolume(),
                    totalSalesRevenue
                };
                model.addRow(row);
            }
        }
    }

    private void populateSupplierFilter() {
        SupplierFilterBox.removeAllItems();
        SupplierFilterBox.addItem("All Suppliers");

        for (Supplier supplier : business.getSupplierDirectory().getSuplierList()) {
            SupplierFilterBox.addItem(supplier.getName());
        }
    }

    private void applyFilters() {
        DefaultTableModel model = (DefaultTableModel) PriceTabel.getModel();
        model.setRowCount(0);

        String selectedSupplier = SupplierFilterBox.getSelectedItem().toString();
        String searchQuery = SearchTxt.getText().trim().toLowerCase();

        for (Supplier supplier : business.getSupplierDirectory().getSuplierList()) {
            if (!selectedSupplier.equals("All Suppliers") && !supplier.getName().equals(selectedSupplier)) {
                continue;
            }

            for (Product product : supplier.getProductCatalog().getProductList()) {
                if (!searchQuery.isEmpty() && !product.getName().toLowerCase().contains(searchQuery)) {
                    continue;
                }

                double totalSalesRevenue = product.getActualPrice() * product.getSalesVolume();

                Object[] row = {
                    product.getName(),
                    supplier.getName(),
                    product.getActualPrice(),
                    product.getTargetPrice(),
                    product.getSalesVolume(),
                    totalSalesRevenue
                };
                model.addRow(row);
            }
        }
    }

    private void clearFilters() {
        SearchTxt.setText(""); // Clear search text
        SupplierFilterBox.setSelectedIndex(0); // Reset supplier filter
        populateTable(); // Reload all data
    }

    public void refreshData() {
        populateTable(); // Refresh table with updated data
    }

}