package controle;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
//		//Criar um programa informa se o ano atual é um ano bissexto; 
//		Caso 1) É um número divisível por 4, mas não é divisível por 100. tem q retornar número inteiros
//	Caso 2) É um número divisível por 4, por 100 e por 400.
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();

		int bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		entrada.close();
		
		
		
		
	}

}
