package QuanLyUI;

import ObjectClass.GiangVien;
import ObjectClass.HocVien; 
import ObjectClass.KhoaHoc;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import saveLoad.SaveLoad;

public class UI extends javax.swing.JFrame {
    private File path = new File("data.bin");
    private List<KhoaHoc> dsKH = new ArrayList<>();
    public UI() {
        initComponents();
        SetupData();
        dsKH = SaveLoad.Load(path);
        pnHyuNie.add(new pnKhoaHoc(dsKH,pnHyuNie));
    }
    private void SetupData(){
        List<KhoaHoc> dsKH = new ArrayList<>();
        KhoaHoc a = new KhoaHoc("Tieng Anh","Lap trinh android",100000, new GiangVien("Nguyen Huu Nien", 19, "0778421699","Ninh Binh", "Tien Si"), 100, "10/12/2023");
        KhoaHoc b = new KhoaHoc("Tieng Nhat","Lap trinh ios",250000 ,new GiangVien("Nguyen Huu Dai", 50, "0985695395","Ninh Binh", "Thac Si"), 50, "30/1/2023");
        KhoaHoc c = new KhoaHoc("Tieng Trung","Cach tan gai",3500000 ,new GiangVien("Pham Thi Hong Anh", 19, "0355336064","Ninh Binh", "Tien Si"), 70, "20/1/2024");
        
        HocVien x = new HocVien("Phan Thai Hoang", 14, "091234567", "Ha Noi", "Kha");
        HocVien y = new HocVien("Nguyen Minh Nguyet", 20, "091234567", "Ha Noi", "Gioi");
        HocVien z = new HocVien("Tran Thanh Hoang", 17, "091234567", "Ha Noi", "Kha");
        HocVien m = new HocVien("Nguyen Minh Van", 19, "091234567", "Ha Noi", "Trung Binh");
        HocVien n = new HocVien("Nguyen Van Thui", 21, "091234567", "Ha Noi", "Kha");
        HocVien q = new HocVien("Vu Thi No", 22, "091234567", "Ha Noi", "Trung Binh");
        HocVien p = new HocVien("Nguyen Van Hoang", 18, "091234567", "Ha Noi", "Kha");
        
        a.addHocVien(x); a.addHocVien(p); a.addHocVien(y); a.addHocVien(z);
        b.addHocVien(p); b.addHocVien(q); b.addHocVien(n); b.addHocVien(z);
        c.addHocVien(m); c.addHocVien(x); c.addHocVien(p); c.addHocVien(q);
        
        dsKH.add(a);    dsKH.add(b);    dsKH.add(c);
        
        SaveLoad.Save(dsKH, path);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnSpace1 = new javax.swing.JPanel();
        pnTitleKhoaHoc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnSapXep = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        pnSpace2 = new javax.swing.JPanel();
        pnHyuNie = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan Ly Trung Tam Ngoai Ngu");
        setPreferredSize(new java.awt.Dimension(700, 810));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 810));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Việt", "Tiếng Anh", "Tiếng Nhật", "Tiếng Hàn", "Tiếng Trung" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(115, 35));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);

        pnInfor.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel2.setText("Xin chào: HyuNie");
        jPanel4.add(jLabel2);

        jButton1.setFont(new java.awt.Font("Liberation Sans Narrow", 2, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-log-out-20.png"))); // NOI18N
        jButton1.setToolTipText("Dang Xuat");
        jButton1.setAlignmentX(0.5F);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(26, 26));
        jPanel4.add(jButton1);

        pnInfor.add(jPanel4);

        getContentPane().add(pnInfor);

        pnSpace1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));
        getContentPane().add(pnSpace1);

        pnTitleKhoaHoc.setPreferredSize(new java.awt.Dimension(700, 43));
        pnTitleKhoaHoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Các khóa học Tiếng Việt");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnTitleKhoaHoc.add(jLabel4);

        getContentPane().add(pnTitleKhoaHoc);

        pnSapXep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSapXep.setPreferredSize(new java.awt.Dimension(650, 80));
        pnSapXep.setRequestFocusEnabled(false);
        pnSapXep.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        jLabel7.setText("Tìm kiếm:");
        pnSapXep.add(jLabel7);

        jTextField1.setPreferredSize(new java.awt.Dimension(120, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        pnSapXep.add(jTextField1);

        jLabel5.setText("             Sắp xếp theo:");
        pnSapXep.add(jLabel5);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã lớp học", "Tên lớp học", "Thời gian học", "Số lượng đăng ký", "Giá" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        pnSapXep.add(jComboBox2);

        jLabel6.setText("          Cách thức:");
        pnSapXep.add(jLabel6);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Tăng");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        pnSapXep.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Giảm");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        pnSapXep.add(jRadioButton2);

        jButton2.setText("OK");
        pnSapXep.add(jButton2);

        getContentPane().add(pnSapXep);

        pnSpace2.setPreferredSize(new java.awt.Dimension(699, 35));
        pnSpace2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));
        getContentPane().add(pnSpace2);
        getContentPane().add(pnHyuNie);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnHyuNie;
    private javax.swing.JPanel pnInfor;
    private javax.swing.JPanel pnSapXep;
    private javax.swing.JPanel pnSpace;
    private javax.swing.JPanel pnSpace1;
    private javax.swing.JPanel pnSpace2;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPanel pnTitleKhoaHoc;
    // End of variables declaration//GEN-END:variables
}
