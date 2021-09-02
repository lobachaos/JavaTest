package jdbc;

public class DaoTeste {
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Maria Eduarda");
		dao.incluir(sql, "Luca");
		
		System.out.println(dao.incluir(sql, "Testando"));
	}
}
