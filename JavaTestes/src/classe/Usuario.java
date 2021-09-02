package classe;

public class Usuario {

	String nome;

	Usuario(String nome) {
		this.nome = nome;
	}
	// estabelecendo critério do Equals
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			return outro.nome.equals(this.nome); // não é uma boa prática
													// colocar ==
		} else {
			return false;
		}
	}
	// o eclipse gera esses criterios , só clico com botão direito -> Generate.
}
