/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * members.java
 *
 * Created on Feb 24, 2019, 2:51:09 AM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class members extends javax.swing.JFrame {

    /** Creates new form members */
    public members() {
        initComponents();this.setLocationRelativeTo(null); 
    }
  public members(String parad) {
        initComponents();
        l1.setText(parad);
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
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        t1.setFont(new java.awt.Font("Arial", 0, 18));
        jPanel1.add(t1);
        t1.setBounds(270, 210, 170, 28);

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UNIQUE ID", "Mobile No.", "Start Time", "End Time"
            }
        ));
        jScrollPane1.setViewportView(t);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 370, 810, 200);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/crs.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(940, 10, 50, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search People");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 17, 180, 30);

        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/Mini.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(870, 10, 50, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel1.setText("Pickup Pincode");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 210, 124, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel2.setText("Drop Pincode");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 210, 109, 22);

        t2.setFont(new java.awt.Font("Arial", 0, 18));
        jPanel1.add(t2);
        t2.setBounds(730, 210, 180, 28);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 310, 73, 25);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24));
        jLabel3.setText("Find The People Near You !!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 130, 320, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/tool.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -4, 1010, 70);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 610, 90, 40);

        l1.setFont(new java.awt.Font("Arial", 0, 18));
        l1.setText("T322138979");
        jPanel1.add(l1);
        l1.setBounds(140, 90, 130, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel5.setText("UNIQUE ID: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 100, 110, 22);

        jButton5.setText("Create My Group");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(820, 600, 140, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/WhatsApp Image 2019-02-23 at 3.45.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 60, 1010, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
    Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/traffic", "root", "help");
    Statement stmt = conn.createStatement();
    String sql="SELECT emp,uni_id,mob,st_time,en_time,addr,compa FROM register WHERE pick='"+t1.getText()+"'AND dro='"+t2.getText()+"';";
ResultSet rs=stmt.executeQuery(sql);
    DefaultTableModel model=(DefaultTableModel) t.getModel();
    model.setRowCount(0);
 while(rs.next()){
        String name=rs.getString("emp");
        String employid=rs.getString("uni_id");
        String mob=rs.getString("mob");
        String sttime=rs.getString("st_time");
        String entime=rs.getString("en_time");
        String addr=rs.getString("addr");
        String compa=rs.getString("compa");
        model.addRow( new Object[]{name,employid,mob,sttime,entime,addr,compa});
}}catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());}
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(ICONIFIED);        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String uni = l1.getText();
        Profile nw = new Profile(uni);
        nw.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String uni = l1.getText();

        Grouped n = new Grouped(uni);
        n.setVisible(true);
        this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new members().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JTable t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables

}
