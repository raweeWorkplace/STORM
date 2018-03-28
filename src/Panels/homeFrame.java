/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ranjan
 */
public class homeFrame extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    stockInPanel sip;
    homePanel hop;
    salesSummaryPanel ssp;
    SalesPanel salesPanel;
    stockManagementPanel stockMgmnt;
    GridBagConstraints gbr;
    QuotationPanel qf;
    public String globalVariableCashier;
    BufferedImage bi;
    

    public String getGlobalVariableCashier() {
        return globalVariableCashier;
    }

    public void setGlobalVariableCashier(String globalVariableCashier) {
        this.globalVariableCashier = globalVariableCashier;
        lblUser.setText(getGlobalVariableCashier());
        }
    
    

    /**
     * Creates new form homeFrame
     */
    public homeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            bi = ImageIO.read(new File("src/BillingIcon/invoice.png").toURI().toURL());
            this.setIconImage(bi);
            this.setTitle("E-Bill Book            Sri Vijaya Teja Communications");
        } catch (IOException ex) {
            Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        getTodayDate();
        displayPanel.setLayout(layout);
        
        init();
        addPanel();
        state();
         hop.setVisible(true);
    }
    
    private void init(){
        gbr= new GridBagConstraints();
        sip = new stockInPanel();
        hop = new homePanel();
        ssp = new salesSummaryPanel();
        salesPanel = new SalesPanel();
        stockMgmnt = new stockManagementPanel();
        qf = new QuotationPanel();
        
    }
    
    private void addPanel(){
        displayPanel.add(sip, gbr);
        displayPanel.add(hop,gbr);
        displayPanel.add(ssp,gbr);
        displayPanel.add(salesPanel,gbr);
        displayPanel.add(stockMgmnt,gbr);
        displayPanel.add(qf,gbr);
    }
    
    private void state(){
        
        sip.setVisible(false);
        hop.setVisible(false);
        ssp.setVisible(false);
        salesPanel.setVisible(false);
        stockMgmnt.setVisible(false);
        qf.setVisible(false);
    }
    
    private void getTodayDate(){
        DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        //System.out.println(dateformat.format(cal.getTime()));
        
     lblTodayDate.setText(dateformat.format(cal.getTime()));
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        displayPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblTodayDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomeMenu = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        InvoiceMenu = new javax.swing.JMenu();
        Billing = new javax.swing.JMenuItem();
        Quotation = new javax.swing.JMenuItem();
        StockMenu = new javax.swing.JMenu();
        stockIn = new javax.swing.JMenuItem();
        stockManagement = new javax.swing.JMenuItem();
        SalesMenu = new javax.swing.JMenu();
        reportSummary = new javax.swing.JMenuItem();
        ExitMenu = new javax.swing.JMenu();
        LogOff = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        displayPanel.setBackground(java.awt.Color.darkGray);
        displayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        jPanel1.setBackground(java.awt.Color.white);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel9.setText("Date:");

        lblTodayDate.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel11.setText("Welcome:");

        lblUser.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lblTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel9, lblTodayDate, lblUser});

        jMenuBar1.setBackground(java.awt.Color.lightGray);
        jMenuBar1.setMargin(new java.awt.Insets(0, 10, 0, 0));

        HomeMenu.setBackground(java.awt.Color.white);
        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/home.png"))); // NOI18N
        HomeMenu.setText("HOME");
        HomeMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        HomeMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HomeMenuFocusGained(evt);
            }
        });
        HomeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenuActionPerformed(evt);
            }
        });

        Home.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/house.png"))); // NOI18N
        Home.setText("My Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        HomeMenu.add(Home);

        jMenuBar1.add(HomeMenu);

        InvoiceMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/invoice.png"))); // NOI18N
        InvoiceMenu.setText("INVOICE");
        InvoiceMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        Billing.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        Billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/slot-machine.png"))); // NOI18N
        Billing.setText("Billing");
        Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingActionPerformed(evt);
            }
        });
        InvoiceMenu.add(Billing);

        Quotation.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        Quotation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/1488294545_Artboard_1.png"))); // NOI18N
        Quotation.setText("Quotation");
        Quotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuotationActionPerformed(evt);
            }
        });
        InvoiceMenu.add(Quotation);

        jMenuBar1.add(InvoiceMenu);

        StockMenu.setBackground(java.awt.Color.white);
        StockMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/warehouse.png"))); // NOI18N
        StockMenu.setText("STOCK");
        StockMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        stockIn.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        stockIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/stock.png"))); // NOI18N
        stockIn.setText("Stocking In");
        stockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockInActionPerformed(evt);
            }
        });
        StockMenu.add(stockIn);

        stockManagement.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        stockManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/office-material.png"))); // NOI18N
        stockManagement.setText("Stock Management");
        stockManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockManagementActionPerformed(evt);
            }
        });
        StockMenu.add(stockManagement);

        jMenuBar1.add(StockMenu);

        SalesMenu.setBackground(java.awt.Color.white);
        SalesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/sale.png"))); // NOI18N
        SalesMenu.setText("SALES");
        SalesMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        reportSummary.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        reportSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/clipboard.png"))); // NOI18N
        reportSummary.setText("Sales Report Summary");
        reportSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportSummaryActionPerformed(evt);
            }
        });
        SalesMenu.add(reportSummary);

        jMenuBar1.add(SalesMenu);

        ExitMenu.setBackground(java.awt.Color.white);
        ExitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/logout.png"))); // NOI18N
        ExitMenu.setText("EXIT");
        ExitMenu.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        LogOff.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        LogOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BillingIcon/log-out.png"))); // NOI18N
        LogOff.setText("Log Off");
        LogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOffActionPerformed(evt);
            }
        });
        ExitMenu.add(LogOff);

        jMenuBar1.add(ExitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingActionPerformed
        state();
       salesPanel.setVisible(true);
       salesPanel.txtCustName.requestFocus();
    }//GEN-LAST:event_BillingActionPerformed

    private void stockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockInActionPerformed
       state();
       sip.setVisible(true);
       sip.txtProName.requestFocus();
    }//GEN-LAST:event_stockInActionPerformed

    private void HomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMenuActionPerformed
       
    }//GEN-LAST:event_HomeMenuActionPerformed

    private void HomeMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HomeMenuFocusGained
       
    }//GEN-LAST:event_HomeMenuFocusGained

    private void reportSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSummaryActionPerformed
       state();
       ssp.setVisible(true);
       ssp.btnSearch.requestFocus();
    }//GEN-LAST:event_reportSummaryActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        init();
        displayPanel.removeAll();
        addPanel();
        state();
        hop.setVisible(true);
        hop.txtsearchName.requestFocus();
    }//GEN-LAST:event_HomeActionPerformed

    private void stockManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockManagementActionPerformed
        state();
       stockMgmnt.setVisible(true);
       stockMgmnt.txtSearchName.requestFocus();
    }//GEN-LAST:event_stockManagementActionPerformed

    private void LogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOffActionPerformed
        System.exit(0);
    }//GEN-LAST:event_LogOffActionPerformed

    private void QuotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuotationActionPerformed
        state();
       qf.setVisible(true);
       qf.txtCustName.requestFocus();
    }//GEN-LAST:event_QuotationActionPerformed

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
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Billing;
    private javax.swing.JMenu ExitMenu;
    private javax.swing.JMenuItem Home;
    private javax.swing.JMenu HomeMenu;
    private javax.swing.JMenu InvoiceMenu;
    private javax.swing.JMenuItem LogOff;
    private javax.swing.JMenuItem Quotation;
    private javax.swing.JMenu SalesMenu;
    private javax.swing.JMenu StockMenu;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTodayDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem reportSummary;
    private javax.swing.JMenuItem stockIn;
    private javax.swing.JMenuItem stockManagement;
    // End of variables declaration//GEN-END:variables
}
