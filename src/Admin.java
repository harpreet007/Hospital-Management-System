
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harpreet
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public Admin() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        
               int x=(int) tk.getScreenSize().getWidth();
               int y=(int) tk.getScreenSize().getHeight();
               this.setSize(x, y);
               conn=Hjavaconnect.connecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(24, 191, 233));
        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("                                     Hospital Management System");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 53, 1800, 110);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\harpreet\\Documents\\NetBeansProjects\\Hospital_Managgement_System\\images\\back-icon.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 190, 59, 35);

        jPanel1.setBackground(java.awt.Color.white);

        jTextField1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Cambria", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(24, 191, 233));
        jLabel5.setText("Login Here");
        jLabel5.setOpaque(true);

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(24, 191, 233));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\harpreet\\Documents\\NetBeansProjects\\Hospital_Managgement_System\\images\\Login-icon.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\harpreet\\Documents\\NetBeansProjects\\Hospital_Managgement_System\\images\\user-icon (1).png")); // NOI18N

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 191, 233));
        jLabel4.setText("ADMIN LOGIN HERE");
        jLabel4.setOpaque(true);

        jPasswordField1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(526, 254, 330, 320);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\harpreet\\Documents\\NetBeansProjects\\Hospital_Managgement_System\\images\\admin.jpeg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1530, 970);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       String sql="select * from Login where Username=? and Password=?";
        try {
             pst=conn.prepareStatement(sql);
             String s1=jTextField1.getText();
             if(s1.charAt(0)=='A'){
           pst.setString(1,jTextField1.getText());
           pst.setString(2,jPasswordField1.getText());
           rs=pst.executeQuery();
             }
             else
             {
                JOptionPane.showMessageDialog(null,"You are wrong user here"); 
             }
           if(rs.next()){
               rs.close();
               pst.close();
               setVisible(false);
             Adminpanel ob=new   Adminpanel();
             
               ob.setVisible(true); 
            }
           else{
               JOptionPane.showMessageDialog(null,"Incorrect Username and Password");
               setVisible(false);
           }
            
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
        }finally{
           try{
           rs.close();
           pst.close();
       }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
         }
           
    }            
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
