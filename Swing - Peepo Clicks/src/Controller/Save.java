package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Save {

    public static void salvar(int slot, int pontos, int incrementoAtivo, int incrementoPassivo, int multiplicador,
                            boolean u1, boolean u2, boolean u3, boolean u4, boolean u5, boolean u6,
                            boolean m2x, boolean m4x, boolean m10x) {

        String sql = "UPDATE jogo SET " +
                "pontos = ?, incrementoAtivo = ?, incrementoPassivo = ?, multiplicador = ?, " +
                "comprouUpgrade1 = ?, comprouUpgrade2 = ?, comprouUpgrade3 = ?, " +
                "comprouUpgrade4 = ?, comprouUpgrade5 = ?, comprouUpgrade6 = ?, " +
                "comprouUpgrade7 = ?, comprouUpgrade8 = ?, comprouUpgrade9 = ? " +
                "WHERE slot = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, pontos);
            stmt.setInt(2, incrementoAtivo);
            stmt.setInt(3, incrementoPassivo);
            stmt.setInt(4, multiplicador);

            stmt.setBoolean(5, u1);
            stmt.setBoolean(6, u2);
            stmt.setBoolean(7, u3);
            stmt.setBoolean(8, u4);
            stmt.setBoolean(9, u5);
            stmt.setBoolean(10, u6);

            stmt.setBoolean(11, m2x);
            stmt.setBoolean(12, m4x);
            stmt.setBoolean(13, m10x);
            
            stmt.setInt(14, slot);

            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Jogo salvo no slot " + slot + " com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: Slot não encontrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}