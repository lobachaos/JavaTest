package exercices;

import java.util.Scanner;

public class Exercise003 {
	public static void main(String[] args) {
		// 3. Write a Java program to divide two numbers and print on the screen

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Primeiro Número : ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o Segundo Número : ");
		int num2 = entrada.nextInt();

		int division =  num1 / num2;
		System.out.println("O resultado da divisão é : " + division);

		entrada.close();
	}
}
