package oo.polimorfismo;

public class Pessoa {

	private double peso;

	Pessoa(double peso) {
		setPeso(peso);
	}

	public void comer(Comida food) {
		this.peso += food.getPeso();
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
