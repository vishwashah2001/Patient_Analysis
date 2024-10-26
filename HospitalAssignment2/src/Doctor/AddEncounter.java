/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Doctor;

import ApplicationDesign.LogIn;
import Classes.Booking;
import Classes.BookingArray;
import Classes.CommunityArray;
import Classes.Encounter;
import Classes.EncounterArray;
import Classes.HospitalArray;
import Classes.Person;
import Classes.PersonArray;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishwashah
 */
public class AddEncounter extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounter
     */
    PersonArray person;
    HospitalArray hospital;
    CommunityArray community;
    BookingArray booking;
    EncounterArray encounter;
    
    public AddEncounter(PersonArray person, HospitalArray hospital, CommunityArray community, BookingArray booking, EncounterArray encounter) {
        initComponents();
        
        this.person = person;
        this.hospital = hospital;
        this.community = community;
        this.booking = booking;
        this.encounter = encounter;
        
        ArrangeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TableScroll = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        NameInput = new javax.swing.JTextField();
        NameLbl = new javax.swing.JLabel();
        IdLbl = new javax.swing.JLabel();
        IdInput = new javax.swing.JTextField();
        BldPrsLbl = new javax.swing.JLabel();
        BldPrsInput = new javax.swing.JTextField();
        ResRtLbl = new javax.swing.JLabel();
        ResRtInput = new javax.swing.JTextField();
        HrtRtLbl = new javax.swing.JLabel();
        HrtRtInput = new javax.swing.JTextField();
        AddSignButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        SearchInput = new javax.swing.JTextField();
        Desciption = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();

        Table.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 102, 102));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableScroll.setViewportView(Table);

        NameInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        NameInput.setForeground(new java.awt.Color(51, 51, 51));
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        NameLbl.setBackground(new java.awt.Color(255, 255, 255));
        NameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(102, 102, 102));
        NameLbl.setText("Name:");
        NameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        IdLbl.setBackground(new java.awt.Color(255, 255, 255));
        IdLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IdLbl.setForeground(new java.awt.Color(102, 102, 102));
        IdLbl.setText("ID:");
        IdLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        IdInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        IdInput.setForeground(new java.awt.Color(51, 51, 51));
        IdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputActionPerformed(evt);
            }
        });

        BldPrsLbl.setBackground(new java.awt.Color(255, 255, 255));
        BldPrsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BldPrsLbl.setForeground(new java.awt.Color(102, 102, 102));
        BldPrsLbl.setText("Blood Presure:");
        BldPrsLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        BldPrsInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BldPrsInput.setForeground(new java.awt.Color(51, 51, 51));
        BldPrsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BldPrsInputActionPerformed(evt);
            }
        });

        ResRtLbl.setBackground(new java.awt.Color(255, 255, 255));
        ResRtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResRtLbl.setForeground(new java.awt.Color(102, 102, 102));
        ResRtLbl.setText("Respiratory Rate:");
        ResRtLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ResRtInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ResRtInput.setForeground(new java.awt.Color(51, 51, 51));
        ResRtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResRtInputActionPerformed(evt);
            }
        });

        HrtRtLbl.setBackground(new java.awt.Color(255, 255, 255));
        HrtRtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HrtRtLbl.setForeground(new java.awt.Color(102, 102, 102));
        HrtRtLbl.setText("Heart Rate:");
        HrtRtLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        HrtRtInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        HrtRtInput.setForeground(new java.awt.Color(51, 51, 51));
        HrtRtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HrtRtInputActionPerformed(evt);
            }
        });

        AddSignButton.setBackground(new java.awt.Color(0, 102, 102));
        AddSignButton.setFont(new java.awt.Font("Symbol", 1, 13)); // NOI18N
        AddSignButton.setForeground(new java.awt.Color(255, 255, 255));
        AddSignButton.setText("ADD SIGN");
        AddSignButton.setMaximumSize(new java.awt.Dimension(120, 50));
        AddSignButton.setMinimumSize(new java.awt.Dimension(120, 50));
        AddSignButton.setPreferredSize(new java.awt.Dimension(200, 60));
        AddSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSignButtonActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(0, 102, 102));
        SearchButton.setFont(new java.awt.Font("Symbol", 1, 13)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchButton.setText("SEARCH");
        SearchButton.setMaximumSize(new java.awt.Dimension(120, 50));
        SearchButton.setMinimumSize(new java.awt.Dimension(120, 50));
        SearchButton.setPreferredSize(new java.awt.Dimension(200, 60));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        SearchInput.setForeground(new java.awt.Color(51, 51, 51));
        SearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInputActionPerformed(evt);
            }
        });

        Desciption.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        Desciption.setForeground(new java.awt.Color(0, 102, 102));
        Desciption.setText("Information about Vital Signs");

        ViewButton.setBackground(new java.awt.Color(0, 102, 102));
        ViewButton.setFont(new java.awt.Font("Symbol", 1, 13)); // NOI18N
        ViewButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewButton.setText("VIEW");
        ViewButton.setMaximumSize(new java.awt.Dimension(120, 50));
        ViewButton.setMinimumSize(new java.awt.Dimension(120, 50));
        ViewButton.setPreferredSize(new java.awt.Dimension(200, 60));
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TableScroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(Desciption)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameLbl)
                                            .addComponent(IdLbl)
                                            .addComponent(BldPrsLbl)
                                            .addComponent(HrtRtLbl))
                                        .addGap(17, 17, 17))
                                    .addComponent(ResRtLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResRtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HrtRtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NameInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                        .addComponent(IdInput, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(BldPrsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(AddSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchInput)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdLbl)
                    .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Desciption, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResRtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResRtLbl))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HrtRtLbl)
                    .addComponent(HrtRtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BldPrsLbl)
                    .addComponent(BldPrsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(AddSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void IdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputActionPerformed

    private void BldPrsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BldPrsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BldPrsInputActionPerformed

    private void ResRtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResRtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResRtInputActionPerformed

    private void HrtRtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HrtRtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HrtRtInputActionPerformed

    private void AddSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSignButtonActionPerformed
        // TODO add your handling code here:
         int docId = 0;
        String tempUser = LogIn.Instance.tmpLogInUsernameInput.getText();
        for(Person p:person.getPerson()) {
            if(p.getPersonEmail().equals(tempUser)) {
                docId = p.getPersonID();
            }
        }
        
        int hosId = 0;
        int tempId = Integer.parseInt(IdInput.getText());     
        for(Booking b:booking.getBooking()) {
            if(tempId == b.getPatientID() && docId == b.getDocID()) {
                hosId = b.getHosID();
            }
        }
        
        int patId = Integer.parseInt(IdInput.getText());
        int blPre = Integer.parseInt(BldPrsInput.getText());
        int hrtRt = Integer.parseInt(HrtRtInput.getText());
        int respRt = Integer.parseInt(ResRtInput.getText());
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
           
        Encounter e = encounter.addNewEncounter();
        e.setDate(dtf.format(now));
        e.setPatientID(patId);
        e.setDocID(docId);
        e.setHosID(hosId);
        e.setBloodPres(blPre);
        e.setHeartRate(hrtRt);
        e.setRespiRate(respRt);
        
        JOptionPane.showMessageDialog(null, "Encounter Created");
    }//GEN-LAST:event_AddSignButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchInputActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = Table.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showInputDialog(this,"Please select a row to view");
            return;
        }

        DefaultTableModel Model = (DefaultTableModel)Table.getModel();

        String tempUser = LogIn.Instance.tmpLogInUsernameInput.getText();

        NameInput.setText((String) Model.getValueAt(selectedRowIndex,1));
        NameInput.setEnabled(false);

        int id1 = (int) Model.getValueAt(selectedRowIndex,0);
        IdInput.setText(String.valueOf(id1));
        IdInput.setEnabled(false);
    }//GEN-LAST:event_ViewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSignButton;
    private javax.swing.JTextField BldPrsInput;
    private javax.swing.JLabel BldPrsLbl;
    private javax.swing.JLabel Desciption;
    private javax.swing.JTextField HrtRtInput;
    private javax.swing.JLabel HrtRtLbl;
    private javax.swing.JTextField IdInput;
    private javax.swing.JLabel IdLbl;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField ResRtInput;
    private javax.swing.JLabel ResRtLbl;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchInput;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane TableScroll;
    private javax.swing.JButton ViewButton;
    // End of variables declaration//GEN-END:variables
 private void ArrangeTable() {
        
        DefaultTableModel Model = (DefaultTableModel)Table.getModel();
        Model.setRowCount(0);
        
        int tempPId = 0;
        int tempDId = 0;
        String tempUser = LogIn.Instance.tmpLogInUsernameInput.getText(); //"yenbowen@koku.org";
        for(Person p:person.getPerson()) {
            if(p.getPersonEmail().equals(tempUser)) {
                tempDId = p.getPersonID();
            }
        }
        
        for(Booking b:booking.getBooking()) {
            if(b.getDocID() == tempDId) {
                tempPId = b.getPatientID();
            }
        }
        
        for(Person p:person.getPerson()) {
            if(p.getPersonID() == tempPId) {
                Object[] row = new Object[3];
                row[0] = p.getPersonID();
                row[1] = p.getPersonName();
                row[2] = p.getCommunity();
                
                Model.addRow(row);
            }
        }
    }
}
