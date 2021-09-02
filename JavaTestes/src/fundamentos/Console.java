package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// Formas de "printar" o console , imprimir

		System.out.print("Bom Dia ! \n");
		System.out.printf("Nome : %s", "Samara\n");
		System.out.println("Ja quebra a linha pro próximo automaticamente");
		System.out.println("Test Quebra de linha");

		// o Scanner precisa ser fechado !
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome : ");
		String nome = entrada.nextLine();

		System.out.println("Digite sua idade : ");
		int idade = entrada.nextInt();

		System.out.printf("Seu nome é %s e sua idade é  %d anos. ", nome, idade);
		// nao esquecer dos argumentos no printf

		entrada.close(); // Fechamento do Scanner
	}

}
