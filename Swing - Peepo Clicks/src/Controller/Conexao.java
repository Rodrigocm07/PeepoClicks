package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Dados de conexão
    private static final String URL = "jdbc:mysql://localhost:3306/peepo";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    // Objeto de conexão
    private static Connection connect = null;

    // Método para obter conexão
    public static Connection getConnection() throws SQLException {
        if (connect == null || connect.isClosed()) {
            try {
                connect = DriverManager.getConnection(URL, USUARIO, SENHA);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao conectar: " + e.getMessage());
                throw e; // Re-lança a exceção para tratamento posterior
            }
        }
        return connect;
    }

    // Método para fechar conexão
    public static void closeConnection() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão: " + e.getMessage());
        } finally {
            connect = null; // Garante que a referência seja limpa
        }
    }
}