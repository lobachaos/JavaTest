package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;
	
	
	public String toString() {
		
		return this.nome ;
	}
	
	Usuario(String nome){
		
		this.nome = nome ;
	}

	 public int hashCode() {
		return Objects.hash(nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

}
