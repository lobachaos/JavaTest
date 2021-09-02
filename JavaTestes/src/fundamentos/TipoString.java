package fundamentos;

public class TipoString {
	public static void main(String[] args) {
//String é um objeto IMUTAVEL

		String s = "Ola";
		s = s.toUpperCase();

		System.out.println("s");

		var nome = "Samara";
		var sobrenome = "Oliveira";
		var idade = 21;
		// %s substitui as strings %d numeros
		System.out.printf("Você se chama : %s %s e tem %d anos.", nome, sobrenome, idade);
		System.out.println("\nTestando Funções");

	}
}
