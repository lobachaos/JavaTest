package wildcards;

import java.util.Arrays;
import java.util.List;

public class UnknownWildcard {
    public static void  imprimeLista(List<?> lista) {
        System.out.println(lista);
    }
    public static void main(String[] args) {
        List<String> listaStrings = Arrays.asList("Samara","ana","bia");
        imprimeLista(listaStrings);
        List<Integer> listaInteiros = Arrays.asList(1,2,3,4,5);
        imprimeLista(listaInteiros);
        List<Double> listaDouble = Arrays.asList(2.2,3.99,5.00);
        imprimeLista(listaDouble);
    }
}
