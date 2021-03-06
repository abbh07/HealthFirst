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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import matrix.Matrix;
import matrix.NoSquareException;
import regression.MultiLinear;

/**
 *
 * @author aakash
 */
public class Prediction extends javax.swing.JFrame {

    String user;
    /**
     * Creates new form Prediction
     * @param user
     */
    public Prediction(String user) {
        initComponents();
        this.user = user;
    }

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    boolean symptomsSelected[] = new boolean[9];
    int c = 0;
    String symptomName[] = new String[9];
    String diseaseName[] = {"Diarrhea", "Malaria", "Cholera", "Typhoid", "Dengue", "Pleural effusion",
        "Collagen Vascular Disease", "Tuberculosis", "Dysentery", "Swine Flu", "Jaundice"};
    int diseaseWeight[] = new int[9];
    boolean flag = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Img_Label = new javax.swing.JLabel();
        Back_Label = new javax.swing.JLabel();
        Predict_Label = new javax.swing.JLabel();
        WaterMotion_Checkbox = new javax.swing.JCheckBox();
        Vomiting_Checkbox = new javax.swing.JCheckBox();
        Coughing_Checkbox = new javax.swing.JCheckBox();
        Dehydration_Checkbox = new javax.swing.JCheckBox();
        MusclePain_Checkbox = new javax.swing.JCheckBox();
        Appetite_Checkbox = new javax.swing.JCheckBox();
        Rashes_Checkbox = new javax.swing.JCheckBox();
        ChestPain_Checkbox = new javax.swing.JCheckBox();
        Constipation_Checkbox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Img_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/healthcare-banner.jpg"))); // NOI18N

