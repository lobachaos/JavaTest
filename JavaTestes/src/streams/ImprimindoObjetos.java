package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> listaAprovados = Arrays.asList("Samara" , "Ana", "Beatriz","Lucas");
		
		System.out.println("Usando o ForEach : ");
		for(String nome: listaAprovados) {
			System.out.println(nome);
		}
		
		System.out.println("Usando o Iterator : ");
		Iterator<String> iterator = listaAprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando o Stream : ");
		Stream<String> stream = listaAprovados.stream();
		stream.forEach(System.out::println);
		
		
	}

}
