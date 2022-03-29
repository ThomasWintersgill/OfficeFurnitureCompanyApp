/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.officefurniturecompany.GUI;

import com.mycompany.officefurniturecompany.Basket;
import com.mycompany.officefurniturecompany.Chair;
import com.mycompany.officefurniturecompany.Table;
import com.mycompany.officefurniturecompany.WoodType;
import com.mycompany.officefurniturecompany.baseType;
import javax.swing.JOptionPane;
import java.util.HashSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author thoma
 */
public class Main extends javax.swing.JFrame {
    private Basket basket = new Basket();
    private HashSet<String> idNumbers = new HashSet();
    private DefaultListModel dm = new DefaultListModel();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        addChairButton = new javax.swing.JButton();
        addTableButton = new javax.swing.JButton();
        addDeskButton = new javax.swing.JButton();
        showSummaryButton = new javax.swing.JButton();
        basketButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        basketPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        basketList = new javax.swing.JList<>();
        deskFormPanel = new javax.swing.JPanel();
        tableFormPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tableIdField = new javax.swing.JFormattedTextField();
        tableTypeOfWoodField = new javax.swing.JComboBox<>();
        tableQuantityField = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tableBaseTypeField = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tableDiameterField = new javax.swing.JFormattedTextField();
        addTabletoBasketBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        chairFormPanel = new javax.swing.JPanel();
        chairPicPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addChairtoBasketBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chairTypeOfWoodField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        armRestsBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        chairQuantityField = new javax.swing.JComboBox<>();
        chairIdField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1208, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 70));

        buttonPanel.setBackground(new java.awt.Color(255, 204, 204));
        buttonPanel.setBorder(new javax.swing.border.MatteBorder(null));

        addChairButton.setText("Add new chair");
        addChairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChairButtonActionPerformed(evt);
            }
        });

        addTableButton.setText("Add new table");
        addTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableButtonActionPerformed(evt);
            }
        });

        addDeskButton.setText("Add new desk");
        addDeskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeskButtonActionPerformed(evt);
            }
        });

        showSummaryButton.setText("Show summmary");
        showSummaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSummaryButtonActionPerformed(evt);
            }
        });

        basketButton.setText("jButton1");
        basketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showSummaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addChairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDeskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(basketButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(addChairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(addDeskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(showSummaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(basketButton)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanel8.add(buttonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 760));

        basketList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        basketList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        basketList.setVisibleRowCount(-1);
        jScrollPane1.setViewportView(basketList);

        javax.swing.GroupLayout basketPanelLayout = new javax.swing.GroupLayout(basketPanel);
        basketPanel.setLayout(basketPanelLayout);
        basketPanelLayout.setHorizontalGroup(
            basketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        basketPanelLayout.setVerticalGroup(
            basketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", basketPanel);

        javax.swing.GroupLayout deskFormPanelLayout = new javax.swing.GroupLayout(deskFormPanel);
        deskFormPanel.setLayout(deskFormPanelLayout);
        deskFormPanelLayout.setHorizontalGroup(
            deskFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        deskFormPanelLayout.setVerticalGroup(
            deskFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", deskFormPanel);

        tableFormPanel.setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setPreferredSize(new java.awt.Dimension(329, 280));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        try {
            tableIdField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tableIdField.setToolTipText("Enter the 4 digit product ID  ");

        tableTypeOfWoodField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OAK", "WALNUT" }));
        tableTypeOfWoodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTypeOfWoodFieldActionPerformed(evt);
            }
        });

        tableQuantityField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel5.setBackground(new java.awt.Color(0, 0, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("ID Number(####):");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Type of wood:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Diameter(CM):");

        tableBaseTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHROME", "WOODEN" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Base Type:");

        tableDiameterField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        addTabletoBasketBtn.setText("Add to basket");
        addTabletoBasketBtn.setToolTipText("Click to add the current item(s) to the basket");
        addTabletoBasketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTabletoBasketBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Quantity:");

        javax.swing.GroupLayout tableFormPanelLayout = new javax.swing.GroupLayout(tableFormPanel);
        tableFormPanel.setLayout(tableFormPanelLayout);
        tableFormPanelLayout.setHorizontalGroup(
            tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableFormPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tableFormPanelLayout.createSequentialGroup()
                        .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tableTypeOfWoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tableFormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tableIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tableBaseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addTabletoBasketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tableDiameterField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tableQuantityField, javax.swing.GroupLayout.Alignment.TRAILING, 0, 148, Short.MAX_VALUE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        tableFormPanelLayout.setVerticalGroup(
            tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableFormPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableFormPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tableTypeOfWoodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tableFormPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableDiameterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(19, 19, 19)
                .addGroup(tableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableBaseTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(addTabletoBasketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("tab4", tableFormPanel);

        chairFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        chairPicPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout chairPicPanelLayout = new javax.swing.GroupLayout(chairPicPanel);
        chairPicPanel.setLayout(chairPicPanelLayout);
        chairPicPanelLayout.setHorizontalGroup(
            chairPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        chairPicPanelLayout.setVerticalGroup(
            chairPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Number(####):");

        addChairtoBasketBtn.setText("Add to basket");
        addChairtoBasketBtn.setToolTipText("Click to add the current item(s) to the basket");
        addChairtoBasketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChairtoBasketBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Type of wood:");

        chairTypeOfWoodField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OAK", "WALNUT" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Armrests");

        armRestsBox.setToolTipText("Check box only if armrests are required");
        armRestsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armRestsBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Quantity:");

        chairQuantityField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        try {
            chairIdField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        chairIdField.setToolTipText("Enter the 4 digit product ID  ");

        javax.swing.GroupLayout chairFormPanelLayout = new javax.swing.GroupLayout(chairFormPanel);
        chairFormPanel.setLayout(chairFormPanelLayout);
        chairFormPanelLayout.setHorizontalGroup(
            chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chairFormPanelLayout.createSequentialGroup()
                .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chairFormPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(addChairtoBasketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chairFormPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chairFormPanelLayout.createSequentialGroup()
                                .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(chairFormPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chairTypeOfWoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(chairFormPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(chairIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chairQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chairPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(chairFormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(armRestsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        chairFormPanelLayout.setVerticalGroup(
            chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chairFormPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(chairPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(chairQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chairIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chairTypeOfWoodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chairFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(armRestsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(addChairtoBasketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("tab2", chairFormPanel);

        jPanel8.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 820, 680));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSummaryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showSummaryButtonActionPerformed

    private void addChairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChairButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_addChairButtonActionPerformed

    private void addChairtoBasketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChairtoBasketBtnActionPerformed
       //this currently works but not if the box is left blank before the first press
        if(!chairIdField.getText().isBlank()){
            if(idNumbers.contains(chairIdField.getText())){
                JOptionPane.showMessageDialog(rootPane, "That ID number is already in use");
            }else{
                idNumbers.add(chairIdField.getText());
           
                String idNumber = chairIdField.getText();
                int quantity = chairQuantityField.getSelectedIndex()+1;
                boolean armRest = armRestsBox.isSelected();
                WoodType wood = WoodType.valueOf(chairTypeOfWoodField.getItemAt(chairTypeOfWoodField.getSelectedIndex()));


                //would like to get this so that the chair image string is an attribute of the chair class?
                Chair chair = new Chair("chair.jpg", armRest, idNumber, wood, quantity);
                chair.calculatePrice();
                basket.addToBasket(chair);
                System.out.println("the following items are in the basket");
                //could do with some sort of feedback here to let user know that the item has been added to basket
                basket.createSummary();
                dm.addElement(chair);
                System.out.println(chair.getImage());
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please ensure all fields are filled before adding to basket");
        }
            
            
        
        
   
    }//GEN-LAST:event_addChairtoBasketBtnActionPerformed

    private void armRestsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armRestsBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_armRestsBoxActionPerformed

    private void addTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTableButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_addTableButtonActionPerformed

    private void addDeskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeskButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_addDeskButtonActionPerformed

    private void basketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basketButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        basketList.setCellRenderer(new basketRenderer());
        basketList.setModel(dm);
        
        
    }//GEN-LAST:event_basketButtonActionPerformed

    private void tableTypeOfWoodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTypeOfWoodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableTypeOfWoodFieldActionPerformed

    private void addTabletoBasketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTabletoBasketBtnActionPerformed
        // TODO add your handling code here:
        int diameter;
        
        //to fix this control flow, just do if any isblankd then show dialog, take off the !
        if(tableIdField.getText().isBlank() || tableDiameterField.getText().isBlank()){
            JOptionPane.showMessageDialog(rootPane, "Please ensure all fields are filled before adding to basket");
            
            
        }else{
            if(idNumbers.contains(tableIdField.getText())){
                JOptionPane.showMessageDialog(rootPane, "That ID number is already in use");
            }else{
                //think this needs to be in a while
                try{
                    
                    diameter = Integer.parseInt(tableDiameterField.getText());
                    if (diameter < 50 || diameter > 500){
                        JOptionPane.showMessageDialog(rootPane, "diameter must be between 50cm to 500cm");
                    } else {
                         diameter = diameter;
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(rootPane, "diameter field must be a number");
                }
                
                String idNumber = tableIdField.getText();
                int quantity = tableQuantityField.getSelectedIndex()+1;
                WoodType wood = WoodType.valueOf(tableTypeOfWoodField.getItemAt(tableTypeOfWoodField.getSelectedIndex()));
                baseType base = baseType.valueOf(tableBaseTypeField.getItemAt(tableBaseTypeField.getSelectedIndex()));
                
                Table table = new Table("table.jpg", base, diameter, idNumber, wood, quantity);
                dm.addElement(table);
                idNumbers.add(tableIdField.getText());
                table.calculatePrice();
                basket.addToBasket(table);
                System.out.println("the following items are in the basket");
                
                basket.createSummary();
                
                
            }
            
        }
    }//GEN-LAST:event_addTabletoBasketBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChairButton;
    private javax.swing.JButton addChairtoBasketBtn;
    private javax.swing.JButton addDeskButton;
    private javax.swing.JButton addTableButton;
    private javax.swing.JButton addTabletoBasketBtn;
    private javax.swing.JCheckBox armRestsBox;
    private javax.swing.JButton basketButton;
    private javax.swing.JList<String> basketList;
    private javax.swing.JPanel basketPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel chairFormPanel;
    private javax.swing.JFormattedTextField chairIdField;
    private javax.swing.JPanel chairPicPanel;
    private javax.swing.JComboBox<String> chairQuantityField;
    private javax.swing.JComboBox<String> chairTypeOfWoodField;
    private javax.swing.JPanel deskFormPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton showSummaryButton;
    private javax.swing.JComboBox<String> tableBaseTypeField;
    private javax.swing.JFormattedTextField tableDiameterField;
    private javax.swing.JPanel tableFormPanel;
    private javax.swing.JFormattedTextField tableIdField;
    private javax.swing.JComboBox<String> tableQuantityField;
    private javax.swing.JComboBox<String> tableTypeOfWoodField;
    // End of variables declaration//GEN-END:variables
}
