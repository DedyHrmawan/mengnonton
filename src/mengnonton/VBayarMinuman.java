/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengnonton;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dblenk
 */
public class VBayarMinuman extends javax.swing.JFrame {
    DefaultTableModel tabModel;
    ResultSet RsProduk=null;
    ResultSet rs=null;
    /**
     * Creates new form VMakanan
     */
    public VBayarMinuman() {
        initComponents();
        waktu();
        this.setExtendedState(VBayarMinuman.MAXIMIZED_BOTH);
        tabelMinuman.getTableHeader().setFont(new Font("Lato", Font.BOLD, 17));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabelMinuman.setDefaultRenderer(String.class, centerRenderer);

        DefaultTableCellRenderer centerInt = new DefaultTableCellRenderer();
        centerInt.setHorizontalAlignment(JLabel.CENTER);
        tabelMinuman.setDefaultRenderer(Integer.class, centerInt);
        tabelMinuman.setRowHeight(30);

        fillCombo();
        tampilData();
    }
    
    public void waktu(){
        Date tgl = new Date();
        FormTanggal.setDate(tgl);
        }
    
    private void fillCombo(){
        try{
            String sql = "select * from minuman where STOK_MINUMAN != 0";
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            rs = stt.executeQuery(sql);
            
            while(rs.next()){
                String id = rs.getString("ID_MINUMAN")+" - "+rs.getString("NAMA_MINUMAN")+" - Stok "+rs.getString("STOK_MINUMAN");
                FormIDMinuman.addItem(id);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    private void refresh(){
        new VBayarMinuman().setVisible(true);
        this.setVisible(false);
    }
    
    private void tampilData(){
        try{
            Object[] judul_kolom = {"No", "ID Minuman", "Jumlah", "Tanggal","Aksi"};
            tabModel = new DefaultTableModel(null,judul_kolom);
            tabelMinuman.setModel(tabModel);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsProduk=stt.executeQuery("SELECT * from pemesanan WHERE TIPE_PEMESANAN = 2 AND STATUS = 0");  
            int no = 0;
            while(RsProduk.next()){
                no++;
                Object[] data={
                    no,
                    RsProduk.getString("ID_BARANG"),
                    RsProduk.getString("JUMLAH_PEMESANAN"),
                    RsProduk.getString("TANGGAL_PEMESANAN")        
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }     

        tabelMinuman.getColumn("Aksi").setCellRenderer(new ButtonRenderer());
        tabelMinuman.getColumn("Aksi").setCellEditor(
                new ButtonEditor(new JCheckBox()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        MJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MPembayaran = new javax.swing.JButton();
        MLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMinuman = new javax.swing.JTable();
        FormIDMinuman = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FormJumlah = new javax.swing.JTextField();
        BSimpan = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        FormTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1000, 700));

        sidepanel.setBackground(new java.awt.Color(0, 8, 66));
        sidepanel.setForeground(new java.awt.Color(255, 255, 255));
        sidepanel.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        sidepanel.setPreferredSize(new java.awt.Dimension(325, 700));

        MJudul.setBackground(new java.awt.Color(255, 255, 255));
        MJudul.setFont(new java.awt.Font("Lato", 1, 30)); // NOI18N
        MJudul.setForeground(new java.awt.Color(255, 255, 255));
        MJudul.setText("MengNonton");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("______________________________");

        MPembayaran.setBackground(new java.awt.Color(0, 8, 66));
        MPembayaran.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        MPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bayar.png"))); // NOI18N
        MPembayaran.setText("Pembayaran");
        MPembayaran.setBorder(null);
        MPembayaran.setBorderPainted(false);
        MPembayaran.setContentAreaFilled(false);
        MPembayaran.setHideActionText(true);
        MPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MPembayaran.setIconTextGap(10);
        MPembayaran.setPreferredSize(new java.awt.Dimension(97, 32));
        MPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPembayaranActionPerformed(evt);
            }
        });

        MLogout.setBackground(new java.awt.Color(0, 8, 66));
        MLogout.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLogout.setForeground(new java.awt.Color(255, 255, 255));
        MLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        MLogout.setText("Logout");
        MLogout.setBorder(null);
        MLogout.setBorderPainted(false);
        MLogout.setContentAreaFilled(false);
        MLogout.setHideActionText(true);
        MLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLogout.setIconTextGap(10);
        MLogout.setPreferredSize(new java.awt.Dimension(97, 32));
        MLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(MJudul)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(MPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 33, 193));
        jPanel2.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bayar.png"))); // NOI18N
        LMakanan.setText("Pembayaran");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Menu Pembayaran Minuman");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LMakanan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabelMinuman.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        tabelMinuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "ID Minuman", "Jumlah", "Tanggal", "Aksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelMinuman.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tabelMinuman);
        if (tabelMinuman.getColumnModel().getColumnCount() > 0) {
            tabelMinuman.getColumnModel().getColumn(0).setMinWidth(25);
            tabelMinuman.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelMinuman.getColumnModel().getColumn(0).setMaxWidth(25);
            tabelMinuman.getColumnModel().getColumn(4).setMinWidth(120);
            tabelMinuman.getColumnModel().getColumn(4).setPreferredWidth(120);
            tabelMinuman.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        FormIDMinuman.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormIDMinuman.setForeground(new java.awt.Color(0, 6, 66));
        FormIDMinuman.setMaximumRowCount(5);

        jLabel7.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("ID Minuman");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Jumlah ");

        FormJumlah.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormJumlah.setForeground(new java.awt.Color(0, 8, 66));
        FormJumlah.setText("Masukan Jumlah");
        FormJumlah.setToolTipText("");
        FormJumlah.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormJumlah.setCaretColor(new java.awt.Color(0, 8, 66));
        FormJumlah.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormJumlah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormJumlahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormJumlahFocusLost(evt);
            }
        });
        FormJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormJumlahActionPerformed(evt);
            }
        });
        FormJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FormJumlahKeyTyped(evt);
            }
        });

        BSimpan.setBackground(new java.awt.Color(12, 33, 193));
        BSimpan.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        BSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan.png"))); // NOI18N
        BSimpan.setText("SIMPAN");
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(238, 210, 2));
        back.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Tanggal Bayar");

        FormTanggal.setBackground(new java.awt.Color(255, 255, 255));
        FormTanggal.setForeground(new java.awt.Color(0, 8, 66));
        FormTanggal.setDateFormatString("yyyy-M-d");
        FormTanggal.setFocusable(false);
        FormTanggal.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormTanggal.setPreferredSize(new java.awt.Dimension(135, 27));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FormIDMinuman, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                                    .addComponent(FormJumlah)
                                    .addComponent(FormTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(60, 60, 60))))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPembayaranActionPerformed
        // TODO add your handling code here:
        new VBayar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MPembayaranActionPerformed

    private void MLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLogoutActionPerformed
        // TODO add your handling code here:
        new VLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLogoutActionPerformed

    private void FormJumlahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormJumlahFocusGained
        // TODO add your handling code here:
        if (FormJumlah.getText().equals("Masukan Jumlah")) {
            FormJumlah.setText("");
        }
    }//GEN-LAST:event_FormJumlahFocusGained

    private void FormJumlahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormJumlahFocusLost
        // TODO add your handling code here:
        if (FormJumlah.getText().equals("")) {
            FormJumlah.setText("Masukan Jumlah");
        }
    }//GEN-LAST:event_FormJumlahFocusLost

    private void FormJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormJumlahActionPerformed

    private void FormJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FormJumlahKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_FormJumlahKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new VBayar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");          
        String date = dateFormat.format(FormTanggal.getDate()); 
        int total = 0;
        String idselect = "";
        String pilihan = FormIDMinuman.getSelectedItem().toString();
        String[] strs = pilihan.split("[ - ]");
        idselect = strs[0].toString();
        try{
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            ResultSet harga = stt.executeQuery("SELECT HARGA_MINUMAN from minuman WHERE ID_MINUMAN = ('"+idselect+"')"); 
            harga.next();
            total = Integer.parseInt(FormJumlah.getText()) * harga.getInt("HARGA_MINUMAN");
            stt.executeUpdate("insert into pemesanan(ID_BARANG,JUMLAH_PEMESANAN,TANGGAL_PEMESANAN,TIPE_PEMESANAN, TOTAL_TAGIHAN)"+
                    "VALUES('"+idselect+"','"+FormJumlah.getText()+"','"+date+"','"+"2"+"','"+total+"')");
            stt.executeUpdate("UPDATE minuman SET STOK_MINUMAN = STOK_MINUMAN-'"+FormJumlah.getText()+"' WHERE ID_MINUMAN ='"+idselect+"'");
            conn.close();
            JOptionPane.showMessageDialog(null, "Berhasil simpan");
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
        new VBayarMinuman().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(VBayarMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBayarMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBayarMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBayarMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());

                } catch (Exception e) {
                }
                new VBayarMinuman().setVisible(true);
            }
        });
    }

     class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
            setFont(new Font("Lato", 0, 17)); // NOI18N

        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "Hapus" : value.toString());
            return this;
        }
    }

    /**
     * @version 1.0 11/09/98
     */
    class ButtonEditor extends DefaultCellEditor {

        protected JButton button;
        protected JButton btnDel;

        private String label;

        private boolean isPushed;
//    ButtonTambah.setBackground(new java.awt.Color(12, 33, 193));
//        ButtonTambah.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
//        ButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
//        ButtonTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah.png"))); // NOI18N
//        ButtonTambah.setText("Tambah");
//        ButtonTambah.setPreferredSize(new java.awt.Dimension(141, 43));
//        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                ButtonTambahActionPerformed(evt);
//            }
//        });

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setBackground(new Color(12, 33, 193));
            button.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
            button.setForeground(new Color(255, 255, 255));
            button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fireEditingStopped();
                    
                    String id_dihapus = "";
                    String jml = "";
                    id_dihapus = tabModel.getValueAt(tabelMinuman.getSelectedRow(),1)+"";
                    jml        = tabModel.getValueAt(tabelMinuman.getSelectedRow(),2)+"";
                    int jumlah = Integer.parseInt(jml);
                    try{
                    Connection conn=(Connection)koneksi.koneksiDB();
                    Statement stt=conn.createStatement();
                    stt.executeUpdate("DELETE FROM pemesanan WHERE ID_BARANG='"+id_dihapus+"' AND STATUS = 0");
                    stt.executeUpdate("update minuman SET STOK_MINUMAN = STOK_MINUMAN+'"+jumlah+"' WHERE ID_MINUMAN='"+id_dihapus+"'");
                    JOptionPane.showMessageDialog(rootPane, "Data berhadil dihapus !");
                    tampilData(); 
                    refresh();
                    } catch(SQLException a){
                        JOptionPane.showMessageDialog(rootPane,"Delete data gagal\n"+a.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    } 
                    
                }
            });

        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setBackground(new Color(12, 33, 193));
                button.setFont(new Font("Lato", 0, 17)); // NOI18N
                button.setBorder(null);
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                button.setForeground(new Color(255, 255, 255));
            } else {
                button.setBackground(new Color(12, 33, 193));
                button.setFont(new Font("Lato", 0, 17)); // NOI18N
                button.setBorder(null);
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                button.setForeground(new Color(255, 255, 255));
            }
            label = (value == null) ? "Hapus" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (isPushed) {
//            new VEditFilm().setVisible(true);
                JOptionPane.showMessageDialog(rootPane, ": Apakah anda ingin menghapus data tersebut ?");
                // System.out.println(label + ": Ouch!");
            }
            isPushed = false;
            return new String(label);
        }

        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSimpan;
    private javax.swing.JComboBox<String> FormIDMinuman;
    private javax.swing.JTextField FormJumlah;
    private com.toedter.calendar.JDateChooser FormTanggal;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MPembayaran;
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tabelMinuman;
    // End of variables declaration//GEN-END:variables
}
