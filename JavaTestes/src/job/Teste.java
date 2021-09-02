package job;

import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
System.out.println(Teste.retornaGuicheIngresso(26));
		

	}
	public static Integer retornaGuicheIngresso(Integer ingressoNumero) {
	      int i = ingressoNumero;
	      if(i == 26) {
	    	  List<Integer> guiche = Arrays.asList(6,26);
	    	  guiche.toString();
	    	  //int convert = Integer.valueOf(guiche.toString());
	    	  return 6;
	      }else
	    	  return null;
    }
	
	
}