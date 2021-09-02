package streams;

public class MediaTeste {

	public static void main(String[] args) {

		Media m1 = new Media().adicionar(10.0);
		m1.adicionar(9.0);
		m1.adicionar(7.6);
		m1.adicionar(8.0);
		
		Media m2 = new Media().adicionar(8.0).adicionar(9.0)
				.adicionar(7.4).adicionar(4.5);
		
		
		System.out.println(m1.getValor());
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
		
		
	}

}
