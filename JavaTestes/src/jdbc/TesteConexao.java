package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args)throws SQLException {
		
		String stringConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSLL=true";
		String user = "root";
		String passwd = "123456";
		
		Connection conexao = DriverManager.getConnection(stringConexao,user,passwd);
		conexao.close();
		System.out.println("Conexao Estabelecida");
			
			
	}
}
