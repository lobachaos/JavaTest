package controle;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		// Criar um programa que enquanto estiver recebendo números positivos,
		// imprime no console
		// a soma dos números inseridos, caso receba um número negativo, encerre
		// o programa
		Scanner entrada = new Scanner(System.in);

		double numero = 0;
		double soma = 0;

		while (numero >= 0) {
			System.out.println("Insira um número");
			numero = entrada.nextDouble();

			if (numero < 0) {
				System.out.println("Fim ! ");
			} else {
				soma += numero;
			}
		}
		System.out.println("A somatoria foi : " + soma);

		entrada.close();

	}

}
