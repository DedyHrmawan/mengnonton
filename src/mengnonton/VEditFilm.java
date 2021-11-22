/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengnonton;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author dblenk
 */
public class VEditFilm extends javax.swing.JFrame {

    /**
     * Creates new form VMakanan
     */
    public VEditFilm() {
        initComponents();
        this.setExtendedState(VEditFilm.MAXIMIZED_BOTH);
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
        headpanel = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FormIDFlm = new javax.swing.JTextField();
        FormJudulFilm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FormDurasi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FormRating = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1000, 700));

        sidepanel.setBackground(new java.awt.Color(0, 8, 66));
        sidepanel.setForeground(new java.awt.Color(255, 255, 255));
        sidepanel.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        sidepanel.setRequestFocusEnabled(false);

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
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Mfilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MMakanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(MJudul))
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

        headpanel.setBackground(new java.awt.Color(12, 33, 193));
        headpanel.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/film.png"))); // NOI18N
        LMakanan.setText("Film");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Edit Data Film");

        javax.swing.GroupLayout headpanelLayout = new javax.swing.GroupLayout(headpanel);
        headpanel.setLayout(headpanelLayout);
        headpanelLayout.setHorizontalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addGroup(headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headpanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LMakanan))
                    .addGroup(headpanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headpanelLayout.setVerticalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("ID Film");

        FormIDFlm.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormIDFlm.setForeground(new java.awt.Color(0, 8, 66));
        FormIDFlm.setText("ID Film");
        FormIDFlm.setToolTipText("");
        FormIDFlm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormIDFlm.setCaretColor(new java.awt.Color(0, 8, 66));
        FormIDFlm.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormIDFlm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormIDFlmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormIDFlmFocusLost(evt);
            }
        });

        FormJudulFilm.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormJudulFilm.setForeground(new java.awt.Color(0, 8, 66));
        FormJudulFilm.setText("Judul Film");
        FormJudulFilm.setToolTipText("");
        FormJudulFilm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormJudulFilm.setCaretColor(new java.awt.Color(0, 8, 66));
        FormJudulFilm.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormJudulFilm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormJudulFilmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormJudulFilmFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Judul FIlm");

        FormDurasi.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormDurasi.setForeground(new java.awt.Color(0, 8, 66));
        FormDurasi.setText("Durasi Film");
        FormDurasi.setToolTipText("");
        FormDurasi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormDurasi.setCaretColor(new java.awt.Color(0, 8, 66));
        FormDurasi.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormDurasi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormDurasiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormDurasiFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Durasi Film");

        FormRating.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormRating.setForeground(new java.awt.Color(0, 8, 66));
        FormRating.setText("Rating Film");
        FormRating.setToolTipText("");
        FormRating.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormRating.setCaretColor(new java.awt.Color(0, 8, 66));
        FormRating.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormRating.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormRatingFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormRatingFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Rating Film");

        jButton1.setBackground(new java.awt.Color(12, 33, 193));
        jButton1.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan.png"))); // NOI18N
        jButton1.setText("SIMPAN");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(FormRating, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(FormIDFlm)
                            .addComponent(FormJudulFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(FormDurasi, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(headpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDFlm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormJudulFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormRating, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormIDFlmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormIDFlmFocusGained
        // TODO add your handling code here:
        if (FormIDFlm.getText().equals("ID Film")) {
            FormIDFlm.setText("");
        }
    }//GEN-LAST:event_FormIDFlmFocusGained

    private void FormIDFlmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormIDFlmFocusLost
        // TODO add your handling code here:
        if (FormIDFlm.getText().equals("")) {
            FormIDFlm.setText("ID Film");
        }
    }//GEN-LAST:event_FormIDFlmFocusLost

    private void FormJudulFilmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormJudulFilmFocusGained
        // TODO add your handling code here:
        if (FormJudulFilm.getText().equals("Judul Film")) {
            FormJudulFilm.setText("");
        }
    }//GEN-LAST:event_FormJudulFilmFocusGained

    private void FormJudulFilmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormJudulFilmFocusLost
        // TODO add your handling code here:
        if (FormJudulFilm.getText().equals("")) {
            FormJudulFilm.setText("Judul Film");
        }
    }//GEN-LAST:event_FormJudulFilmFocusLost

    private void FormDurasiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormDurasiFocusGained
        // TODO add your handling code here:
        if (FormDurasi.getText().equals("Durasi Film")) {
            FormDurasi.setText("");
        }
    }//GEN-LAST:event_FormDurasiFocusGained

    private void FormDurasiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormDurasiFocusLost
        // TODO add your handling code here:
        if (FormDurasi.getText().equals("")) {
            FormDurasi.setText("Durasi Film");
        }
    }//GEN-LAST:event_FormDurasiFocusLost

    private void FormRatingFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormRatingFocusGained
        // TODO add your handling code here:
        if (FormRating.getText().equals("Rating Film")) {
            FormRating.setText("");
        }
    }//GEN-LAST:event_FormRatingFocusGained

    private void FormRatingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormRatingFocusLost
        // TODO add your handling code here:
        if (FormRating.getText().equals("")) {
            FormRating.setText("Rating Film");
        }
    }//GEN-LAST:event_FormRatingFocusLost

    private void MfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfilmActionPerformed
        // TODO add your handling code here:
        new VFilm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MfilmActionPerformed

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
            java.util.logging.Logger.getLogger(VEditFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEditFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEditFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEditFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                
                new VEditFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FormDurasi;
    private javax.swing.JTextField FormIDFlm;
    private javax.swing.JTextField FormJudulFilm;
    private javax.swing.JTextField FormRating;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JButton MJadwal;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MMakanan;
    private javax.swing.JButton MMinuman;
    private javax.swing.JButton MStudio;
    private javax.swing.JButton Mfilm;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel headpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
