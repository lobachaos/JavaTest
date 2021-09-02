package oo.heranca.desafio;

public class UnoTurbinado extends Carro implements Esportivo {

	public UnoTurbinado(){
		super(100);
	}
	
	
	@Override
	public void ligarTurbo() {
		setDelta(30);
	}
	
	@Override
	public void desligarTurbo() {
		setDelta(5);
	}
	
	public void acelerar () {
		super.acelerar();
	}
}
