package QuanLyUI;

import ObjectClass.GiangVien;
import ObjectClass.KhoaHoc;

public class pnTTKhoaHoc extends javax.swing.JPanel {
    private GiangVien gv ;
    private KhoaHoc khoaHoc;
    public pnTTKhoaHoc(){
        initComponents();
        khoaHoc = new KhoaHoc();
        gv = new GiangVien();
        setData();
        txtID.setText(khoaHoc.getIDKhoaHoc()+"");
        if(khoaHoc.getGiangVien() != null){
            UI.getDSKhoaHoc().add(khoaHoc);
        }
    }
    public pnTTKhoaHoc(KhoaHoc kh) {
        initComponents();
        khoaHoc = kh;
        gv = khoaHoc.getGiangVien();
        setData();
        txtID.setText(khoaHoc.getIDKhoaHoc()+"");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTop = new javax.swing.JPanel();
        btSave = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbNgonNgu = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtTenGV = new javax.swing.JTextField();
        btnAddGV = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMaxNum = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtNangLuc = new javax.swing.JLabel();
        txtDayBegin = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(680, 57));
        setPreferredSize(new java.awt.Dimension(680, 460));

        pnTop.setPreferredSize(new java.awt.Dimension(680, 30));

        btSave.setText("Save");
        btSave.setPreferredSize(new java.awt.Dimension(80, 25));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        txtError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 0, 0));
        txtError.setPreferredSize(new java.awt.Dimension(500, 28));

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        add(pnTop);

        pnCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        pnCenter.setPreferredSize(new java.awt.Dimension(680, 415));
        pnCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        jPanel1.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID Khóa học");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel1.add(jLabel2);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtID.setText("11111111");
        txtID.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(txtID);

        pnCenter.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên khóa học");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel2.add(jLabel3);

        txtName.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel2.add(txtName);

        pnCenter.add(jPanel2);

        jPanel8.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ngôn ngữ");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel8.add(jLabel5);

        cbNgonNgu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Việt", "Tiếng Anh", "Tiếng Nhật", "Tiếng Hàn", "Tiếng Trung" }));
        cbNgonNgu.setSelectedIndex(-1);
        cbNgonNgu.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel8.add(cbNgonNgu);

        pnCenter.add(jPanel8);

        jPanel3.setPreferredSize(new java.awt.Dimension(670, 45));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giảng viên");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel3.add(jLabel4);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        txtTenGV.setEditable(false);
        txtTenGV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenGV.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel4.add(txtTenGV);

        btnAddGV.setText("Add");
        btnAddGV.setPreferredSize(new java.awt.Dimension(40, 35));
        btnAddGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGVActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddGV);

        jPanel3.add(jPanel4);

        pnCenter.add(jPanel3);

        jPanel5.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Số lượng tối đa");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel5.add(jLabel6);

        txtMaxNum.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel5.add(txtMaxNum);

        pnCenter.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Giá");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel6.add(jLabel7);

        txtGia.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel6.add(txtGia);

        pnCenter.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(670, 45));

        txtNangLuc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNangLuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNangLuc.setText("Ngày bắt đầu");
        txtNangLuc.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel7.add(txtNangLuc);

        txtDayBegin.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel7.add(txtDayBegin);

        pnCenter.add(jPanel7);

        add(pnCenter);
    }// </editor-fold>//GEN-END:initComponents

    private void setData(){
        txtName.setText(khoaHoc.getTenKhoaHoc());
        txtGia.setText(String.valueOf(khoaHoc.getGia()));
        txtDayBegin.setText(khoaHoc.getThoiGian());
        txtTenGV.setText(gv.getName());
        txtMaxNum.setText(String.valueOf(khoaHoc.getSoLuong()[1]));
        cbNgonNgu.setSelectedItem(khoaHoc.getNgonNgu());
    }
    
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(txtName.getText().equals("")){
            txtError.setText("Vui lòng nhập tên khóa học!");
            return;
        }else{
            khoaHoc.setTenKhoaHoc(txtName.getText());
        }
        if(gv.getName() != null){
            khoaHoc.setGiangVien(gv);
        }else{
            txtError.setText("Vui lòng nhập giảng viên!");
            return;
        }
        if(txtGia.getText().length()<1){
            txtError.setText("Vui lòng lại nhập số tiền!");
            return;
        }else{
            for(int i=0;i<txtGia.getText().length();i++){
                if(txtGia.getText().charAt(i)>'9' || txtGia.getText().charAt(i) < '0' ){
                    txtError.setText("Vui lòng nhập đúng định dạng số tiền");
                    return;
                }
            }
            khoaHoc.setGia(Integer.parseInt(txtGia.getText()));
        }
        if(cbNgonNgu.getSelectedIndex() != -1){
            khoaHoc.setNgonNgu((String)cbNgonNgu.getSelectedItem());
        }else{
            txtError.setText("Vui lòng chọn ngôn ngữ cho khóa học!");
        }
        for(int i=0;i<txtMaxNum.getText().length();i++){
                if(txtMaxNum.getText().charAt(i)>'9' || txtMaxNum.getText().charAt(i) < '0' ){
                    txtError.setText("Vui lòng nhập đúng định dạng số lượng học viên!");
                    return;
                }
            }
        if(Integer.parseInt(txtMaxNum.getText())<1 || txtMaxNum.getText().equals("")){
            txtError.setText("Vui lòng thiết lập lại số lượng học viên tối đa!");
            return;
        }else{
            khoaHoc.setMaxSoLuong(Integer.parseInt(txtMaxNum.getText()));
        }
        if(txtDayBegin.getText().length()!=10){
            txtError.setText("Vui lòng nhập lại ngày bắt đầu!");
        }else{
            String s = txtDayBegin.getText();
            if(s.charAt(2) != '/' && s.charAt(5) != '/'){
                txtError.setText("Vui lòng nhập đúng định dạng ngày bắt đầu học (dd/MM/yyyy)");
                return;
            }
            for(int i=0;i<s.length();i++){
                if(i==2 || i==5){
                    continue;
                }
                if(s.charAt(i)>'9' || s.charAt(i) < '0' ){
                    txtError.setText("Vui lòng nhập đúng định dạng ngày bắt đầu học (dd/MM/yyyy)");
                    return;
                }
            }
            if(Integer.parseInt(s.substring(0, 2))<1||Integer.parseInt(s.substring(0, 2))>31 ||
                Integer.parseInt(s.substring(3, 5))<1 || Integer.parseInt(s.substring(3, 5))>12 ||
                Integer.parseInt(s.substring(6))<0){
                txtError.setText("Dữ liệu ngày bắt đầu không hợp lệ!");
                return;
            }
            khoaHoc.setThoiGian(s);
        }
        UI.changePnController(new pnKhoaHoc(),"KhoaHoc");
    }//GEN-LAST:event_btSaveActionPerformed

    private void btnAddGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGVActionPerformed
        UI.changePnController(new pnTTGiangVien(gv, khoaHoc,this),"TTGiangVien");
        txtTenGV.setText(gv.getName());
    }//GEN-LAST:event_btnAddGVActionPerformed
    public void setTenGiangVien(){
        txtTenGV.setText(gv.getName());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btnAddGV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbNgonNgu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnTop;
    private javax.swing.JTextField txtDayBegin;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtGia;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtMaxNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtNangLuc;
    private javax.swing.JTextField txtTenGV;
    // End of variables declaration//GEN-END:variables
}
