package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = product -> System.out.println(product.nome);
		
		Produto p1 = new Produto("Caneta", 1.50);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Borracha", 4.50);
		Produto p3 = new Produto("Caneta Preta", 1.50);
		Produto p4 = new Produto("Caneta Roxa", 1.50);
		Produto p5 = new Produto("Caneta Vermelha", 1.50);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println();
		produtos.forEach(imprimir);
		
		
	}

}
