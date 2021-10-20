package lambdas;

public record Produto(String nome, double preco) {

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
