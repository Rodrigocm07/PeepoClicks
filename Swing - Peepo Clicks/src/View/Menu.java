package View;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
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
        ImageIcon imagemBackground = new ImageIcon("C:\\Users\\ADM\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\Menu.png");
        //ImageIcon imagemBackground = new ImageIcon("C:\\Users\\Dev\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\Menu.png");
        JLabel labelBackground = new JLabel(imagemBackground);
        labelBackground.setBounds(0, 0, 1280, 720);

        // Adiciona o fundo como último elemento
        getContentPane().add(labelBackground);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovoJogo = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovoJogo.setOpaque(false);
        btnNovoJogo.setContentAreaFilled(false);
        btnNovoJogo.setBorderPainted(false);
        btnNovoJogo.setFocusPainted(false);
        btnNovoJogo.setBackground(new java.awt.Color(51, 51, 51));
        btnNovoJogo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/NovoJogo.png"))); // NOI18N
        btnNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoJogo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/NovoJogo(p).png"))); // NOI18N
        btnNovoJogo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/NovoJogo(s).png"))); // NOI18N
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
            }
        });

        btnContinuar.setOpaque(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setFocusPainted(false);
        btnContinuar.setBackground(new java.awt.Color(51, 51, 51));
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Continuar.png"))); // NOI18N
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Continuar(p).png"))); // NOI18N
        btnContinuar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Continuar(s).png"))); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnSair.setOpaque(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setBorderPainted(false);
        btnSair.setFocusPainted(false);
        btnSair.setBackground(new java.awt.Color(51, 51, 51));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Sair.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Sair(p).png"))); // NOI18N
        btnSair.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Sair(s).png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(498, 498, 498))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
        
        Jogo jogo = new Jogo();
        jogo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoJogoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        
        Continuar continuar = new Continuar();
        continuar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnContinuarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()
                -> new Menu().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.JButton btnSair;
    // End of variables declaration//GEN-END:variables

}
