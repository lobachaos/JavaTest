package classe;

public class Pessoa {
	
	String nome ;
	double peso ;
	
	
	Pessoa (String nome , double peso){ // isso é um constrtuor
		
		this.nome = nome;
		this.peso = peso;
	}
		
	void comer (Comida comida) { // isso é um método. Convençao começar com min
		if (comida != null ) {
			this.peso += comida.peso; // acrescenta o peso da comida no peso 
			// da pessoa . -- > simbolo --> +=
		}
		else {
			System.out.println("Peso  da comida invalido ");
		}
		
	}
	
	String apresentar() { // outro metodo
		return nome + " e tenho " + peso + " KGs.";
		
	}
	
	}
	
	
	

