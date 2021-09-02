package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	double preccoComDesconto(){
		
		double precofinal = preco * (1-desconto); 
		return precofinal;
		
		
		
		// sempre todos produtos tem 25 % de desconto , porem pode variar
		// mas como padrao vem com 25 %
		
		
	}
}

