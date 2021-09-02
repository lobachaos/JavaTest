package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		
		Pessoa convidado = new Pessoa(80.00);
		Feijao comida1 = new Feijao(0.2);
		Arroz comida2 = new Arroz(0.2);
		Sorvete sobremesa = new Sorvete(0.5);
		
		convidado.comer(comida2);
		convidado.comer(comida1);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}
