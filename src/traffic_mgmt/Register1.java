/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Register1.java
 *
 * Created on Feb 23, 2019, 5:02:57 PM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Register1 extends javax.swing.JFrame {

    /** Creates new form Register1 */
    public Register1() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("REGISTER HERE!!!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 90, 327, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(840, 10, 50, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(930, 10, 50, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("For Hassle Free Ghaziabad");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 140, 234, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Employee Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 260, 184, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Employee ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 330, 144, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Date Of Birth (YYYY-MM-DD)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 400, 330, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Adress");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 470, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Mobile");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 540, 78, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Residence Contact no.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 610, 259, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Email ID");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 680, 95, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Save And Continue");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(390, 760, 257, 40);
        jPanel1.add(t1);
        t1.setBounds(600, 250, 240, 30);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(600, 320, 240, 30);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(600, 390, 240, 30);
        jPanel1.add(t4);
        t4.setBounds(600, 460, 240, 30);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(600, 530, 240, 30);
        jPanel1.add(t6);
        t6.setBounds(600, 600, 240, 30);

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(600, 670, 240, 30);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1040, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int l = t2.getText().length();
      int ll = t5.getText().length();
        String uni=t2.getText().substring(l-5)+t5.getText().substring(ll-5);
      String pa = t3.getText().substring(0,4)+t2.getText().substring(l-5);
      System.out.print(pa+"\n");
      System.out.print(uni);
        try{
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/traffic", "root", "help");
            Statement stmt = conn.createStatement();
            String Query="insert into register(emp,id,dob,addr,mob,res_mob,gmai)values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"');";
            stmt.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"YOUR DATA IS SUCESSFULLY SUBMITTED\nYour Unique Id id  "+uni+"\nYour Password is "+pa+"\nKEEP IT SECURE" );
            Com_your_profile fra = new Com_your_profile(uni);
fra .setVisible(true);
this.setVisible(false);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        
        
        
        
        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables

}
