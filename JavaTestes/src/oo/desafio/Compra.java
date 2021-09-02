package oo.desafio;

import java.util.ArrayList;

public class Compra {

	String num;

	ArrayList<Item> listaItens = new ArrayList<Item>();

	Compra(String num) {
		this.num = num;
	}
	double getTotalDaCompra() {
		double totalCompra = 0;
		for (Item item : listaItens) {

			totalCompra += (item.qtd * item.getPrecoTotal());

		}
		return totalCompra;
		
	}
	
			
		}
		
		
		
		
