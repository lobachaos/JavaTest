package lambdas;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 6050);

		/*
		 * 1. Imposto Municipal >= 2500 (8,5%) / < 2500 (Isento)
		 *  Frete : >= 3000 (100) / <3000 (50) 
		 * Arredondar : Deixar duas casas decimais 
		 * Formatar : R$1234,57
		 */

		BiFunction<Double, Double, Double> aplicarImposto = (valorProduto,
				imposto) -> valorProduto >= 2500 ? valorProduto + (valorProduto * imposto) : valorProduto;
		UnaryOperator<Double> aplicarFrete = valorProduto -> valorProduto >= 3000 ? valorProduto + 100.0
				: valorProduto + 50.0;

		System.out.printf("R$: %.2f", aplicarImposto.andThen(aplicarFrete).apply(p1.preco, 0.085));

	}

}
