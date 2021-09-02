package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("João");
		Usuario user2 = new Usuario("João");
		
		System.out.println(user1.equals(user2)); // por padrão equals tem mesmo comportamento
		// do ===
	
		
	}
}
