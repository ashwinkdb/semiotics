/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Profile.java
 *
 * Created on Feb 23, 2019, 10:37:56 PM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Profile extends javax.swing.JFrame {

    /** Creates new form Profile */
    public Profile() {
        initComponents();this.setLocationRelativeTo(null); 
    }
   public Profile(String parad) {
        initComponents();
        ll.setText(parad);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ll = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        l7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        l10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("UNIQUE ID: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 80, 110, 22);

        ll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ll.setText("3452368289");
        jPanel1.add(ll);
        ll.setBounds(140, 70, 130, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel4.setText("Mobile");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 320, 230, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 190, 230, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel5.setText("Employee ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 250, 270, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel6.setText("Email ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 390, 160, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Vehicle Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 530, 340, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel8.setText("Residence Mobile No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 460, 340, 30);

        jButton2.setText("Update Personal Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 665, 180, 40);

        jButton3.setText("Find People");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 660, 150, 40);

        jButton4.setText("Update Vehicle Details");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(630, 665, 180, 40);

        jButton5.setText("Delete My Account");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(929, 665, 150, 40);

        l7.setVisible(false);
        l7.setFont(new java.awt.Font("Arial", 0, 14));
        l7.setText("65");
        jPanel1.add(l7);
        l7.setBounds(890, 190, 130, 17);

        jLabel15.setVisible(false);
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel15.setText("Ist Person");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(740, 190, 80, 17);

        jLabel16.setVisible(false);
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel16.setText("2nd Person");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(740, 260, 90, 17);

        l8.setVisible(false);
        l8.setFont(new java.awt.Font("Arial", 0, 14));
        l8.setText("65");
        jPanel1.add(l8);
        l8.setBounds(890, 260, 130, 17);

        jLabel17.setVisible(false);
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel17.setText("3rd Person");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(740, 330, 80, 17);

        l9.setVisible(false);
        l9.setFont(new java.awt.Font("Arial", 0, 14));
        l9.setText("65");
        jPanel1.add(l9);
        l9.setBounds(890, 330, 130, 17);

        jLabel9.setVisible(true);
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel9.setText("No Group Found!!!!!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(790, 330, 130, 30);

        jLabel2.setVisible(false);
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Vehicle Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(740, 400, 120, 17);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/crs.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1020, 10, 50, 40);

        l10.setVisible(false);
        l10.setFont(new java.awt.Font("Arial", 0, 14));
        l10.setText("ee");
        jPanel1.add(l10);
        l10.setBounds(890, 400, 120, 20);

        jLabel10.setVisible(false);
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel10.setText("Parking Slot :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(740, 470, 110, 17);

        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(470, 30, 90, 25);

        jButton8.setText("LOG OUT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(959, 80, 100, 25);

        jButton7.setForeground(new java.awt.Color(102, 102, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/Mini.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(950, 10, 50, 40);

        jLabel13.setVisible(false);
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel13.setText("ee");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(740, 500, 310, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Profile");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 17, 110, 30);

        jButton1.setText("Leave Group");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(810, 560, 130, 25);

        t1.setEditable(false);
        jPanel1.add(t1);
        t1.setBounds(410, 190, 230, 30);

        t2.setEditable(false);
        jPanel1.add(t2);
        t2.setBounds(410, 250, 230, 30);

        t3.setEditable(false);
        jPanel1.add(t3);
        t3.setBounds(410, 320, 230, 30);

        t4.setEditable(false);
        jPanel1.add(t4);
        t4.setBounds(410, 390, 230, 30);

        t5.setEditable(false);
        jPanel1.add(t5);
        t5.setBounds(410, 460, 230, 30);

        t6.setEditable(false);
        String uni = ll.getText();
        try{
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
            Statement stmt = con.createStatement();
            String  quer = "Select emp,id,mob,gmai,res_mob,veh_no FROM register WHERE uni_id='"+uni+"';";
            ResultSet rs = stmt.executeQuery(quer);
            while(rs.next())
            {String nam = rs.getString("emp");
                String id = rs.getString("id");
                String mob = rs.getString("mob");
                String gm = rs.getString("gmai");
                String res = rs.getString("res_mob");
                String veh = rs.getString("veh_no");
                t1.setText(nam);
                t2.setText(id);
                t3.setText(mob);
                t4.setText(gm);
                t5.setText(res);
                t6.setText(veh);

            }
        }

        catch(Exception e )
        {JOptionPane.showMessageDialog(null,e.getMessage());}

        int i;

        try{
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
            Statement stmt = con.createStatement();
            String qu = "Select mem1 , mem2 ,mem3 ,veh_no,comp FROM grp WHERE mem1 = '"+uni+"' OR mem2 ='"+uni+"' OR mem3='"+uni+"';";
            ResultSet rs = stmt.executeQuery(qu);
            if(rs.next())
            {
                String m1 = rs.getString("mem1");
                String m2 = rs.getString("mem2");
                String m3 = rs.getString("mem3");
                String v_n = rs.getString("veh_no");
                String comp= rs.getString("comp");
                l7.setText(m1);
                l8.setText(m2);
                l9.setText(m3);
                l10.setText(v_n);
                jLabel13.setText(comp);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
                jLabel17.setVisible(true);
                jLabel13.setVisible(true);
                jLabel2.setVisible(true);
                jLabel10.setVisible(true);

                l7.setVisible(true);
                l8.setVisible(true);
                l9.setVisible(true);
                l10.setVisible(true);
                jLabel9.setVisible(false);
            }
            else {jLabel9.setVisible(true);
                jButton4.setEnabled(false);
                jButton1.setEnabled(false);
            }
        }

        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
        t1.setEditable(false);
        jPanel1.add(t6);
        t6.setBounds(410, 530, 230, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Profile");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(480, 90, 110, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/WhatsApp Image 2019-02-23 at 3.45.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 60, 1090, 690);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/tool.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, -4, 1090, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String uni = ll.getText();
        Update_Details fr = new Update_Details(uni);
        fr.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setState(ICONIFIED);        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String uni = ll.getText();
members ne = new members(uni);
ne.setVisible(true);
this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String uni=ll.getText();
delete fr = new delete(uni);
fr.setVisible(true);
this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/traffic", "root", "help");
            Statement stmt = conn.createStatement();
            String sql="DELETE from grp WHERE mem1='"+l7.getText()+"' AND  mem2='"+l8.getText()+"' and mem3='"+l9.getText()+"';";
            stmt.executeUpdate(sql);
           JOptionPane.showMessageDialog(this, "you had leave group");
 }

 catch(Exception e)
 {JOptionPane.showMessageDialog(null, e.getMessage());}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
Login hn = new Login();
hn.setVisible(true);
this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
String uni = ll.getText();
try{
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
Statement stmt = con.createStatement();
String  quer = "Select emp,id,mob,gmai,res_mob,veh_no FROM register WHERE uni_id='"+uni+"';";
ResultSet rs = stmt.executeQuery(quer);
while(rs.next())
{String nam = rs.getString("emp");
 String id = rs.getString("id");
 String mob = rs.getString("mob");
String gm = rs.getString("gmai");
String res = rs.getString("res_mob");
String veh = rs.getString("veh_no");
t1.setText(nam);
t2.setText(id);
t3.setText(mob);
t4.setText(gm);
t5.setText(res);
t6.setText(veh);

}
}

catch(Exception e )
{JOptionPane.showMessageDialog(null,e.getMessage());}

int i;

try{
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
Statement stmt = con.createStatement();
String qu = "Select mem1 , mem2 ,mem3 ,veh_no,comp FROM grp WHERE mem1 = '"+uni+"' OR mem2 ='"+uni+"' OR mem3='"+uni+"';";
ResultSet rs = stmt.executeQuery(qu);
if(rs.next())
{
String m1 = rs.getString("mem1");
String m2 = rs.getString("mem2");
String m3 = rs.getString("mem3");
String v_n = rs.getString("veh_no");
String comp= rs.getString("comp");
l7.setText(m1);
l8.setText(m2);
l9.setText(m3);
l10.setText(v_n);
jLabel13.setText(comp);
jLabel15.setVisible(true);
jLabel16.setVisible(true);
jLabel17.setVisible(true);
jLabel13.setVisible(true);
jLabel2.setVisible(true);
jLabel10.setVisible(true);

l7.setVisible(true);
l8.setVisible(true);
l9.setVisible(true);
l10.setVisible(true);
jLabel9.setVisible(false);
}
else {jLabel9.setVisible(true);
jButton4.setEnabled(false);
jButton1.setEnabled(false);
}
}

catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
t1.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables

}
