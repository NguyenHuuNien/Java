package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import saveLoad.SaveLoad;   

public class UI extends javax.swing.JFrame {
    private static List<KhoaHoc> dsKH = new ArrayList<>();
    private static List<KhoaHoc> dsKhoaHoc_Loc = new ArrayList<>();
    private static String nameCurrentJPanel = "KhoaHoc";
    
    public UI() {
        initComponents();
        dsKH = SaveLoad.Load();
        LocDanhSach_NgonNgu();
        pnControl.add(new pnKhoaHoc());
    }
    public static void addKhoaHoc(KhoaHoc newKH){
        dsKH.add(newKH);
    }
    public static List<KhoaHoc> getDSKhoaHoc(){
        return dsKhoaHoc_Loc;
    }
    public static void changePnController(JPanel newPanel, String nameNewJPanel){
        SaveLoad.Save(dsKH);
        pnControl.removeAll();
        nameCurrentJPanel = nameNewJPanel;
        pnControl.add(newPanel);
        pnControl.revalidate();
        pnControl.repaint();
    }
    
    //Ngược vì dùng khi đổi từ ThanhVien -> KhoaHoc và ngược lại
    public static void updateModelComboBoxSapXep(){
        if(nameCurrentJPanel.equals("ThanhVien")){
            DefaultComboBoxModel<String> cbM =  new DefaultComboBoxModel<>(new String[]{"ID khóa học","Tên khóa học","Giá khóa học"});
            cbSX.setModel(cbM);
        }else if(nameCurrentJPanel.equals("KhoaHoc")){
            DefaultComboBoxModel<String> cbM =  new DefaultComboBoxModel<>(new String[]{"ID học viên","Tên học viên","Tuổi học viên"});
            cbSX.setModel(cbM);
        }
    }
    public static String getNgonNgu(){
        return (String)cbNgonNgu.getSelectedItem();
    }    

    private void LocDanhSach_NgonNgu(){
        String text = getNgonNgu();
        ChangeNameTitle(text);
        if(text.equals("Tất cả")){
            dsKhoaHoc_Loc = dsKH;
        }else{
            dsKhoaHoc_Loc = new ArrayList<>();
            for(var o : dsKH){
                if(o.getNgonNgu().equals(text)){
                    dsKhoaHoc_Loc.add(o);
                }
            }
        }
    }
    
    private void ChangeNameTitle(String newText){
        if(nameCurrentJPanel.equals("KhoaHoc")||nameCurrentJPanel.equals("ThongKe")){
            if(newText.equals("Tất cả")){
                txtTitle.setText("Thông tin tất cả các khóa học");
            }else{
                txtTitle.setText("Thông tin các khóa học " + newText);
            }
        }
    }
    
