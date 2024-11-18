/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Panels;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

/**
 *
 * @author siddheshnikam
 */
public class SimulationPanel extends javax.swing.JPanel {
    private  Business business;
    /**
     * Creates new form SimulationPanel
     */
    public SimulationPanel(Business business) {
        this.business = business;
        initComponents();
        refreshData();
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
        SimulationTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SimulationResults = new javax.swing.JTextArea();
        RunSimulationBtn = new javax.swing.JButton();
        ResetSimulationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        SimulationTable.setBackground(new java.awt.Color(102, 204, 255));
        SimulationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Original Target Price", "Adjusted Target Price", "Projected Revenue", "Profit Margin"
            }
        ));
        jScrollPane1.setViewportView(SimulationTable);

        SimulationResults.setBackground(new java.awt.Color(102, 204, 255));
        SimulationResults.setColumns(20);
        SimulationResults.setRows(5);
        jScrollPane2.setViewportView(SimulationResults);

        RunSimulationBtn.setBackground(new java.awt.Color(102, 204, 255));
        RunSimulationBtn.setText("Run Simulation");
        RunSimulationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunSimulationBtnActionPerformed(evt);
            }
        });

        ResetSimulationBtn.setBackground(new java.awt.Color(102, 204, 255));
        ResetSimulationBtn.setText("Reset Simulation");
        ResetSimulationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetSimulationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(RunSimulationBtn)
                        .addGap(39, 39, 39)
                        .addComponent(ResetSimulationBtn)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RunSimulationBtn)
                    .addComponent(ResetSimulationBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RunSimulationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunSimulationBtnActionPerformed
        // TODO add your handling code here:
        runSimulation();
    }//GEN-LAST:event_RunSimulationBtnActionPerformed

    private void ResetSimulationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetSimulationBtnActionPerformed
        // TODO add your handling code here:
        resetSimulation();
    }//GEN-LAST:event_ResetSimulationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetSimulationBtn;
    private javax.swing.JButton RunSimulationBtn;
    private javax.swing.JTextArea SimulationResults;
    private javax.swing.JTable SimulationTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   public void refreshData() {
    DefaultTableModel model = (DefaultTableModel) SimulationTable.getModel();
    model.setRowCount(0); 

    for (Supplier supplier : business.getSupplierDirectory().getSuplierList()) {
        for (Product product : supplier.getProductCatalog().getProductList()) {
            double targetPrice = product.getTargetPrice();
            double revenue = targetPrice * product.getSalesVolume(); 
            double profitMargin = revenue - (product.getFloorPrice() * product.getSalesVolume());

            Object[] row = {
                product.getName(),         
                targetPrice,               
                product.getSalesVolume(),  
                revenue,                   
                profitMargin               /
            };
            model.addRow(row);
        }
    }
}



    private void runSimulation() {
        try {
            DefaultTableModel model = (DefaultTableModel) SimulationTable.getModel();
            model.setRowCount(0);

            double totalRevenue = 0.0;

            for (Supplier supplier : business.getSupplierDirectory().getSuplierList()) {
                for (Product product : supplier.getProductCatalog().getProductList()) {
                    double adjustedPrice = product.getTargetPrice();
                    double projectedRevenue = adjustedPrice * product.getSalesVolume();
                    double profitMargin = projectedRevenue - (product.getFloorPrice() * product.getSalesVolume());
                    
                    totalRevenue += projectedRevenue;

                    model.addRow(new Object[] {
                        product.getName(),
                        product.getFloorPrice(),
                        adjustedPrice,
                        projectedRevenue,
                        profitMargin
                    });
                }
            }

            SimulationResults.setText("Total Projected Revenue: $" + String.format("%.2f", totalRevenue));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error running simulation: " + e.getMessage());
        }
    }

   
    

}
