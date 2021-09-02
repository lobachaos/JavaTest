package classe;

public class ValoresPadroes {

	///byte , short , int , long -> 0
	// float , double --> 0.0
	// boolean -> False
	// so acontece com valores da INSTANCIA , variaveis locais não sao 
	// inicializadas.
	// final ( constantes ) precisam ser definidas.
static 	int a ; // variavel "a" não foi definida.

public static void main(String[] args) {
	System.out.println(a);
}		
}

