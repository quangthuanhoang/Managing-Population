/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.biendoihokhau;
import Bean.HoKhauBean;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controllers.HoKhau.ThayDoiHoKhauController;

/**
 *
 * @author Vu Tran Duc Anh
 */
public class ThayDoiHoKhau extends javax.swing.JFrame {
    private HoKhauBean HoKhauBean;
    private ThayDoiHoKhauController controller;
    private JFrame parentJFrame;

    /**
     * Creates new form ThayDoiHoKhau
     */
    public ThayDoiHoKhau(JFrame parrent) {
        initComponents();
        this.HoKhauBean = new HoKhauBean();
        this.parentJFrame = parrent;
        this.parentJFrame.setEnabled(false);
        this.controller = new ThayDoiHoKhauController(HoKhauBean,timKiemJtf, tableJpn);
        this.controller.setDataJtf(maHoKhauJtf, tenChuHoJtf, maKhuVucJtf, diaChiHienTaiJtf);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                parentJFrame.setEnabled(true);
                close();
                }
        });
    }
    
    private void close() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure to close??", "Confirm", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.parentJFrame.setEnabled(true);
            dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pn3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        thayDoiHoKhaulb = new javax.swing.JLabel();
        timKiemlb = new javax.swing.JLabel();
        chonHoKhaulb = new javax.swing.JLabel();
        timKiemJtf = new javax.swing.JTextField();
        tableJpn = new javax.swing.JPanel();
        maHoKhaulb = new javax.swing.JLabel();
        tenChuHolb = new javax.swing.JLabel();
        maHoKhauJtf = new javax.swing.JTextField();
        tenChuHoJtf = new javax.swing.JTextField();
        maKhuVuclb = new javax.swing.JLabel();
        maKhuVucJtf = new javax.swing.JTextField();
        diaChiHienTailb = new javax.swing.JLabel();
        diaChiHienTaiJtf = new javax.swing.JTextField();
        diaChiChuyenDenlb = new javax.swing.JLabel();
        diaChiChuyenDenJtf = new javax.swing.JTextField();
        lyDoChuyenDilb = new javax.swing.JLabel();
        lyDoChuyenDiJtf = new javax.swing.JTextField();
        huyBtn = new javax.swing.JButton();
        xacNhanJbt = new javax.swing.JButton();
        batBuoclb1 = new javax.swing.JLabel();
        batBuoclb2 = new javax.swing.JLabel();
        batBuoclb3 = new javax.swing.JLabel();
        batBuoclb4 = new javax.swing.JLabel();
        batBuoclb5 = new javax.swing.JLabel();
        batBuoclb6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn3.setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        thayDoiHoKhaulb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        thayDoiHoKhaulb.setForeground(new java.awt.Color(255, 255, 255));
        thayDoiHoKhaulb.setText("Thay đổi hộ khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(thayDoiHoKhaulb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thayDoiHoKhaulb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        timKiemlb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timKiemlb.setText("Tìm kiếm");

        chonHoKhaulb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chonHoKhaulb.setText("Chọn hộ khẩu");

        timKiemJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tableJpn.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout tableJpnLayout = new javax.swing.GroupLayout(tableJpn);
        tableJpn.setLayout(tableJpnLayout);
        tableJpnLayout.setHorizontalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        tableJpnLayout.setVerticalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        maHoKhaulb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maHoKhaulb.setText("Mã hộ khẩu:");

        tenChuHolb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tenChuHolb.setText("Tên chủ hộ:");

        maHoKhauJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tenChuHoJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        maKhuVuclb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maKhuVuclb.setText("Mã khu vực:");

        maKhuVucJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        diaChiHienTailb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diaChiHienTailb.setText("Địa chỉ hiện tại:");

        diaChiHienTaiJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        diaChiChuyenDenlb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diaChiChuyenDenlb.setText("Địa chỉ chuyển đến:");

        diaChiChuyenDenJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lyDoChuyenDilb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lyDoChuyenDilb.setText("Lý do chuyển đi:");

        lyDoChuyenDiJtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        huyBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        huyBtn.setText("Hủy");
        huyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyBtnActionPerformed(evt);
            }
        });

        xacNhanJbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xacNhanJbt.setText("Xác nhận");
        xacNhanJbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanJbtActionPerformed(evt);
            }
        });

        batBuoclb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb1.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb1.setText("(*)");

        batBuoclb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb2.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb2.setText("(*)");

        batBuoclb3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb3.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb3.setText("(*)");

        batBuoclb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb4.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb4.setText("(*)");

        batBuoclb5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb5.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb5.setText("(*)");

        batBuoclb6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batBuoclb6.setForeground(new java.awt.Color(255, 0, 0));
        batBuoclb6.setText("(*)");

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chonHoKhaulb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timKiemlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(timKiemJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(xacNhanJbt))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(tableJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maHoKhaulb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tenChuHolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maKhuVuclb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diaChiHienTailb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diaChiChuyenDenlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lyDoChuyenDilb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maHoKhauJtf)
                                    .addComponent(tenChuHoJtf)
                                    .addComponent(maKhuVucJtf)
                                    .addComponent(diaChiHienTaiJtf)
                                    .addComponent(diaChiChuyenDenJtf)
                                    .addComponent(lyDoChuyenDiJtf, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batBuoclb1)
                            .addComponent(batBuoclb2)
                            .addComponent(batBuoclb3)
                            .addComponent(batBuoclb4)
                            .addComponent(batBuoclb5)
                            .addComponent(batBuoclb6))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timKiemlb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiemJtf))
                .addGap(18, 18, 18)
                .addComponent(chonHoKhaulb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maHoKhaulb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maHoKhauJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batBuoclb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tenChuHolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tenChuHoJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batBuoclb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maKhuVuclb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maKhuVucJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batBuoclb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diaChiHienTailb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diaChiHienTaiJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batBuoclb4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diaChiChuyenDenlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diaChiChuyenDenJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batBuoclb6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lyDoChuyenDilb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lyDoChuyenDiJtf, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(batBuoclb5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huyBtn)
                    .addComponent(xacNhanJbt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyBtnActionPerformed
        close();
    }//GEN-LAST:event_huyBtnActionPerformed

    private void xacNhanJbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanJbtActionPerformed
        if (this.diaChiChuyenDenJtf.getText().trim().isEmpty() || this.lyDoChuyenDiJtf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập hết các trường bắt buộc!!", "Warning!", JOptionPane.NO_OPTION);
        } else {
            this.controller.getHoKhauService().chuyenDi(this.HoKhauBean.getHoKhauModel().getIdChuHo(), diaChiChuyenDenJtf.getText().trim(), lyDoChuyenDiJtf.getText().trim());
            this.parentJFrame.setEnabled(true);
            dispose();
        }
    }//GEN-LAST:event_xacNhanJbtActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batBuoclb1;
    private javax.swing.JLabel batBuoclb2;
    private javax.swing.JLabel batBuoclb3;
    private javax.swing.JLabel batBuoclb4;
    private javax.swing.JLabel batBuoclb5;
    private javax.swing.JLabel batBuoclb6;
    private javax.swing.JLabel chonHoKhaulb;
    private javax.swing.JTextField diaChiChuyenDenJtf;
    private javax.swing.JLabel diaChiChuyenDenlb;
    private javax.swing.JTextField diaChiHienTaiJtf;
    private javax.swing.JLabel diaChiHienTailb;
    private javax.swing.JButton huyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lyDoChuyenDiJtf;
    private javax.swing.JLabel lyDoChuyenDilb;
    private javax.swing.JTextField maHoKhauJtf;
    private javax.swing.JLabel maHoKhaulb;
    private javax.swing.JTextField maKhuVucJtf;
    private javax.swing.JLabel maKhuVuclb;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel tableJpn;
    private javax.swing.JTextField tenChuHoJtf;
    private javax.swing.JLabel tenChuHolb;
    private javax.swing.JLabel thayDoiHoKhaulb;
    private javax.swing.JTextField timKiemJtf;
    private javax.swing.JLabel timKiemlb;
    private javax.swing.JButton xacNhanJbt;
    // End of variables declaration//GEN-END:variables
}
