package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		// dois metodos para add
		
		livros.add("HP"); // retorna true or false
		livros.push("Senhor dos Aneis"); // não retorna nada
		
		// metodos peek e element são válidos aqui , só altera a lógica
		// last in first out (LIFO)
		
		System.out.println(livros.isEmpty());
		// ForEach tbm é valido na fila.
		for(String livro: livros) {
			System.out.println(livro);
			
		}
	}

}
