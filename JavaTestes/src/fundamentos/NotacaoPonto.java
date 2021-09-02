package fundamentos;

// a notação ponto chama funcões no java.

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);

		// a notação ponto pode ser seguida em uma unica linha
		String y = "Teste Y".replace("Y", "123").toUpperCase();
		System.out.println(y);
		// ou a notação ponto pode ser quebrada em várias linhas

		String x = "Teste X".concat("!!").concat("Add 01").toUpperCase();
		System.out.println(x);
	}

}
