/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.design;

import database.DoctorDatabase;
import javax.swing.JPanel;
import model.DoctorModel;

/**
 *
 * @author SayefReyadh
 */
public class DoctorFrame extends javax.swing.JFrame {

    private DoctorModel doctorModel;
    private DoctorDatabase doctorDatabase;
    /**
     * Creates new form Login
     */
    public DoctorFrame() {
        initComponents();
        addPanelToDoctorTaskPanel(appointmentPanel);
    }
    
    public DoctorFrame(int doctorId) {
        initComponents();
        addPanelToDoctorTaskPanel(appointmentPanel);
        
        doctorDatabase = new DoctorDatabase();
        doctorModel = doctorDatabase.getDoctorInformation(doctorId);
        
        doctorModel.setAppointmentList(doctorDatabase.getAppointmentModels());
        ///set this arraylist to the appointment table
        //appointmentTable
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorWorkStationPanel = new javax.swing.JPanel();
        doctorTaskButtonPanel = new javax.swing.JPanel();
        viewPatientButton = new javax.swing.JButton();
        viewAppointmentButton = new javax.swing.JButton();
        doctorTaskPanel = new javax.swing.JPanel();
        patientInformationPanel = new javax.swing.JPanel();
        titlePatientLabel = new javax.swing.JLabel();
        patientReportsButton = new javax.swing.JButton();
        patientNameLabel = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        patientGenderLabel = new javax.swing.JLabel();
        patientContactLabel = new javax.swing.JLabel();
        patientContactTextField = new javax.swing.JTextField();
        patientIdLabel = new javax.swing.JLabel();
        patientIdTextField = new javax.swing.JTextField();
        patientAgeLabel = new javax.swing.JLabel();
        patientAgeTextField = new javax.swing.JTextField();
        patientAddressLabel = new javax.swing.JLabel();
        patientAddressScrollPane = new javax.swing.JScrollPane();
        patientAddressTextArea = new javax.swing.JTextArea();
        patientAgeTextField1 = new javax.swing.JTextField();
        patientReportsPanel = new javax.swing.JPanel();
        titleReportsLabel = new javax.swing.JLabel();
        patientNameReportsLabel = new javax.swing.JLabel();
        reportsScrollPane = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        appointmentPanel = new javax.swing.JPanel();
        titleAppointmentLabel = new javax.swing.JLabel();
        appointmentScrollPane = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        searchDateLabel = new javax.swing.JLabel();
        searchDateTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        patientListPanel = new javax.swing.JPanel();
        titlePatientListLabel = new javax.swing.JLabel();
        patientListScrollPane = new javax.swing.JScrollPane();
        patientListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(200, 50, 1000, 700));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 20));
        setResizable(false);

        doctorWorkStationPanel.setBackground(new java.awt.Color(0, 204, 204));
        doctorWorkStationPanel.setForeground(new java.awt.Color(255, 255, 255));
        doctorWorkStationPanel.setLayout(new javax.swing.BoxLayout(doctorWorkStationPanel, javax.swing.BoxLayout.LINE_AXIS));

        doctorTaskButtonPanel.setLayout(new java.awt.GridLayout(4, 1));

        viewPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewPatientButton.setText("View Patients");
        viewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientButtonActionPerformed(evt);
            }
        });
        doctorTaskButtonPanel.add(viewPatientButton);

        viewAppointmentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewAppointmentButton.setText("View Appointment");
        viewAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentButtonActionPerformed(evt);
            }
        });
        doctorTaskButtonPanel.add(viewAppointmentButton);

        doctorWorkStationPanel.add(doctorTaskButtonPanel);

        doctorTaskPanel.setBackground(new java.awt.Color(255, 204, 51));
        doctorTaskPanel.setMaximumSize(new java.awt.Dimension(821, 644));
        doctorTaskPanel.setLayout(new java.awt.CardLayout());

        patientInformationPanel.setBackground(new java.awt.Color(204, 102, 0));
        patientInformationPanel.setMaximumSize(new java.awt.Dimension(821, 644));
        patientInformationPanel.setPreferredSize(new java.awt.Dimension(821, 644));

        titlePatientLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titlePatientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePatientLabel.setText("Patient Information");

        patientReportsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientReportsButton.setText("Patient Reports");

        patientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientNameLabel.setText("Patient Name");

        patientNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientNameTextField.setEnabled(false);

        patientGenderLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientGenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientGenderLabel.setText("Patient Gender");

        patientContactLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientContactLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientContactLabel.setText("Patient Contact");

        patientContactTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientContactTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientContactTextField.setEnabled(false);

        patientIdLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientIdLabel.setText("Patient ID");

        patientIdTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientIdTextField.setEnabled(false);

        patientAgeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientAgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientAgeLabel.setText("Patient Age");

        patientAgeTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientAgeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientAgeTextField.setEnabled(false);

        patientAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientAddressLabel.setText("Patient Address");

        patientAddressTextArea.setColumns(20);
        patientAddressTextArea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientAddressTextArea.setRows(5);
        patientAddressTextArea.setEnabled(false);
        patientAddressScrollPane.setViewportView(patientAddressTextArea);

        patientAgeTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientAgeTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientAgeTextField1.setEnabled(false);

        javax.swing.GroupLayout patientInformationPanelLayout = new javax.swing.GroupLayout(patientInformationPanel);
        patientInformationPanel.setLayout(patientInformationPanelLayout);
        patientInformationPanelLayout.setHorizontalGroup(
            patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientInformationPanelLayout.createSequentialGroup()
                .addComponent(titlePatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(patientInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientNameTextField))
                    .addComponent(patientReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientAgeTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patientAgeTextField))
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientContactTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientIdTextField))
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientAddressScrollPane)))
                .addContainerGap())
        );
        patientInformationPanelLayout.setVerticalGroup(
            patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientInformationPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titlePatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientGenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientAgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(patientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patientAgeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientContactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(patientContactTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(patientInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(patientReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        doctorTaskPanel.add(patientInformationPanel, "card2");

        patientReportsPanel.setBackground(new java.awt.Color(0, 153, 153));
        patientReportsPanel.setMaximumSize(new java.awt.Dimension(821, 644));

        titleReportsLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleReportsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleReportsLabel.setText("Reports");

        patientNameReportsLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        patientNameReportsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientNameReportsLabel.setText("Reports");

        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        reportsScrollPane.setViewportView(reportsTable);

        javax.swing.GroupLayout patientReportsPanelLayout = new javax.swing.GroupLayout(patientReportsPanel);
        patientReportsPanel.setLayout(patientReportsPanelLayout);
        patientReportsPanelLayout.setHorizontalGroup(
            patientReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientReportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleReportsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(patientReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientReportsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(patientNameReportsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        patientReportsPanelLayout.setVerticalGroup(
            patientReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientReportsPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(titleReportsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(patientReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientReportsPanelLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(patientNameReportsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );

        doctorTaskPanel.add(patientReportsPanel, "card4");

        appointmentPanel.setBackground(new java.awt.Color(255, 255, 0));
        appointmentPanel.setMaximumSize(new java.awt.Dimension(821, 644));

        titleAppointmentLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleAppointmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleAppointmentLabel.setText("Appointment");

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        appointmentScrollPane.setViewportView(appointmentTable);

        searchDateLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchDateLabel.setText("Date");

        searchDateTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchDateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchDateTextField.setText("Default All");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appointmentPanelLayout = new javax.swing.GroupLayout(appointmentPanel);
        appointmentPanel.setLayout(appointmentPanelLayout);
        appointmentPanelLayout.setHorizontalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleAppointmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentScrollPane)
                    .addGroup(appointmentPanelLayout.createSequentialGroup()
                        .addComponent(searchDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        appointmentPanelLayout.setVerticalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addComponent(titleAppointmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appointmentPanelLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appointmentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        doctorTaskPanel.add(appointmentPanel, "card5");

        patientListPanel.setBackground(new java.awt.Color(255, 255, 0));
        patientListPanel.setMaximumSize(new java.awt.Dimension(821, 644));

        titlePatientListLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titlePatientListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePatientListLabel.setText("Patient List");

        patientListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        patientListScrollPane.setViewportView(patientListTable);

        javax.swing.GroupLayout patientListPanelLayout = new javax.swing.GroupLayout(patientListPanel);
        patientListPanel.setLayout(patientListPanelLayout);
        patientListPanelLayout.setHorizontalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePatientListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientListScrollPane)
                .addContainerGap())
        );
        patientListPanelLayout.setVerticalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addComponent(titlePatientListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(patientListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        doctorTaskPanel.add(patientListPanel, "card5");

        doctorWorkStationPanel.add(doctorTaskPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorWorkStationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorWorkStationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientButtonActionPerformed
        // TODO add your handling code here:
        addPanelToDoctorTaskPanel(patientListPanel);
        doctorModel.setPatientList(doctorDatabase.getPatientsList());
        ///set this arraylist to the patientlist table
        //patientsTable
        //might have to repaint again
        
    }//GEN-LAST:event_viewPatientButtonActionPerformed

    private void viewAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentButtonActionPerformed
        // TODO add your handling code here:
        
        addPanelToDoctorTaskPanel(appointmentPanel);
        doctorModel.setAppointmentList(doctorDatabase.getAppointmentModels());
        ///set this arraylist to the appointment table
        //appointmentTable
        //might have to repaint again
        
    }//GEN-LAST:event_viewAppointmentButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
        String date = "2017-05-01"; //get the date from searchDateTextField
        doctorDatabase.getAppointmentModels(date);
        doctorModel.setAppointmentList(doctorDatabase.getAppointmentModels());
        ///set this arraylist to the appointment table
        //appointmentTable
        
    }//GEN-LAST:event_searchButtonActionPerformed
    
    public void addPanelToDoctorTaskPanel(JPanel panel)
    {
        doctorTaskPanel.removeAll();
        doctorTaskPanel.add(panel);
        doctorTaskPanel.repaint();
        doctorTaskPanel.revalidate();
    }
    
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
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentPanel;
    private javax.swing.JScrollPane appointmentScrollPane;
    private javax.swing.JTable appointmentTable;
    private javax.swing.JPanel doctorTaskButtonPanel;
    private javax.swing.JPanel doctorTaskPanel;
    private javax.swing.JPanel doctorWorkStationPanel;
    private javax.swing.JLabel patientAddressLabel;
    private javax.swing.JScrollPane patientAddressScrollPane;
    private javax.swing.JTextArea patientAddressTextArea;
    private javax.swing.JLabel patientAgeLabel;
    private javax.swing.JTextField patientAgeTextField;
    private javax.swing.JTextField patientAgeTextField1;
    private javax.swing.JLabel patientContactLabel;
    private javax.swing.JTextField patientContactTextField;
    private javax.swing.JLabel patientGenderLabel;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JPanel patientInformationPanel;
    private javax.swing.JPanel patientListPanel;
    private javax.swing.JScrollPane patientListScrollPane;
    private javax.swing.JTable patientListTable;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JLabel patientNameReportsLabel;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JButton patientReportsButton;
    private javax.swing.JPanel patientReportsPanel;
    private javax.swing.JScrollPane reportsScrollPane;
    private javax.swing.JTable reportsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchDateLabel;
    private javax.swing.JTextField searchDateTextField;
    private javax.swing.JLabel titleAppointmentLabel;
    private javax.swing.JLabel titlePatientLabel;
    private javax.swing.JLabel titlePatientListLabel;
    private javax.swing.JLabel titleReportsLabel;
    private javax.swing.JButton viewAppointmentButton;
    private javax.swing.JButton viewPatientButton;
    // End of variables declaration//GEN-END:variables
}
