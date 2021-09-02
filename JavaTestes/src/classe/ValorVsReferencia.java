package classe;

public class ValorVsReferencia {
public static void main(String[] args) {

	int a = 2;
	int b = a; // atribuição por VALOR , se trata de um TIPO PRIMITIVO.
	// será criado uma COPIA do valor na memoria.
	
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	DesafioDate d1 = new DesafioDate(1, 8, 2021);
	DesafioDate d2 = d1; // Atribuição por REFERÊNCIA , pois trabalhando
	// com OBJETO . So aponta para o mesmo espaço na memoria.
	d1.dia = 31;
	d2.mes = 02;
	// muda os valores nos dois objetos.
	
	System.out.println(d1.obterDataFortada());
	System.out.println(d2.obterDataFortada());
	
	}
	
	
}
