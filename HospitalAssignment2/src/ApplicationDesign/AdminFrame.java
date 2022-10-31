/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ApplicationDesign;

import Classes.BookingArray;
import Classes.CommunityArray;
import Classes.EncounterArray;
import Classes.HospitalArray;
import Classes.PersonArray;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

/**
 *
 * @author vishwashah
 */
public class AdminFrame extends javax.swing.JFrame {

   
    
    public static AdminFrame Instance;
    public JSplitPane tmpMainSplit;
    public JLabel tmpLogInText;
    public JButton tmpLogInButton;

    /**
     * Creates new form AdminFrame
     */
    PersonArray person;
    HospitalArray hospital;
    CommunityArray community;
    BookingArray booking;
    EncounterArray encounter;
    
    public AdminFrame() {
        initComponents();
        Instance = this;
        tmpMainSplit = MainSplit;
        tmpLogInText = LogInText;
        tmpLogInButton = LogInButton;
        
        person = new PersonArray();
        hospital = new HospitalArray();
        community = new CommunityArray();
        booking = new BookingArray();
        encounter = new EncounterArray();
        
        person.setValues();
        hospital.setValues();
        community.setValues();
        booking.setValues();
        encounter.setValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainSplit = new javax.swing.JSplitPane();
        AdminArea = new javax.swing.JPanel();
        LogInButton = new javax.swing.JButton();
        LogInText = new javax.swing.JLabel();
        WorkArea = new javax.swing.JPanel();
        WorkAreaSplit = new javax.swing.JSplitPane();
        ButtonsArea = new javax.swing.JPanel();
        ActionsArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainSplit.setBackground(new java.awt.Color(139, 14, 14));
        MainSplit.setDividerLocation(180);
        MainSplit.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        MainSplit.setPreferredSize(new java.awt.Dimension(800, 1000));

        AdminArea.setBackground(new java.awt.Color(255, 255, 255));
        AdminArea.setPreferredSize(new java.awt.Dimension(1200, 200));

        LogInButton.setBackground(new java.awt.Color(0, 153, 153));
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Log In");
        LogInButton.setMaximumSize(new java.awt.Dimension(120, 50));
        LogInButton.setMinimumSize(new java.awt.Dimension(120, 50));
        LogInButton.setPreferredSize(new java.awt.Dimension(200, 60));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        LogInText.setFont(new java.awt.Font("Kokonor", 0, 36)); // NOI18N
        LogInText.setForeground(new java.awt.Color(51, 51, 51));
        LogInText.setText("Hospital Management System");

        javax.swing.GroupLayout AdminAreaLayout = new javax.swing.GroupLayout(AdminArea);
        AdminArea.setLayout(AdminAreaLayout);
        AdminAreaLayout.setHorizontalGroup(
            AdminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAreaLayout.createSequentialGroup()
                .addContainerGap(641, Short.MAX_VALUE)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(AdminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminAreaLayout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(LogInText)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        AdminAreaLayout.setVerticalGroup(
            AdminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminAreaLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(AdminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminAreaLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(LogInText)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        MainSplit.setTopComponent(AdminArea);

        WorkArea.setBackground(new java.awt.Color(255, 255, 255));
        WorkArea.setPreferredSize(new java.awt.Dimension(1200, 795));

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
            .addGap(0, 815, Short.MAX_VALUE)
        );

        WorkAreaSplit.setLeftComponent(ButtonsArea);

        ActionsArea.setBackground(new java.awt.Color(255, 255, 255));
        ActionsArea.setPreferredSize(new java.awt.Dimension(995, 795));

        javax.swing.GroupLayout ActionsAreaLayout = new javax.swing.GroupLayout(ActionsArea);
        ActionsArea.setLayout(ActionsAreaLayout);
        ActionsAreaLayout.setHorizontalGroup(
            ActionsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        ActionsAreaLayout.setVerticalGroup(
            ActionsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );

        WorkAreaSplit.setRightComponent(ActionsArea);

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkAreaSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkAreaSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );

        MainSplit.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
        if(LogInButton.getText().equals("Log In")) {
            LogIn loginframe = new LogIn(person, hospital, community, booking, encounter);
            loginframe.setVisible(true);
        } else {
            LogOut originalScreen = new LogOut(person, hospital, community, booking, encounter);
            MainSplit.setBottomComponent(originalScreen);

            LogInText.setText("Log in to your account");
            LogInButton.setText("Log In");
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionsArea;
    private javax.swing.JPanel AdminArea;
    private javax.swing.JPanel ButtonsArea;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LogInText;
    private javax.swing.JSplitPane MainSplit;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JSplitPane WorkAreaSplit;
    // End of variables declaration//GEN-END:variables
}
