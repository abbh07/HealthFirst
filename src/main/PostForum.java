/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aakash
 */
public class PostForum extends javax.swing.JFrame {

    String user = null;
    Connection con = null;
    ResultSet rs = null;
    Statement st = null;
    /**
     * Creates new form PostForum
     * @param user
     */
    public PostForum(String user) {
        initComponents();
        this.user = user;
        PostTextArea.setLineWrap(true);
        PostTextArea.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Img_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostTextArea = new javax.swing.JTextArea();
        Back_Label = new javax.swing.JLabel();
        Post_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Img_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/healthcare-banner.jpg"))); // NOI18N

        PostTextArea.setColumns(20);
        PostTextArea.setRows(5);
        jScrollPane1.setViewportView(PostTextArea);

        Back_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/back.png"))); // NOI18N
        Back_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Back_LabelMousePressed(evt);
            }
        });
        Back_Label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Back_LabelKeyPressed(evt);
            }
        });

        Post_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/post.png"))); // NOI18N
        Post_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Post_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Post_LabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(Back_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Post_Label)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Img_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Post_Label)
                    .addComponent(Back_Label))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_LabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Back_LabelKeyPressed
        
    }//GEN-LAST:event_Back_LabelKeyPressed

    private void Post_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Post_LabelMousePressed
        String disc = PostTextArea.getText();
        if(PostTextArea.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter something to post!");
        }
        else if(disc.length() > 3000)
        {
            JOptionPane.showMessageDialog(null, "Character Limit Exceeded!");
        }
        else
        {
            try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthfirst","root", "abbh07@6718");
            st = con.createStatement();
            String q = "insert into forum values ('"+user+"','"+disc+"');";
            st.executeUpdate(q);
        } catch (SQLException ex) {
            Logger.getLogger(PostForum.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Post Successful!");
        PostTextArea.setText(null);
        }        
    }//GEN-LAST:event_Post_LabelMousePressed

    private void Back_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_LabelMousePressed
        Forum f = new Forum(user);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_LabelMousePressed

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
            java.util.logging.Logger.getLogger(PostForum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostForum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostForum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostForum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostForum(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Label;
    private javax.swing.JLabel Img_Label;
    private javax.swing.JTextArea PostTextArea;
    private javax.swing.JLabel Post_Label;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
