package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidade;
	private int delta = 5; // indica quanto ele ira acelerar ou freiar
	
	public int getDelta() {
		return delta;
	}
	public void setDelta(int delta) {
		this.delta = delta;
	}
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void acelerar () {
		if(velocidade + 5 > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += delta;
		}
	}
	public void freiar () {
		if (velocidade > 0) {
			velocidade -= delta;
		}
	}

}
