package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas você deseja adicionar ? ");
		int qtdnotas = entrada.nextInt();

		double[] notas = new double[qtdnotas];

		for (int i = 0; i < qtdnotas; i++) {
			System.out.println("Insira a nota : ");
			notas[i] = entrada.nextDouble();
		}

		double soma = Arrays.stream(notas).sum();
		System.out.println("A média do aluno foi : " + soma / qtdnotas);

		entrada.close();

	}

}
