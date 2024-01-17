package QuanLyUI;

import ObjectClass.KhoaHoc;

public class pnListKhoaHoc extends javax.swing.JPanel {
    private KhoaHoc kh;
    public pnListKhoaHoc(KhoaHoc kh) {
        initComponents();
        this.kh = kh;
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNameKH = new javax.swing.JLabel();
        txtNameGV = new javax.swing.JLabel();
        txtSL = new javax.swing.JLabel();
        txtNgay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnChiTiet = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 65));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-log-out-20.png"))); // NOI18N
        jPanel1.add(jLabel1);

        add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 63));
        jPanel2.setRequestFocusEnabled(false);

        txtNameKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNameKH.setText("Tiếng Nhật N3 - Học cấp tốc chỉ trong 10 ngày");
        txtNameKH.setPreferredSize(new java.awt.Dimension(400, 16));
        jPanel2.add(txtNameKH);

        txtNameGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNameGV.setText("Nguyễn Hữu Niên");
        txtNameGV.setPreferredSize(new java.awt.Dimension(450, 16));
        jPanel2.add(txtNameGV);

        txtSL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSL.setText("Số lượng: 50/100");
        txtSL.setPreferredSize(new java.awt.Dimension(200, 16));
        jPanel2.add(txtSL);

        txtNgay.setText("Ngày: 17/01/2024");
        jPanel2.add(txtNgay);

        add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(120, 60));

        btnChiTiet.setText("Chi Tiết");
        btnChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        jPanel3.add(btnChiTiet);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        pnThanhVien pnTV = new pnThanhVien(kh);
        
    }//GEN-LAST:event_btnChiTietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtNameGV;
    private javax.swing.JLabel txtNameKH;
    private javax.swing.JLabel txtNgay;
    private javax.swing.JLabel txtSL;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        txtNameKH.setText(kh.getTenKhoaHoc());
        txtNameGV.setText("Giảng viên: " + kh.getGiangVien().getName());
        txtSL.setText("Số lượng: " + kh.getSoLuong()[0] + "/" + kh.getSoLuong()[1]);
        txtNgay.setText("Ngay: " + kh.getThoiGian());
        this.repaint();
    }
}
