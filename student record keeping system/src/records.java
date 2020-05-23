
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


 public class records extends javax.swing.JFrame {
     Connection con;
     Statement st;
     ResultSet rs;
    
 public records() {
     initComponents();
     data();
 }  
     void data(){
         try{
             Class.forName("java.sql.DriverManager");
             con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecords","root","anshul") ;
             st=(Statement)con.createStatement();
             String q="select * from coaching;";
             rs=st.executeQuery(q);
         } 
         catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane,"Connection Time "+e.getMessage());
         }
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cleabt = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        searbtn = new javax.swing.JButton();
        addrebtn = new javax.swing.JButton();
        updtbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        disbtn = new javax.swing.JButton();
        dispall = new javax.swing.JButton();
        mn = new javax.swing.JTextField();
        cl = new javax.swing.JTextField();
        fnm = new javax.swing.JTextField();
        stnm = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        adn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cleabt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cleabt.setText("Clear");
        cleabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleabtActionPerformed(evt);
            }
        });

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        searbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searbtn.setText("Search");
        searbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searbtnActionPerformed(evt);
            }
        });

        addrebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addrebtn.setText("Add Record");
        addrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrebtnActionPerformed(evt);
            }
        });

        updtbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updtbtn.setText("Update");
        updtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtbtnActionPerformed(evt);
            }
        });

        delbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        disbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disbtn.setText("Display");
        disbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disbtnActionPerformed(evt);
            }
        });

        dispall.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dispall.setText("Display All");
        dispall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispallActionPerformed(evt);
            }
        });

        mn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });

        cl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });

        fnm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnmActionPerformed(evt);
            }
        });

        stnm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stnmActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        adn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Admission No.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Student's Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Class");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mobile No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fees");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Subjects");

        fs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cleabt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(cl)
                            .addComponent(fnm)
                            .addComponent(stnm)
                            .addComponent(adn)
                            .addComponent(fs, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updtbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dispall, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(disbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stnm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dispall, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleabt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleabtActionPerformed
        // coding for clear button
        adn.setText("");
        stnm.setText("");
        fnm.setText("");
        cl.setText("");
        mn.setText("");
        fs.setText("");
        sub.setText("");
        adn.requestFocus();
}//GEN-LAST:event_cleabtActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // coding for exit button
        JOptionPane.showMessageDialog(null,"Thank You ");
        System.exit(0);
}//GEN-LAST:event_exitbtnActionPerformed

    private void searbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searbtnActionPerformed
     // coding for search button
     try{
         String txt=JOptionPane.showInputDialog("Enter Admission Number to search");
         String q="select * from coaching where admno="+txt+";";
         ResultSet r=st.executeQuery(q);
         if(r.next()) {
             adn.setText(r.getString(1));
             stnm.setText(r.getString(2));
             fnm.setText(r.getString(3));
             cl.setText(r.getString(4));
             mn.setText(r.getString(5));
             fs.setText(r.getString(6));
             sub.setText(r.getString(7));
         }
         else {
             JOptionPane.showMessageDialog(rootPane,"No such record found");
         }
         }
         catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Searching not found"+e.getMessage());
         }
}//GEN-LAST:event_searbtnActionPerformed

    private void addrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrebtnActionPerformed
     // coding for opening the add record window
     new records().setVisible(false);
     new insert().setVisible(true);
}//GEN-LAST:event_addrebtnActionPerformed

    private void updtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtbtnActionPerformed
     // coding for update button
     int x=JOptionPane.showConfirmDialog(rootPane,"Do you want update the record Yes or No?");
     if(x==JOptionPane.YES_OPTION)
     try {
        
         String q="update coaching set studentnm='"+stnm.getText()+"',fathernm='"+fnm.getText()+"',class='"+cl.getText()+"',mobileno='"+mn.getText()+"',fees='"+fs.getText()+"',subjects='"+sub.getText()+"' where admno="+adn.getText()+";";
         st.executeUpdate(q);
         JOptionPane.showMessageDialog(null,"Record successfully updated");
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error in table updation");
     }
}//GEN-LAST:event_updtbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
     // coding for delete button
     try{
         String b=JOptionPane.showInputDialog("Enter Rollno To Delete");
         String u="Delete from coaching where admno='"+b+"';";
         int confirm=JOptionPane.showConfirmDialog(null,"Are you sure?");
         if(confirm==JOptionPane.YES_OPTION){
             st.executeUpdate(u);
             JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
         }
     } 
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Record can not be Deleted "+e.getMessage());
     }
}//GEN-LAST:event_delbtnActionPerformed

    private void disbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disbtnActionPerformed
     // coding for opening display window
     new records().setVisible(false);
     new Display().setVisible(true);
}//GEN-LAST:event_disbtnActionPerformed

    private void dispallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispallActionPerformed
     //coding for opening display all window
     new records().setVisible(false);
     new DisplayAll().setVisible(true);
}//GEN-LAST:event_dispallActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clActionPerformed

    private void fnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnmActionPerformed

    private void stnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stnmActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void adnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adnActionPerformed

    private void fsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fsActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addrebtn;
    private javax.swing.JTextField adn;
    private javax.swing.JTextField cl;
    private javax.swing.JButton cleabt;
    private javax.swing.JButton delbtn;
    private javax.swing.JButton disbtn;
    private javax.swing.JButton dispall;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField fnm;
    private javax.swing.JTextField fs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mn;
    private javax.swing.JButton searbtn;
    private javax.swing.JTextField stnm;
    private javax.swing.JTextField sub;
    private javax.swing.JButton updtbtn;
    // End of variables declaration//GEN-END:variables

}
