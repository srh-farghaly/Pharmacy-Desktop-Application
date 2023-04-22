/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

/**
 *
 * @author ASUS
 */
public class view_supp extends javax.swing.JFrame {

    /**
     * Creates new form view_supp
     */
    public view_supp() {
        initComponents();
      setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        edit_supp = new button.mybutton();
        com_adress = new javax.swing.JLabel();
        company_name = new javax.swing.JTextField();
        comp_name1 = new javax.swing.JLabel();
        supp_address = new javax.swing.JTextField();
        telephone = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(6, 107, 138,80));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View supplier info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 17), new java.awt.Color(255, 255, 255))); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled-1 (2).png"))); // NOI18N
        logo.setText("jLabel1");
        logo.setPreferredSize(new java.awt.Dimension(122, 115));

        edit_supp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit_supp.setForeground(new java.awt.Color(6, 107, 138));
        edit_supp.setText("Edit Info");
        edit_supp.setBorderColor(new java.awt.Color(255, 255, 255));
        edit_supp.setBorderPainted(false);
        edit_supp.setColorClick(new java.awt.Color(153, 204, 255));
        edit_supp.setColorOver(new java.awt.Color(204, 204, 204));
        edit_supp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_supp.setRadius(10);
        edit_supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_suppMouseClicked(evt);
            }
        });
        edit_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_suppActionPerformed(evt);
            }
        });

        com_adress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_adress.setForeground(new java.awt.Color(255, 255, 255));
        com_adress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        com_adress.setText("Address:");

        company_name.setBackground(new java.awt.Color(255, 255, 255));
        company_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        company_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        company_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_nameActionPerformed(evt);
            }
        });

        comp_name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comp_name1.setForeground(new java.awt.Color(255, 255, 255));
        comp_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comp_name1.setText("Company Name:");

        supp_address.setBackground(new java.awt.Color(255, 255, 255));
        supp_address.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        supp_address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        supp_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supp_addressActionPerformed(evt);
            }
        });

        telephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telephone.setForeground(new java.awt.Color(255, 255, 255));
        telephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telephone.setText("Telephone");

        tele.setBackground(new java.awt.Color(255, 255, 255));
        tele.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tele.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supp_address, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comp_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supp_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(edit_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 510, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/17973908.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_suppMouseClicked

        //        if (validateFields()) {
            //            customers_operations.insert_CustomerData(txtname1.getText(), txtname2.getText(),txtcity.getText(), txtstreet.getText(),(String) gender.getSelectedItem(), txtphone.getText());
            //            Customers obj = new Customers();
            //            obj.setVisible(true);
            //            obj.show_table();
            //            this.dispose();
            //        } else {
            //            JOptionPane.showMessageDialog(null, "Please Enter Correct information","Message", JOptionPane.WARNING_MESSAGE);
            //        }
    }//GEN-LAST:event_edit_suppMouseClicked

    private void edit_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_suppActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EditCompProd ss=new EditCompProd();
        ss.setVisible(true);
    }//GEN-LAST:event_edit_suppActionPerformed

    private void company_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_company_nameActionPerformed

    private void supp_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supp_addressActionPerformed

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Supplier ss=new Supplier();
        ss.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(view_supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_supp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel com_adress;
    private javax.swing.JLabel comp_name1;
    private javax.swing.JTextField company_name;
    private button.mybutton edit_supp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField supp_address;
    private javax.swing.JTextField tele;
    private javax.swing.JLabel telephone;
    // End of variables declaration//GEN-END:variables
}
