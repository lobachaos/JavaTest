package padroes.oberserver;

public class Namorada implements ObserverChegadaAniversariante {

	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar o restante do pessoal");
		System.out.println("Apagar as luzes !");
		System.out.println("Se esconder..");
		System.out.println("Surprise !");
	}

}
