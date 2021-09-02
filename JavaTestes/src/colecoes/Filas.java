package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		// Offer e add -> Adiciona elementos na fila
		// Diferença é o comportamento quanto a fila está cheia!
		fila.add("Tiago"); // retorna false
		fila.offer("Carlos"); // lança uma exeção 
		fila.add("Alfa");
		fila.add("Bia");
		
		
		
		// Peek e element --> Obtem o proximo objeto da fila sem remover
		// Diferença ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // Lança uma exceção
		
		// .poll e remove --> Obtem o proximo da fila e REMOVE !
		// poll retorna null e remove lança uma exceção -> Diferença quando a fila está vazia
		
	}
	

}