    private <E> List<E> searchController(List<E> ds, String text){
        List<E> tmp = new ArrayList<>();
        for(var o : ds){
            if((o.toString().toLowerCase()).contains(text.toLowerCase())){
                tmp.add(o);
            }
        }
        return tmp;
    }
    private void SapXepKhoaHoc(){
        if(((String)cbSX.getSelectedItem()).equals("ID khóa học")){
            Collections.sort(dsKhoaHoc_Loc,(a,b) -> Integer.compare(a.getIDKhoaHoc(), b.getIDKhoaHoc()));
        }else if(((String)cbSX.getSelectedItem()).equals("Tên khóa học")){
            Collections.sort(dsKhoaHoc_Loc,(a,b) -> a.getTenKhoaHoc().compareTo(b.getTenKhoaHoc()));
        }else if(((String)cbSX.getSelectedItem()).equals("Giá khóa học")){
            Collections.sort(dsKhoaHoc_Loc, (a,b) -> Integer.compare(a.getGia(), b.getGia()));
        }
    }
    private void SapXepHocVien(){
        if(((String)cbSX.getSelectedItem()).equals("ID học viên")){
            Collections.sort(pnThanhVien.getCurrentKhoaHoc().getDSHocVien(),(a,b) -> a.getID().compareTo(b.getID()));
        }else if(((String)cbSX.getSelectedItem()).equals("Tên học viên")){
            Collections.sort(pnThanhVien.getCurrentKhoaHoc().getDSHocVien(),(a,b) -> a.getFirstName().compareTo(b.getFirstName()));
        }else if(((String)cbSX.getSelectedItem()).equals("Tuổi học viên")){
            Collections.sort(pnThanhVien.getCurrentKhoaHoc().getDSHocVien(), (a,b) -> Integer.compare(a.getTuoi(), b.getTuoi()));
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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbNgonNgu = new javax.swing.JComboBox<>();
        pnTitleKhoaHoc = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        pnSapXep = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbSX = new javax.swing.JComboBox<>();
        btOK = new javax.swing.JButton();
        pnSpace2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
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
        pnInfor.setPreferredSize(new java.awt.Dimension(700, 45));
        pnInfor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 0));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chọn ngôn ngữ:   ");
        jPanel4.add(jLabel3);

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
        jPanel4.add(cbNgonNgu);

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
        pnSapXep.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 5));

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabel7.setText("Tìm kiếm:");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel1.add(jLabel7);

        txtSearch.setPreferredSize(new java.awt.Dimension(120, 25));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearch);

        pnSapXep.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 35));

        jLabel2.setText("Sắp xếp theo");
        jPanel2.add(jLabel2);

        cbSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID khóa học", "Tên khóa học", "Giá khóa học" }));
        jPanel2.add(cbSX);

        pnSapXep.add(jPanel2);

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });
        pnSapXep.add(btOK);

        getContentPane().add(pnSapXep);

        pnSpace2.setPreferredSize(new java.awt.Dimension(620, 35));
        pnSpace2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 3));

        jPanel5.setPreferredSize(new java.awt.Dimension(310, 35));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setText("Thống kê");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        pnSpace2.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(310, 35));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jButton1.setText("Home");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        pnSpace2.add(jPanel6);

        getContentPane().add(pnSpace2);
        getContentPane().add(pnControl);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbNgonNguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNgonNguActionPerformed
        
    }//GEN-LAST:event_cbNgonNguActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UI.updateModelComboBoxSapXep();
        UI.changePnController(new pnKhoaHoc(),"KhoaHoc");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UI.changePnController(new pnThongKe(),"ThongKe");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbNgonNguItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNgonNguItemStateChanged
        LocDanhSach_NgonNgu();
        if(nameCurrentJPanel.equals("KhoaHoc")){
            changePnController(new pnKhoaHoc(), nameCurrentJPanel);
        }else if(nameCurrentJPanel.equals("ThongKe")){
            changePnController(new pnThongKe(), nameCurrentJPanel);
        }
    }//GEN-LAST:event_cbNgonNguItemStateChanged

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String search = txtSearch.getText();
        if(nameCurrentJPanel.equals("KhoaHoc")){
            if(search.isEmpty()){
                dsKhoaHoc_Loc = dsKH;
            }else{
                dsKhoaHoc_Loc = searchController(dsKhoaHoc_Loc, search);
            }
            SapXepKhoaHoc();
            changePnController(new pnKhoaHoc(),"KhoaHoc");
        }else if(nameCurrentJPanel.equals("ThanhVien")){
            if(search.isEmpty()){
                pnThanhVien.setDSHocVien(pnThanhVien.getCurrentKhoaHoc().getDSHocVien());
            }else{
                pnThanhVien.setDSHocVien(searchController(pnThanhVien.getCurrentKhoaHoc().getDSHocVien(), search));
            }
            SapXepHocVien();
            changePnController(new pnThanhVien(pnThanhVien.getCurrentKhoaHoc()),"ThanhVien");
        }
    }//GEN-LAST:event_btOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JComboBox<String> cbNgonNgu;
    private static javax.swing.JComboBox<String> cbSX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private static javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnInfor;
    private javax.swing.JPanel pnSapXep;
    private javax.swing.JPanel pnSpace;
    private javax.swing.JPanel pnSpace2;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPanel pnTitleKhoaHoc;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
