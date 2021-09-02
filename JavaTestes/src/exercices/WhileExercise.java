package exercices;

import java.util.Scanner;

public class WhileExercise {
	public static void main(String[] args) {
		
//		Crie um programa em Java que recebe um inteiro positivo do usuário
//		e exibe a música inteira na tela, onde o inteiro recebido representa 
//		o número inicial n de patinhos que foram passear.

		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o núumero de patinhos : ");
		int patinhos = entrada.nextInt();
		
		while(patinhos != 0 ) {
			System.out.println(patinhos +" patinhos foram passear\nAlém das montanhas"
					+ "\nPara brincar\nA mamãe gritou: Quá, quá, quá, quá"
					+ "\nMas só " + (patinhos-1) +  " patinhos voltaram de lá.");
			System.out.println();
					patinhos --;
		}
					// Que se repete até nenhum patinho voltar de lá
					
					System.out.println( "\nA mamãe patinha foi procurar"
					+ "\nAlém das montanhas"
					+ "\nNa beira do mar"
					+ "\nA mamãe gritou: Quá, quá, quá, quá"
					+ "\n"
					+ "E nenhum patinho voltou de lá. :( ! ");
		
		
		entrada.close();
		
		
	}

}
