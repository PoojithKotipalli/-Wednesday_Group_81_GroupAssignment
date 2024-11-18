/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Business.Business;
import ui.Panels.AdjustPricesPanel;
import ui.Panels.BrowsePricePanel;
import ui.Panels.FinalReportPanel;
import ui.Panels.MaximizeProfitPanel;
import ui.Panels.SimulationPanel;

/**
 *
 * @author siddheshnikam
 */
public class MainJFrame extends javax.swing.JFrame {

    private Business business;
    private JPanel blankPanel;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(Business business) {
        this.business = business;
        initComponents();
        initializePanels();
        initializeBlankPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        NavigationPanel = new javax.swing.JPanel();
        BrowsePriceBtn = new javax.swing.JButton();
        AdjustPriceBtn = new javax.swing.JButton();
        SimulationBtn = new javax.swing.JButton();
        MaximizeProfitBtn = new javax.swing.JButton();
        FinalReportBtn = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        NavigationPanel.setBackground(new java.awt.Color(204, 255, 255));

        BrowsePriceBtn.setBackground(new java.awt.Color(102, 204, 255));
        BrowsePriceBtn.setText("Browse Prices");
        BrowsePriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowsePriceBtnActionPerformed(evt);
            }
        });

        AdjustPriceBtn.setBackground(new java.awt.Color(102, 204, 255));
        AdjustPriceBtn.setText("Adjust prices");
        AdjustPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjustPriceBtnActionPerformed(evt);
            }
        });

        SimulationBtn.setBackground(new java.awt.Color(102, 204, 255));
        SimulationBtn.setText("Run Simulation");
        SimulationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulationBtnActionPerformed(evt);
            }
        });

        MaximizeProfitBtn.setBackground(new java.awt.Color(102, 204, 255));
        MaximizeProfitBtn.setText("Maximize Profit");
        MaximizeProfitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximizeProfitBtnActionPerformed(evt);
            }
        });

        FinalReportBtn.setBackground(new java.awt.Color(102, 204, 255));
        FinalReportBtn.setText("Final Report");
        FinalReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationPanelLayout = new javax.swing.GroupLayout(NavigationPanel);
        NavigationPanel.setLayout(NavigationPanelLayout);
        NavigationPanelLayout.setHorizontalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BrowsePriceBtn)
                .addGap(18, 18, 18)
                .addComponent(AdjustPriceBtn)
                .addGap(18, 18, 18)
                .addComponent(SimulationBtn)
                .addGap(18, 18, 18)
                .addComponent(MaximizeProfitBtn)
                .addGap(18, 18, 18)
                .addComponent(FinalReportBtn)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        NavigationPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AdjustPriceBtn, BrowsePriceBtn, FinalReportBtn, MaximizeProfitBtn, SimulationBtn});

        NavigationPanelLayout.setVerticalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrowsePriceBtn)
                    .addComponent(AdjustPriceBtn)
                    .addComponent(SimulationBtn)
                    .addComponent(MaximizeProfitBtn)
                    .addComponent(FinalReportBtn))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        NavigationPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdjustPriceBtn, BrowsePriceBtn, FinalReportBtn, MaximizeProfitBtn, SimulationBtn});

        jSplitPane1.setTopComponent(NavigationPanel);

        ContentPanel.setBackground(new java.awt.Color(204, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(ContentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowsePriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowsePriceBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) ContentPanel.getLayout();
        card.show(ContentPanel, "BrowsePricePanel");
    }//GEN-LAST:event_BrowsePriceBtnActionPerformed

    private void AdjustPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdjustPriceBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) ContentPanel.getLayout();
        card.show(ContentPanel, "AdjustPricesPanel");
    }//GEN-LAST:event_AdjustPriceBtnActionPerformed

    private void SimulationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulationBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) ContentPanel.getLayout();
        card.show(ContentPanel, "SimulationPanel");
    }//GEN-LAST:event_SimulationBtnActionPerformed

    private void MaximizeProfitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximizeProfitBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) ContentPanel.getLayout();
        card.show(ContentPanel, "MaximizeProfitPanel");
    }//GEN-LAST:event_MaximizeProfitBtnActionPerformed

    private void FinalReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalReportBtnActionPerformed
        // TODO add your handling code here:
        java.awt.CardLayout card = (java.awt.CardLayout) ContentPanel.getLayout();
        card.show(ContentPanel, "FinalReportPanel");
    }//GEN-LAST:event_FinalReportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdjustPriceBtn;
    private javax.swing.JButton BrowsePriceBtn;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton FinalReportBtn;
    private javax.swing.JButton MaximizeProfitBtn;
    private javax.swing.JPanel NavigationPanel;
    private javax.swing.JButton SimulationBtn;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    private void initializePanels() {
        // Instantiate the panels
        BrowsePricePanel browsePricePanel = new BrowsePricePanel(business);
        SimulationPanel simulationPanel = new SimulationPanel(business);
        MaximizeProfitPanel maximizeProfitPanel = new MaximizeProfitPanel(business);
        FinalReportPanel finalReportPanel = new FinalReportPanel(business);

        AdjustPricesPanel adjustPricesPanel = new AdjustPricesPanel(
                business,
                simulationPanel,
                maximizeProfitPanel,
                browsePricePanel,
                finalReportPanel
        );

        ContentPanel.add("BrowsePricePanel", browsePricePanel);
        ContentPanel.add("AdjustPricesPanel", adjustPricesPanel);
        ContentPanel.add("SimulationPanel", simulationPanel);
        ContentPanel.add("MaximizeProfitPanel", maximizeProfitPanel);
        ContentPanel.add("FinalReportPanel", finalReportPanel);
    }

    private void initializeBlankPanel() {
        blankPanel = new JPanel();
        blankPanel.setLayout(new BorderLayout());

        blankPanel.setBackground(new Color(204, 255, 255));

        JLabel welcomeLabel = new JLabel("Welcome! Please select an option from the navigation panel.", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        blankPanel.add(welcomeLabel, BorderLayout.CENTER);
        ContentPanel.add(blankPanel, "BlankPanel");

        CardLayout cardLayout = (CardLayout) ContentPanel.getLayout();
        cardLayout.show(ContentPanel, "BlankPanel");
    }
}
