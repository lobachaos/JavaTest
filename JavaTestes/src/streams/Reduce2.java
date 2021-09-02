package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno ("Pedro", 9.0);
		Aluno a2 = new Aluno("Bia", 6.0);
		Aluno a3 = new Aluno("Carlos", 8.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		
		Predicate<Aluno> aprovados = a -> a.nota >=7;
		Function<Aluno, Double> getNota = a-> a.nota;
		BinaryOperator<Double> somaNotas = (a,b)-> a+b;
		
		alunos.stream().filter(aprovados).map(getNota).reduce(somaNotas)
		.ifPresent(System.out::println);
		
		
	}
}
