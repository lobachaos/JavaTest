package generics;

public class TestePares {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();
		resultadoConcurso.adicionar(01, "Ana");
		resultadoConcurso.adicionar(01, "Carlos");
		resultadoConcurso.adicionar(02, "Bia");
		resultadoConcurso.adicionar(03, "Lucas");
		
		
		System.out.println(resultadoConcurso.getValor(01));
		System.out.println(resultadoConcurso.getValor(03));

	}

}
