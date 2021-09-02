package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[3]; // [] pode ir depois do nome da variavel
		notasAlunoA[0] = 7.0;
		notasAlunoA[1] = 10;
		notasAlunoA[2] = 8;

		System.out.println("Primeira forma de imprimir " + Arrays.toString(notasAlunoA));
		
		System.out.println("Segunda forma de Imprimir um Array : ");
		for (double notaA : notasAlunoA) {
			System.out.print(notaA + " ");
		}
		
		System.out.println();
		double totalA = 0;
		for (int i = 0; i < 3; i++) { // no lugar do 03 pode ser usado .length
			totalA += notasAlunoA[i];
		}
		System.out.println( "A media do Aluno A : " + totalA / 3); 

		// outra maneira de se iniciar um Array

		double[] notasAlunoB = { 6.0, 6.6, 5.0 };

		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}

		System.out.println(totalB / 3);

	}

}
