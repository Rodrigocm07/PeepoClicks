package View;

import Controller.Load;
import Controller.Save;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Jogo extends javax.swing.JFrame {


    public Jogo() {
        initComponents();


        setSize(1280, 720);
        setTitle("Peepo Clicks - A jornada pelo sorriso");
        setLocationRelativeTo(null);
        setResizable(false);

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
        ImageIcon imagemBackground = new ImageIcon("C:\\Users\\ADM\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\peepoclicks.gif");
        //ImageIcon imagemBackground = new ImageIcon("C:\\Users\\Dev\\Documents\\NetBeansProjects\\Swing - Peepo Clicks\\src\\Resource\\Fundo\\peepoclicks.gif");
        JLabel labelBackground = new JLabel(imagemBackground);
        labelBackground.setBounds(0, 0, 1280, 720);

        // Adiciona o fundo como último elemento
        getContentPane().add(labelBackground);

        Menu_Jogo.configurarPara(this, this::salvarProgresso);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClicar = new javax.swing.JButton();
        LContador = new javax.swing.JLabel();
        JUpdate = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        btnUpdate2 = new javax.swing.JButton();
        btnUpdate3 = new javax.swing.JButton();
        btnUpdate4 = new javax.swing.JButton();
        btnUpdate5 = new javax.swing.JButton();
        btnUpdate6 = new javax.swing.JButton();
        btnUpdate7 = new javax.swing.JButton();
        btnUpdate8 = new javax.swing.JButton();
        btnUpdate9 = new javax.swing.JButton();
        JUpdate1 = new javax.swing.JLabel();
        JUpdate2 = new javax.swing.JLabel();
        LStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClicar.setOpaque(false);
        btnClicar.setContentAreaFilled(false);
        btnClicar.setBorderPainted(false);
        btnClicar.setFocusPainted(false);
        btnClicar.setBackground(new java.awt.Color(51, 51, 51));
        btnClicar.setForeground(new java.awt.Color(0, 0, 0));
        btnClicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Elementos/bits.png"))); // NOI18N
        btnClicar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Elementos/bits(p).png"))); // NOI18N
        btnClicar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Elementos/bits(s).png"))); // NOI18N
        btnClicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicarActionPerformed(evt);
            }
        });

        LContador.setBackground(new java.awt.Color(51, 51, 51));
        LContador.setFont(new java.awt.Font("Retro Gaming", 3, 24)); // NOI18N
        LContador.setForeground(new java.awt.Color(255, 255, 255));
        LContador.setText("Alegria:");

        JUpdate.setBackground(new java.awt.Color(51, 51, 51));
        JUpdate.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        JUpdate.setForeground(new java.awt.Color(255, 255, 255));
        JUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JUpdate.setText("ATIVO:");

        btnUpdate1.setContentAreaFilled(false);
        btnUpdate1.setBorderPainted(false);
        btnUpdate1.setFocusPainted(false);
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/dedo animado.png"))); // NOI18N
        btnUpdate1.setToolTipText("Dedo Animado: 500 Alegria");
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/dedo animado(p).png"))); // NOI18N
        btnUpdate1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/dedo animado(s).png"))); // NOI18N
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnUpdate2.setContentAreaFilled(false);
        btnUpdate2.setBorderPainted(false);
        btnUpdate2.setFocusPainted(false);
        btnUpdate2.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/click do poggers.png"))); // NOI18N
        btnUpdate2.setToolTipText("Click do Poggers: 2.000 Alegria");
        btnUpdate2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/click do poggers(p).png"))); // NOI18N
        btnUpdate2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/click do poggers (s).png"))); // NOI18N
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });

        btnUpdate3.setContentAreaFilled(false);
        btnUpdate3.setBorderPainted(false);
        btnUpdate3.setFocusPainted(false);
        btnUpdate3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo turbo.png"))); // NOI18N
        btnUpdate3.setToolTipText("Peepo Turbo: 10.000 Alegria");
        btnUpdate3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo turbo(p).png"))); // NOI18N
        btnUpdate3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo turbo(s).png"))); // NOI18N
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });

        btnUpdate4.setContentAreaFilled(false);
        btnUpdate4.setBorderPainted(false);
        btnUpdate4.setFocusPainted(false);
        btnUpdate4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/Mini peepos.png"))); // NOI18N
        btnUpdate4.setToolTipText("Mini Peepos: 1.000 Alegria");
        btnUpdate4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/mini peepo(p).png"))); // NOI18N
        btnUpdate4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/mini peepo(s).png"))); // NOI18N
        btnUpdate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate4ActionPerformed(evt);
            }
        });

        btnUpdate5.setContentAreaFilled(false);
        btnUpdate5.setBorderPainted(false);
        btnUpdate5.setFocusPainted(false);
        btnUpdate5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo Streamer.png"))); // NOI18N
        btnUpdate5.setToolTipText("Peepo Streamer: 5.000 Alegria");
        btnUpdate5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo streamer(p).png"))); // NOI18N
        btnUpdate5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo streamer(s).png"))); // NOI18N
        btnUpdate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate5ActionPerformed(evt);
            }
        });

        btnUpdate6.setContentAreaFilled(false);
        btnUpdate6.setBorderPainted(false);
        btnUpdate6.setFocusPainted(false);
        btnUpdate6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo master.png"))); // NOI18N
        btnUpdate6.setToolTipText("Peepo Mestre: 25.000 Alegria");
        btnUpdate6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo streamer(p).png"))); // NOI18N
        btnUpdate6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/peepo master(s).png"))); // NOI18N
        btnUpdate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate6ActionPerformed(evt);
            }
        });

        btnUpdate7.setContentAreaFilled(false);
        btnUpdate7.setBorderPainted(false);
        btnUpdate7.setFocusPainted(false);
        btnUpdate7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/combo de alegria.png"))); // NOI18N
        btnUpdate7.setToolTipText("Combo de Alegria: 50.000 Alegria");
        btnUpdate7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/combo de alegria(p).png"))); // NOI18N
        btnUpdate7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/combo de alegria(s).png"))); // NOI18N
        btnUpdate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate7ActionPerformed(evt);
            }
        });

        btnUpdate8.setContentAreaFilled(false);
        btnUpdate8.setBorderPainted(false);
        btnUpdate8.setFocusPainted(false);
        btnUpdate8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/efeito peepo.png"))); // NOI18N
        btnUpdate8.setToolTipText("Efeito Peepo: 150.000 Alegria");
        btnUpdate8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/efeito peepo(p).png"))); // NOI18N
        btnUpdate8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/efeito peepo(s).png"))); // NOI18N
        btnUpdate8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate8ActionPerformed(evt);
            }
        });

        btnUpdate9.setContentAreaFilled(false);
        btnUpdate9.setBorderPainted(false);
        btnUpdate9.setFocusPainted(false);
        btnUpdate9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/chuva de emote.png"))); // NOI18N
        btnUpdate9.setToolTipText("Chuva de Emote: 500.000 Alegria");
        btnUpdate9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/chuva de emote(p).png"))); // NOI18N
        btnUpdate9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Botoes/chuva de emote(s).png"))); // NOI18N
        btnUpdate9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate9ActionPerformed(evt);
            }
        });

        JUpdate1.setBackground(new java.awt.Color(51, 51, 51));
        JUpdate1.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        JUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        JUpdate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JUpdate1.setText("ESPECIAL:");

        JUpdate2.setBackground(new java.awt.Color(51, 51, 51));
        JUpdate2.setFont(new java.awt.Font("Retro Gaming", 1, 18)); // NOI18N
        JUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        JUpdate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JUpdate2.setText("PASSIVO:");

        LStatus.setFont(new java.awt.Font("Retro Gaming", 2, 24)); // NOI18N
        LStatus.setForeground(new java.awt.Color(255, 255, 255));
        LStatus.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LContador, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClicar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JUpdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JUpdate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(JUpdate2)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(JUpdate1)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnClicar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LContador)
                    .addComponent(LStatus))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int pontos = 0;
    private int incrementoAtivo = 1;
    private int incrementoPassivo = 0;
    private int multiplicador = 1;
    private int slotAtual = 1;
    //BOOLEANO
    private boolean comprouUpgrade1 = false;
    private boolean comprouUpgrade2 = false;
    private boolean comprouUpgrade3 = false;
    private boolean comprouUpgrade4 = false;
    private boolean comprouUpgrade5 = false;
    private boolean comprouUpgrade6 = false;
    private boolean comprouMultiplicador2x = false;
    private boolean comprouMultiplicador4x = false;
    private boolean comprouMultiplicador10x = false;
    private boolean finalAlcancado = false;

    // BOTÕES E ATUALIZAÇÃO DE INTERFACE
    private void atualizarInterface() {
        LContador.setText("Alegria: " + pontos);
        LStatus.setText("A: " + incrementoAtivo + " | P: " + incrementoPassivo + " | M: x" + multiplicador);

        if (pontos >= 1_000_000 && !finalAlcancado) {
            finalAlcancado = true;
            mostrarFinalDoJogo();
        }

    }

    private Timer timerPassivo;

    private void iniciarGeracaoPassiva() {
        if (timerPassivo == null) {
            timerPassivo = new Timer(1000, e -> {
                if (incrementoPassivo > 0) {
                    pontos += incrementoPassivo * multiplicador;
                    atualizarInterface();
                }
            });
            timerPassivo.start();
        }
    }


    private void btnClicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClicarActionPerformed
        pontos += incrementoAtivo * multiplicador;
        atualizarInterface();
    }//GEN-LAST:event_btnClicarActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        final int CUSTO = 1;
        final int AUMENTO = 1;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoAtivo += AUMENTO;

            if (!comprouUpgrade1) {
                comprouUpgrade1 = true;
                String msg = UpgradeMensagens.upgrade1();
                JOptionPane.showMessageDialog(this, msg, "⚡ Novo Poder!", JOptionPane.PLAIN_MESSAGE);
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed
        final int CUSTO = 2000;
        final int AUMENTO = 3;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoAtivo += AUMENTO;

            if (!comprouUpgrade2) {
                comprouUpgrade2 = true;
                String msg = UpgradeMensagens.upgrade2();
                JOptionPane.showMessageDialog(this, msg, "⚡ Novo Poder!", JOptionPane.PLAIN_MESSAGE);
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed
        final int CUSTO = 10000;
        final int AUMENTO = 7;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoAtivo += AUMENTO;

            if (!comprouUpgrade3) {
                comprouUpgrade3 = true;
                String msg = UpgradeMensagens.upgrade3();
                JOptionPane.showMessageDialog(this, msg, "⚡ Novo Poder!", JOptionPane.PLAIN_MESSAGE);
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate3ActionPerformed

    private void btnUpdate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate4ActionPerformed
        final int CUSTO = 1000;
        final int AUMENTO = 1;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoPassivo += AUMENTO;

            if (!comprouUpgrade4) {
                comprouUpgrade4 = true;
                String msg = UpgradeMensagens.upgrade4();
                JOptionPane.showMessageDialog(this, msg, "✨ Novo Ajudante!", JOptionPane.PLAIN_MESSAGE);
                iniciarGeracaoPassiva();
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate4ActionPerformed

    private void btnUpdate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate5ActionPerformed
        final int CUSTO = 5000;
        final int AUMENTO = 5;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoPassivo += AUMENTO;

            if (!comprouUpgrade5) {
                comprouUpgrade5 = true;
                String msg = UpgradeMensagens.upgrade5();
                JOptionPane.showMessageDialog(this, msg, "📡 Nova Fonte de Alegria!", JOptionPane.PLAIN_MESSAGE);
                iniciarGeracaoPassiva();
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate5ActionPerformed

    private void btnUpdate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate6ActionPerformed
        final int CUSTO = 25000;
        final int AUMENTO = 10;

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            incrementoPassivo += AUMENTO;

            if (!comprouUpgrade6) {
                comprouUpgrade6 = true;
                String msg = UpgradeMensagens.upgrade6();
                JOptionPane.showMessageDialog(this, msg, "🧘 Concentração Elevada!", JOptionPane.PLAIN_MESSAGE);
                iniciarGeracaoPassiva();
            }

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate6ActionPerformed

    private void btnUpdate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate7ActionPerformed
        final int CUSTO = 50000;
        final int MULT = 2;

        if (comprouMultiplicador2x) {
            return;
        }

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            multiplicador *= MULT;
            comprouMultiplicador2x = true;
            btnUpdate7.setEnabled(false);
            String msg = UpgradeMensagens.upgrade7();
            JOptionPane.showMessageDialog(this, msg, "🌀 Combo Ativado!", JOptionPane.PLAIN_MESSAGE);

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate7ActionPerformed

    private void btnUpdate8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate8ActionPerformed
        final int CUSTO = 150000;
        final int MULT = 4;

        if (comprouMultiplicador4x) {
            return;
        }

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            multiplicador *= MULT;
            comprouMultiplicador4x = true;
            btnUpdate8.setEnabled(false);
            String msg = UpgradeMensagens.upgrade8();
            JOptionPane.showMessageDialog(this, msg, "🌟 Poder Máximo!", JOptionPane.PLAIN_MESSAGE);

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate8ActionPerformed

    private void btnUpdate9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate9ActionPerformed
        final int CUSTO = 500000;
        final int MULT = 10;

        if (comprouMultiplicador10x) {
            return;
        }

        if (pontos >= CUSTO) {
            pontos -= CUSTO;
            multiplicador *= MULT;
            comprouMultiplicador10x = true;
            btnUpdate9.setEnabled(false);
            String msg = UpgradeMensagens.upgrade9();
            JOptionPane.showMessageDialog(this, msg, "🌧️ Chuva de Emotes!", JOptionPane.PLAIN_MESSAGE);

            atualizarInterface();
        } else {
            mostrarAvisoAlegriaInsuficiente(CUSTO);
        }
    }//GEN-LAST:event_btnUpdate9ActionPerformed

    void setSlotAtual(int slot) {
        this.slotAtual = slot;
    }

    public class UpgradeMensagens {

        public static String gerarMensagemUpgradeHTML(String titulo, String bonus, String descricao) {
            return """
            <html>
                <div style='
                    text-align: center;
                    font-family: retro gaming;
                    padding: 10px;
                    background: #f5f5f5;
                    border-radius: 8px;
                    width:250px ;
                    height:200px ;
                '>
                    <h2 style='color: #35b50e; margin-top: 0;'>
                        """ + titulo + """
                    </h2>
                    <hr style='border: 1px solid #e0e0e0; width: 80%;'>
                    <p style='font-size: 14px;'>
                        <span style='color: #ff6b00; font-weight: bold;'>✨ Bônus:</span> 
                        """ + bonus + """
                    </p>
                    <p style='font-size: 12px; color: #666;'>
                        """ + descricao + """
                    </p>
                </div>
            </html>
            """;
        }

        // Upgrades Ativos
        public static String upgrade1() {
            return gerarMensagemUpgradeHTML(
                    "🖐️ Dedo Animado Desbloqueado!",
                    "+1 Alegria por clique",
                    "Após visitar o Vale do Meme, Peepo encontra a Luva Animada. Agora seus cliques são pura energia!"
            );
        }

        public static String upgrade2() {
            return gerarMensagemUpgradeHTML(
                    "👏 Click do Poggers Ativado!",
                    "+3 Alegria por clique",
                    "Nas Nuvens do Pog, Peepo aprende o lendário gesto do Pog. Seus cliques agora causam comoção positiva!"
            );
        }

        public static String upgrade3() {
            return gerarMensagemUpgradeHTML(
                    "💨 Peepo Turbo Desbloqueado!",
                    "+7 Alegria por clique",
                    "Na Caverna do MonkaS, Peepo encontra um cristal de velocidade. Seus cliques desafiam o tempo!"
            );
        }

        // Upgrades Passivos
        public static String upgrade4() {
            return gerarMensagemUpgradeHTML(
                    "💤 Mini Peepos Recrutados!",
                    "+1 Alegria por segundo",
                    "Peepo encontrou ajudantes em miniatura gerados pela Alegria. Eles trabalham incansavelmente ao seu lado!"
            );
        }

        public static String upgrade5() {
            return gerarMensagemUpgradeHTML(
                    "📡 Peepo Streamer Ligado!",
                    "+5 Alegria por segundo",
                    "Um transmissor mágico transmite alegria em tempo real para Emoteia. Peepo agora viralizou!"
            );
        }

        public static String upgrade6() {
            return gerarMensagemUpgradeHTML(
                    "🧘 Peepo Mestre Iluminado!",
                    "+10 Alegria por segundo",
                    "Após treinar com o Sábio Emoteiro, Peepo medita e emana alegria mesmo parado."
            );
        }

        // Multiplicadores
        public static String upgrade7() {
            return gerarMensagemUpgradeHTML(
                    "🌀 Combo da Alegria!",
                    "Multiplicador x2",
                    "Ao dominar o ritmo dos cliques, Peepo ativa combos que dobram sua eficiência."
            );
        }

        public static String upgrade8() {
            return gerarMensagemUpgradeHTML(
                    "🌟 Efeito Peepo!",
                    "Multiplicador x4",
                    "Peepo libera seu poder máximo, gerando empatia e alegria em níveis cósmicos."
            );
        }

        public static String upgrade9() {
            return gerarMensagemUpgradeHTML(
                    "🌧️ Chuva de Emotes!",
                    "Multiplicador x10",
                    "Quando a alegria atinge o ápice, o céu se abre e emotes mágicos caem em festival."
            );
        }
    }

    private void mostrarAvisoAlegriaInsuficiente(int custo) {
        JOptionPane.showMessageDialog(
                this,
                "<html><div style='padding: 8px; text-align: center;'>"
                + "Você precisa de mais <b style='color:#d32f2f;'>" + (custo - pontos) + "</b> alegria!"
                + "<br><br>Continue clicando para conseguir!"
                + "</div></html>",
                "Recursos Insuficientes",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public void carregarEstado(Load.GameState estado) {
        if (estado != null) {
            this.pontos = estado.pontos;
            this.incrementoAtivo = estado.incrementoAtivo;
            this.incrementoPassivo = estado.incrementoPassivo;
            this.multiplicador = estado.multiplicador;

            this.comprouUpgrade1 = estado.u1;
            this.comprouUpgrade2 = estado.u2;
            this.comprouUpgrade3 = estado.u3;
            this.comprouUpgrade4 = estado.u4;
            this.comprouUpgrade5 = estado.u5;
            this.comprouUpgrade6 = estado.u6;

            this.comprouMultiplicador2x = estado.m2x;
            this.comprouMultiplicador4x = estado.m4x;
            this.comprouMultiplicador10x = estado.m10x;

            atualizarInterface();

            if (incrementoPassivo > 0) {
                iniciarGeracaoPassiva();
            }
        }
    }

// Atualize o método salvarProgresso
    public void salvarProgresso() {
        Save.salvar(
                slotAtual,
                pontos,
                incrementoAtivo,
                incrementoPassivo,
                multiplicador,
                comprouUpgrade1,
                comprouUpgrade2,
                comprouUpgrade3,
                comprouUpgrade4,
                comprouUpgrade5,
                comprouUpgrade6,
                comprouMultiplicador2x,
                comprouMultiplicador4x,
                comprouMultiplicador10x
        );
    }

    private void mostrarFinalDoJogo() {
        String mensagemFinal = """
    <html>
        <div style='
            background-color: #f5f5f5;
            border: 2px solid #4CAF50;
            border-radius: 10px;
            padding: 15px;
            width: 300px;
            font-family: retro gaming;
            text-align: center;
        '>
            <h2 style='color: #4CAF50;'>🏁 Fim da Jornada!</h2>
            <p style='font-size: 14px; color: #333;'>
                Peepo alcançou <b>1.000.000</b> de alegria!<br><br>
                O mundo sorri com ele agora 🌎💚<br>
                Você libertou a verdadeira essência da positividade.
            </p>
            <hr>
            <p style='font-size: 12px; color: #888;'>Obrigado por jogar ✨</p>
        </div>
    </html>
    """;

        JOptionPane.showMessageDialog(this, mensagemFinal, "🌟 Final do Jogo", JOptionPane.PLAIN_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(()
                -> new Jogo().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JUpdate;
    private javax.swing.JLabel JUpdate1;
    private javax.swing.JLabel JUpdate2;
    private javax.swing.JLabel LContador;
    private javax.swing.JLabel LStatus;
    private javax.swing.JButton btnClicar;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JButton btnUpdate4;
    private javax.swing.JButton btnUpdate5;
    private javax.swing.JButton btnUpdate6;
    private javax.swing.JButton btnUpdate7;
    private javax.swing.JButton btnUpdate8;
    private javax.swing.JButton btnUpdate9;
    // End of variables declaration//GEN-END:variables

}
