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
        initComponents();
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
        l1 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("UNIQUE ID: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 110, 22);

        ll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ll.setText("324234");
        jPanel1.add(ll);
        ll.setBounds(140, 30, 130, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Mobile");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 310, 230, 20);

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
                l1.setText(nam);
                l2.setText(id);
                l3.setText(mob);
                l4.setText(gm);
                l5.setText(res);
                l6.setText(veh);

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
                jLabel12.setVisible(true);
                l7.setVisible(true);
                l8.setVisible(true);
                l9.setVisible(true);
                l10.setVisible(true);jLabel9.setVisible(false);
            }
            else {}
        }

        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 160, 230, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Employee ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 230, 270, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Email ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 370, 260, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Vehicle Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 520, 340, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Residence Mobile No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 440, 340, 30);
        jPanel1.add(l1);
        l1.setBounds(460, 160, 210, 30);
        jPanel1.add(l5);
        l5.setBounds(460, 450, 210, 30);
        jPanel1.add(l4);
        l4.setBounds(460, 370, 210, 30);
        jPanel1.add(l3);
        l3.setBounds(460, 300, 210, 30);
        jPanel1.add(l2);
        l2.setBounds(460, 230, 210, 30);
        jPanel1.add(l6);
        l6.setBounds(460, 520, 210, 30);

        jButton1.setText("LOAD DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 30, 180, 50);

        p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.setLayout(null);

        jLabel13.setVisible(false);
        p2.add(jLabel13);
        jLabel13.setBounds(20, 380, 300, 20);

        jLabel15.setVisible(false);
        jLabel15.setText("Ist Person");
        p2.add(jLabel15);
        jLabel15.setBounds(20, 40, 57, 16);

        jLabel16.setVisible(false);
        jLabel16.setText("2nd Person");
        p2.add(jLabel16);
        jLabel16.setBounds(20, 110, 64, 16);

        jLabel17.setVisible(false);
        jLabel17.setText("3rd Person");
        p2.add(jLabel17);
        jLabel17.setBounds(20, 180, 62, 16);

        l7.setVisible(false);
        l7.setText("65");
        p2.add(l7);
        l7.setBounds(164, 40, 130, 16);

        l8.setVisible(false);
        l8.setText("65");
        p2.add(l8);
        l8.setBounds(164, 110, 130, 16);

        l9.setVisible(false);
        l9.setText("65");
        p2.add(l9);
        l9.setBounds(164, 180, 130, 16);

        jLabel2.setVisible(false);
        jLabel2.setText("Vehicle Number");
        p2.add(jLabel2);
        jLabel2.setBounds(20, 260, 90, 16);

        l10.setVisible(false);
        p2.add(l10);
        l10.setBounds(160, 260, 160, 20);

        jLabel9.setVisible(true);
        jLabel9.setText("No Group Found!!!!!");
        p2.add(jLabel9);
        jLabel9.setBounds(110, 150, 130, 120);

        jLabel10.setVisible(false);
        jLabel10.setText("Parking Slot :");
        p2.add(jLabel10);
        jLabel10.setBounds(20, 350, 110, 16);

        jLabel12.setText("No Group Found !!");
        p2.add(jLabel12);
        jLabel12.setBounds(750, 40, 280, 100);

        jPanel1.add(p2);
        p2.setBounds(730, 110, 340, 510);

        jButton2.setText("Update Personal Details");
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 665, 180, 40);

        jButton3.setText("Create Group");
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 660, 150, 40);

        jButton4.setText("Update Vehicle Details");
        jPanel1.add(jButton4);
        jButton4.setBounds(630, 665, 180, 40);

        jButton5.setText("Delete My Account");
        jPanel1.add(jButton5);
        jButton5.setBounds(929, 665, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
l1.setText(nam);
l2.setText(id);
l3.setText(mob);
l4.setText(gm);
l5.setText(res);
l6.setText(veh);

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
jLabel12.setVisible(true);
l7.setVisible(true);
l8.setVisible(true);
l9.setVisible(true);
l10.setVisible(true);
}
else {jLabel9.setVisible(true);}
}

catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel ll;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables

}
