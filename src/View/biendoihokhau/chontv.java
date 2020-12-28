/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.biendoihokhau;

import static services_ho_khau.HoKhauTVService.getnhankhau;
import java.awt.Font;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model_ho_khau.ThanhVienCuaHo;

import model_ho_khau.NhanKhautest;


/**
 *
 * @author admin
 */
public class chontv extends javax.swing.JDialog {

    /**
     * Creates new form chontv
     */
    private themhokhau hk;
    private DefaultTableModel tblModel;
    //public List<String> str;
    public static List<NhanKhautest> ListTbgd;
    public static List<NhanKhautest> ListTbtv;
    private int indexTbGiaDinh;
    private int indexTbthanhVien;
    public chontv(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hk = (themhokhau) parent;
       // str = new ArrayList<>();
        ListTbtv = new ArrayList<>();
        setLocationRelativeTo(null);
        tbgiadinh.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tbthanhvien.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        show_nk_Jtable();
       
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbgiadinh = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbthanhvien = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbgiadinh.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbgiadinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "CMND", "Quan hệ với chủ hộ"
            }
        ));
        tbgiadinh.setGridColor(new java.awt.Color(255, 255, 255));
        tbgiadinh.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbgiadinh);
        if (tbgiadinh.getColumnModel().getColumnCount() > 0) {
            tbgiadinh.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        tbthanhvien.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbthanhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "CMT", "Quan hệ với chủ hộ"
            }
        ));
        tbthanhvien.setGridColor(new java.awt.Color(255, 255, 255));
        tbthanhvien.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tbthanhvien);

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Hủy");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Tạo mới");
        jButton6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton6)
                        .addGap(36, 36, 36)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
      public void show_nk_Jtable(){
         ListTbgd = getnhankhau();
         tblModel = (DefaultTableModel) tbgiadinh.getModel();
         tblModel.setRowCount(0);
            for(NhanKhautest nk: ListTbgd){
            tblModel.addRow(new Object[]{
            nk.getID(),nk.getHoTen(),nk.getSoCMND(),nk.getQuanHeVoiChuHo()
            });
        }
     }

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        indexTbGiaDinh = tbgiadinh.getSelectedRow();
        if(ListTbgd.size()==0){
            JOptionPane.showMessageDialog(rootPane, "Không thể thêm");
        } else if (indexTbGiaDinh == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn");
        } else {
            boolean flag = true;
            for(int i =0; i < ListTbtv.size();i++){
                if(ListTbtv.get(i).getID() == ListTbgd.get(indexTbGiaDinh).getID()){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                JOptionPane.showMessageDialog(rootPane, "Bạn đã chọn rồi");
            } else {
                NhanKhautest nkk = ListTbgd.get(indexTbGiaDinh);
                //str.add(JOptionPane.showInputDialog(rootPane,"Quan hệ Với Chủ Hộ", "Quan Hệ", JOptionPane.NO_OPTION));
                addTb1ToTb2(nkk);
            }
            
            //ListTbtv.add(nkk);
           
          
        }
    
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        indexTbthanhVien = tbthanhvien.getSelectedRow();
        if(ListTbtv.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có thành viên để xóa");
            
        } else if (indexTbthanhVien == -1){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn thành viên");
        } else {
            ListTbtv.remove(indexTbthanhVien);
           // str.remove(indexTbthanhVien);
            showData();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6AncestorAdded

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tblModel = (DefaultTableModel) tbthanhvien.getModel();
        tblModel.setRowCount(0);
    //    str.clear();
        ListTbtv.clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        hk.resetListtv();
        for(int i = 0; i< ListTbtv.size();i++){
            ThanhVienCuaHo tv = new ThanhVienCuaHo();
            tv.setIdNhanKhau(ListTbtv.get(i).getID());
            tv.setQuanHeVoiChuHo(ListTbtv.get(i).getQuanHeVoiChuHo());
            hk.addListtv(tv);
        }
        hk.addtb(ListTbtv);
        
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

   
           public void addTb1ToTb2(NhanKhautest nk){
           ListTbtv.add(nk);
           showData();
        
        
        // 
    }                                        
        public void showData(){
        tblModel = (DefaultTableModel) tbthanhvien.getModel();
        tblModel.setRowCount(0);
        Object[] row = new Object[3];
        for (int i = 0; i< ListTbtv.size();i++){
            row[0] = ListTbtv.get(i).getHoTen();
            row[1] = ListTbtv.get(i).getSoCMND();
            row[2] =  ListTbtv.get(i).getQuanHeVoiChuHo();
            
            tblModel.addRow(row);
        }
        /*tblModel.setRowCount(0);
        for(NhanKhautest nk: ListTbtv){
            tblModel.addRow(new Object[]{
                nk.getHoTen(),nk.getSoCMND(),"abc"
            });
        }*/
            
        
    }
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
            java.util.logging.Logger.getLogger(chontv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chontv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chontv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chontv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                chontv dialog = new chontv(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbgiadinh;
    private javax.swing.JTable tbthanhvien;
    // End of variables declaration//GEN-END:variables
}