        Back_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/back.png"))); // NOI18N
        Back_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Back_LabelMousePressed(evt);
            }
        });

        Predict_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/predict.png"))); // NOI18N
        Predict_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Predict_LabelMousePressed(evt);
            }
        });

        WaterMotion_Checkbox.setText("Watery Motion ");
        WaterMotion_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterMotion_CheckboxActionPerformed(evt);
            }
        });

        Vomiting_Checkbox.setText("Vomiting/ Coughing Blood");
        Vomiting_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vomiting_CheckboxActionPerformed(evt);
            }
        });

        Coughing_Checkbox.setText("Feverish and Coughing ");
        Coughing_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Coughing_CheckboxActionPerformed(evt);
            }
        });

        Dehydration_Checkbox.setText("Dehydration ");
        Dehydration_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dehydration_CheckboxActionPerformed(evt);
            }
        });

        MusclePain_Checkbox.setText("Muscle Pain ");
        MusclePain_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusclePain_CheckboxActionPerformed(evt);
            }
        });

        Appetite_Checkbox.setText("Appetite Loss ");
        Appetite_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Appetite_CheckboxActionPerformed(evt);
            }
        });

        Rashes_Checkbox.setText("Skin Rashes ");
        Rashes_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rashes_CheckboxActionPerformed(evt);
            }
        });

        ChestPain_Checkbox.setText("Chest pain/Breath shortness ");
        ChestPain_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChestPain_CheckboxActionPerformed(evt);
            }
        });

        Constipation_Checkbox.setText("Urination abnormalities/Constipation ");
        Constipation_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Constipation_CheckboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 86, 217));
        jLabel1.setText("SELECT SYMPTOMS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Back_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MusclePain_Checkbox)
                            .addComponent(Dehydration_Checkbox)
                            .addComponent(Coughing_Checkbox)
                            .addComponent(Vomiting_Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Predict_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rashes_Checkbox)
                            .addComponent(Appetite_Checkbox)
                            .addComponent(ChestPain_Checkbox)
                            .addComponent(Constipation_Checkbox)
                            .addComponent(WaterMotion_Checkbox))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Img_Label)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WaterMotion_Checkbox)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vomiting_Checkbox)
                    .addComponent(Appetite_Checkbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Coughing_Checkbox)
                    .addComponent(Rashes_Checkbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dehydration_Checkbox)
                    .addComponent(ChestPain_Checkbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MusclePain_Checkbox)
                    .addComponent(Constipation_Checkbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back_Label)
                    .addComponent(Predict_Label))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_LabelMousePressed
        Index i = new Index(user);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_LabelMousePressed

    private void Predict_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Predict_LabelMousePressed
        for (int i = 0; i < symptomsSelected.length; i++) {
            if (symptomsSelected[i] == true) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthfirst", "root", "abbh07@6718");
                st = con.createStatement();
                String qu = "select watery_motion,vomiting,feverish,dehydration,muscle_pain,appetite_loss,skin_rashes,chest_pain,constipation from prediction;";
                rs = st.executeQuery(qu);
                Statement stmt1 = con.createStatement();
                ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM prediction;");
                int count = 0;
                while (rs1.next()) {
                    count = rs1.getInt("total");
                }
                Statement stmt2 = con.createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT disease FROM prediction;");
                String a = "";
                int nCol = rs.getMetaData().getColumnCount();
                double ar[][] = new double[count][nCol];
                //System.out.println(rowNumb);
                List<int[]> table = new ArrayList<>();
                while (rs.next()) {
                    int[] row = new int[nCol];
                    for (int iCol = 1; iCol <= nCol; iCol++) {
                        a = rs.getObject(iCol).toString();
                        row[iCol - 1] = Integer.parseInt(a);
                    }
                    table.add(row);
                }

                int nColy = rs2.getMetaData().getColumnCount();
                double ary[][] = new double[count][nColy];

                List<int[]> tabley = new ArrayList<>();
                while (rs2.next()) {
                    int[] rowy = new int[nColy];
                    for (int iCol = 1; iCol <= nColy; iCol++) {
                        a = rs2.getObject(iCol).toString();
                        rowy[iCol - 1] = Integer.parseInt(a);
                    }
                    tabley.add(rowy);
                }
                int i = 0;
                int j = 0;
                // print result
                for (int[] row : table) {
                    for (int si : row) {
                        ar[i][j] = si;
                        j++;
                    }
                    j = 0;
                    i++;

                }

                i = 0;
                j = 0;
                // print result
                for (int[] row : tabley) {
                    for (int si : row) {
                        ary[i][j] = si;
                        j++;
                    }
                    j = 0;
                    i++;
                }

//            for (i = 0; i < count; i++) {
//                for (j = 0; j < nCol; j++) {
//                    System.out.print(ar[i][j] + "\t");
//                }
//                System.out.println();
//            }
//            for (i = 0; i < count; i++) {
//                for (j = 0; j < nColy; j++) {
//                    System.out.print(ary[i][j] + "\t");
//                }
//                System.out.println();
//            }
                Matrix m = new Matrix(ar);
                Matrix m2 = new Matrix(ary);
                MultiLinear ml = new MultiLinear(m, m2);
                Matrix result = ml.calculate();
//            for (int i1 = 0; i1 < result.getNrows(); i1++) {
//                for (int j1 = 0; j1 < result.getNcols(); j1++) {
//                    System.out.print(result.getValueAt(i1, j1));
//                }
//                System.out.println();
//            }

                double predictedDisease = result.getValueAt(0, 0);
                for (j = 1; j < result.getNrows(); j++) {
                    predictedDisease += result.getValueAt(j, 0) * diseaseWeight[j - 1];
                }
                //System.out.println(predictedDisease);
                int pd = (int) (predictedDisease + 50) / 100 * 100;
                //System.out.println(pd);
                int pdIndex = (pd / 100) - 1;
                //System.out.println(diseaseName[pd]);
                qu = "insert into prediction values ('" + diseaseWeight[0] + "','" + diseaseWeight[1] + "','" + diseaseWeight[2] + "','" + diseaseWeight[3] + "','" + diseaseWeight[4] + "','" + diseaseWeight[5] + "','" + diseaseWeight[6] + "','" + diseaseWeight[7] + "','" + diseaseWeight[8] + "','" + pd + "');";
                st.executeUpdate(qu);
                qu = "select Cure from Remedies where Disease = '" + diseaseName[pdIndex] + "';";
                rs = st.executeQuery(qu);
                String rem = "";
                while (rs.next()) {
                    rem += rs.getString("Cure");
                    rem += "\n";
                }
                qu = "select Name,Contact from Doctor where Disease = '" + diseaseName[pdIndex] + "';";
                rs = st.executeQuery(qu);
                String info = "";
                while (rs.next()) {
                    info = info + rs.getString("Name");
                    info = info + "\n";
                    info = info + rs.getString("Contact");
                    info = info + "\n";
                }
                JOptionPane.showMessageDialog(null, "Prediction Successful!");
                Result r = new Result(diseaseName[pdIndex], rem, info,user);
                r.setVisible(true);
                this.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(Prediction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSquareException ex) {
                Logger.getLogger(Prediction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No Symptoms selected!");
        }

    }//GEN-LAST:event_Predict_LabelMousePressed

    private void WaterMotion_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaterMotion_CheckboxActionPerformed
        symptomsSelected[0] = WaterMotion_Checkbox.isEnabled();
        symptomName[0] = WaterMotion_Checkbox.getText();
        if (symptomsSelected[0]) {
            diseaseWeight[0] = 10;
        } else {
            diseaseWeight[0] = 0;
        }
    }//GEN-LAST:event_WaterMotion_CheckboxActionPerformed

    private void Vomiting_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vomiting_CheckboxActionPerformed
        symptomsSelected[1] = Vomiting_Checkbox.isEnabled();
        symptomName[1] = Vomiting_Checkbox.getText();
        if (symptomsSelected[1]) {
            diseaseWeight[1] = 20;
        } else {
            diseaseWeight[1] = 0;
        }
    }//GEN-LAST:event_Vomiting_CheckboxActionPerformed

    private void Coughing_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Coughing_CheckboxActionPerformed
        symptomsSelected[2] = Coughing_Checkbox.isEnabled();
        symptomName[2] = Coughing_Checkbox.getText();
        if (symptomsSelected[2]) {
            diseaseWeight[2] = 30;
        } else {
            diseaseWeight[2] = 0;
        }
    }//GEN-LAST:event_Coughing_CheckboxActionPerformed

    private void Dehydration_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dehydration_CheckboxActionPerformed
        symptomsSelected[3] = Dehydration_Checkbox.isEnabled();
        symptomName[3] = Dehydration_Checkbox.getText();
        if (symptomsSelected[3]) {
            diseaseWeight[3] = 40;
        } else {
            diseaseWeight[3] = 0;
        }
    }//GEN-LAST:event_Dehydration_CheckboxActionPerformed

    private void MusclePain_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusclePain_CheckboxActionPerformed
        symptomsSelected[4] = MusclePain_Checkbox.isEnabled();
        symptomName[4] = MusclePain_Checkbox.getText();
        if (symptomsSelected[4]) {
            diseaseWeight[4] = 50;
        } else {
            diseaseWeight[4] = 0;
        }
    }//GEN-LAST:event_MusclePain_CheckboxActionPerformed

    private void Appetite_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Appetite_CheckboxActionPerformed
        symptomsSelected[5] = Appetite_Checkbox.isEnabled();
        symptomName[5] = Appetite_Checkbox.getText();
        if (symptomsSelected[5]) {
            diseaseWeight[5] = 60;
        } else {
            diseaseWeight[5] = 0;
        }
    }//GEN-LAST:event_Appetite_CheckboxActionPerformed

    private void Rashes_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rashes_CheckboxActionPerformed
        symptomsSelected[6] = Rashes_Checkbox.isEnabled();
        symptomName[6] = Rashes_Checkbox.getText();
        if (symptomsSelected[6]) {
            diseaseWeight[6] = 70;
        } else {
            diseaseWeight[6] = 0;
        }
    }//GEN-LAST:event_Rashes_CheckboxActionPerformed

    private void ChestPain_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChestPain_CheckboxActionPerformed
        symptomsSelected[7] = ChestPain_Checkbox.isEnabled();
        symptomName[7] = ChestPain_Checkbox.getText();
        if (symptomsSelected[7]) {
            diseaseWeight[7] = 80;
        } else {
            diseaseWeight[7] = 0;
        }
    }//GEN-LAST:event_ChestPain_CheckboxActionPerformed

    private void Constipation_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Constipation_CheckboxActionPerformed
        symptomsSelected[8] = Constipation_Checkbox.isEnabled();
        symptomName[8] = Constipation_Checkbox.getText();
        if (symptomsSelected[8]) {
            diseaseWeight[8] = 90;
        } else {
            diseaseWeight[8] = 0;
        }
    }//GEN-LAST:event_Constipation_CheckboxActionPerformed

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
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prediction(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Appetite_Checkbox;
    private javax.swing.JLabel Back_Label;
    private javax.swing.JCheckBox ChestPain_Checkbox;
    private javax.swing.JCheckBox Constipation_Checkbox;
    private javax.swing.JCheckBox Coughing_Checkbox;
    private javax.swing.JCheckBox Dehydration_Checkbox;
    private javax.swing.JLabel Img_Label;
    private javax.swing.JCheckBox MusclePain_Checkbox;
    private javax.swing.JLabel Predict_Label;
    private javax.swing.JCheckBox Rashes_Checkbox;
    private javax.swing.JCheckBox Vomiting_Checkbox;
    private javax.swing.JCheckBox WaterMotion_Checkbox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
