package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (num1 , num2) -> (num1 + num2) / 2;
		System.out.println(media.apply(2.0, 6.0));
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> ((n1+n2) /2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(10.0, 2.0));
		System.out.println(resultado.apply(10.0, 10.0));
	}

}
