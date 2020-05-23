
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Display.java
 *
 * Created on 19 Oct, 2017, 10:03:59 PM
 */

/**
 *
 * @author lenovo
 */
public class Display extends javax.swing.JFrame {
 Connection con;
 Statement st;
 ResultSet rs;

public Display() {
     initComponents();
     data();
}  
     void data(){
        try{ 
             Class.forName("java.sql.DriverManager");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecords","root","anshul");
             st=con.createStatement();
             String q="Select * from coaching;";
             rs=st.executeQuery(q);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(rootPane,"Cannot Display Data "+e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstrebtn = new javax.swing.JButton();
        nextbtn = new javax.swing.JButton();
        prevbtn = new javax.swing.JButton();
        lastrebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        stnm = new javax.swing.JTextField();
        fnm = new javax.swing.JTextField();
        cl = new javax.swing.JTextField();
        mn = new javax.swing.JTextField();
        fs = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        adn = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Student's Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Admission No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Class");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mobile No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fees");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Subjects");

        firstrebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstrebtn.setText("First Record");
        firstrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstrebtnActionPerformed(evt);
            }
        });

        nextbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextbtn.setText("Next Record");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        prevbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prevbtn.setText("Previous Record");
        prevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevbtnActionPerformed(evt);
            }
        });

        lastrebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastrebtn.setText("Last Record");
        lastrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastrebtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        stnm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fnm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        adn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstrebtn)
                        .addGap(28, 28, 28)
                        .addComponent(nextbtn)
                        .addGap(28, 28, 28)
                        .addComponent(prevbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastrebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sub, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fs, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fnm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stnm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adn, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(fnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstrebtn)
                    .addComponent(nextbtn)
                    .addComponent(prevbtn)
                    .addComponent(lastrebtn))
                .addGap(12, 12, 12)
                .addComponent(backbtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstrebtnActionPerformed
        // coding for displaying the first record
        try{
            rs.first();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in First Record "+e.getMessage());
        }
}//GEN-LAST:event_firstrebtnActionPerformed

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        // coding for displaying the next record
        try{if(rs.isLast()) {
            rs.first();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        }else{
            rs.next();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in Next Record "+e.getMessage());
        }
}//GEN-LAST:event_nextbtnActionPerformed

    private void prevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevbtnActionPerformed
        // coding for displaying the previous record
        try{if(rs.isFirst()) {
            rs.last();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        }else{
            rs.previous();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in Previous Record "+e.getMessage());
        }
}//GEN-LAST:event_prevbtnActionPerformed

    private void lastrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastrebtnActionPerformed
        // coding for displaying the last record
        try{
            rs.last();
            adn.setText(rs.getString(1));
            stnm.setText(rs.getString(2));
            fnm.setText(rs.getString(3));
            cl.setText(rs.getString(4));
            mn.setText(rs.getString(5));
            fs.setText(rs.getString(6));
            sub.setText(rs.getString(7));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Error in Last Record "+e.getMessage());
        }
}//GEN-LAST:event_lastrebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
     // coding for opening the record window 
     new Display().setVisible(false);
     new records().setVisible(true);
}//GEN-LAST:event_backbtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adn;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField cl;
    private javax.swing.JButton firstrebtn;
    private javax.swing.JTextField fnm;
    private javax.swing.JTextField fs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lastrebtn;
    private javax.swing.JTextField mn;
    private javax.swing.JButton nextbtn;
    private javax.swing.JButton prevbtn;
    private javax.swing.JTextField stnm;
    private javax.swing.JTextField sub;
    // End of variables declaration//GEN-END:variables

}