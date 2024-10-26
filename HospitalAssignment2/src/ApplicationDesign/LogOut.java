/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ApplicationDesign;

import Classes.BookingArray;
import Classes.CommunityArray;
import Classes.EncounterArray;
import Classes.HospitalArray;
import Classes.PersonArray;

/**
 *
 * @author vishwashah
 */
public class LogOut extends javax.swing.JPanel {

    PersonArray person;
    HospitalArray hospital;
    CommunityArray community;
    BookingArray booking;
    EncounterArray encounter;
    
    public LogOut(PersonArray person, HospitalArray hospital, CommunityArray community, BookingArray booking, EncounterArray encounter) {
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

        WorkAreaSplit = new javax.swing.JSplitPane();
        ButtonsArea = new javax.swing.JPanel();
        ActionsArea = new javax.swing.JPanel();

        WorkAreaSplit.setBackground(new java.awt.Color(139, 14, 14));
        WorkAreaSplit.setDividerLocation(200);

        ButtonsArea.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsArea.setPreferredSize(new java.awt.Dimension(200, 795));

        javax.swing.GroupLayout ButtonsAreaLayout = new javax.swing.GroupLayout(ButtonsArea);
        ButtonsArea.setLayout(ButtonsAreaLayout);
        ButtonsAreaLayout.setHorizontalGroup(
            ButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        ButtonsAreaLayout.setVerticalGroup(
            ButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        WorkAreaSplit.setLeftComponent(ButtonsArea);

        ActionsArea.setBackground(new java.awt.Color(255, 255, 255));
        ActionsArea.setPreferredSize(new java.awt.Dimension(995, 795));

        javax.swing.GroupLayout ActionsAreaLayout = new javax.swing.GroupLayout(ActionsArea);
        ActionsArea.setLayout(ActionsAreaLayout);
        ActionsAreaLayout.setHorizontalGroup(
            ActionsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        ActionsAreaLayout.setVerticalGroup(
            ActionsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        WorkAreaSplit.setRightComponent(ActionsArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkAreaSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkAreaSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionsArea;
    private javax.swing.JPanel ButtonsArea;
    private javax.swing.JSplitPane WorkAreaSplit;
    // End of variables declaration//GEN-END:variables
}
