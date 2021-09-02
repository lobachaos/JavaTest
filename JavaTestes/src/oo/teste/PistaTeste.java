package oo.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Fusca;
import oo.heranca.desafio.UnoTurbinado;

public class PistaTeste {
	public static void main(String[] args) {
		
		UnoTurbinado uno = new UnoTurbinado();
		Carro fusca = new Fusca();
		
		uno.acelerar();
		uno.acelerar();
		uno.acelerar();
		uno.freiar();
		fusca.acelerar();
		fusca.freiar();
		fusca.freiar();
		fusca.freiar();
		fusca.freiar();
		
		System.out.println(uno.velocidade + "<< Velocidade Antes do Turbo");
		System.out.println(fusca.velocidade);
		
		uno.ligarTurbo();
		uno.acelerar();
		System.out.println(uno.velocidade + "<< Velocidade apos Turbo Ligado");
		
		
		
		
	}

}
