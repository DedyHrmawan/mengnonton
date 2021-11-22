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
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonModel;
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
public class VStudio extends javax.swing.JFrame {
    DefaultTableModel tabModel;
    ResultSet RsStudio=null;

    /**
     * Creates new form VMakanan
     */
    public VStudio() {
        initComponents();
        this.setExtendedState(VStudio.MAXIMIZED_BOTH);
        tabelStudio.getTableHeader().setFont(new Font("Lato", Font.BOLD, 17));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabelStudio.setDefaultRenderer(String.class, centerRenderer);

        DefaultTableCellRenderer centerInt = new DefaultTableCellRenderer();
        centerInt.setHorizontalAlignment(JLabel.CENTER);
        tabelStudio.setDefaultRenderer(Integer.class, centerInt);
        tabelStudio.setRowHeight(30);

        tabelStudio.getColumn("Aksi").setCellRenderer(new ButtonsRenderer());
        tabelStudio.getColumn("Aksi").setCellEditor(
                new ButtonsEditor(new JTable()));
        
        tampilData();

    }
    
    private void tampilData(){
        try{
            Object[] judul_kolom = {"No", "ID Studio", "Nama Studio", "Kapasitas Studio", "Jenis Studio", "Aksi"};
            tabModel = new DefaultTableModel(null,judul_kolom);
            tabelStudio.setModel(tabModel);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsStudio=stt.executeQuery("SELECT * from studio");  
            int no = 0;
            while(RsStudio.next()){
                no++;
                
                Object[] data={
                    no,
                    RsStudio.getString("ID_STUDIO"),
                    RsStudio.getString("NAMA_STUDIO"),
                    RsStudio.getString("KAPASITAS_STUDIO"),
                    RsStudio.getString("JENIS_STUDIO"),
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }     

        tabelStudio.getColumn("Aksi").setCellRenderer(new VStudio.ButtonsRenderer());
        tabelStudio.getColumn("Aksi").setCellEditor(
                new VStudio.ButtonsEditor(tabelStudio)); 
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
        Mfilm = new javax.swing.JButton();
        MStudio = new javax.swing.JButton();
        MJadwal = new javax.swing.JButton();
        MMakanan = new javax.swing.JButton();
        MMinuman = new javax.swing.JButton();
        MLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonTambah = new javax.swing.JButton();
        FormSearch = new javax.swing.JTextField();
        iconSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelStudio = new javax.swing.JTable();

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

        Mfilm.setBackground(new java.awt.Color(0, 8, 66));
        Mfilm.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        Mfilm.setForeground(new java.awt.Color(255, 255, 255));
        Mfilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/film.png"))); // NOI18N
        Mfilm.setText("Film");
        Mfilm.setBorder(null);
        Mfilm.setBorderPainted(false);
        Mfilm.setContentAreaFilled(false);
        Mfilm.setHideActionText(true);
        Mfilm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mfilm.setIconTextGap(10);
        Mfilm.setPreferredSize(new java.awt.Dimension(97, 32));
        Mfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfilmActionPerformed(evt);
            }
        });

