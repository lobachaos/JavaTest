package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		
		CaixaObjeto<String> caixaA = new CaixaObjeto<>();
		caixaA.guardar("Guarndando uma String");
		
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto<Double> caixaB = new CaixaObjeto<>();
		caixaB.guardar(20.5);

		double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		
	}

}
