package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.util.List;
import ObjectClass.HocVien;
import javax.swing.table.DefaultTableModel;

public class pnThanhVien extends javax.swing.JPanel {
    private KhoaHoc kh;
    public pnThanhVien(KhoaHoc kh) {
        initComponents();
        this.kh = kh;
        SetupTable();
    }
    private void SetupTable(){
        Object[][] data = new Object[6][kh.getSoLuong()[0]];
        List<HocVien> dsHV = kh.getDSHocVien();
        for(int i = 0; i < dsHV.size(); i++){
            data[0][i] = dsHV.get(i).getID();
            data[1][i] = dsHV.get(i).getName();
            data[2][i] = dsHV.get(i).getTuoi();
            data[3][i] = dsHV.get(i).getSoDienThoai();
            data[4][i] = dsHV.get(i).getQueQuan();
            data[5][i] = dsHV.get(i).getHocLuc();
        }
        String[] colName = {"ID","Họ và tên","Tuổi","Số điện thoại","Quê quán","Học lực"};
        DefaultTableModel dfTable = new DefaultTableModel(data,colName);
        tbThanhVien.setModel(dfTable);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThanhVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng thành viên lớp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnTable.setPreferredSize(new java.awt.Dimension(680, 460));
        pnTable.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 350));

        tbThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và Tên", "Tuổi", "Số điện thoại", "Quê quán", "Học lực"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbThanhVien.setPreferredSize(new java.awt.Dimension(500, 350));
        tbThanhVien.setRowHeight(30);
        tbThanhVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbThanhVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbThanhVien.setShowGrid(true);
        jScrollPane1.setViewportView(tbThanhVien);
        if (tbThanhVien.getColumnModel().getColumnCount() > 0) {
            tbThanhVien.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbThanhVien.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbThanhVien.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbThanhVien.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbThanhVien.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbThanhVien.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        pnTable.add(jScrollPane1);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 100, 0));

        jButton3.setText("Thêm");
        jPanel1.add(jButton3);

        jButton4.setText("Chi tiết");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setText("Xóa");
        jPanel1.add(jButton5);

        pnTable.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tbThanhVien;
    // End of variables declaration//GEN-END:variables
}
