package classe;

public class DesafioDate {
	int dia;
	int mes;
	int ano;
	// 01/01/1970 -- > Construtor padrao
	// Construtores TEM QUE TER O MESMO NOME DA CLASSE 
	DesafioDate(int diax ,int mesx ,int anox ){
	dia = diax;
	mes = mesx;
	ano = anox;
	}
	DesafioDate(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	// criar um metodo para obter a data formatada
	String obterDataFortada() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
	
}
