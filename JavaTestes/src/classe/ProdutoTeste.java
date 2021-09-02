package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		// Teste do padrão 25 %
		
		Produto p3 = new Produto();
		p3.nome = "Celular";
		p3.preco = 1250;
		double precoComDesconto3 = p3.preccoComDesconto();
		System.out.println(precoComDesconto3);

		Produto p1 = new Produto();
		p1.nome = "Caneta";
		Produto.desconto = 0.1;
		p1.preco = 10.00;
		double precoComDesconto1 = p1.preccoComDesconto(); // modo otimizado ,
		// foi criado um METODO para calculo.
		System.out.println("O preço do produto um é " + precoComDesconto1);

		Produto p2 = new Produto();
		p2.nome = "Jujuaba";
		Produto.desconto = 0.00;
		p2.preco = 2.50;
		double precoComDesconto2 = p2.preco * (1 - Produto.desconto);
		System.out.println("O preço do produto dois é " + precoComDesconto2);


	

	}
}
