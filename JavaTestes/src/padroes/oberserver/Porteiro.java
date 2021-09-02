package padroes.oberserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
// responsavel por avisar os observadores !

	// instanciado a lista de observadores
	private List<ObserverChegadaAniversariante> observadores = new ArrayList<>();

	public void registrarObservers(ObserverChegadaAniversariante o) {
		observadores.add(o);
	}

	public void monitorar() {
		Scanner entrada = new Scanner(System.in);

		String valor = " ";
		
		while (!"sim".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				// Criando o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				// notificar os observers
				observadores.stream().forEach(o -> o.chegou(evento));

			} else {
				System.out.println("Alarme Falso!");
			}
		}

		entrada.close();
	}

}
