package oo.desafio;

public class ClienteTeste {
	public static void main(String[] args) {

		// O cliente tem que ter 02 compras cada compra 02 itens
		// e cada Item 03 produtos

		Produto p1 = new Produto("Caneta Azul", 1.50);
		Produto p2 = new Produto("Caneta Preta", 1.50);
		Produto p3 = new Produto("Caneta Vermelha", 1.50);
		Produto p4 = new Produto("Livro A", 3.00);
		Produto p5 = new Produto("Livro B", 4.50);
		Produto p6 = new Produto("Livro C", 10.50);

		Item item1 = new Item(1, "Jogo de Canetas");
		item1.listaProdutos.add(p1);
		item1.listaProdutos.add(p2);
		item1.listaProdutos.add(p3);

		Item item2 = new Item(1, "Jogo de Livros");
		item2.listaProdutos.add(p4);
		item2.listaProdutos.add(p5);
		item2.listaProdutos.add(p6);

		Compra compra1 = new Compra("Compra 01");
		compra1.listaItens.add(item1);
		compra1.listaItens.add(item2);

		Compra compra2 = new Compra("Compra 02");
		compra2.listaItens.add(item1);
		compra2.listaItens.add(item1);

		Cliente cliente1 = new Cliente("Samara", "99 9999-9999");

		cliente1.listaCompras.add(compra1);
		cliente1.listaCompras.add(compra2);

		System.out.println(cliente1.getTotalCliente());
	}

}
