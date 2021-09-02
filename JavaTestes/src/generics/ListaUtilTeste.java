package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS","JAVA","GO","COFFE");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem);
		
		int ultimoNumero = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero);

	}

}
