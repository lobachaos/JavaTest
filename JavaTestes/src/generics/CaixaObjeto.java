package generics;

public class CaixaObjeto<TIPO> {
	
	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return coisa;
	}
	

}
