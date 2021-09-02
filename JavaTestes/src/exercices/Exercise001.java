package exercices;

import java.util.Scanner;

public class Exercise001 {
	public static void main(String[] args) {
		// https://www.w3resource.com/java-exercises/basic/index.php
		


		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu Primeiro nome : ");
		String primeironome = entrada.next();

		System.out.println("Digite seu sobrenome : ");
		String segundonome = entrada.next();
		System.out.println("Olá " + primeironome+ " " + segundonome);

		entrada.close();

	}
}
