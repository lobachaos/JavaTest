package controle;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Criar um programa que receba uma palavra e imprime no console letra
		// por letra.
		String palavra;

		int contador = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma palavra");
		palavra = entrada.nextLine();

		for (contador = 0; contador < palavra.length(); contador++) {
			
			System.out.println(palavra.charAt(contador));
			entrada.close();
		}
		

	}


}