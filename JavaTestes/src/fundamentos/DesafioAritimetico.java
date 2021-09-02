package fundamentos;

public class DesafioAritimetico {
	public static void main(String[] args) {
		// pow é usado pra potencia
		// ([6*(3+2)]² / 3 * 2 - [( 1-5) * (2-7) /2]² / 10³

		int a = 3 + 2;
		int b = 6 * a;
		int c = (int) Math.pow(b, 2);
		int d = 6;
		int e = c / d;

		int aa = 2 - 7;
		int ab = 1 - 5;
		int ac = aa * ab;
		int ad = ac / 2;
		int ae = (int) Math.pow(ad, 2);

		int finaltwo = (int) Math.pow(10, 3);
		int finalone = e - ae;
		int finalthree = (int) Math.pow(finalone, 3);
		int finish = finalthree / finaltwo;

		System.out.println(finish);

	}
}
