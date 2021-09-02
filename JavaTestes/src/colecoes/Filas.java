package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		// Offer e add -> Adiciona elementos na fila
		// Diferen�a � o comportamento quanto a fila est� cheia!
		fila.add("Tiago"); // retorna false
		fila.offer("Carlos"); // lan�a uma exe��o 
		fila.add("Alfa");
		fila.add("Bia");
		
		
		
		// Peek e element --> Obtem o proximo objeto da fila sem remover
		// Diferen�a ocorre quando a fila est� vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // Lan�a uma exce��o
		
		// .poll e remove --> Obtem o proximo da fila e REMOVE !
		// poll retorna null e remove lan�a uma exce��o -> Diferen�a quando a fila est� vazia
		
	}
	

}
