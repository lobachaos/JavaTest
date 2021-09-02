package oo.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Jogador j1 = new Monstro();
		
		j1.x = 10;
		j1.y = 10;
		
		Jogador j2 = new Heroi();
		j2.x = 9;
		j2.y = 9;		
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.OESTE);
		
		System.out.println(j1.x);
		System.out.println(j1.y);
		
		System.out.println("Vida antes do ATK : " + j1.vida);
		
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		
		
		
		
	}

}
