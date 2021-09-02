package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {
	public static void main(String[] args) throws SQLException {
		Connection conexao = ConexaoAuto.getConexao();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o ID : ");
		int id = entrada.nextInt();

		String select = "SELECT codigo,nome FROM pessoas where codigo = ?";
		String update = "UPDATE pessoas SET nome = (?) WHERE codigo = ? ";

		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();

		if (result.next()) {
			Pessoa p = new Pessoa(result.getInt(1), result.getString(2));

			System.out.println("O nome atual é : " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome : ");
			String novoNome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println("Atualizado");
			
			
		} else {
			System.out.println("Nao existe");

		}

		entrada.close();
		conexao.close();

	}

}
