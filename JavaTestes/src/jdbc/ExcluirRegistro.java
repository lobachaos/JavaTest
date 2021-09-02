package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro {
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = ConexaoAuto.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o ID a ser exlcuido");
		int id = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		int contador = stmt.executeUpdate();
		if(contador > 0) {
			System.out.println("Realizado com Sucesso");
			System.out.println("Linhas alteradas : " + contador);
		}else {
			System.out.println("Nada foi alterado.");
		}
		
		
		
		
		
		
		entrada.close();
		conexao.close();
		
	}

}
