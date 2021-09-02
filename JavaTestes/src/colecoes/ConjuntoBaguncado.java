package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	// não é uma boa prática adicionar varios tipos.
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(10.5); // faz o Wrapper automatico double -> Double
		conjunto.add(false); 
		conjunto.add("Testando"); // é case sensetive , T é diferente de t.
		
		System.out.println("O tamanho é " + conjunto.size());
		// uma funcionalidade interessante 
		System.out.println(conjunto.contains(10.5));

		// outro metodo válido
		Set nums = new HashSet();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println(nums);
		
		conjunto.addAll(nums); // Operação de união
		System.out.println("A união entre os dois conjuntos : " + conjunto);
		// para interseção usar retainAll.
		
		
	}
}
