package oo.polimorfismo;

public class Pessoa {

	private double peso;

	Pessoa(double peso) {
		setPeso(peso);
	}

	public void comer(Comida... foods) {
		for(Comida c: foods) {
			this.peso += c.getPeso();
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

}
