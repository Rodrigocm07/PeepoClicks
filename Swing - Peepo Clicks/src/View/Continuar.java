package View;

import Controller.Conexao;
import Controller.Load;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Continuar extends javax.swing.JFrame {

    public Continuar() {

        setSize(1280, 720);
        setTitle("Peepo Clicks - A jornada pelo sorriso");
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();

// Configurando o JFrame
        setSize(1296, 759);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Criando o JPanel com imagem de fundo
        JPanel P = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                ImageIcon imagemPanel = new ImageIcon("C:\\Users\\dev\\Documents\\NetBeansProjects\\Swing - NPC Revoltado\\src\\Resource\\Menu Iniciar.png");
//                g.drawImage(imagemPanel.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        P.setBounds(50, 50, 700, 873); // Define posição e tamanho
        P.setOpaque(false); // Torna o painel transparente
        P.setLayout(null); // Define layout absoluto no painel

        // Adiciona o painel ao JFrame
        getContentPane().add(P);

        // Configurando o fundo
        ImageIcon imagemBackground = new ImageIcon("C:\\Users\\ADM\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\Continuar.png");
        //ImageIcon imagemBackground = new ImageIcon("C:\\Users\\Dev\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\Continuar.png");
        JLabel labelBackground = new JLabel(imagemBackground);
        labelBackground.setBounds(0, 0, 1280, 720);

        // Adiciona o fundo como último elemento
        getContentPane().add(labelBackground);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnContinuar2 = new javax.swing.JButton();
        btnDeletar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnContinuar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnContinuar3 = new javax.swing.JButton();
        btnDeletar3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnFlecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 126, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        btnContinuar2.setOpaque(false);
        btnContinuar2.setContentAreaFilled(false);
        btnContinuar2.setBorderPainted(false);
        btnContinuar2.setFocusPainted(false);
        btnContinuar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar.png"))); // NOI18N
        btnContinuar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(p).png"))); // NOI18N
        btnContinuar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(s).png"))); // NOI18N
        btnContinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar2ActionPerformed(evt);
            }
        });

        btnDeletar2.setOpaque(false);
        btnDeletar2.setContentAreaFilled(false);
        btnDeletar2.setBorderPainted(false);
        btnDeletar2.setFocusPainted(false);
        btnDeletar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar.png"))); // NOI18N
        btnDeletar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(p).png"))); // NOI18N
        btnDeletar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(s).png"))); // NOI18N
        btnDeletar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Retro Gaming", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SAVE 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnContinuar2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jPanel2.setBackground(new java.awt.Color(81, 126, 90));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        btnContinuar1.setOpaque(false);
        btnContinuar1.setContentAreaFilled(false);
        btnContinuar1.setBorderPainted(false);
        btnContinuar1.setFocusPainted(false);
        btnContinuar1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        btnContinuar1.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar.png"))); // NOI18N
        btnContinuar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(p).png"))); // NOI18N
        btnContinuar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(s).png"))); // NOI18N
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });

        btnDeletar1.setOpaque(false);
        btnDeletar1.setContentAreaFilled(false);
        btnDeletar1.setBorderPainted(false);
        btnDeletar1.setFocusPainted(false);
        btnDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar.png"))); // NOI18N
        btnDeletar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(p).png"))); // NOI18N
        btnDeletar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(s).png"))); // NOI18N
        btnDeletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Retro Gaming", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SAVE  1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeletar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContinuar1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar1)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar1)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(81, 126, 90));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));

        btnContinuar3.setOpaque(false);
        btnContinuar3.setContentAreaFilled(false);
        btnContinuar3.setBorderPainted(false);
        btnContinuar3.setFocusPainted(false);
        btnContinuar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar.png"))); // NOI18N
        btnContinuar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(p).png"))); // NOI18N
        btnContinuar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/btnContinuar(s).png"))); // NOI18N
        btnContinuar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar3ActionPerformed(evt);
            }
        });

        btnDeletar3.setOpaque(false);
        btnDeletar3.setContentAreaFilled(false);
        btnDeletar3.setBorderPainted(false);
        btnDeletar3.setFocusPainted(false);
        btnDeletar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar.png"))); // NOI18N
        btnDeletar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(p).png"))); // NOI18N
        btnDeletar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Deletar(s).png"))); // NOI18N
        btnDeletar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Retro Gaming", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SAVE 3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnDeletar3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinuar3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnFlecha.setOpaque(false);
        btnFlecha.setContentAreaFilled(false);
        btnFlecha.setBorderPainted(false);
        btnFlecha.setFocusPainted(false);
        btnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/flecha.png"))); // NOI18N
        btnFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFlecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/flecha(p).png"))); // NOI18N
        btnFlecha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/flecha(s).png"))); // NOI18N
        btnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnFlecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFlecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarJogo(int slot) {
        Load.GameState estado = Load.carregar(slot);
        if (estado != null) {
            Jogo jogo = new Jogo();
            jogo.carregarEstado(estado);
            jogo.setSlotAtual(slot); // Você precisará adicionar um setter para slotAtual na classe Jogo
            jogo.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum jogo salvo encontrado no slot " + slot);
        }
    }

    private void deletarSave(int slot) {
    int confirmar = JOptionPane.showConfirmDialog(
        this,
        "Tem certeza que deseja deletar o save do slot " + slot + "?",
        "Confirmar exclusão",
        JOptionPane.YES_NO_OPTION
    );
    
    if (confirmar == JOptionPane.YES_OPTION) {
        String sql = "UPDATE jogo SET " +
            "pontos = 0, incrementoAtivo = 1, incrementoPassivo = 0, multiplicador = 1, " +
            "comprouUpgrade1 = FALSE, comprouUpgrade2 = FALSE, comprouUpgrade3 = FALSE, " +
            "comprouUpgrade4 = FALSE, comprouUpgrade5 = FALSE, comprouUpgrade6 = FALSE, " +
            "comprouUpgrade7 = FALSE, comprouUpgrade8 = FALSE, comprouUpgrade9 = FALSE " +
            "WHERE slot = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, slot);
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Save do slot " + slot + " deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao deletar save");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        carregarJogo(1);
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    private void btnContinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar2ActionPerformed
        carregarJogo(2);

    }//GEN-LAST:event_btnContinuar2ActionPerformed

    private void btnContinuar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar3ActionPerformed
        carregarJogo(3);

    }//GEN-LAST:event_btnContinuar3ActionPerformed

    private void btnDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar1ActionPerformed
        deletarSave(1);
    }//GEN-LAST:event_btnDeletar1ActionPerformed

    private void btnDeletar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar2ActionPerformed
        deletarSave(2);
    }//GEN-LAST:event_btnDeletar2ActionPerformed

    private void btnDeletar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar3ActionPerformed
       deletarSave(3);
    }//GEN-LAST:event_btnDeletar3ActionPerformed

    private void btnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaActionPerformed
           
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFlechaActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Continuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Continuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Continuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Continuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()
                -> new Continuar().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JButton btnContinuar2;
    private javax.swing.JButton btnContinuar3;
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnDeletar2;
    private javax.swing.JButton btnDeletar3;
    private javax.swing.JButton btnFlecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
