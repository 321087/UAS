package Form;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class View extends javax.swing.JFrame {

    private Connection conn;
    public View() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        
    }
    private void getData() {
       DefaultTableModel model = (DefaultTableModel) tbldata.getModel();
       model.setRowCount(0);
       
        try {
            String sql = "SELECT * FROM biodata";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                int kode = rs.getInt("kode");
                String nama = rs.getString("nama");
                
                Object[] rowData = {id, kode, nama};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_kode = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Rubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA SIMPLE");

        jLabel2.setText("KODE");

        jLabel3.setText("NAMA");

        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Rubah.setText("RUBAH");
        Rubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RubahMouseClicked(evt);
            }
        });
        Rubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubahActionPerformed(evt);
            }
        });

        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Kode", "Nama"
            }
        ));
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Simpan)
                        .addGap(82, 82, 82)
                        .addComponent(Rubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hapus)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(Rubah)
                    .addComponent(Hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        String kode = t_kode.getText();
        String nama = t_nama.getText();
        if(nama.isEmpty()||kode.isEmpty()){
            JOptionPane.showMessageDialog(this, "kosong ngene lur genah ae..", "validsi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "INSERT INTO biodata (kode, nama)VALUES(?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kode);
            st.setString(2, nama);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
            JOptionPane.showMessageDialog(this, "data wes mlebu");
            resetForm();
            getData();
                
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        int selectedRow = tbldata.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "perbarui gausah kesuen");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this,"yakin dek?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbldata.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM biodata WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this, "data wes ilang");
                    resetForm();
                    getData();
                }
                
                st.close();
            } catch (Exception e) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void RubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RubahMouseClicked
        
    }//GEN-LAST:event_RubahMouseClicked

    private void RubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubahActionPerformed
        int selectedRow = tbldata.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "perbarui gausah kesuen");
            return;
        }
        String id = tbldata.getValueAt(selectedRow, 0).toString();
        String kode = t_kode.getText();
        String nama = t_nama.getText();
        if(nama.isEmpty()||kode.isEmpty()){
            JOptionPane.showMessageDialog(this, "kosong ngene lur genah ae..", "validsi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "UPDATE biodata SET kode=?, nama=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kode);
            st.setString(2, nama);
            st.setString(3, id);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0){
            JOptionPane.showMessageDialog(this, "data wes anyar");
            resetForm();
            getData();
                
            }
            st.close();
            
        } catch (Exception e) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_RubahActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
       int selectedRow = tbldata.getSelectedRow();
        if(selectedRow != -1){
            String kode = tbldata.getValueAt(selectedRow, 1).toString();
            String nama = tbldata.getValueAt(selectedRow, 2).toString();
            
            t_kode.setText(kode);
            t_nama.setText(nama);
        }
    }//GEN-LAST:event_tbldataMouseClicked

    
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Rubah;
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_kode;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTable tbldata;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_kode.setText("");
        t_nama.setText("");
    }

    
}
