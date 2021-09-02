package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
		
		/* Filtrar os produto que possuem desconto >= 10% && frete gratis
		 * mostrar os nomes no console.
		 */

		Produto p1 = new Produto("Monitor AOC", 6543.50, 0.3, 0);
		Produto p2 = new Produto("Notebook", 1500.79, 0.1, 55.79);
		Produto p3 = new Produto("Xbox", 4500.00, 0.0, 150);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3);
		
		produtos.stream().filter(n->n.getDesconto() >= 0.1).filter(n-> n.getFrete() == 0).map(n-> n.getNome())
		.forEach(System.out::println);
		
		System.out.println(produtos.toString());
	}

}
