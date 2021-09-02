package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaA = new CaixaNumero<Integer>();
		caixaA.guardar(7);
		
		int coisaA = caixaA.abrir();
		
		System.out.println(coisaA);
	}

}
