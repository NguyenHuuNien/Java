package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class pnKhoaHoc extends javax.swing.JPanel {
    private List<KhoaHoc> dsListKH = UI.getDSKhoaHoc();
    public pnKhoaHoc() {
        initComponents();
        SetData();
        setSizeColumn();
    }
    private void setSizeColumn(){
        TableColumnModel columnModel = tbKhoaHoc.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(110);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(42);
        columnModel.getColumn(5).setPreferredWidth(50);
    }
    
    private void SetData(){
        String[] colName = {"ID","Tên","Giảng viên","Số lượng","Ngày","Giá"};
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(colName);
        for(var o : dsListKH){
            Object[] data = {o.getIDKhoaHoc(), o.getTenKhoaHoc(),
                o.getGiangVien()!=null?o.getGiangVien().getName():"",
               o.getSoLuong()[0] + "/" + o.getSoLuong()[1],
               o.getThoiGian(), o.getGia() + "VND"
            };
            dtm.addRow(data);
        }
        tbKhoaHoc.setPreferredSize(new Dimension(550,50*dsListKH.size()));
        tbKhoaHoc.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKhoaHoc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btThemKhoaHoc = new javax.swing.JButton();
        txtThongTin = new javax.swing.JButton();
        btThanhVien = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 460));

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnTable.setPreferredSize(new java.awt.Dimension(680, 460));
        pnTable.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(650, 350));
        jScrollPane2.setViewportView(tbKhoaHoc);

        tbKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Giảng viên", "Số lượng", "Ngày", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhoaHoc.setPreferredSize(new java.awt.Dimension(550, 350));
        tbKhoaHoc.setRowHeight(50);
        jScrollPane2.setViewportView(tbKhoaHoc);
        if (tbKhoaHoc.getColumnModel().getColumnCount() > 0) {
            tbKhoaHoc.getColumnModel().getColumn(0).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbKhoaHoc.getColumnModel().getColumn(1).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbKhoaHoc.getColumnModel().getColumn(2).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(2).setPreferredWidth(135);
            tbKhoaHoc.getColumnModel().getColumn(3).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbKhoaHoc.getColumnModel().getColumn(4).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(4).setPreferredWidth(35);
            tbKhoaHoc.getColumnModel().getColumn(5).setResizable(false);
            tbKhoaHoc.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnTable.add(jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(600, 23));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 30));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 0));

        btThemKhoaHoc.setText("Thêm khóa học");
        btThemKhoaHoc.setPreferredSize(new java.awt.Dimension(130, 23));
        btThemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemKhoaHocActionPerformed(evt);
            }
        });
        jPanel2.add(btThemKhoaHoc);

        txtThongTin.setText("Thông tin");
        txtThongTin.setPreferredSize(new java.awt.Dimension(100, 23));
        txtThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThongTinActionPerformed(evt);
            }
        });
        jPanel2.add(txtThongTin);

        btThanhVien.setText("Thành viên");
        btThanhVien.setPreferredSize(new java.awt.Dimension(100, 23));
        btThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThanhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btThanhVien);

        btXoa.setText("Xóa");
        btXoa.setPreferredSize(new java.awt.Dimension(100, 23));
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btXoa);

        pnTable.add(jPanel2);

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

    private void btThemKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemKhoaHocActionPerformed
        KhoaHoc newKhoaHoc = new KhoaHoc();
        UI.addKhoaHoc(newKhoaHoc);
        UI.changePnController(new pnTTKhoaHoc(newKhoaHoc),"KhoaHoc");
    }//GEN-LAST:event_btThemKhoaHocActionPerformed

    private void btThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThanhVienActionPerformed
        int rowSelected = tbKhoaHoc.getSelectedRow();
        if(rowSelected != -1){
            TableModel tab = tbKhoaHoc.getModel();
            int ID = (int)tab.getValueAt(rowSelected, 0);
            for(var o : dsListKH){
                if(o.getIDKhoaHoc()==ID){
                    UI.updateModelComboBoxSapXep();
                    UI.changePnController(new pnThanhVien(o),"ThanhVien");
                }
            }
        }
    }//GEN-LAST:event_btThanhVienActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int rowSelect = tbKhoaHoc.getSelectedRow();
        if(rowSelect != -1){
            TableModel tab = tbKhoaHoc.getModel();
            int ID = (int)tab.getValueAt(rowSelect, 0);
            for(var o : dsListKH){
                if(ID == o.getIDKhoaHoc()){
                    dsListKH.remove(o);
                    break;
                }
            }
        }
        UI.changePnController(new pnKhoaHoc(),"KhoaHoc");
    }//GEN-LAST:event_btXoaActionPerformed

    private void txtThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThongTinActionPerformed
        int rowSelect = tbKhoaHoc.getSelectedRow();
        if(rowSelect != -1){
            TableModel tbModel = tbKhoaHoc.getModel();
            int ID = (int)tbModel.getValueAt(rowSelect, 0);
            for(var o : dsListKH){
                if(o.getIDKhoaHoc() == ID){
                    UI.changePnController(new pnTTKhoaHoc(o),"TTKhoaHoc");
                    return;
                }
            }
        }
    }//GEN-LAST:event_txtThongTinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThanhVien;
    private javax.swing.JButton btThemKhoaHoc;
    private javax.swing.JButton btXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tbKhoaHoc;
    private javax.swing.JButton txtThongTin;
    // End of variables declaration//GEN-END:variables
}
