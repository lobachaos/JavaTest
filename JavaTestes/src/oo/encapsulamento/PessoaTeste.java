package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(30);
		// idade invalida
		p1.alterarIdade(-100);
		System.out.println(p1.lerIdade());
		
		Pessoa p2 = new Pessoa (20);
		System.out.println(p2.lerIdade());
		
	}

}
