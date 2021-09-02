package classe;

public class Jantar {
public static void main(String[] args) {
	
	
	Pessoa p1 = new Pessoa("Pedro", 60);
	
	
	Comida c1 = new Comida("Batata" , 0.1);
	
	
	System.out.print(p1.apresentar());
	p1.comer(c1);
	System.out.println();
	System.out.println(p1.apresentar());
	
}
	
}
