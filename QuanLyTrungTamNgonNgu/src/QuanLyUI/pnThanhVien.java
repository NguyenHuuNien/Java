package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.util.List;
import ObjectClass.HocVien;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class pnThanhVien extends javax.swing.JPanel {
    private KhoaHoc kh;
    private List<HocVien> dsHV;
    public pnThanhVien(KhoaHoc kh) {
        initComponents();
        this.kh = kh;
        dsHV = kh.getDSHocVien();
        SetupTable();
        resizeTable();
    }
    private void resizeTable(){
        TableColumnModel columnModel = tbThanhVien.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(130);
        columnModel.getColumn(2).setPreferredWidth(30);
        columnModel.getColumn(3).setPreferredWidth(35);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(80);
        columnModel.getColumn(6).setPreferredWidth(120);
    }
    private void SetupTable(){
        Object[][] data = new Object[kh.getSoLuong()[0]+1][7];
        if(kh.getGiangVien()!=null){
            data[0][0] = kh.getGiangVien().getID();
            data[0][1] = kh.getGiangVien().getName();
            data[0][2] = kh.getGiangVien().getTuoi();
            data[0][3] = kh.getGiangVien().getGioiTinh();
            data[0][4] = kh.getGiangVien().getSoDienThoai();
            data[0][5] = kh.getGiangVien().getQueQuan();
            data[0][6] = "Trình độ " + kh.getGiangVien().getTrinhDo();
        }
        
        for(int i = 0; i < dsHV.size(); i++){
            data[i+1][0] = dsHV.get(i).getID();
            data[i+1][1] = dsHV.get(i).getName();
            data[i+1][2] = dsHV.get(i).getTuoi();
            data[i+1][3] = dsHV.get(i).getGioiTinh();
            data[i+1][4] = dsHV.get(i).getSoDienThoai();
            data[i+1][5] = dsHV.get(i).getQueQuan();
            data[i+1][6] = "Học lực " + dsHV.get(i).getHocLuc();
        }
        String[] colName = {"ID","Họ và tên","Tuổi","Giới tính","Số điện thoại","Quê quán","Năng lực"};
        DefaultTableModel dfTable = new DefaultTableModel(data,colName);
        tbThanhVien.setModel(dfTable);
        tbThanhVien.setPreferredSize(new Dimension(550, dsHV.size()>10?50*dsHV.size():320));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThanhVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThemHocVien = new javax.swing.JButton();
        btChiTiet = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 2);
        flowLayout2.setAlignOnBaseline(true);
        setLayout(flowLayout2);

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng thành viên lớp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnTable.setMinimumSize(new java.awt.Dimension(350, 87));
        pnTable.setPreferredSize(new java.awt.Dimension(680, 450));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20);
        flowLayout1.setAlignOnBaseline(true);
        pnTable.setLayout(flowLayout1);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(650, 350));

        tbThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và Tên", "Tuổi", "Gioi Tinh", "Số điện thoại", "Quê quán", "Học lực"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbThanhVien.setPreferredSize(new java.awt.Dimension(500, 30));
        tbThanhVien.setRowHeight(30);
        tbThanhVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbThanhVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbThanhVien.setShowGrid(true);
        tbThanhVien.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tbThanhVienComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tbThanhVien);
        if (tbThanhVien.getColumnModel().getColumnCount() > 0) {
            tbThanhVien.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbThanhVien.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbThanhVien.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbThanhVien.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbThanhVien.getColumnModel().getColumn(5).setPreferredWidth(80);
            tbThanhVien.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        pnTable.add(jScrollPane1);

        jPanel1.setPreferredSize(new java.awt.Dimension(630, 25));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btThemHocVien.setText("Thêm học viên");
        btThemHocVien.setPreferredSize(new java.awt.Dimension(150, 23));
        btThemHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemHocVienActionPerformed(evt);
            }
        });
        jPanel1.add(btThemHocVien);

        btChiTiet.setText("Thông tin");
        btChiTiet.setPreferredSize(new java.awt.Dimension(100, 23));
        btChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChiTietActionPerformed(evt);
            }
        });
        jPanel1.add(btChiTiet);

        jButton5.setText("Xóa");
        jButton5.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        pnTable.add(jPanel1);

        add(pnTable);
    }// </editor-fold>//GEN-END:initComponents

    private void btChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChiTietActionPerformed
        int rowSelect = tbThanhVien.getSelectedRow();
        if(rowSelect==0){
            UI.changePnController(new pnTTGiangVien(kh.getGiangVien(),kh, this));
        }
        if(rowSelect<0){
            return;
        }
        
        TableModel tabModel = tbThanhVien.getModel();
        String ID = (String)tabModel.getValueAt(rowSelect, 0);
        for(var o : dsHV){
            if(o.getID().equals(ID)){
                UI.changePnController(new pnTTHocVien(o,kh));
            }
        }
    }//GEN-LAST:event_btChiTietActionPerformed

    private void btThemHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemHocVienActionPerformed
        UI.changePnController(new pnTTHocVien(new HocVien(),kh));
    }//GEN-LAST:event_btThemHocVienActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int rowSelect = tbThanhVien.getSelectedRow();
        if(rowSelect != -1){
            TableModel tab = tbThanhVien.getModel();
            String ID = (String)tab.getValueAt(rowSelect, 0);
            for(var o : dsHV){
                if(ID.equals(o.getID())){
                    dsHV.remove(o);
                    break;
                }
            }
        }
        UI.changePnController(new pnThanhVien(kh));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbThanhVienComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tbThanhVienComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbThanhVienComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChiTiet;
    private javax.swing.JButton btThemHocVien;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tbThanhVien;
    // End of variables declaration//GEN-END:variables
}
