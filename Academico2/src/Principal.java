import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		LocalDate dataNasc1 = LocalDate.of(1988, 9, 17);

		Aluno a1 = new Aluno("Jefté", "21750454", "masculino", dataNasc1);
		System.out.println("\n<<< Aluno >>>" + a1);

		Aluno a2 = new Aluno("Larine", "21750455", "Feminino", LocalDate.of(1990, 2, 03));
		System.out.println("\n<<< Aluno >>>" + a2);
		Disciplina d1 = new Disciplina("logica de Programação", "Ciência da Computação", 75);
		System.out.println("\n<<< Disciplina >>> " + d1);

		Professor p1 = new Professor("Marcos", "2211221", "Mestrado", "221112221122");
		System.out.println("\n<<< Professor >>>" + p1);

	}

}
