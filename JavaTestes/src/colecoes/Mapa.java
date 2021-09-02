package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa { // estrutura chave e valor.
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Gabriel"); // o put tanto adiciona quanto substitui caso repetido.
		usuarios.put(2, "Leo");
		usuarios.put(3, "Brunno");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.get(2));
		
		//maneiras de percorrer a chave
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		// para percorrer os dois ao mesmo tempo
for(Entry<Integer, String> registro: usuarios.entrySet()) {
	System.out.print(registro.getKey() + " ");
	System.out.println(registro.getValue());
}
		
	}

}
