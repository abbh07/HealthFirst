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
public class FirstAid1 extends javax.swing.JFrame {

    String user;
    /**
     * Creates new form FirstAid
     */
    public FirstAid1(String user) {
        initComponents();
        this.user = user;
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEditable(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Back_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Img_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/healthcare-banner.jpg"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Stings, Bites, and Allergies:\n\nStinging Insects\nRemove the stinger as soon as possible with a scraping motion using a firm item (such as the edge of a credit card). Put a cold compress on the bite to relieve the pain. If trouble breathing; fainting; swelling of lips, face, or throat; or hives over the entire body occurs, call an emergency number right away.\n\nAnimal or Human Bites\nWash wound well with soap and water. The victim may need a tetanus or rabies shot or antibiotics.\n\nTicks\nUse tweezers or your fingers to grasp as close as possible to the head of the tick and briskly pull the tick away from where it is attached.\n\nSnake Bites\nTake the victim to an emergency department if you are unsure of the type of snake or if you are concerned that the snake may be poisonous. Keep the victim at rest. Do not apply ice. Loosely splint the injured area and keep it at rest, positioned at or slightly below the level of the heart. Identify the snake, if you can do so safely. If you are not able to identify the snake but are able to kill it safely, take it with you to the emergency department for identification.\n\nAllergy\nSwelling, problems breathing, and paleness may be signs of severe allergy. Call an emergency number right away. Some people may have emergency medicine for these times. If possible, ask about emergency medicine they may have and help them administer it if necessary.\n\nFever:\n\nFever is usually caused by infection. It also can be caused by chemicals, poisons, medicines, an environment that is too hot, or an extreme level of overactivity. Take the victims' temperature to see if he has a fever. Most pediatricians consider any thermometer reading above 100.4°F (38°C) as a fever.\n\nCall an emergency number right away if the victim has a fever and:\n- Appears very ill, is unusually drowsy, or is very fussy\n- Has other symptoms such as a stiff neck, a severe headache, severe sore throat, severe ear pain, an     unexplained rash, repeated vomiting or diarrhea, or difficulty breathing\n- Has a condition causing immune suppression (such as sickle cell disease, cancer, or chronic steroid use)\n- Has had a first seizure but is no longer seizing\n- Is younger than 2 months and has a temperature of 100.4°F (38°C) or higher\n- Has been in a very hot place, such as an overheated car\n\nSkin Wounds:\n\nBruises\nApply cool compresses. Call an emergency number if the child has a crush injury, large bruises, continued pain, or swelling. \n\nCuts\nRinse small cuts with water until clean. Use direct pressure with a clean cloth to stop bleeding and hold in place for 1 to 2 minutes. If the cut is not deep, apply an antibiotic ointment, then cover the cut with a clean bandage. Seek emergency care for large or deep cuts, or if the wound is wide open.\n\nScrapes\nRinse with clean, running tap water for at least 5 minutes to remove dirt and germs. Do not use detergents, alcohol, or peroxide. Apply an antibiotic ointment and a bandage that will not stick to the wound.\n\nSplinters\nRemove small splinters with tweezers, then wash until clean. If you cannot remove the splinter completely, call an emergency number.\n\nPuncture Wounds\nDo not remove large objects (such as a knife or stick) from a wound. Call for help (an emergency number). Such objects must be removed by a doctor.\n\nBleeding\nApply pressure with gauze over the bleeding area for 1 to 2 minutes. If still bleeding, add more gauze and apply pressure for another 5 minutes. You can also wrap an elastic bandage firmly over gauze and apply pressure. If bleeding continues, call for help.\n\nBurns and Scalds:\n\nGeneral Treatment\nFirst, stop the burning process by removing the victim from contact with hot water or a hot object (for example, hot iron). If clothing is burning, smother flames. Remove clothing unless it is firmly stuck to the skin. Run cool water over burned skin until the pain stops. Do not apply ice, butter, grease, medicine, or ointment.\n\nBurns With Blisters\nDo not break the blisters. For burns on the face, hands, feet, or genitals, seek emergency care.\n\nLarge or Deep Burns\nCall an emergency number. After stopping and cooling the burn, keep the child warm with a clean sheet covered with a blanket until help arrives.\n\nElectrical Burns\nDisconnect electrical power. If the child is still in contact with an electrical source, do NOT touch the child with bare hands. Pull the child away from the power source with an object that does not conduct electricity (such as a wooden broom handle), only after the power is turned off. ALL electrical burns need to be seen by a doctor.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

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
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Img_Label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(Back_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Img_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_LabelMousePressed
        Index i =new Index(user);
        i.setVisible(true);
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
            java.util.logging.Logger.getLogger(FirstAid1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstAid1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstAid1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstAid1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstAid1(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Label;
    private javax.swing.JLabel Img_Label;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}