package controle;

import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; 
		
		Scanner entrada = new Scanner(System.in);
			
			
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
		if ( numero >= 0 && numero <=10 ) {
		if (numero % 2 == 0) {
			System.out.println("O número é par ");
		} else {
			System.out.println("O número é impar");
		}
		
				}
		else
			System.out.println("O número " + numero + " não está entre 0 e 10");

	entrada.close();

}

}
