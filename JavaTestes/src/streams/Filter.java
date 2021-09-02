package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Samara", 8.0);
		Aluno a2 = new Aluno("Lucas", 6.8);
		Aluno a3 = new Aluno("Murilo", 7.8);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		
		alunos.stream()
		.filter(a -> a.nota >=7)
		.map(a -> "Você está aprovado(a) " + a.nome )
		.forEach(System.out::println);
		
		
		List<String> crescente = Arrays.asList("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#");
      //crescente.stream().map(n->n.hashCode()).forEach(System.out::println);
          //  System.out.println(crescente.size());	
             System.out.println(crescente.get(0));
	}

}
