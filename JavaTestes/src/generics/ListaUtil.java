package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
		// vai ser necessario fazer cast
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
		// não é preciso fazer o cast o tipo da lista vai ser 
		// automaticamente identificado
	}
	
}
