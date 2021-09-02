package padroes.oberserver;

public class FestaSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		
		porteiro.registrarObservers(namorada);
		porteiro.monitorar();
		
		
		
	}

}
