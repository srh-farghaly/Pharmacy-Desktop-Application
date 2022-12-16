/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class rond extends javax.swing.JFrame {

    /**
     * Creates new form rond
     */
    public rond() {
        initComponents();
       // this.reshape(520, 130, 900, 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        suppliers = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pharmacist = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        orders = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(6, 107, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/online-pharmacy (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 140));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 37)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 228, 207));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/text-1670628895593.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 750, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharmacy (12).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supplyyy.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        suppliers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        suppliers.setForeground(new java.awt.Color(255, 228, 207));
        suppliers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suppliers.setText("Suppliers");
        suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliersMouseClicked(evt);
            }
        });
        jPanel2.add(suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 240, 180));

        jPanel3.setBackground(new java.awt.Color(255,255,255,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pharmacist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pharmacist.setForeground(new java.awt.Color(255, 228, 207));
        pharmacist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pharmacist.setText("Pharmacist");
        pharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacistMouseClicked(evt);
            }
        });
        jPanel3.add(pharmacist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resize.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 123));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customers.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(270, 180));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        customers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 228, 207));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setText("Customers");
        customers.setPreferredSize(new java.awt.Dimension(75, 20));
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });
        jPanel4.add(customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 180));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orders_1.jpg"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        orders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 228, 207));
        orders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orders.setText("Orders");
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
        });
        jPanel5.add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 240, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/productss.png"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        products.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        products.setForeground(new java.awt.Color(255, 228, 207));
        products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        products.setText("Products");
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });
        jPanel6.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 240, 180));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sales2.png"))); // NOI18N
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        sales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 228, 207));
        sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales.setText("Sales");
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        jPanel7.add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 240, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacistMouseClicked
        pharmacist gg=new pharmacist();
        this.setVisible(false);     
        gg.setVisible(true);
        gg.show_table();
    }//GEN-LAST:event_pharmacistMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customersMouseClicked

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ordersMouseClicked

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        products ob=new products();
        ob.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_productsMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_salesMouseClicked

    private void suppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliersMouseClicked

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
            java.util.logging.Logger.getLogger(rond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rond().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel orders;
    private javax.swing.JLabel pharmacist;
    private javax.swing.JLabel products;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel suppliers;
    // End of variables declaration//GEN-END:variables
}