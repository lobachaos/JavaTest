package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java " , "PHP " , "C++");
		langs.forEach(print);
		
		String[] maisLangs = {"\nRuby " , "Python " , "Go"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print); // outra forma de criar uma Stream
		
		List<String> otherLangs = Arrays.asList("\nKotlin " , "JS " , "C");
		otherLangs.stream().forEach(print); // pode ser criada a partir das collections
		
		
		
		
		
	}

}
