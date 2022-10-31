/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalAdmin;

import Classes.BookingArray;
import Classes.CommunityArray;
import Classes.EncounterArray;
import Classes.Hospital;
import Classes.HospitalArray;
import Classes.PersonArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vishwashah
 */
public class HospitalDirectory extends javax.swing.JPanel {

    /**
     * Creates new form HospitalDirectory
     */
    PersonArray person;
    HospitalArray hospital;
    CommunityArray community;
    BookingArray booking;
    EncounterArray encounter;
    
    public HospitalDirectory(PersonArray person, HospitalArray hospital, CommunityArray community, BookingArray booking, EncounterArray encounter) {
        initComponents();
        
        this.person = person;
        this.hospital = hospital;
        this.community = community;
        this.booking = booking;
        this.encounter = encounter;
        
        addCommuniy();
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
        ViewButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        SearchInput = new javax.swing.JTextField();
        IdLbl = new javax.swing.JLabel();
        CityInput = new javax.swing.JTextField();
        CommunityInput = new javax.swing.JComboBox<>();
        NameLbl = new javax.swing.JLabel();
        CommunityLbl = new javax.swing.JLabel();
        CityLbl = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        IdInput = new javax.swing.JTextField();

        Table.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Table.setForeground(new java.awt.Color(51, 51, 51));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Community", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableScroll.setViewportView(Table);

        ViewButton.setBackground(new java.awt.Color(21, 126, 140));
        ViewButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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

        UpdateButton.setBackground(new java.awt.Color(21, 126, 140));
        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("UPDATE");
        UpdateButton.setMaximumSize(new java.awt.Dimension(120, 50));
        UpdateButton.setMinimumSize(new java.awt.Dimension(120, 50));
        UpdateButton.setPreferredSize(new java.awt.Dimension(200, 60));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(21, 126, 140));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.setMaximumSize(new java.awt.Dimension(120, 50));
        DeleteButton.setMinimumSize(new java.awt.Dimension(120, 50));
        DeleteButton.setPreferredSize(new java.awt.Dimension(200, 60));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(21, 126, 140));
        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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

        SearchInput.setBackground(new java.awt.Color(238, 238, 238));
        SearchInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        SearchInput.setForeground(new java.awt.Color(51, 51, 51));
        SearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInputActionPerformed(evt);
            }
        });
        SearchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchInputKeyReleased(evt);
            }
        });

        IdLbl.setBackground(new java.awt.Color(255, 255, 255));
        IdLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        IdLbl.setText("ID:");
        IdLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        CityInput.setBackground(new java.awt.Color(238, 238, 238));
        CityInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CityInput.setForeground(new java.awt.Color(51, 51, 51));
        CityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityInputActionPerformed(evt);
            }
        });

        CommunityInput.setBackground(new java.awt.Color(238, 238, 238));
        CommunityInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CommunityInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Community" }));
        CommunityInput.setPreferredSize(new java.awt.Dimension(64, 23));
        CommunityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityInputActionPerformed(evt);
            }
        });

        NameLbl.setBackground(new java.awt.Color(255, 255, 255));
        NameLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        NameLbl.setText("Name:");
        NameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        CommunityLbl.setBackground(new java.awt.Color(255, 255, 255));
        CommunityLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        CommunityLbl.setText("Community:");
        CommunityLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        CityLbl.setBackground(new java.awt.Color(255, 255, 255));
        CityLbl.setFont(new java.awt.Font("Symbol", 0, 14)); // NOI18N
        CityLbl.setText("City:");
        CityLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        NameInput.setBackground(new java.awt.Color(238, 238, 238));
        NameInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        NameInput.setForeground(new java.awt.Color(51, 51, 51));
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        IdInput.setBackground(new java.awt.Color(238, 238, 238));
        IdInput.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        IdInput.setForeground(new java.awt.Color(51, 51, 51));
        IdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameLbl)
                                            .addComponent(IdLbl)
                                            .addComponent(CommunityLbl)
                                            .addComponent(CityLbl))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CommunityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(NameInput, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IdInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameLbl))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IdLbl))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CommunityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CommunityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CityLbl)
                        .addComponent(CityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(169, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = Table.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showInputDialog(this,"Please select a row to view");
            return;
        }

        DefaultTableModel Model = (DefaultTableModel)Table.getModel();
        Hospital h = (Hospital) Model.getValueAt(selectedRowIndex,0);

        NameInput.setText(h.getHospitalName());
        IdInput.setText(String.valueOf(h.getHosID()));
        IdInput.setEnabled(false);
        CommunityInput.setSelectedItem(h.getHospitalCommunity());
        CityInput.setText(h.getHospitalCity());
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        int i = Table.getSelectedRow();
        DefaultTableModel Model = (DefaultTableModel)Table.getModel();

        if(i >= 0) {
            Model.setValueAt(NameInput.getText(),i,0);
            Model.setValueAt(IdInput.getText(), i,1);
            Model.setValueAt(CommunityInput.getSelectedItem(), i,2);
            Model.setValueAt(CityInput.getText(), i,3);
            JOptionPane.showMessageDialog(null, "Record Updated");
        }
        else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = Table.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showInputDialog(this,"Please select a row to delete");
            return;
        }

        DefaultTableModel Model = (DefaultTableModel)Table.getModel();
        Hospital selectedPerson = (Hospital) Model.getValueAt(selectedRowIndex,0);

        hospital.deleteEmployee(selectedPerson);
        JOptionPane.showMessageDialog(null, "Record Deleted");

        ArrangeTable();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchInputActionPerformed

    private void SearchInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchInputKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<DefaultTableModel>(model);
        Table.setRowSorter(sort);
        sort.setRowFilter(RowFilter.regexFilter(SearchInput.getText().trim()));
    }//GEN-LAST:event_SearchInputKeyReleased

    private void CityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityInputActionPerformed

    private void CommunityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommunityInputActionPerformed

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void IdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityInput;
    private javax.swing.JLabel CityLbl;
    private javax.swing.JComboBox<String> CommunityInput;
    private javax.swing.JLabel CommunityLbl;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField IdInput;
    private javax.swing.JLabel IdLbl;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchInput;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane TableScroll;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    // End of variables declaration//GEN-END:variables

private void addCommuniy() {
        String filePath = "/Users/vishwashah/Downloads/Assignment2/files/Community.csv";
       
        try (Scanner sc = new Scanner(new File(filePath))) {
            sc.useDelimiter("[,\n]");
            String[] temp = new String[3];
            while (sc.hasNext()) {
                for(int i = 0; i < temp.length; i++) {
                    temp[i] = sc.next();
                }
                CommunityInput.addItem(temp[1]);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private void ArrangeTable() {
        
        DefaultTableModel Model = (DefaultTableModel)Table.getModel();
        Model.setRowCount(0);
        
        for(Hospital h:hospital.getHospital()) {
            System.out.println(h.getHosID());
            Object[] row = new Object[4];
            row[0] = h;
            row[1]=h.getHosID();
           // row[1] = h.getHosId();
            row[2] = h.getHospitalCommunity();
            row[3] = h.getHospitalCity();
            
            Model.addRow(row);
        }
    }}