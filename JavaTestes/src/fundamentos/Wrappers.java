package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		Byte b = 1; // Maneira de "Objetizar" o byte , ou seja utilizar o .
		Short s = 1000; // Mesma coisa para o short
		Integer i = 10000; // objetificação do int
		Long l = 100000000L; // Objetificação do long
		Character c = 'X'; // mesma coisa do tipo char , tem que estar entre aspas simples
		
		

		System.out.println(b.byteValue());
		System.out.println(s.hashCode());
		System.out.println(i.doubleValue());
		System.out.println(l.compareTo(l));
		System.out.println(c + " ue ?");
		
	}
}
