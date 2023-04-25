/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javax.swing.JLabel;

/**
 *
 * @author Ahmed Sherif
 */
public class Reservations extends javax.swing.JFrame {

    /**
     * Creates new form Reservations
     */
    public Reservations() {
        initComponents();
         tableDark1.fixTable(jScrollPane1);
        tableDark1.setColumnAlignment(0, JLabel.CENTER);
        tableDark1.setCellAlignment(0, JLabel.CENTER);
        tableDark1.setColumnAlignment(1, JLabel.CENTER);
        tableDark1.setCellAlignment(1, JLabel.CENTER);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new tabledark.TableDark();
        jTextField1 = new javax.swing.JTextField();
        addButton = new button.mybutton();
        searchButton = new button.mybutton();
        deleteButton = new button.mybutton();
        editButton = new button.mybutton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pharmacist", "Customer", "Product", "Quantity", "Date"
            }
        ));
        jScrollPane1.setViewportView(tableDark1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 680, 220));

        jTextField1.setText("Pharmacist id");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, 30));

        addButton.setBackground(new java.awt.Color(6, 107, 138));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorderColor(new java.awt.Color(255, 255, 255));
        addButton.setColorClick(new java.awt.Color(0, 153, 153));
        addButton.setMaximumSize(new java.awt.Dimension(75, 25));
        addButton.setMinimumSize(new java.awt.Dimension(75, 25));
        addButton.setPreferredSize(new java.awt.Dimension(75, 25));
        addButton.setRadius(10);
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 30));

        searchButton.setBackground(new java.awt.Color(6, 107, 138));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setBorderColor(new java.awt.Color(255, 255, 255));
        searchButton.setColorClick(new java.awt.Color(0, 153, 153));
        searchButton.setMaximumSize(new java.awt.Dimension(75, 25));
        searchButton.setMinimumSize(new java.awt.Dimension(75, 25));
        searchButton.setPreferredSize(new java.awt.Dimension(75, 25));
        searchButton.setRadius(10);
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        deleteButton.setBackground(new java.awt.Color(6, 107, 138));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorderColor(new java.awt.Color(255, 255, 255));
        deleteButton.setColorClick(new java.awt.Color(0, 153, 153));
        deleteButton.setMaximumSize(new java.awt.Dimension(75, 25));
        deleteButton.setMinimumSize(new java.awt.Dimension(75, 25));
        deleteButton.setPreferredSize(new java.awt.Dimension(75, 25));
        deleteButton.setRadius(10);
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, 30));

        editButton.setBackground(new java.awt.Color(6, 107, 138));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setBorderColor(new java.awt.Color(255, 255, 255));
        editButton.setColorClick(new java.awt.Color(0, 153, 153));
        editButton.setMaximumSize(new java.awt.Dimension(75, 25));
        editButton.setMinimumSize(new java.awt.Dimension(75, 25));
        editButton.setPreferredSize(new java.awt.Dimension(75, 25));
        editButton.setRadius(10);
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
  if(login.Manager)
     {
        rond obj = new rond();
        obj.setVisible(true);
        this.dispose();
     }
     else
     {
        phar_rond obj = new phar_rond();
        obj.setVisible(true);
        this.dispose();
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.mybutton addButton;
    private button.mybutton deleteButton;
    private button.mybutton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private button.mybutton searchButton;
    private tabledark.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}