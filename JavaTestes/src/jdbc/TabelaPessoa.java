package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TabelaPessoa  {
	public static void main(String[] args)throws SQLException {
		Connection conexao = ConexaoAuto.getConexao();
		String sql = "CREATE TABLE pessoas("
				+ "codigo SERIAL PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		System.out.println("Executado");
		conexao.close();
		
		
	}

}
