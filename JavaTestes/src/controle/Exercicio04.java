package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
//		Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
//		Armazene um numero aleatório em uma variável.
//		O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, 
//		imprima a quantidade de tentativas restantes,
//		e imprima se o número inserido é maior ou menor do que o número armazenado. 
		
		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo xD !");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();

				if (numero > numeroSorteado) {

					System.out.printf("\n O numero sorteado e menor que %d\n\n", numero);

				} else if (numero < numeroSorteado) {

					System.out.printf("\n O numero sorteado e maior que %d\n\n", numero);

				} else {

					System.out.printf("\n Parabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);

				}

			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = entrada.nextInt();

		} while (continuar != 0);

		entrada.close();
		
		
		
		
		
		
	}

}
