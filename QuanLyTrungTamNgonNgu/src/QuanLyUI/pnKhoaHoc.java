package QuanLyUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class pnKhoaHoc extends javax.swing.JPanel {
    private List<pnListKhoaHoc> dsListKH = new ArrayList<>();
    public pnKhoaHoc(List<pnListKhoaHoc> ds) {
        initComponents();
        dsListKH = ds;
        setListModel();
    }
    private void setListModel(){
        DefaultListModel<pnListKhoaHoc> dfListKH = new DefaultListModel<>();
        for(var o : dsListKH){
            dfListKH.addElement(o);
        }
        lsKhoaHoc.setModel(dfListKH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsKhoaHoc = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 460));

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnTable.setPreferredSize(new java.awt.Dimension(680, 460));
        pnTable.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 350));

        lsKhoaHoc.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane1.setViewportView(lsKhoaHoc);

        pnTable.add(jScrollPane1);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 100, 0));

        jButton3.setText("Thêm khóa học");
        jPanel1.add(jButton3);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<pnListKhoaHoc> lsKhoaHoc;
    private javax.swing.JPanel pnTable;
    // End of variables declaration//GEN-END:variables
}
