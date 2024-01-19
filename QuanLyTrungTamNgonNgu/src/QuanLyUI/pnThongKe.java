
package QuanLyUI;

import ObjectClass.HocVien;
import ObjectClass.KhoaHoc;
import java.util.List;

public class pnThongKe extends javax.swing.JPanel {
    private List<KhoaHoc> dsKhoaHoc = UI.getDSKhoaHoc();
    public pnThongKe() {
        initComponents();
        ThongKeBang();
    }
    
    private void ThongKeBang(){
        int slGioi = 0, slKha = 0, slKhac = 0;
        int tongSV = 0;
        int tongDoanhThu = 0;
        Object[][] data = new Object[dsKhoaHoc.size()+1][7];
        for(var o : dsKhoaHoc){
            List<HocVien> dsHV = o.getDSHocVien();
            tongSV += dsHV.size();
            tongDoanhThu += o.getGia();
            for(var k : dsHV){
                if(k.getHocLuc().equals("Giỏi")){
                    
                }else if(k.getHocLuc().equals("Khá")){
                    
                }else{
                    
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDoanhThu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ttThue = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTongDoanhThu = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 460));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 310));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê học lực", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 15), new java.awt.Color(0, 0, 255))); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(650, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Khóa học", "Giỏi", "Khá", "Khác", "Số lượng sinh viên", "Doanh thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(630, 300));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(680, 200));

        jPanel3.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doanh thu");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel3.add(jLabel1);

        txtDoanhThu.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.add(txtDoanhThu);

        jPanel2.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thuế");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel4.add(jLabel3);

        ttThue.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel4.add(ttThue);

        jPanel2.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tổng thu");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel5.add(jLabel5);

        txtTongDoanhThu.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel5.add(txtTongDoanhThu);

        jPanel2.add(jPanel5);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ttThue;
    private javax.swing.JLabel txtDoanhThu;
    private javax.swing.JLabel txtTongDoanhThu;
    // End of variables declaration//GEN-END:variables
}
