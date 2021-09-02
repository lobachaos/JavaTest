package oo.desafio;

import java.util.ArrayList;

public class Item {

	int qtd;
	String nome;
	
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	
	Item(int qtd , String nome){
		this.qtd = qtd;
		this.nome = nome;
		
	}
	
	double getPrecoTotal() {
		double total = 0;
		for (Produto produto: listaProdutos) {
			total += produto.preco;
			
		}
		return total;
		// aqui ta retornando o preço DO ITEM.
	}
	
}
