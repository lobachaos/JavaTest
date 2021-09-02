package streams;

public class Media {
	
	private double total;
	private int qtd;
	
	
	 // quando retorna a instancia pode sair encadeando
	public Media adicionar(double valor) {
		total += valor;
		qtd++;
		return this;
	}

	public double getValor() {
		return total / qtd;
		
	}
	public static Media combinar(Media m1 , Media m2) {
		Media resultado = new Media();
		resultado.qtd = m1.qtd + m2.qtd;
		resultado.total = m1.total + m2.total;
		return resultado;
	}
	
}
