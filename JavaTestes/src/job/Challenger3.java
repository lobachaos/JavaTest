package job;

public class Challenger3 {
	public static void main(String[] args) {

		int inicial = 1, razao = 2, an = inicial, valor_max = 20;
		
		while (an <= valor_max) {
			System.out.println(an);
			an += razao;
		}

	}

}
