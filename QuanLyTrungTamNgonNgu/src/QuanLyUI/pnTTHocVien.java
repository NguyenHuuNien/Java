package QuanLyUI;

import ObjectClass.HocVien;
import ObjectClass.KhoaHoc;

public class pnTTHocVien extends javax.swing.JPanel {
    private HocVien a;
    private KhoaHoc khoaHoc;
    public pnTTHocVien(HocVien hocVien, KhoaHoc khoaHoc) {
        initComponents();
        txtError.setText("");
        this.a = hocVien;
        this.khoaHoc = khoaHoc;
        setData();
    }
    private void setData(){
        txtID.setText(a.getID());
        txtName.setText(a.getName());
        if(a.getTuoi()==0){
            txtAge.setText("");
        }else{
            txtAge.setText(a.getTuoi()+"");
        }
        if(a.getGioiTinh()!=null){
            rdNam.setSelected(a.getGioiTinh().length()>2?true:false);
            rdNu.setSelected(!rdNam.isSelected());
        }
        txtNumberPhone.setText(a.getSoDienThoai());
        cbAddress.setSelectedItem(a.getQueQuan());
        cbNangLuc.setSelectedItem(a.getHocLuc());
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNumberPhone = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbAddress = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtNangLuc = new javax.swing.JLabel();
        cbNangLuc = new javax.swing.JComboBox<>();

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

        txtError.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
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

        pnCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin học viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        pnCenter.setPreferredSize(new java.awt.Dimension(680, 415));
        pnCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jPanel1.setPreferredSize(new java.awt.Dimension(670, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel1.add(jLabel2);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtID.setText("11111111");
        txtID.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtID);

        pnCenter.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Họ và tên");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel2.add(jLabel3);

        txtName.setPreferredSize(new java.awt.Dimension(200, 35));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);

        pnCenter.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tuổi");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel3.add(jLabel4);

        txtAge.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel3.add(txtAge);

        pnCenter.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Giới tính");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel4.add(jLabel5);

        jPanel8.setPreferredSize(new java.awt.Dimension(200, 35));

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");
        rdNam.setPreferredSize(new java.awt.Dimension(80, 30));
        rdNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNamActionPerformed(evt);
            }
        });
        jPanel8.add(rdNam);

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");
        rdNu.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel8.add(rdNu);

        jPanel4.add(jPanel8);

        pnCenter.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Số điện thoại");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel5.add(jLabel6);

        txtNumberPhone.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel5.add(txtNumberPhone);

        pnCenter.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(670, 45));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quê quán");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel6.add(jLabel7);

        cbAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên-Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Đắk Nông" }));
        cbAddress.setSelectedIndex(-1);
        cbAddress.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel6.add(cbAddress);

        pnCenter.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(670, 45));

        txtNangLuc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNangLuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNangLuc.setText("Học lực");
        txtNangLuc.setPreferredSize(new java.awt.Dimension(150, 35));
        jPanel7.add(txtNangLuc);

        cbNangLuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giỏi", "Khá", "Trung Bình", "Kém" }));
        cbNangLuc.setSelectedIndex(-1);
        cbNangLuc.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel7.add(cbNangLuc);

        pnCenter.add(jPanel7);

        add(pnCenter);
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(txtName.getText().equals("")){
            txtError.setText("Vui lòng nhập tên!");
            return;
        }else{
            String[] s = txtName.getText().split(" ");
            StringBuilder result = new StringBuilder();
            for (String o : s) {
                if (o.length() > 0) {
                    String capitalizedWord = o.substring(0, 1).toUpperCase() + o.substring(1);
                    result.append(capitalizedWord).append(" ");
                }
            }
            txtName.setText(result.toString().trim());
            a.setName(txtName.getText());
        }
        
        if(!rdNam.isSelected() && !rdNu.isSelected()){
            txtError.setText("Vui lòng chọn giới tính!");
            return;
        }else{
            a.setGioiTinh(rdNam.isSelected()?"Nam":"Nữ");
        }
        
        if(txtAge.getText().equals("")){
            txtError.setText("Vui lòng nhập tuổi!");
            return;
        }else{
            String s = txtAge.getText();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                    txtError.setText("Vui lòng nhập đúng định dạng tuổi!");
                    return;
                }
            }
            int tuoi = Integer.parseInt(txtAge.getText());
            if(tuoi<1 || tuoi > 100){
                txtError.setText("Tuổi: Trường hợp này trung tâm từ chối đào tạo!");
                return;
            }
            a.setTuoi(tuoi);
        }
        
        String sdt = txtNumberPhone.getText();
        for(int i=0;i<sdt.length();i++){
            if(sdt.charAt(i)<'0' || sdt.charAt(i)>'9'){
                txtError.setText("Vui lòng nhập đúng định dạng Số điện thoại!");
                return;
            }
        }
        if(sdt.length()>11 || sdt.length()<9){
            txtError.setText("Vui lòng nhập đúng định dạng Số điện thoại! (9-11 số)");
            return;
        }
        a.setSoDienThoai(sdt);
        
        if(cbAddress.getSelectedIndex()<0){
            txtError.setText("Vui lòng chọn quê quán!");
            return;
        }else{
            a.setQueQuan((String)cbAddress.getSelectedItem());
        }
        
        if(cbNangLuc.getSelectedIndex()<0){
            txtError.setText("Vui lòng chọn học lực!");
            return;
        }else{
            a.setHocLuc((String)cbNangLuc.getSelectedItem());
        }
        CheckDaCoChua();
        ReturnPnThanhVien();
    }//GEN-LAST:event_btSaveActionPerformed

    private void CheckDaCoChua(){
        for(var o : khoaHoc.getDSHocVien()){
            if(o.getID().equals(a.getID())){
                return;
            }
        }
        khoaHoc.addHocVien(a);
    }
    private void ReturnPnThanhVien(){
        UI.changePnController(new pnThanhVien(khoaHoc));
    }
    
    private void rdNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNamActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAddress;
    private javax.swing.JComboBox<String> cbNangLuc;
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
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtAge;
    private javax.swing.JLabel txtError;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtNangLuc;
    private javax.swing.JTextField txtNumberPhone;
    // End of variables declaration//GEN-END:variables
}
