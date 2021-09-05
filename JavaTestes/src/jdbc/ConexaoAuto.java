package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoAuto  {
	public static Connection getConexao()  {
	try {
		Properties prop = getProperties();
	String url = prop.getProperty("banco.url");
	String user = prop.getProperty("banco.usuario");
	String passwd = prop.getProperty("banco.senha");
	
	return DriverManager.getConnection(url,user,passwd);
	}
	catch(SQLException | IOException e) {
		throw new RuntimeException(e);
	}
		
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		InputStream stream = new FileInputStream("/home/lobachaos/git/JavaTest/conexao.properties");
		prop.load(stream);
		return prop;
	}
}
