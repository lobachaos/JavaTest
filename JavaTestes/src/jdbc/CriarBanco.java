package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConexaoAuto.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE Curso_Java");
		conexao.close();
	}

}
