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
public class Result extends javax.swing.JFrame {

    
    /**
     * Creates new form Result
     * @param predictedDisease
     * @param rem
     * @param info
     */
    public Result(String predictedDisease, String rem,String info) {
        initComponents();
        Predicted_TextField.setEditable(false);
        Predicted_TextField.setText(predictedDisease);
        Remedy_TextArea.setEditable(false);
        Remedy_TextArea.setLineWrap(true);
        Remedy_TextArea.setWrapStyleWord(true);
        Remedy_TextArea.setText(rem);
        Doctor_TextArea.setEditable(false);
        Doctor_TextArea.setLineWrap(true);
        Doctor_TextArea.setWrapStyleWord(true);
        Doctor_TextArea.setText(info);
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
        Predicted_TextField = new javax.swing.JTextField();
        Disease_Label = new javax.swing.JLabel();
        Remedy_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Remedy_TextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Doctor_TextArea = new javax.swing.JTextArea();
        Back_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Img_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/healthcare-banner.jpg"))); // NOI18N

        Disease_Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Disease_Label.setText("Predicted Disease:");

        Remedy_Label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Remedy_Label.setText("Remedies:");

        Remedy_TextArea.setColumns(20);
        Remedy_TextArea.setRows(5);
        jScrollPane1.setViewportView(Remedy_TextArea);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Specialized Doctor:");

        Doctor_TextArea.setColumns(20);
        Doctor_TextArea.setRows(5);
        jScrollPane2.setViewportView(Doctor_TextArea);

        Back_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/back.png"))); // NOI18N
        Back_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Back_LabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(Disease_Label)
                    .addComponent(Remedy_Label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(Predicted_TextField)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Label)
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Img_Label)
                .addGap(18, 18, 18)
                .addComponent(Disease_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Predicted_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remedy_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_LabelMousePressed
        Prediction p  = new Prediction();
        p.setVisible(true);
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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Label;
    private javax.swing.JLabel Disease_Label;
    private javax.swing.JTextArea Doctor_TextArea;
    private javax.swing.JLabel Img_Label;
    private javax.swing.JTextField Predicted_TextField;
    private javax.swing.JLabel Remedy_Label;
    private javax.swing.JTextArea Remedy_TextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
