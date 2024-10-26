/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CommunityAdmins;

import Classes.BookingArray;
import Classes.Community;
import Classes.CommunityArray;
import Classes.EncounterArray;
import Classes.HospitalArray;
import Classes.PersonArray;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author vishwashah
 */
public class AddCommunity extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunity
     */
     PersonArray person;
    HospitalArray hospital;
    CommunityArray community;
    BookingArray booking;
    EncounterArray encounter;
    
    public AddCommunity(PersonArray person, HospitalArray hospital, CommunityArray community, BookingArray booking, EncounterArray encounter) {
        initComponents();
        
        this.person = person;
        this.hospital = hospital;
        this.community = community;
        this.booking = booking;
        this.encounter = encounter;
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NameLbl = new javax.swing.JLabel();
        IdLbl = new javax.swing.JLabel();
        IdInput = new javax.swing.JTextField();
        NameInput = new javax.swing.JTextField();
        CityLbl = new javax.swing.JLabel();
        CityInput = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        NameLbl.setBackground(new java.awt.Color(255, 255, 255));
        NameLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        NameLbl.setText("Name:");
        NameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        IdLbl.setBackground(new java.awt.Color(255, 255, 255));
        IdLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        IdLbl.setText("ID:");
        IdLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        IdInput.setBackground(new java.awt.Color(238, 238, 238));
        IdInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        IdInput.setForeground(new java.awt.Color(51, 51, 51));
        IdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputActionPerformed(evt);
            }
        });

        NameInput.setBackground(new java.awt.Color(238, 238, 238));
        NameInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        NameInput.setForeground(new java.awt.Color(51, 51, 51));
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        CityLbl.setBackground(new java.awt.Color(255, 255, 255));
        CityLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        CityLbl.setText("City:");
        CityLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        CityInput.setBackground(new java.awt.Color(238, 238, 238));
        CityInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CityInput.setForeground(new java.awt.Color(51, 51, 51));
        CityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityInputActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 153, 153));
        AddButton.setFont(new java.awt.Font("Symbol", 1, 13)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD");
        AddButton.setMaximumSize(new java.awt.Dimension(120, 50));
        AddButton.setMinimumSize(new java.awt.Dimension(120, 50));
        AddButton.setPreferredSize(new java.awt.Dimension(200, 60));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLbl)
                            .addComponent(IdLbl)
                            .addComponent(CityLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CityInput, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(IdInput)
                            .addComponent(NameInput))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLbl))
                .addGap(32, 32, 32)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputActionPerformed

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void CityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityInputActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (IdInput.getText().isEmpty() || NameInput.getText().isEmpty() || CityInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,"Please fill all field");
            } else {
                Community c = community.addNewCommunity();

                c.setCommunityID(Integer.parseInt(IdInput.getText()));
                c.setCommunityName(NameInput.getText());
                c.setCommunityCity(CityInput.getText());

                NameInput.setText(null);
                IdInput.setText(null);
                CityInput.setText(null);

                JOptionPane.showMessageDialog(this,"Record Added");
            }
        } catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Data");
        }
    }//GEN-LAST:event_AddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CityInput;
    private javax.swing.JLabel CityLbl;
    private javax.swing.JTextField IdInput;
    private javax.swing.JLabel IdLbl;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
