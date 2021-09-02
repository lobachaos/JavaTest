package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		

		Aluno a1 = new Aluno("Pedro", 9.0);
		Aluno a2 = new Aluno("Bia", 6.0);
		Aluno a3 = new Aluno("Carlos", 8.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3);

		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		
		System.out.println(alunos.stream().allMatch(aprovados));
		System.out.println(alunos.stream().anyMatch(aprovados));
		System.out.println(alunos.stream().noneMatch(aprovados)); // none = nenhum;
		// pode ser encadeado com o negate.
		
	}

}
