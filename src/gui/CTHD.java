/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.ChiTietBUS;
import Model.ChiTietDTO;
import Model.HoaDonDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import gui.HoaDon;
import bus.HoaDonBUS;
import java.util.logging.Level;
import java.util.logging.Logger;
import bus.hanghoaBUS;
import Model.Sanpham;

/**
 *
 * @author huynh
 */
public class CTHD extends javax.swing.JFrame {
    ArrayList<ChiTietDTO> ct=new ArrayList<>();
    ArrayList<HoaDonDTO> hd=new ArrayList<>();
    ArrayList<Sanpham> sp=new ArrayList<>();
    DefaultTableModel model=new DefaultTableModel();
    HoaDonBUS hdbus=new HoaDonBUS();
    hanghoaBUS hhbus=new hanghoaBUS();
    Vector vector=new Vector();
    Vector vector1=new Vector();
    Vector vector2=new Vector();

    /**
     * Creates new form CTHD
     */
    public CTHD() throws Exception {
        initComponents();
        hd=hdbus.dochoadon();
        for(HoaDonDTO dto :hd){
            vector.add(dto.getMaHD());
        }
        cb1.setModel(new DefaultComboBoxModel(vector));
        sp=hhbus.doc();
        for(Sanpham dto1 :sp){
            vector1.add(dto1.getMaSanpham());
        }
        cb2.setModel(new DefaultComboBoxModel(vector1));
        for(Sanpham dto1 :sp){
            vector2.add(dto1.getDongiaSanpham());
        }
        cb3.setModel(new DefaultComboBoxModel(vector2));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbMaHD = new javax.swing.JLabel();
        lbMaHD2 = new javax.swing.JLabel();
        lbMaHD4 = new javax.swing.JLabel();
        txMaSL = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        btAdd = new javax.swing.JButton();
        cb2 = new javax.swing.JComboBox<>();
        lbMaHD5 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMaHD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMaHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMaHD.setText("Số lượng");
        lbMaHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 90, 91, 31));

        lbMaHD2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMaHD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMaHD2.setText("Mã SP");
        lbMaHD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbMaHD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 53, 91, 31));

        lbMaHD4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMaHD4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMaHD4.setText("Đơn giá");
        lbMaHD4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbMaHD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 127, 91, 31));

        txMaSL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txMaSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaSLActionPerformed(evt);
            }
        });
        jPanel1.add(txMaSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 100, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 16, 99, 31));

        btAdd.setBackground(new java.awt.Color(255, 0, 153));
        btAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Add.png"))); // NOI18N
        btAdd.setText("Thêm");
        btAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jPanel1.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 47));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 53, 99, 31));

        lbMaHD5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMaHD5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMaHD5.setText("Mã HD");
        lbMaHD5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbMaHD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 16, 91, 31));

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 127, 99, 31));

        p1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 310, 240));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Chi tiết hoá đơn");
        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153)));

        jButton1.setBackground(new java.awt.Color(255, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        p1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txMaSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaSLActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        float tt;
        tt=Float.parseFloat(cb3.getSelectedItem().toString())*Integer.parseInt(txMaSL.getText());
        ChiTietDTO chitiet=new ChiTietDTO();
        chitiet.setMaHD(cb1.getSelectedItem().toString());
        chitiet.setMaSP(cb2.getSelectedItem().toString());
        chitiet.setDonGia(Float.parseFloat(cb3.getSelectedItem().toString()));
        chitiet.setSL(Integer.parseInt(txMaSL.getText()));
        chitiet.setTT(tt);
         
        ChiTietBUS bus=new ChiTietBUS();
        try {
            bus.them(chitiet);
        } catch (Exception ex) {
            Logger.getLogger(CTHD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HoaDon ct = null;
        try {
            ct = new HoaDon();
        } catch (Exception ex) {
            Logger.getLogger(CTHD.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        ct.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CTHD().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CTHD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbMaHD2;
    private javax.swing.JLabel lbMaHD4;
    private javax.swing.JLabel lbMaHD5;
    private javax.swing.JPanel p1;
    private javax.swing.JTextField txMaSL;
    // End of variables declaration//GEN-END:variables
}
