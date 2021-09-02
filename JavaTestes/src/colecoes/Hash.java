package colecoes;

import java.util.HashSet;

public class Hash {
public static void main(String[] args) {
	
	HashSet<Usuario> usuarios = new HashSet<Usuario>();
	usuarios.add(new Usuario("Samara"));
	usuarios.add(new Usuario("Kaio"));
	usuarios.add(new Usuario("Caua"));
	
	boolean teste = usuarios.contains(new Usuario("Kaio"));
	System.out.println(teste);
	// se nao tiver o hash implementado retornara false.
}
}
