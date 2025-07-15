package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Load {

    public static GameState carregar(int slot) {
        String sql = "SELECT * FROM jogo WHERE slot = ?";
        GameState estado = null;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, slot);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                estado = new GameState(
                    rs.getInt("pontos"),
                    rs.getInt("incrementoAtivo"),
                    rs.getInt("incrementoPassivo"),
                    rs.getInt("multiplicador"),
                    rs.getBoolean("comprouUpgrade1"),
                    rs.getBoolean("comprouUpgrade2"),
                    rs.getBoolean("comprouUpgrade3"),
                    rs.getBoolean("comprouUpgrade4"),
                    rs.getBoolean("comprouUpgrade5"),
                    rs.getBoolean("comprouUpgrade6"),
                    rs.getBoolean("comprouUpgrade7"),
                    rs.getBoolean("comprouUpgrade8"),
                    rs.getBoolean("comprouUpgrade9")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estado;
    }
    
    public static class GameState {
        public final int pontos;
        public final int incrementoAtivo;
        public final int incrementoPassivo;
        public final int multiplicador;
        public final boolean u1, u2, u3, u4, u5, u6;
        public final boolean m2x, m4x, m10x;

        public GameState(int pontos, int incrementoAtivo, int incrementoPassivo, int multiplicador,
                        boolean u1, boolean u2, boolean u3, boolean u4, boolean u5, boolean u6,
                        boolean m2x, boolean m4x, boolean m10x) {
            this.pontos = pontos;
            this.incrementoAtivo = incrementoAtivo;
            this.incrementoPassivo = incrementoPassivo;
            this.multiplicador = multiplicador;
            this.u1 = u1;
            this.u2 = u2;
            this.u3 = u3;
            this.u4 = u4;
            this.u5 = u5;
            this.u6 = u6;
            this.m2x = m2x;
            this.m4x = m4x;
            this.m10x = m10x;
        }
    }
}