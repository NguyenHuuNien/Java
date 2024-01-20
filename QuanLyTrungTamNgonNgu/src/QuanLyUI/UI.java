package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import saveLoad.SaveLoad;   

public class UI extends javax.swing.JFrame {
    private static List<KhoaHoc> dsKH = new ArrayList<>();
    private static List<KhoaHoc> dsKhoaHoc_Loc = new ArrayList<>();
    private static boolean isOpenPanelKhoaHoc = true;
    
    public UI() {
        initComponents();
        dsKH = SaveLoad.Load();
        LocDanhSach("Tất cả");
        pnControl.add(new pnKhoaHoc());
    }
    public static void changStatePanelKhoaHoc(){
        isOpenPanelKhoaHoc = true;
        cbSX.removeAllItems();
        cbSX.addItem("Mã khóa học");
        cbSX.addItem("Tên khóa học");
        cbSX.addItem("Giá khóa học");
    }
    public static void addKhoaHoc(KhoaHoc newKH){
        dsKH.add(newKH);
    }
    public static List<KhoaHoc> getDSKhoaHoc(){
        return dsKhoaHoc_Loc;
    }
    public static void changePnController(JPanel newPanel){
        isOpenPanelKhoaHoc = false;
        SaveLoad.Save(dsKH);
        
        cbSX.removeAllItems();
        cbSX.addItem("Mã học viên");
        cbSX.addItem("Tên học viên");
        cbSX.addItem("Tuổi học viên");
        
        pnControl.removeAll();
        pnControl.add(newPanel);
        pnControl.revalidate();
        pnControl.repaint();
    }
    public static String getNgonNgu(){
        return (String)cbNgonNgu.getSelectedItem();
    }    

    private void LocDanhSach(String text){
        if(text.equals("Tất cả")){
            txtTitle.setText("Thông tin tất cả các khóa học");
            dsKhoaHoc_Loc = dsKH;
        }else{
            txtTitle.setText("Thông tin các khóa học " + text);
            dsKhoaHoc_Loc = new ArrayList<>();
            for(var o : dsKH){
                if(o.getNgonNgu().equals(text)){
                    dsKhoaHoc_Loc.add(o);
                }
            }
        }
    }
    
    private void searchController(List<KhoaHoc> ds, String text){
        List<KhoaHoc> tmp = new ArrayList<>();
        for(var o : ds){
            if(ds.toString().contains(text)){
                tmp.add(o);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnSpace = new javax.swing.JPanel();
        pnInfor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbNgonNgu = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        pnTitleKhoaHoc = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        pnSapXep = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbSX = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rbTang = new javax.swing.JRadioButton();
        rbGIam = new javax.swing.JRadioButton();
        btOK = new javax.swing.JButton();
        pnSpace2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnControl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan Ly Trung Tam Ngoai Ngu");
        setMinimumSize(new java.awt.Dimension(700, 810));
        setPreferredSize(new java.awt.Dimension(700, 810));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 810));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 3));

        pnTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        pnTitle.setPreferredSize(new java.awt.Dimension(680, 50));
        pnTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trung tâm ngoại ngữ HyuNie");
        pnTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnTitle);

        pnSpace.setPreferredSize(new java.awt.Dimension(200, 15));
        pnSpace.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));
        getContentPane().add(pnSpace);

        pnInfor.setMinimumSize(new java.awt.Dimension(1, 1));
        pnInfor.setPreferredSize(new java.awt.Dimension(700, 35));
        pnInfor.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chọn khóa học ngôn ngữ:");
        jPanel3.add(jLabel3);

        cbNgonNgu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tiếng Việt", "Tiếng Anh", "Tiếng Nhật", "Tiếng Hàn", "Tiếng Trung" }));
        cbNgonNgu.setPreferredSize(new java.awt.Dimension(115, 35));
        cbNgonNgu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNgonNguItemStateChanged(evt);
            }
        });
        cbNgonNgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNgonNguActionPerformed(evt);
            }
        });
        jPanel3.add(cbNgonNgu);

        pnInfor.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setText("Thống kê");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        pnInfor.add(jPanel4);

        getContentPane().add(pnInfor);

        pnTitleKhoaHoc.setPreferredSize(new java.awt.Dimension(700, 43));
        pnTitleKhoaHoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        txtTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Các khóa học Tiếng Việt");
        txtTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtTitle.setPreferredSize(new java.awt.Dimension(600, 32));
        txtTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnTitleKhoaHoc.add(txtTitle);

        getContentPane().add(pnTitleKhoaHoc);

        pnSapXep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSapXep.setPreferredSize(new java.awt.Dimension(650, 80));
        pnSapXep.setRequestFocusEnabled(false);
        pnSapXep.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        jLabel7.setText("Tìm kiếm:");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 16));
        pnSapXep.add(jLabel7);

        txtSearch.setPreferredSize(new java.awt.Dimension(120, 22));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        pnSapXep.add(txtSearch);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("       Sắp xếp theo:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 16));
        pnSapXep.add(jLabel5);

        cbSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khóa học", "Tên khóa học", "Giá khóa học", "Mã sinh viên", "Tên sinh viên", "Tuổi sinh viên" }));
        cbSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSXActionPerformed(evt);
            }
        });
        pnSapXep.add(cbSX);

        jLabel6.setText("    Cách thức:");
        pnSapXep.add(jLabel6);

        buttonGroup1.add(rbTang);
        rbTang.setSelected(true);
        rbTang.setText("Tăng");
        rbTang.setPreferredSize(new java.awt.Dimension(60, 21));
        rbTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTangActionPerformed(evt);
            }
        });
        pnSapXep.add(rbTang);

        buttonGroup1.add(rbGIam);
        rbGIam.setText("Giảm");
        rbGIam.setPreferredSize(new java.awt.Dimension(60, 21));
        rbGIam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGIamActionPerformed(evt);
            }
        });
        pnSapXep.add(rbGIam);

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });
        pnSapXep.add(btOK);

        getContentPane().add(pnSapXep);

        pnSpace2.setPreferredSize(new java.awt.Dimension(699, 35));
        pnSpace2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 3));

        jButton1.setText("Home");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnSpace2.add(jButton1);

        getContentPane().add(pnSpace2);

        pnControl.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        getContentPane().add(pnControl);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbNgonNguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNgonNguActionPerformed
        LocDanhSach((String)cbNgonNgu.getSelectedItem());
        changePnController(new pnKhoaHoc());
    }//GEN-LAST:event_cbNgonNguActionPerformed

    private void cbSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSXActionPerformed

    private void rbTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTangActionPerformed

    private void rbGIamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGIamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGIamActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UI.changePnController(new pnKhoaHoc());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UI.changePnController(new pnThongKe());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbNgonNguItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNgonNguItemStateChanged
        
    }//GEN-LAST:event_cbNgonNguItemStateChanged

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String search = txtSearch.getText();
        String ycCombo = (String)cbSX.getSelectedItem();
        List<KhoaHoc> tmp = new ArrayList<>();
        
    }//GEN-LAST:event_btOKActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JComboBox<String> cbNgonNgu;
    private static javax.swing.JComboBox<String> cbSX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnInfor;
    private javax.swing.JPanel pnSapXep;
    private javax.swing.JPanel pnSpace;
    private javax.swing.JPanel pnSpace2;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPanel pnTitleKhoaHoc;
    private javax.swing.JRadioButton rbGIam;
    private javax.swing.JRadioButton rbTang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
