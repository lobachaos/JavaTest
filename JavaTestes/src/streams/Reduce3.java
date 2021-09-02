package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Pedro", 9.0);
		Aluno a2 = new Aluno("Bia", 6.0);
		Aluno a3 = new Aluno("Carlos", 8.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3);

		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> getNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media media = alunos.stream().filter(aprovados).map(getNota).reduce(new Media(), calcularMedia, combinarMedia);

		System.out.println("A media dos aprovados foi : " + media.getValor());
	}

}
