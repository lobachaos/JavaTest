package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		// dois metodos para add
		
		livros.add("HP"); // retorna true or false
		livros.push("Senhor dos Aneis"); // n�o retorna nada
		
		// metodos peek e element s�o v�lidos aqui , s� altera a l�gica
		// last in first out (LIFO)
		
		System.out.println(livros.isEmpty());
		// ForEach tbm � valido na fila.
		for(String livro: livros) {
			System.out.println(livro);
			
		}
	}

}
