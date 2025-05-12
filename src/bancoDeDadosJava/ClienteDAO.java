package bancoDeDadosJava;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	private final String url = "jdbc:postgresql://localhost:5432/bancodados";
	private final String user = "postgres";
	private final String password = "dados2204";

	
	public Connection conectar() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

    public void inserir(Cliente cliente) {
        String sql = "insert into cliente (nome, saldo) values (?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setDouble(2, cliente.getSaldo());
            stmt.executeUpdate();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM cliente";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome") + ", Saldo: R$" + rs.getDouble("saldo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, saldo = ? WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setDouble(2, cliente.getSaldo());
            stmt.setInt(3, cliente.getId());
            stmt.executeUpdate();
            System.out.println("Cliente atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
