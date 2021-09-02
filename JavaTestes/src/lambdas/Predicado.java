package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isExpensive = product -> product.preco >= 1.000;
		
		Produto p1 = new Produto("Celular", 1.500);
		
		
		System.out.println(isExpensive.test(p1));
		
	}
	
	
	

}
