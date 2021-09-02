package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um salário");
		String salario1 = entrada.nextLine().replace(',','.');
		System.out.println("Digite um salário");
		String salario2 = entrada.nextLine().replace(',','.');
		System.out.println("Digite um salário");
		String salario3 = entrada.nextLine().replace(',','.');

		double salarioa = Double.parseDouble(salario1);
		double salariob = Double.parseDouble(salario2);
		double salarioc = Double.parseDouble(salario3);
		
		double media = (salarioa + salariob + salarioc) / 3  ;
		
		System.out.println("O valor da média é : " + media);

		entrada.close();

	}

}
