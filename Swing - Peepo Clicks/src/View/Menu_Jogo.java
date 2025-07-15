package View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Menu_Jogo {

    public static void configurarPara(JFrame frame, Runnable acaoSalvar) {
        JRootPane rootPane = frame.getRootPane();

        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ESCAPE"), "abrirMenuRapido");

        rootPane.getActionMap().put("abrirMenuRapido", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPopup(frame, acaoSalvar);
            }
        });
    }

    private static void mostrarPopup(JFrame frame, Runnable acaoSalvar) {
        String[] opcoes = {"💾 Salvar", "🚪 Sair", "❌ Cancelar"};
        int escolha = JOptionPane.showOptionDialog(
                frame,
                "O que deseja fazer?",
                "Menu Rápido",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        switch (escolha) {
            case 0 -> { // Salvar
                Object[] slots = {"Slot 1", "Slot 2", "Slot 3"};
                int slotEscolhido = JOptionPane.showOptionDialog(
                        frame,
                        "Selecione o slot para salvar:",
                        "Salvar Jogo",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        slots,
                        slots[0]
                );

                if (slotEscolhido >= 0 && slotEscolhido <= 2) {
                    if (frame instanceof Jogo) {
                        ((Jogo) frame).setSlotAtual(slotEscolhido + 1);
                    }
                    if (acaoSalvar != null) {
                        acaoSalvar.run();
                    }
                }
            }
            case 1 -> { // Sair
                int confirmar = JOptionPane.showConfirmDialog(
                        frame,
                        "Tem certeza que deseja sair?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirmar == JOptionPane.YES_OPTION) {
                     frame.dispose();
                new Menu().setVisible(true);
                }
            }
            case 2 -> {
                // Cancelar
            }
        }
    }
}
