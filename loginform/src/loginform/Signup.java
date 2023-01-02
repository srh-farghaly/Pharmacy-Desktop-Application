package loginform;

import Control.Pharmacist_operations;
import javax.swing.JOptionPane;

/**
 *
 * @author Seifeldin Ahmed
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^01[0125][0-9]{8}$";

    public Signup() {
        initComponents();
        RegButton.setEnabled(false);
    }
        public boolean validateFields() {
            
        String firstname = txtfName.getText();
        String lastname = txtlName.getText();
        String email = txtEmail.getText();
        String phonenumber = txtphone.getText();
        String Password = txtpass.getText();
        String salary= txtsalary.getText();
        return email.matches(emailPattern) && !firstname.equals("") && !lastname.equals("") && phonenumber.matches(mobileNumberPattern) && !Password.equals("") && !salary.equals("");
    
    }
        public boolean password_vaildate()
        {
           String Password = txtpass.getText();
           return Password.length()>=6;
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        txtlName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        RegButton = new button.mybutton();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtAge = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(6, 107, 138,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Pharmacist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled-1 (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(122, 115));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 122, -1, 127));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 131, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });
        txtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 139, -1));

        txtlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlNameActionPerformed(evt);
            }
        });
        txtlName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 139, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 139, -1));

        txtsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryActionPerformed(evt);
            }
        });
        txtsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsalaryKeyReleased(evt);
            }
        });
        jPanel2.add(txtsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 139, -1));

        RegButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegButton.setForeground(new java.awt.Color(6, 107, 138));
        RegButton.setText("Register");
        RegButton.setBorderColor(new java.awt.Color(255, 255, 255));
        RegButton.setBorderPainted(false);
        RegButton.setColorClick(new java.awt.Color(153, 204, 255));
        RegButton.setColorOver(new java.awt.Color(204, 204, 204));
        RegButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegButton.setRadius(10);
        RegButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegButtonMouseClicked(evt);
            }
        });
        RegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 83, 41));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 139, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone Number");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        txtpass.setToolTipText("enter at least 6 digits");
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 139, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salary");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 510, 390));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/17973908.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pharmacist gg =new pharmacist();
        this.dispose();
        gg.setVisible(true);

    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtfNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameKeyReleased

    private void txtlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameActionPerformed

    private void txtlNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameKeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryActionPerformed

    private void txtsalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalaryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryKeyReleased

    private void RegButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegButtonMouseClicked
        if (validateFields()) {
            if(password_vaildate())
            {   
                Pharmacist_operations.insert_pharmacistData(txtfName.getText(), txtlName.getText(), (String)jComboBox2.getSelectedItem(), txtphone.getText(), txtEmail.getText(), txtpass.getText(), Integer.parseInt(txtsalary.getText().trim()),Integer.parseInt(txtAge.getText().trim()));
                pharmacist obj = new pharmacist();
                obj.setVisible(true);
                obj.show_table();
                this.dispose();
            }
            else {
            JOptionPane.showMessageDialog(null, "Password Is Weak","Message", JOptionPane.WARNING_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Correct information","Message", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_RegButtonMouseClicked

    private void RegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyReleased

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.mybutton RegButton;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtlName;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
