/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Feb 23, 2019, 10:25:20 PM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();this.setLocationRelativeTo(null); 
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/Mini.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(750, 10, 50, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/crs.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(820, 10, 50, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sign In");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 17, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/tool.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -4, 890, 70);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 310, 160, 30);

        jPanel2.setLayout(null);

        jLabel3.setText("jLabel1");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 20, 890, 16);

        jLabel4.setText("Unique ID :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 200, 64, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel5.setText("Unique ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 220, 140, 30);
        jPanel1.add(t1);
        t1.setBounds(490, 220, 250, 40);
        jPanel1.add(p1);
        p1.setBounds(490, 310, 250, 40);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("LOGIN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 460, 100, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Not Register Yet ?");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 560, 170, 30);

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 560, 150, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24));
        jLabel7.setText("Sign In");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 100, 90, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/WhatsApp Image 2019-02-23 at 3.45.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 60, 890, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Register1 fr = new Register1();
fr.setVisible(true);
this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String uni   =t1.getText();
String pa = new String(p1.getPassword());
try{
        Class.forName("java.sql.Driver");
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
        Statement stmt = con.createStatement();
        String sql = "SELECT pass FROM register WHERE uni_id = '"+uni+"';";
        ResultSet rs = stmt.executeQuery(sql);
        
        if(rs.next())
        {
            String v = rs.getString("pass");
            if(v.equals(pa)){
                JOptionPane.showMessageDialog(null,"Login Successfully");
          String hh =t1.getText();
        Profile fram = new Profile (uni);
            fram.setVisible(true);
            this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                t1.setText("");
                p1.setText("");
               
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"User not Found !"); t1.setText("");
                p1.setText("");
        }
}
catch(Exception e )
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }



// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jButton1.setBackground(new Color(51,51,255));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
     jButton1.setBackground(new Color(153,153,255));   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

}
