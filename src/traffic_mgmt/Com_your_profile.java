/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Com_your_profile.java
 *
 * Created on Feb 23, 2019, 3:14:29 PM
 */

package traffic_mgmt;

import javax.swing.JOptionPane;

import java.sql.*;
/**
 *
 * @author HP
 */
public class Com_your_profile extends javax.swing.JFrame {

    /** Creates new form Com_your_profile */
    public Com_your_profile() {
        initComponents();
    }
    public Com_your_profile(String para) {
        initComponents();
        l1.setText(para);
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
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 10, 50, 40);
        jPanel1.add(t1);
        t1.setBounds(570, 520, 340, 30);
        jPanel1.add(t2);
        t2.setBounds(790, 230, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel3.setText("Complete Your Profile");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 200, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel4.setText("Dropping Pincode");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 530, 250, 20);

        jLabel1.setText("dfs");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 913, 58);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel5.setText("Company Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 160, 250, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel6.setText("Working Timings (HH:MM:SS)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 230, 350, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel7.setText("Vehicle Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 310, 160, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel8.setText("Vehicle Registration No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 380, 280, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel9.setText("Pickup Pincode");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 450, 250, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("to");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(730, 240, 30, 17);

        jButton2.setText("jButton1");
        jPanel1.add(jButton2);
        jButton2.setBounds(849, 10, 50, 40);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(570, 230, 120, 30);
        jPanel1.add(t4);
        t4.setBounds(570, 310, 340, 30);
        jPanel1.add(t5);
        t5.setBounds(570, 380, 340, 30);
        jPanel1.add(t6);
        t6.setBounds(570, 450, 340, 30);

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A -10 11 Amazon", "A-12 Microsoft" }));
        jPanel1.add(c1);
        c1.setBounds(580, 160, 320, 30);

        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(490, 650, 110, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel2.setText("UNIQUE ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 130, 30);

        l1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l1.setText("324234");
        jPanel1.add(l1);
        l1.setBounds(180, 80, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String comp = c1.getSelectedItem().toString();
String st = t3.getText();
String en_tim= t2.getText();
String veh_nam = t4.getText();
String veh_num = t5.getText();
int pick=Integer.parseInt(t6.getText());
int dro = Integer.parseInt(t1.getText());
String uni =l1.getText();
try {
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
Statement stmt = con.createStatement();
String query = "UPDATE register SET  compa ='"+comp+"' WHERE uni_id='"+uni+"'; ";
String quer= "UPDATE register SET  st_time ='"+st+"' WHERE uni_id='"+uni+"'; ";
String quewr= "UPDATE register SET  en_time ='"+en_tim+"' WHERE uni_id='"+uni+"'; ";
String queer= "UPDATE register SET  veh_no ='"+veh_num+"' WHERE uni_id='"+uni+"'; ";
String qer= "UPDATE register SET  veh_name ='"+veh_nam+"' WHERE uni_id='"+uni+"'; ";
String aqer= "UPDATE register SET  pick ='"+pick+"' WHERE uni_id='"+uni+"'; ";
String qder= "UPDATE register SET  dro ='"+dro+"' WHERE uni_id='"+uni+"'; ";
stmt.executeUpdate(query);
stmt.executeUpdate(quer);
stmt.executeUpdate(quewr);
stmt.executeUpdate(queer);
stmt.executeUpdate(qer);
stmt.executeUpdate(aqer);
stmt.executeUpdate(qder);
JOptionPane.showMessageDialog(null,"Data updated successfully");
String vv = l1.getText();
Profile nn = new Profile(vv);
nn.setVisible(true);
this.setVisible(false);

}
catch(Exception e)
{ JOptionPane.showMessageDialog(null,e.getMessage()); }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Com_your_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables

}
