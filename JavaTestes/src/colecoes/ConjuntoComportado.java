package colecoes;

import java.util.TreeSet;

public class ConjuntoComportado {
public static void main(String[] args) {
	
	TreeSet<String> lista = new TreeSet<String>(); // fixando o tipo dos dados.
	// TreeSet respeita a ordem.
	lista.add("Joao");
	lista.add("Sam");
	lista.add("Lucas");
	
	for(String ordem: lista) {
		
		System.out.println(ordem);
	}
	
}
}
