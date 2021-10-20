package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {

		Calculo somar = (x, y) -> x + y;

		System.out.println(somar.executar(2, 2));

		Calculo multiplicar = (x, y) -> x * y;
		System.out.println(multiplicar.executar(2, 3));

	}
}
