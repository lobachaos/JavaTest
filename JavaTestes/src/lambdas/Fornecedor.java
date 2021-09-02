package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		Supplier<List<String>> nomes = () -> Arrays.asList("Caio" , "Fernando" , "Lucas");
		
		System.out.println(nomes.get());
		
		
		
	}

}
