package QuanLyUI;

import ObjectClass.KhoaHoc;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class pnKhoaHoc extends javax.swing.JPanel {
    private List<KhoaHoc> dsListKH = UI.getDSKhoaHoc();
    public pnKhoaHoc() {
        initComponents();
        //SetupTable();
        SetData();
        setSizeColumn();
    }
    private void setSizeColumn(){
        TableColumnModel columnModel = tbKhoaHoc.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(35);
        columnModel.getColumn(5).setPreferredWidth(50);
    }
    
    private void SetData(){
        DefaultTableModel dtm = new DefaultTableModel();
        for(var o : dsListKH){
            Object[] data = {o.getIDKhoaHoc(), o.getTenKhoaHoc(),
                o.getGiangVien()!=null?o.getGiangVien().getName():"",
               o.getSoLuong()[0] + "/" + o.getSoLuong()[1],
               o.getThoiGian(), o.getGia() + "VND"
            };
            dtm.addRow(data);
        }
        tbKhoaHoc.setModel(dtm);
    }
    private void SetupTable(){
        Object[][] data = new Object[dsListKH.size()+1][6];
        for(int i = 0; i < dsListKH.size(); i++){
            data[i][0] = dsListKH.get(i).getIDKhoaHoc();
            data[i][1] = dsListKH.get(i).getTenKhoaHoc();
            
            if(dsListKH.get(i).getGiangVien()!=null){
                data[i][2] = dsListKH.get(i).getGiangVien().getName();
            }
            
            int[] x = dsListKH.get(i).getSoLuong();
            String s = x[0] + "/" + x[1];
            data[i][3] = s;
            
            data[i][4] = dsListKH.get(i).getThoiGian();
            
            String gia = dsListKH.get(i).getGia() + "VND";
            data[i][5] = gia;
        }
        String[] colName = {"ID","Tên","Giảng viên","Số lượng","Ngày","Giá"};
        DefaultTableModel dfTable = new DefaultTableModel(data, colName);
        dfTable.setRowCount(dsListKH.size()+1);
        tbKhoaHoc.setModel(dfTable);
        System.out.println(data[dsListKH.size()-1][1]);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKhoaHoc = new javax.swing.JTable();
        btThemKhoaHoc = new javax.swing.JButton();
        btChiTiet = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 460));

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnTable.setPreferredSize(new java.awt.Dimension(680, 460));

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

        btThemKhoaHoc.setText("Thêm khóa học");
        btThemKhoaHoc.setPreferredSize(new java.awt.Dimension(120, 23));
        btThemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemKhoaHocActionPerformed(evt);
            }
        });

        btChiTiet.setText("Chi tiết");
        btChiTiet.setPreferredSize(new java.awt.Dimension(100, 23));
        btChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChiTietActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.setPreferredSize(new java.awt.Dimension(100, 23));
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnTableLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btThemKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThemKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        UI.changePnController(new pnTTKhoaHoc());
    }//GEN-LAST:event_btThemKhoaHocActionPerformed

    private void btChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChiTietActionPerformed
        int rowSelected = tbKhoaHoc.getSelectedRow();
        if(rowSelected != -1){
            TableModel tab = tbKhoaHoc.getModel();
            int ID = (int)tab.getValueAt(rowSelected, 0);
            for(var o : dsListKH){
                if(o.getIDKhoaHoc()==ID){
                    UI.changePnController(new pnThanhVien(o));
                }
            }
        }
    }//GEN-LAST:event_btChiTietActionPerformed

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
        UI.changePnController(new pnKhoaHoc());
    }//GEN-LAST:event_btXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChiTiet;
    private javax.swing.JButton btThemKhoaHoc;
    private javax.swing.JButton btXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tbKhoaHoc;
    // End of variables declaration//GEN-END:variables
}
