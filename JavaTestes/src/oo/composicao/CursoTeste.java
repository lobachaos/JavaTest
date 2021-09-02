package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Barbara");
		Aluno aluno2 = new Aluno("Caio");
		Aluno aluno3 = new Aluno("Henrique");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("React Native");
		Curso curso3 = new Curso("Python");

		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso3);
		
		aluno2.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso3);

		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 01");
			System.out.println("E meu nome é : " + aluno);
		}
		
		System.out.println(curso1.alunos.get(0).cursos); // pega o primeiro aluno do curso 1 
		// e mostra todos os cursos que ele esta matriculado
		
		
		
	}
}
