package myproject3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DeleteStudents extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstmt;
    
    public DeleteStudents() {
        initComponents();
        
        name_label.setText("N/A");
        username_label.setText("N/A");
        age_label.setText("N/A");
        gender_label.setText("N/A");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id_search = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        gender_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Delete Student");

        back_btn.setBackground(new java.awt.Color(242, 242, 242));
        back_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 26)); // NOI18N
        back_btn.setText("<");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        search_btn.setBackground(new java.awt.Color(102, 0, 102));
        search_btn.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        search_btn.setForeground(new java.awt.Color(255, 255, 0));
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        name_label.setText("Name");

        username_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        username_label.setText("Username");

        gender_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        gender_label.setText("Gender");

        age_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        age_label.setText("Age");

        delete_btn.setBackground(new java.awt.Color(255, 0, 0));
        delete_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_btn)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gender_label)
                                            .addComponent(name_label))
                                        .addGap(154, 154, 154)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(age_label)
                                            .addComponent(username_label)))
                                    .addComponent(id_search, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_btn)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back_btn))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(username_label))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label)
                    .addComponent(age_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String idStr = id_search.getText();
        String query = "SELECT * FROM students_data WHERE id = ?";
        
        try {
            pstmt = con.prepareStatement(query);      
            pstmt.setString(1, idStr);
            ResultSet resultSet = pstmt.executeQuery();
            
            if (!resultSet.next()) {
                name_label.setText("N/A");
                age_label.setText("N/A");
                username_label.setText("N/A");
                gender_label.setText("N/A");
                
                JOptionPane.showMessageDialog(this, "No record found with provided id.");
            } else {
                resultSet.beforeFirst();
                while (resultSet.next()) {
                String nameStr = resultSet.getString("name");
                String ageStr = resultSet.getString("age");
                String usernameStr = resultSet.getString("username");
                String genderStr = resultSet.getString("gender");

                name_label.setText(nameStr);
                age_label.setText(ageStr);
                username_label.setText(usernameStr);
                gender_label.setText(genderStr);
                }
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(UpdateStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_search_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new Successful().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
        String id = id_search.getText();
        
        int option = JOptionPane.showConfirmDialog(this, "Kya Sach mai ap data delete krna chahte ho ?", "CONFIRMATION", JOptionPane.YES_NO_OPTION);                   
        
        if (option == JOptionPane.YES_OPTION) {
            try {
                DbManager dmg = new DbManager();
                int res = dmg.deleteData(id);
                
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong ..");
                }
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_delete_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age_label;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel gender_label;
    private javax.swing.JTextField id_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton search_btn;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
