/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view;

import dakmainstitute.controller.StudentController;
import dakmainstitute.model.Student;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shashi
 */
public class UpdateMobileNum extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMobileNum
     */
    public UpdateMobileNum(Student stm) {
        initComponents();
        curMobileNumText.setText(stm.getMobileNum());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        titleLabe = new javax.swing.JLabel();
        titleLabe1 = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        mobileLabel1 = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        curMobileNumText = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabe.setBackground(new java.awt.Color(204, 204, 255));
        titleLabe.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        titleLabe.setText("Number");
        titleLabe.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(titleLabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, 30));

        titleLabe1.setBackground(new java.awt.Color(204, 204, 255));
        titleLabe1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        titleLabe1.setText("Update Contact ");
        titleLabe1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(titleLabe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, -1));

        mobileLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        mobileLabel.setForeground(new java.awt.Color(51, 0, 0));
        mobileLabel.setText("Current Number : ");
        getContentPane().add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        mobileLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        mobileLabel1.setForeground(new java.awt.Color(51, 0, 0));
        mobileLabel1.setText("New Number     : ");
        getContentPane().add(mobileLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        mobileText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        mobileText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileTextKeyPressed(evt);
            }
        });
        getContentPane().add(mobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 192, -1));

        saveButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        saveButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveButtonKeyPressed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        curMobileNumText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(curMobileNumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 189, 26));

        iconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\iphone.jpg")); // NOI18N
        iconLabel.setToolTipText("Dakma Higer Education Center");
        iconLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(0, new java.awt.Color(102, 0, 102), new java.awt.Color(204, 0, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102)));
        iconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveButtonKeyPressed
        String mobileNum=mobileText.getText();
        String curNum=curMobileNumText.getText();
        try {
            int res=StudentController.updateMobileNum(mobileNum,curNum);
           // System.out.println("A");
            if(res>0){
                JOptionPane.showMessageDialog(this, "Success........");
            }else{
                JOptionPane.showMessageDialog(this, "Fail........");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMobileNum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMobileNum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveButtonKeyPressed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String mobileNum=mobileText.getText();
        String curNum=curMobileNumText.getText();
        try {
            int res=StudentController.updateMobileNum(mobileNum,curNum);
           // System.out.println("A");
            if(res>0){
                JOptionPane.showMessageDialog(this, "Success........");
            }else{
                JOptionPane.showMessageDialog(this, "Fail........");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMobileNum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMobileNum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void mobileTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTextKeyPressed
        if(evt.getKeyCode()==10){
            saveButton.requestFocus();
        }
    }//GEN-LAST:event_mobileTextKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curMobileNumText;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JLabel mobileLabel1;
    private javax.swing.JTextField mobileText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabe;
    private javax.swing.JLabel titleLabe1;
    // End of variables declaration//GEN-END:variables
}