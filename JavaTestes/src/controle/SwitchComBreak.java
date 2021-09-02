package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		// Primeira possibilidade
		System.out.println("Insira a nota : ");
		int nota = entrada.nextInt();
		switch (nota) {
			case 10, 9 -> System.out.print("Seu conceito foi : A ");
			case 8, 7 -> System.out.println("Seu conceito foi : B");
			case 6, 5 -> System.out.println("Seu conceito foi : C");
		}
		
		
		
		// Segunda possibilidade
		System.out.println("\nInsira uma letra");
		String letra =entrada.next();
		switch(letra) {
			case "a" :
				System.out.print("A");
				break;
			case "b":
				System.out.println("B");
			
			
		}
		
		entrada.close();

	}

}
