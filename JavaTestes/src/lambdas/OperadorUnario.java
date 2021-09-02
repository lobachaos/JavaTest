package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> plusTwo = n -> n + 2;
		UnaryOperator<Integer> multyTwo = n -> n * 2;
		
		System.out.println(plusTwo.andThen(multyTwo).apply(2));

	}

}
