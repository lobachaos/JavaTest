package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno ("Pedro", 9.0);
		Aluno a2 = new Aluno("Bia", 6.0);
		Aluno a3 = new Aluno("Carlos", 8.0);
		Aluno a4 = new Aluno("Daniel", 5.7);
		Aluno a5 = new Aluno("Eduardo", 7.9);
		Aluno a6 = new Aluno("Daniel", 5.7);
		Aluno a7 = new Aluno("Eduardo", 7.9);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		
		System.out.println("Usando distinct ");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip / Limit");
		alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);
		
		System.out.println("\n TakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 5).forEach(System.out::println);
		
		
		
		
	}
	

}
