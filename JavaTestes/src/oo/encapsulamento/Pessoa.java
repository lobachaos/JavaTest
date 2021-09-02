package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	Pessoa(int idade){
		alterarIdade(idade);
	}
	
	
	public void alterarIdade(int novaIdade) {
		if (novaIdade >= 0) {
			this.idade = novaIdade;
		}
	}
	
	public int lerIdade() {
		return idade;
	}

}
