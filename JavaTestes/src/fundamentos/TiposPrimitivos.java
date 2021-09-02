package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações de um funcionário

		// Tipos númericos inteiros
		byte anosDeEmpresa = 23; // chega até 127 positvo e -128
		short numeroDeVoos = 327;
		int id = 58889;
		long pontosAcumulados = 3_234_845_223L; // para espaço em numeros utilizar underline. e precisa utilizar L

		// Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_223_341_103.04;

		// Tipo Booleano
		boolean estaDeFerias = false; // true
		char status = 'A'; // Só serve UM UNICO caractere , pode ser ?!% porem somente UM.

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Número de viagens
		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status: " + status);

	}

}