        MStudio.setBackground(new java.awt.Color(0, 8, 66));
        MStudio.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MStudio.setForeground(new java.awt.Color(255, 255, 255));
        MStudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/studio.png"))); // NOI18N
        MStudio.setText("Studio");
        MStudio.setBorder(null);
        MStudio.setBorderPainted(false);
        MStudio.setContentAreaFilled(false);
        MStudio.setHideActionText(true);
        MStudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MStudio.setIconTextGap(10);
        MStudio.setPreferredSize(new java.awt.Dimension(97, 32));
        MStudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MStudioActionPerformed(evt);
            }
        });

        MJadwal.setBackground(new java.awt.Color(0, 8, 66));
        MJadwal.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MJadwal.setForeground(new java.awt.Color(255, 255, 255));
        MJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jadwal.png"))); // NOI18N
        MJadwal.setText("Jadwal");
        MJadwal.setBorder(null);
        MJadwal.setBorderPainted(false);
        MJadwal.setContentAreaFilled(false);
        MJadwal.setHideActionText(true);
        MJadwal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MJadwal.setIconTextGap(10);
        MJadwal.setPreferredSize(new java.awt.Dimension(97, 32));
        MJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJadwalActionPerformed(evt);
            }
        });

        MMakanan.setBackground(new java.awt.Color(0, 8, 66));
        MMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MMakanan.setForeground(new java.awt.Color(255, 255, 255));
        MMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/makanan.png"))); // NOI18N
        MMakanan.setText("Makanan");
        MMakanan.setBorder(null);
        MMakanan.setBorderPainted(false);
        MMakanan.setContentAreaFilled(false);
        MMakanan.setHideActionText(true);
        MMakanan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MMakanan.setIconTextGap(10);
        MMakanan.setPreferredSize(new java.awt.Dimension(97, 32));
        MMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMakananActionPerformed(evt);
            }
        });

        MMinuman.setBackground(new java.awt.Color(0, 8, 66));
        MMinuman.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MMinuman.setForeground(new java.awt.Color(255, 255, 255));
        MMinuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minuman.png"))); // NOI18N
        MMinuman.setText("Minuman");
        MMinuman.setBorder(null);
        MMinuman.setBorderPainted(false);
        MMinuman.setContentAreaFilled(false);
        MMinuman.setHideActionText(true);
        MMinuman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MMinuman.setIconTextGap(10);
        MMinuman.setPreferredSize(new java.awt.Dimension(97, 32));
        MMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMinumanActionPerformed(evt);
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
                    .addComponent(Mfilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MMakanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Mfilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 33, 193));
        jPanel2.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/studio.png"))); // NOI18N
        LMakanan.setText("Studio");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Menu Data Studio");

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

        ButtonTambah.setBackground(new java.awt.Color(12, 33, 193));
        ButtonTambah.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        ButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah.png"))); // NOI18N
        ButtonTambah.setText("Tambah");
        ButtonTambah.setPreferredSize(new java.awt.Dimension(141, 43));
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        FormSearch.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormSearch.setForeground(new java.awt.Color(204, 204, 204));
        FormSearch.setText("Cari");
        FormSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 8, 66), 1, true));
        FormSearch.setPreferredSize(new java.awt.Dimension(211, 43));
        FormSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormSearchFocusLost(evt);
            }
        });

        iconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N

        tabelStudio.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        tabelStudio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "M001", "Pizza",  new Integer(10000), null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Studio", "Nama Studio", "Kapasitas", "Jenis Studio", "Aksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelStudio.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tabelStudio);
        if (tabelStudio.getColumnModel().getColumnCount() > 0) {
            tabelStudio.getColumnModel().getColumn(0).setMinWidth(25);
            tabelStudio.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelStudio.getColumnModel().getColumn(0).setMaxWidth(25);
            tabelStudio.getColumnModel().getColumn(5).setMinWidth(120);
            tabelStudio.getColumnModel().getColumn(5).setPreferredWidth(120);
            tabelStudio.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(ButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(iconSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FormSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormSearchFocusGained
        // TODO add your handling code here:
        if (FormSearch.getText().equals("Cari")) {
            FormSearch.setText("");
        }
    }//GEN-LAST:event_FormSearchFocusGained

    private void FormSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormSearchFocusLost
        // TODO add your handling code here:
        if (FormSearch.getText().equals("")) {
            FormSearch.setText("Cari");
        }
    }//GEN-LAST:event_FormSearchFocusLost

    private void MJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJadwalActionPerformed
        // TODO add your handling code here:
        new VJadwal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MJadwalActionPerformed

    private void MMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMakananActionPerformed
        // TODO add your handling code here:
        new VMakanan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MMakananActionPerformed

    private void MMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMinumanActionPerformed
        // TODO add your handling code here:
        new VMinuman().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MMinumanActionPerformed

    private void MLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLogoutActionPerformed
        // TODO add your handling code here:
        new VLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLogoutActionPerformed

    private void MfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfilmActionPerformed
        // TODO add your handling code here:
        new VStudio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MfilmActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
        new VTambahStudio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void MStudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MStudioActionPerformed
        // TODO add your handling code here:
        new VStudio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MStudioActionPerformed

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
            java.util.logging.Logger.getLogger(VStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());

                } catch (Exception e) {
                }
                new VStudio().setVisible(true);
            }
        });
    }

    class ButtonsPanel extends JPanel {

        public final List<JButton> buttons = Arrays.asList(new JButton("edit"), new JButton("hapus"));

        protected ButtonsPanel() {

            setOpaque(true);
            for (JButton b : buttons) {
                b.setFocusable(false);
                b.setRolloverEnabled(false);
                add(b);
            }
        }
    }

    class ButtonsRenderer implements TableCellRenderer {

        private final ButtonsPanel panel = new ButtonsPanel() {

            @Override
            public void updateUI() {
                super.updateUI();
                setName("Table.cellRenderer");
            }
        };

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            panel.setBackground(new Color(255, 255, 255));
//            panel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
            return panel;
        }
    }

    class EditAction extends AbstractAction {

        private final JTable table;

        protected EditAction(JTable table) {
            super("edit");

            this.table = table;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new VEditStudio(tabModel.getValueAt(table.getSelectedRow(),1)+"").setVisible(true);
            setVisible(false);
        }
    }

    class HapusAction extends AbstractAction {

        private final JTable table;

        protected HapusAction(JTable table) {
            super("hapus");
            this.table = table;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(table, "Data berhadil dihapus !");
        }

//        @Override
//        public void actionPerformed(ActionEvent e) {
//            // Object o = table.getModel().getValueAt(table.getSelectedRow(), 0);
//            int row = table.convertRowIndexToModel(table.getEditingRow());
//            Object o = table.getModel().getValueAt(row, 0);
//            JOptionPane.showMessageDialog(table, "Editing: " + o);
//        }
    }

