/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * delete.java
 *
 * Created on Feb 24, 2019, 8:19:08 AM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class delete extends javax.swing.JFrame {

    /** Creates new form delete */
    public delete() {
        initComponents();
    }
    public delete (String para )
    {initComponents();

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        l1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l1.setText("T322138979");
        jPanel1.add(l1);
        l1.setBounds(150, 90, 160, 30);

        jButton7.setForeground(new java.awt.Color(102, 102, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/Mini.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(770, 10, 50, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/crs.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(840, 10, 50, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("UNIQUE ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 90, 130, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Delete My Account");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 17, 190, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/tool.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, -4, 1090, 70);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Reason to Delete the Account :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 190, 400, 20);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        r3.setText("Other (Specify it)");
        jPanel1.add(r3);
        r3.setBounds(190, 360, 240, 37);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        r2.setText("Company change");
        jPanel1.add(r2);
        r2.setBounds(190, 300, 240, 37);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        r1.setText("Address change");
        jPanel1.add(r1);
        r1.setBounds(190, 240, 240, 37);

        ta.setColumns(20);
        ta.setRows(5);
        ta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 360, 310, 96);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 510, 77, 40);

        jLabel4.setText("(once you click submit , your account cant be recovered)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 560, 340, 16);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/WhatsApp Image 2019-02-23 at 3.45.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 60, 910, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setState(ICONIFIED);        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String uni = l1.getText();
        String a;
        if(r1.isSelected())
{a="Address change";}
        else if (r2.isSelected())
        {a = "Company Change";}
        else if (r3.isSelected())
        {a=ta.getText();}

try {
Class.forName("java.sql.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
            Statement stmt = con.createStatement();
            String s = "DELETE FROM register WHERE uni_id ='"+uni+"';";
            stmt.executeUpdate(s );
            JOptionPane.showMessageDialog(null, "Your Account Has been Deleted");
}
catch(Exception w)
{JOptionPane.showMessageDialog(null,w.getMessage());}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

}
