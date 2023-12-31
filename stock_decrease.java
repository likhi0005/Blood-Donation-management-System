import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.*;
import dbmsproject.Connectionprovider;
import java.awt.Insets;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class stock_decrease extends javax.swing.JFrame {

    /**
     * Creates new form stock_decrease
     */
    public stock_decrease() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x_size=(int)tk.getScreenSize().getWidth();
        int y_size=(int)tk.getScreenSize().getHeight();
        Insets scnMax=Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize=scnMax.bottom;
        this.setSize(x_size,y_size);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bldgrp_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        stockunits_txt = new javax.swing.JTextField();
        stock_updatebtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        stockclose_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Decrease Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 16, 296, 65));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 99, 1176, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Blood Group");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 53));

        bldgrp_combo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bldgrp_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bldgrp_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 140, 104, 53));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Units");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 140, -1, 53));
        getContentPane().add(stockunits_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 140, 114, 53));

        stock_updatebtn.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        stock_updatebtn.setText("Update");
        stock_updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(stock_updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 140, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 211, 1180, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 574, 1180, -1));

        stockclose_btn.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        stockclose_btn.setText("Close");
        stockclose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockclose_btnActionPerformed(evt);
            }
        });
        getContentPane().add(stockclose_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 605, -1, 45));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 247, 1182, 308));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stock_updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_updatebtnActionPerformed
        // TODO add your handling code here:
        String BloodGroup=(String)bldgrp_combo.getSelectedItem();
        String units=stockunits_txt.getText();
        int Blood_Units=Integer.parseInt(units);
        try
        {
            Connection conn=Connectionprovider.getCon();
            Statement st1=conn.createStatement();
            st1.executeUpdate("update Blood_stock set units=units-'"+Blood_Units+"' where BloodGroup='"+BloodGroup+"'");
            JOptionPane.showMessageDialog(null, "Stock Successfully Updated");
            setVisible(false);
            new stock_decrease().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_stock_updatebtnActionPerformed

    private void stockclose_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockclose_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_stockclose_btnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try
        {
            Connection conn=Connectionprovider.getCon();
            Statement st1=conn.createStatement();
            ResultSet rs1=st1.executeQuery("select * from Blood_stock");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);     
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(stock_decrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock_decrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock_decrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock_decrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock_decrease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bldgrp_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton stock_updatebtn;
    private javax.swing.JButton stockclose_btn;
    private javax.swing.JTextField stockunits_txt;
    // End of variables declaration//GEN-END:variables
}
