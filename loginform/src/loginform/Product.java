/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import Modeling.Products_Model;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Product extends javax.swing.JFrame {

    private ArrayList<Products_Model> arr;
    private int row_number = 0; 
    
    public Product() {
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        mybutton1 = new button.mybutton();
        mybutton2 = new button.mybutton();
        mybutton3 = new button.mybutton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new tabledark.TableDark();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 107, 138));
        jLabel1.setText("Products List");
        jLabel1.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 28));
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharmacist (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel2.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel2.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(32, 32));
        jLabel3.setMinimumSize(new java.awt.Dimension(32, 32));
        jLabel3.setPreferredSize(new java.awt.Dimension(32, 32));
        jLabel3.setRequestFocusEnabled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharmacy (15).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(32, 32));
        jLabel4.setMinimumSize(new java.awt.Dimension(32, 32));
        jLabel4.setPreferredSize(new java.awt.Dimension(32, 32));

        jTextField1.setText("Enter Product ID");
        jTextField1.setPreferredSize(new java.awt.Dimension(42, 19));

        mybutton1.setBackground(new java.awt.Color(6, 107, 138));
        mybutton1.setForeground(new java.awt.Color(255, 255, 255));
        mybutton1.setText("Search");
        mybutton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mybutton1.setMaximumSize(new java.awt.Dimension(55, 25));
        mybutton1.setMinimumSize(new java.awt.Dimension(55, 25));
        mybutton1.setRadius(10);

        mybutton2.setBackground(new java.awt.Color(6, 107, 138));
        mybutton2.setForeground(new java.awt.Color(255, 255, 255));
        mybutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x (2).png"))); // NOI18N
        mybutton2.setText("Delete");
        mybutton2.setBorderColor(new java.awt.Color(255, 255, 255));
        mybutton2.setBorderPainted(false);
        mybutton2.setColor(new java.awt.Color(6, 107, 138));
        mybutton2.setColorClick(new java.awt.Color(0, 153, 153));
        mybutton2.setColorText(new java.awt.Color(0, 102, 102));
        mybutton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mybutton2.setMaximumSize(new java.awt.Dimension(92, 27));
        mybutton2.setMinimumSize(new java.awt.Dimension(92, 27));
        mybutton2.setPreferredSize(new java.awt.Dimension(92, 27));
        mybutton2.setRadius(10);

        mybutton3.setBackground(new java.awt.Color(6, 107, 138));
        mybutton3.setForeground(new java.awt.Color(255, 255, 255));
        mybutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user.png"))); // NOI18N
        mybutton3.setText("Add");
        mybutton3.setBorderColor(new java.awt.Color(255, 255, 255));
        mybutton3.setBorderPainted(false);
        mybutton3.setColor(new java.awt.Color(6, 107, 138));
        mybutton3.setColorClick(new java.awt.Color(0, 153, 153));
        mybutton3.setColorText(new java.awt.Color(0, 102, 102));
        mybutton3.setMaximumSize(new java.awt.Dimension(74, 25));
        mybutton3.setMinimumSize(new java.awt.Dimension(74, 25));
        mybutton3.setPreferredSize(new java.awt.Dimension(74, 25));
        mybutton3.setRadius(10);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(22, 22));

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Expires Date" ,"Quantity" ,"Category" ,"Description"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
    );
    tableDark1.setGridColor(new java.awt.Color(0, 102, 102));
    tableDark1.setMaximumSize(new java.awt.Dimension(2147483647, 180));
    tableDark1.setPreferredSize(new java.awt.Dimension(600, 180));
    tableDark1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableDark1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tableDark1);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(mybutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(mybutton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(151, 151, 151)
                            .addComponent(mybutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 16, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mybutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(50, 50, 50)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(mybutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mybutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyPressed

    private void tableDark1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDark1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDark1MouseClicked

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private button.mybutton mybutton1;
    private button.mybutton mybutton2;
    private button.mybutton mybutton3;
    private tabledark.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
