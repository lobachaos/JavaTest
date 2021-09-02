package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		Usuario user1 = new Usuario("Luca");
		lista.add(user1);

		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Rafa"));
		lista.add(new Usuario("Murilo"));

		System.out.println(lista.get(0)); // acessando pelo indice
        System.out.println(lista.get(3));
        
		System.out.println("Acessando pelo ForEach : ");
		for (Usuario u : lista) {
			System.out.println(u);
			// a ordem de inserção é respeitada
		}
	}
}
