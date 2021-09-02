package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

	public static void main(String[] args) {

		/* Numero para string Binária ..6 => "110"
		 * Revert a string 110 => 011
		 * Converter devolta para inteiro -> 011 -->3
		 */
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<String> print = System.out::println;
		
		nums.stream().map(n->Integer.toBinaryString(n)).map(n-> new StringBuilder(n).reverse().toString())
		.map(n->Integer.parseInt(n))
		.map(n->n.toString())
		.forEach(print);
		
		
		
	}

}
