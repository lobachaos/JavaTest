package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
	public static void main(String[] args) throws SQLException {
		Connection conexao = ConexaoAuto.getConexao();
		Scanner entrada = new Scanner(System.in);
		String sql = "SELECT * FROM pessoas WHERE nome LIKE (?) ";

		System.out.println("Insira o que vai ser procurado : ");
		String search = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + search + "%");
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));

		}
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + "--> " + p.getNome());
		}

		stmt.close();
		conexao.close();
		entrada.close();

	}

}
