package fundamentos;

public class Ternario {
	public static void main(String[] args) {

		double media = 8.0;
		String resultado = media >= 7 ? "Aprovado" : "Reprovado"; // ? : Operadores ternários
		// equivalente ao "if".
		// 1 condição caso retorne true , segunda condição quando retorna false

		System.out.println("O aluno está : " + resultado);

	}
}
