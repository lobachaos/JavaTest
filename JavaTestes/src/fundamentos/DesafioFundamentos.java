package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
	public static void main(String[] args) {
		// o Desafio é fazer uma calculadora que
		// Leia 1 numero depois Leia outro Numero
		// Usuário Escolha qual operação + - * / %

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro número : ");
		double a = entrada.nextDouble();
		System.out.println("Insira o segundo número : ");
		double b = entrada.nextDouble();
		System.out.println("Qual operação você deseja realizar ? Por favor introduzir + , - , * ou / ");
		String tipoOperacao = entrada.next();

 
		var cv = "+".equals(tipoOperacao) ? a + b : " error";		
		cv = "-".equals(tipoOperacao) ? a - b : cv;		
		cv = "*".equals(tipoOperacao) ? a * b : cv;		
		cv = "/".equals(tipoOperacao) ? a / b : cv;		
		
		
		System.out.println("O resultado é :" + cv );
		

		
		
		entrada.close();
	}
}
