/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.biendoihokhau;

import model_ho_khau.Tach_Ho_Khau;
import model_ho_khau.ChonTvInTachHk;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model_ho_khau.ThanhVienCuaHo;
import model_ho_khau.HoKhau;
import model_ho_khau.NhanKhautest;
import static services_ho_khau.TachHoKhauService.*;
import services_ho_khau.ThemHoKhauService;

/**
 *
 * @author admin
 */
public class TachHoKhau extends javax.swing.JFrame {

    /**
     * Creates new form TachHoKhau
     */
    private DefaultTableModel tblModel;
    private List<Tach_Ho_Khau> List1;
    private List<ChonTvInTachHk> List2;
    private List<ChonTvInTachHk> List3;
    private List<ThanhVienCuaHo> List4;
    private List<ThanhVienCuaHo> List5;
    private List<NhanKhautest> List6;
    private static int index1;
    private int index2;
    private int index3;
    private static int temp = 1;
    private HoKhau hk;
    

    public TachHoKhau() {
        initComponents();
        setLocationRelativeTo(null);
        List1 = new ArrayList<>();
        List2 = new ArrayList<>();
        List3 = new ArrayList<>();
        List4 = new ArrayList<>();
        List5 = new ArrayList<>();
        List6 = new ArrayList<>();
        txtchm.setToolTipText("Hãy nhập quan hệ với chủ hộ mới = Chủ hộ");
        them.setToolTipText("Chọn đây để thêm thành viên cho hộ mới");
        bot.setToolTipText("Chọn đây để loại 1 thành viên của hộ mới");
        show_tb1();
        
      
    }
    public void show_tb1(){
        List1 = tachhk();
        tblModel = (DefaultTableModel) tb1.getModel();
        tblModel.setRowCount(0);
        for(Tach_Ho_Khau tach: List1){
            tblModel.addRow(new Object[]{
                tach.getHokhau().getID(),tach.getNhankhau().getHoTen(),tach.getHokhau().getDiaChi()
            });
        }
      
         
    }
    public void show_tb2(){
        index1 = tb1.getSelectedRow();
        if(index1 > -1){
        List2 = chontṿ(List1.get(index1).getHokhau().getID());
        tblModel = (DefaultTableModel) tb2.getModel();
        tblModel.setRowCount(0);
        for(ChonTvInTachHk chon : List2){
           tblModel.addRow(new Object[]{
              chon.getTvh().getIdNhanKhau(), chon.getNk().getHoTen(),chon.getTvh().getQuanHeVoiChuHo()
           });
        }
        }
     
    }
    public void show_tb3(){
        tblModel = (DefaultTableModel) tb3.getModel();
        tblModel.setRowCount(0);
        for(ChonTvInTachHk chon : List3){
            tblModel.addRow(new Object[]{
                chon.getTvh().getIdNhanKhau(),chon.getNk().getHoTen(),chon.getTvh().getQuanHeVoiChuHo()
            });
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmahkcu = new javax.swing.JTextField();
        txtchm = new javax.swing.JTextField();
        txtmhkm = new javax.swing.JTextField();
        txtmakv = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        them = new javax.swing.JButton();
        bot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hộ khẩu", "Họ tên chủ hộ ", "Địa chỉ"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        tb2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Họ tên", "Quan hệ với chủ hộ"
            }
        ));
        jScrollPane2.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        tb3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Quan hệ với chủ hộ"
            }
        ));
        jScrollPane3.setViewportView(tb3);
        if (tb3.getColumnModel().getColumnCount() > 0) {
            tb3.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Chọn hộ:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Chủ hộ mới:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Mã hộ khẩu mới:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Mã khu vực:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        txtmahkcu.setEnabled(false);
        txtmahkcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmahkcuActionPerformed(evt);
            }
        });

        txtchm.setEnabled(false);
        txtchm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchmActionPerformed(evt);
            }
        });

        txtmhkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmhkmActionPerformed(evt);
            }
        });

        txtmakv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakvActionPerformed(evt);
            }
        });

        txtdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdcActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Chọn người sang hộ mới:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Người ở hộ mới:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Mã hộ khẩu:");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Lưu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Làm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Hủy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        them.setText(">>");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        bot.setText("<<");
        bot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tách Hộ Khẩu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(bot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmakv, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmhkm, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtchm, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmahkcu, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmahkcu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtchm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmhkm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmakv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtchm.setText("");
        txtmhkm.setText("");
        txtdc.setText("");
        txtmakv.setText("");
        tblModel = (DefaultTableModel) tb3.getModel();
        tblModel.setRowCount(0);
        List4.clear();
        List3.clear();
        List5.clear();
        List6.clear();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtmakvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakvActionPerformed

    private void txtdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdcActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        index1 = tb1.getSelectedRow();
        int tmp = List1.get(index1).getHokhau().getID();

        txtmahkcu.setText(tmp+"");    // TODO add your handling code here:
        show_tb2();
        /*List2= chontṿ(tmp);
        tblModel = (DefaultTableModel) tb2.getModel();
        tblModel.setRowCount(0);
        for(ChonTvInTachHk chon : List2){
           tblModel.addRow(new Object[]{
              chon.getNk().getHoTen(),chon.getNk().getNamSinh(),chon.getTvh().getQuanHeVoiChuHo()
           });
        }*/
       
    }//GEN-LAST:event_tb1MouseClicked

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        index2 = tb2.getSelectedRow();
        if(List2.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có thành viên để tách");
           
        } else if(index2 == -1){
         JOptionPane.showMessageDialog(rootPane, "Bạn Cần chọn 1 thành viên!");
         
         
    } else {
            
            try {
            String s = JOptionPane.showInputDialog(rootPane, "Quan hệ với chủ hộ mới");
            ThanhVienCuaHo tv = new ThanhVienCuaHo();
            NhanKhautest nk = new NhanKhautest();
            nk.setHoTen(List2.get(index2).getNk().getHoTen());
            nk.setID(List2.get(index2).getTvh().getIdNhanKhau());
            nk.setQuanHeVoiChuHo(s);
            tv.setIdNhanKhau(List2.get(index2).getTvh().getIdNhanKhau());
            tv.setQuanHeVoiChuHo(s);
            /*if(s != "Chủ hộ"){
            ChonTvInTachHk chon = new ChonTvInTachHk(nk, tv);
            List3.add(chon);
            } else {
                txtchm.setText(nk.getHoTen());
            }*/
           if(s.equalsIgnoreCase("Chủ hộ")){
               txtchm.setText(nk.getHoTen());
               temp = List2.get(index2).getTvh().getIdNhanKhau();
              
           } else{
               ChonTvInTachHk chon = new ChonTvInTachHk(nk,tv);
               List3.add(chon);
               
           }
            List5.add(List2.get(index2).getTvh());
            List4.add(tv);
            List6.add(nk);
            show_tb3();
            } catch (Exception e) {
                
            
            }
            
            
         
          
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_themActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botActionPerformed
        index3 = tb3.getSelectedRow();
        tblModel = (DefaultTableModel) tb3.getModel();
        if(List3.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có thanh viên nào");
            
        } else if(index3 == -1){
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn 1 thành viên trước");
        } else{
            List3.remove(index3);
            List4.remove(index3);
            List5.remove(index3);
            List6.remove(index3);
            show_tb3();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_botActionPerformed

    private void txtmhkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmhkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmhkmActionPerformed

    private void txtchmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchmActionPerformed

    private void txtmahkcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmahkcuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmahkcuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if(txtchm.getText().trim().isEmpty()
                  || txtdc.getText().trim().isEmpty()
                  || txtmahkcu.getText().trim().isEmpty()
                  || txtmakv.getText().trim().isEmpty()
                  || txtmhkm.getText().trim().isEmpty()){
              JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
              
          } else{
              hk = new HoKhau();
              hk.setIdChuHo(temp);
              hk.setMaKhuVuc(txtmakv.getText().trim());
              hk.setMaHoKhau(txtmhkm.getText().trim());
              hk.setDiaChi(txtdc.getText().trim());
              if(new ThemHoKhauService().addChuho(hk)){
               
                if(new ThemHoKhauService().XoaThanhVienCuaHo(List5));
                if(new ThemHoKhauService().addThanhVienCuaHo(List4));
                if(new ThemHoKhauService().UpdateNhanKhau(List6));
              }
              dispose();
              
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TachHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TachHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TachHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TachHoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TachHoKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JButton them;
    private javax.swing.JTextField txtchm;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtmahkcu;
    private javax.swing.JTextField txtmakv;
    private javax.swing.JTextField txtmhkm;
    // End of variables declaration//GEN-END:variables
}
