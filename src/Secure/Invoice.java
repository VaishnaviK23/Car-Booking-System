/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Graphics2D;

/**
 *
 * @author vuk ksc
 */
public class Invoice extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String username;

    /**
     * Creates new form BookRide
     */
    public Invoice(String username) {
        this.username = username;
        initComponents();
        fillTextfields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PDFpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBID = new javax.swing.JLabel();
        txtIID = new javax.swing.JLabel();
        txtUname = new javax.swing.JLabel();
        txtCname = new javax.swing.JLabel();
        txtPDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtSource = new javax.swing.JLabel();
        txtDestination = new javax.swing.JLabel();
        txtCar = new javax.swing.JLabel();
        txtAmount = new javax.swing.JLabel();
        txtPayment = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.orange);
        setForeground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setPreferredSize(new java.awt.Dimension(934, 800));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Customer Invoice");

        PDFpanel.setForeground(java.awt.Color.white);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Pickup date:");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("Booking ID:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel6.setText("Amount:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Customer Name:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel7.setText("Booking date:");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel10.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Method of Payment:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Car Category:");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("Invoice Number:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel8.setText("Payment Successful.");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel13.setText("Source:");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel14.setText("Destination:");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel15.setText("(Please produce this invoice at the time of pickup)");

        txtBID.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtBID.setText("xyz");

        txtIID.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        txtIID.setText("xyz");

        txtUname.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtUname.setText("xyz");

        txtCname.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtCname.setText("xyz");

        txtPDate.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtPDate.setText("xyz");

        txtDate.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtDate.setText("xyz");

        txtSource.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtSource.setText("xyz");

        txtDestination.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtDestination.setText("xyz");

        txtCar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtCar.setText("xyz");

        txtAmount.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtAmount.setText("xyz");

        txtPayment.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtPayment.setText("xyz");

        btnPrint.setBackground(java.awt.Color.black);
        btnPrint.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnPrint.setForeground(java.awt.Color.orange);
        btnPrint.setText("Print");
        btnPrint.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PDFpanelLayout = new javax.swing.GroupLayout(PDFpanel);
        PDFpanel.setLayout(PDFpanelLayout);
        PDFpanelLayout.setHorizontalGroup(
            PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDFpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PDFpanelLayout.createSequentialGroup()
                        .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PDFpanelLayout.createSequentialGroup()
                        .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PDFpanelLayout.createSequentialGroup()
                                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDFpanelLayout.createSequentialGroup()
                                        .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                                        .addGap(37, 37, 37))
                                    .addGroup(PDFpanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)))
                                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPayment)
                                    .addComponent(txtBID)
                                    .addComponent(txtIID)
                                    .addComponent(txtCname)
                                    .addComponent(txtUname)
                                    .addComponent(txtDate)
                                    .addComponent(txtPDate)
                                    .addComponent(txtSource)
                                    .addComponent(txtDestination)
                                    .addComponent(txtCar)
                                    .addComponent(txtAmount))))
                        .addContainerGap(431, Short.MAX_VALUE))))
            .addGroup(PDFpanelLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PDFpanelLayout.setVerticalGroup(
            PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDFpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIID))
                .addGap(31, 31, 31)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBID))
                .addGap(16, 16, 16)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCname))
                .addGap(16, 16, 16)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUname))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPDate))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSource))
                .addGap(13, 13, 13)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestination))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCar))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount))
                .addGap(12, 12, 12)
                .addGroup(PDFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(PDFpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDFpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.black);

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book A Ride!");

        btnHome.setBackground(java.awt.Color.black);
        btnHome.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnHome.setForeground(java.awt.Color.orange);
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnHome.setBorderPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnHistory.setBackground(java.awt.Color.black);
        btnHistory.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnHistory.setForeground(java.awt.Color.orange);
        btnHistory.setText("Ride History");
        btnHistory.setBorder(new javax.swing.border.MatteBorder(null));
        btnHistory.setBorderPainted(false);
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnProfile.setBackground(java.awt.Color.black);
        btnProfile.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnProfile.setForeground(java.awt.Color.orange);
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnProfile.setBorderPainted(false);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnLogout.setBackground(java.awt.Color.black);
        btnLogout.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnLogout.setForeground(java.awt.Color.orange);
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        try {
            Document document = new Document(PageSize.A4, 90, 90, 90, 90);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/vaishnavi/STQAproject/invoice/invoice.pdf"));
            document.open();
            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate tp = cb.createTemplate(PDFpanel.getWidth(), PDFpanel.getHeight());
            Graphics2D g2 = tp.createGraphics(PDFpanel.getWidth(), PDFpanel.getHeight());
            g2.scale(0.8, 1.0);
            PDFpanel.print(g2);
            g2.dispose();
            cb.addTemplate(tp, 5, 60);
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "PDF generated successfully!");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        HomeCustomer h = new HomeCustomer(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        try {
            String sql = "select * from customer where login_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, this.username);
            rs = pst.executeQuery();

            if (rs.next()) {
                RideHistory h = new RideHistory(username);
                h.setVisible(true);
                this.dispose();
            } else {
                DriverHistory h = new DriverHistory(username);
                h.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        try {
            String sql = "select * from customer where login_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, this.username);
            rs = pst.executeQuery();

            if (rs.next()) {
                CustomerProfile h = new CustomerProfile(username);
                h.setVisible(true);
                this.dispose();
            } else {
                EmployeeProfile h = new EmployeeProfile(username);
                h.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginPage h = new LoginPage();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public void fillTextfields() {
        conn = MySqlConnect.ConnectDB();

        try {
            String sql = "select * from booking order by booking_id desc limit 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtBID.setText(rs.getString("booking_id"));
                txtPDate.setText(rs.getString("pickup_date"));
                txtDate.setText(rs.getString("date_of_booking"));
                txtSource.setText(rs.getString("source_name"));
                txtDestination.setText(rs.getString("destination_name"));
                txtCar.setText(rs.getString("car_category"));
                txtAmount.setText(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "select distinct * from name where login_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, this.username);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtCname.setText(rs.getString("first_name") + rs.getString("last_name"));
                txtUname.setText(rs.getString("login_id"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "select distinct * from transaction order by booking_id desc limit 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtIID.setText(rs.getString("invoice_no"));
                txtPayment.setText(rs.getString("payment_method"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Invoice(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PDFpanel;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel txtAmount;
    private javax.swing.JLabel txtBID;
    private javax.swing.JLabel txtCar;
    private javax.swing.JLabel txtCname;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDestination;
    private javax.swing.JLabel txtIID;
    private javax.swing.JLabel txtPDate;
    private javax.swing.JLabel txtPayment;
    private javax.swing.JLabel txtSource;
    private javax.swing.JLabel txtUname;
    // End of variables declaration//GEN-END:variables
}
