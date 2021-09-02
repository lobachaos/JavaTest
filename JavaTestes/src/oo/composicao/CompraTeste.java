package oo.composicao;

public class CompraTeste {
public static void main(String[] args) {
	
	Compra c1 = new Compra();
	
	c1.cliente = "Nilo";
	c1.adicionarItem(new Item("Caneta", 10, 1.50));
	c1.adicionarItem(new Item("Borracha", 05, 3.00));
	c1.adicionarItem(new Item("Lapizeira", 10, 10.00));
	c1.adicionarItem(new Item("Papel", 10, 0.50));
	
	System.out.println(c1.itens.size());
	System.out.println(c1.getvalorTotal());
	
	
}
}
