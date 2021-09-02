package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {

		// duas maneiras de converter numero para string
		// pois algumas funcionalidades so estão disponiveis para string

		Integer num1 = 10;
		System.out.println(num1.toString().length());

		int num2 = 20;
		System.out.println(Integer.toString(num2).length());

	}
}
