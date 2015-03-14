/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view.managestudents;

import dakmainstitute.controller.StudentController;
import dakmainstitute.controller.TestMarksController;
import dakmainstitute.model.Student;
import dakmainstitute.model.TestMarks;
import dakmainstitute.view.UpdateMobileNum;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jfreechart.ViewEachStudentChart;

/**
 *
 * @author Shashi
 */
public class ViewAllStudents extends JFrame {

    ArrayList<Object[]> studentList;
    DefaultTableModel dtm;

    /**
     * Creates new form ViewAllStudents
     */
    public ViewAllStudents() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);


        ArrayList<Student> stuList = null;
        try {
            stuList = StudentController.getAllStudents();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewAllStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtm = (DefaultTableModel) studentTable.getModel();
        for (Student student : stuList) {
            Object[] row = {student.getIndexNo(), student.getStudentName(), student.getSchools().getSchoolName(),
                student.getClasses(), student.getSubject(), student.getMobileNum(), student.getHomeNum()};
            dtm.addRow(row);
        }



        studentList = new ArrayList<>();

        for (int i = 0; i < studentTable.getRowCount(); i++) {
            Object[] row = {studentTable.getValueAt(i, 0), studentTable.getValueAt(i, 1), studentTable.getValueAt(i, 2), studentTable.getValueAt(i, 3), studentTable.getValueAt(i, 4), studentTable.getValueAt(i, 5), studentTable.getValueAt(i, 6)};
            studentList.add(row);
        }
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
        jPanel1 = new javax.swing.JPanel();
        titleLabe = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        indexNoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        schoolLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewChartButton = new javax.swing.JButton();
        indexNoSearchField = new org.jdesktop.swingx.JXSearchField();
        jLabel1 = new javax.swing.JLabel();
        nameSearchField = new org.jdesktop.swingx.JXSearchField();
        schoolSearchField = new org.jdesktop.swingx.JXSearchField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 255, 255));

        titleLabe.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titleLabe.setIcon(new javax.swing.ImageIcon("F:\\NetBeans Project\\icon\\cart113.gif")); // NOI18N

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index No", "Name", "School", "Class", "Subject", "Mobile Num:", "Home Num:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(studentTable);
        studentTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        indexNoLabel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        indexNoLabel.setText("Index No   :");

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        nameLabel.setText("Name  :");

        schoolLabel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        schoolLabel.setText("School :");

        viewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/add_list-26.png"))); // NOI18N
        viewButton.setText("View All Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/iphone-26.png"))); // NOI18N
        updateButton.setText("Update Mobile Number");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewChartButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewChartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/add_list-26.png"))); // NOI18N
        viewChartButton.setText("View Test Marks");
        viewChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChartButtonActionPerformed(evt);
            }
        });

        indexNoSearchField.setBackground(new java.awt.Color(255, 255, 204));
        indexNoSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexNoSearchFieldActionPerformed(evt);
            }
        });
        indexNoSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                indexNoSearchFieldKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText(" Search Student ");

        nameSearchField.setBackground(new java.awt.Color(255, 255, 204));
        nameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchFieldActionPerformed(evt);
            }
        });
        nameSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameSearchFieldKeyReleased(evt);
            }
        });

        schoolSearchField.setBackground(new java.awt.Color(255, 255, 204));
        schoolSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolSearchFieldActionPerformed(evt);
            }
        });
        schoolSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schoolSearchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(indexNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indexNoSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(schoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schoolSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewChartButton)
                                    .addComponent(updateButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabe))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indexNoLabel)
                            .addComponent(nameLabel)
                            .addComponent(schoolLabel)
                            .addComponent(indexNoSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schoolSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 203, Short.MAX_VALUE)
                        .addComponent(viewChartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        int row = studentTable.getSelectedRow();

        if (studentTable.getModel().getValueAt(row, 5) == null) {
            JOptionPane.showMessageDialog(this, "Please select student name..");

        } else {
            String indexNo = (String) studentTable.getModel().getValueAt(row, 0);
            Student student = new Student(indexNo, 0);
            new ViewStudent(student).setVisible(true);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            int row = studentTable.getSelectedRow();

            if (studentTable.getSelectedRowCount() ==0) {
                JOptionPane.showMessageDialog(this, "Please select mobile number..");

            } else {
                String mobileNum = (String) studentTable.getModel().getValueAt(row, 5);
                Student student = new Student(mobileNum);
                new UpdateMobileNum(student).setVisible(true);
            }

        } catch (HeadlessException headlessException) {
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChartButtonActionPerformed
        int row = studentTable.getSelectedRow();
        try {
            ArrayList<TestMarks> marks = TestMarksController.getTestMarks(studentTable.getValueAt(row, 0).toString());
            if (!marks.isEmpty()) {
                ViewEachStudentChart.viweChart(marks);
            } else {
                JOptionPane.showMessageDialog(this, "This student haven't test marks...");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewAllStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewChartButtonActionPerformed

    private void indexNoSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_indexNoSearchFieldKeyReleased
        String txt = indexNoSearchField.getText();
        int caretPosition = indexNoSearchField.getCaretPosition();
        if (caretPosition == 1 || caretPosition == 2 || caretPosition == 3) {
            String st = txt.toUpperCase();
            indexNoSearchField.setText(st);
        }

        String index = indexNoSearchField.getText();
        dtm = (DefaultTableModel) studentTable.getModel();
        dtm.setRowCount(0);
        for (Object[] objects : studentList) {
            if (objects[0].toString().contains(index)) {
                dtm.addRow(objects);
            }
        }
    }//GEN-LAST:event_indexNoSearchFieldKeyReleased

    private void indexNoSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexNoSearchFieldActionPerformed
    }//GEN-LAST:event_indexNoSearchFieldActionPerformed

    private void nameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSearchFieldActionPerformed

    private void nameSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameSearchFieldKeyReleased
        String txt = nameSearchField.getText();
        int caretPosition = nameSearchField.getCaretPosition();
        if (caretPosition == 1 || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            String st = txt.toUpperCase();
            nameSearchField.setText(st);
        }

        String index = nameSearchField.getText();
        dtm = (DefaultTableModel) studentTable.getModel();
        dtm.setRowCount(0);
        for (Object[] objects : studentList) {
            if (objects[1].toString().contains(index)) {
                dtm.addRow(objects);
            }
        }
    }//GEN-LAST:event_nameSearchFieldKeyReleased

    private void schoolSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolSearchFieldActionPerformed

    private void schoolSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schoolSearchFieldKeyReleased
        String index = schoolSearchField.getText();
        dtm = (DefaultTableModel) studentTable.getModel();
        dtm.setRowCount(0);
        for (Object[] objects : studentList) {
            if (objects[2].toString().contains(index)) {
                dtm.addRow(objects);
            }
        }
    }//GEN-LAST:event_schoolSearchFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ViewAllStudents().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel indexNoLabel;
    private org.jdesktop.swingx.JXSearchField indexNoSearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private org.jdesktop.swingx.JXSearchField nameSearchField;
    private javax.swing.JLabel schoolLabel;
    private org.jdesktop.swingx.JXSearchField schoolSearchField;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel titleLabe;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewChartButton;
    // End of variables declaration//GEN-END:variables
}
