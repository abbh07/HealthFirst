/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author aakash
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        Login_Label = new javax.swing.JLabel();
        FirstAid_Label = new javax.swing.JLabel();
        Background_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Login_Label.setForeground(new java.awt.Color(0, 62, 255));
        Login_Label.setText("          LOGIN");
        Login_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Login_LabelMousePressed(evt);
            }
        });
        Main_Panel.add(Login_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, 60));

        FirstAid_Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        FirstAid_Label.setForeground(new java.awt.Color(0, 62, 255));
        FirstAid_Label.setText("       FIRST AID");
        FirstAid_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FirstAid_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FirstAid_LabelMousePressed(evt);
            }
        });
        Main_Panel.add(FirstAid_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 120, 60));

        Background_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/healthcare-1.jpg"))); // NOI18N
        Main_Panel.add(Background_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_LabelMousePressed
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Login_LabelMousePressed

    private void FirstAid_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstAid_LabelMousePressed
        FirstAid fa = new FirstAid();
        fa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FirstAid_LabelMousePressed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_Image;
    private javax.swing.JLabel FirstAid_Label;
    private javax.swing.JLabel Login_Label;
    private javax.swing.JPanel Main_Panel;
    // End of variables declaration//GEN-END:variables
}
