package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Connection conexao = ConexaoAuto.getConexao();

		System.out.println("Informe o nome : ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		// seguro contra SQL Injection
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		System.out.println("Pessoa incluida com sucesso");

		entrada.close();

	}

}
