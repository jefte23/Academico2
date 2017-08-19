import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		LocalDate dataNasc1 = LocalDate.of(1988, 9, 17);

		Disciplina d1 = new Disciplina("logica de Programação", "Ciência da Computação", 75);
		System.out.println("\n<<< Disciplina >>> " + d1);

		Professor p1 = new Professor("Marcos", "2211221", "Mestrado", "221112221122");
		System.out.println("\n<<< Professor >>>" + p1);

		Turma t1 = new Turma("Turma A", p1.getNome(), d1.getNome());
		System.out.println("\n<<< Turma >>>" + t1);

		// Instanciar Objetos da classe Aluno
		Aluno a1 = new Aluno("Jefté", "21750454", "masculino", dataNasc1);
		Aluno a2 = new Aluno("Larine", "21750455", "Feminino", LocalDate.of(1990, 2, 03));
		Aluno a3 = new Aluno("João", "2170882", "Masculino", LocalDate.of(1992, 4, 21));
		Aluno a4 = new Aluno("Raquel", "20129221", "Feminino", LocalDate.of(1990, 11, 13));
		Aluno a5 = new Aluno("Eron", "21110112", "Masculino", LocalDate.of(1986, 8, 12));
		Aluno a6 = new Aluno("Carlos", "20011221", "Masculino", LocalDate.of(1982, 3, 15));

		// Adicinar A1 em T1
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);

		System.out.println("\n <<< Alunos >>>");
		System.out.println(t1.listarAlunos());

		Calculadora c = new Calculadora();
		String mencao = c.calcularMencao(6.7);

		System.out.println("Menção: " + mencao + "\nResultado: " + c.calcularResultado(mencao));
	}

}