// delegation pattern
    class ButtonsEditor extends AbstractCellEditor implements TableCellEditor {

        protected final ButtonsPanel panel = new ButtonsPanel();
        protected final JTable table;

        private class EditingStopHandler extends MouseAdapter implements ActionListener {

            @Override
            public void mousePressed(MouseEvent e) {
                Object o = e.getSource();
                if (o instanceof TableCellEditor) {
                    actionPerformed(null);
                } else if (o instanceof JButton) {
                    // DEBUG: view button click -> control key down + edit button(same cell) press -> remain selection color
                    ButtonModel m = ((JButton) e.getComponent()).getModel();
                    if (m.isPressed() && table.isRowSelected(table.getEditingRow()) && e.isControlDown()) {
                        panel.setBackground(table.getBackground());
                    }
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> fireEditingStopped());
            }
        }

        protected ButtonsEditor(JTable table) {
            super();
            this.table = table;
            panel.buttons.get(0).setAction(new EditAction(table));
            panel.buttons.get(1).setAction(new HapusAction(table));

            EditingStopHandler handler = new EditingStopHandler();
            for (JButton b : panel.buttons) {
                b.addMouseListener(handler);
                b.addActionListener(handler);
            }
            panel.addMouseListener(handler);
        }

        @Override
        public Component getTableCellEditorComponent(JTable tbl, Object value, boolean isSelected, int row, int column) {
            panel.setBackground(tbl.getSelectionBackground());
            return panel;
        }

        @Override
        public Object getCellEditorValue() {
            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JTextField FormSearch;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JButton MJadwal;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MMakanan;
    private javax.swing.JButton MMinuman;
    private javax.swing.JButton MStudio;
    private javax.swing.JButton Mfilm;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel iconSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tabelStudio;
    // End of variables declaration//GEN-END:variables
}
