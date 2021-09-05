package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args)throws SQLException {
		
		Connection conexao = ConexaoAuto.getConexao();
		
		System.out.println("Conexao Estabelecida");
		conexao.close();
			
			
	}
}
