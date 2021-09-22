package api;

public class ExplorandoString {
	public static void main(String[] args) {
		
		String nome = "Samara";
		System.out.println(nome.length());
		System.out.println(nome.substring(0,2));
		System.out.println(nome.indexOf('m'));
		System.out.println(nome.charAt(0));
		
		//String é imutável ! 
		System.out.println(nome);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Testando");
		sb.append("Ixi");
		sb.append("123");
		sb.toString();
		
		System.out.println(sb);
		
	}
}
