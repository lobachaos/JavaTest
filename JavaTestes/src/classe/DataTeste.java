package classe;

public class DataTeste {
public static void main(String[] args) {
	
	DesafioDate datafinal = new DesafioDate();
	datafinal.dia = 01;
	datafinal.mes = 02;
	datafinal.ano = 2003;
			
	System.out.println("O dia escolhido foi : " + datafinal.dia + "/" +
	datafinal.mes + "/" + datafinal.ano + ".");
	
	System.out.printf("%d/%d/%d\n",datafinal.dia,datafinal.mes,datafinal.ano);
	
	
	
	System.out.println(datafinal.obterDataFortada()); // modo otimizado 
	
	
	// Uso com construtor
	DesafioDate datafinal2 = new DesafioDate(01, 01, 2021);
	
	System.out.println(datafinal2.obterDataFortada());
	
	
}
}
