package oo.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	String telefone;

	
	ArrayList<Compra> listaCompras = new ArrayList<Compra>();
	
	Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	double getTotalCliente() {
		double total = 0;
		for(Compra compra: listaCompras) {
			
			total += compra.getTotalDaCompra();
			
		}
		return total;
		
	}
	
	}
