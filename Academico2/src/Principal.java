import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {

		Calendar dataA1 = Calendar.getInstance();
		dataA1.set(Calendar.YEAR, 1988);
		dataA1.set(Calendar.MONTH, Calendar.SEPTEMBER);
		dataA1.set(Calendar.DAY_OF_MONTH, 17);

		Aluno a1 = new Aluno("Jefté", "21750454", "masculino", dataA1);
		System.out.println("\n<<< Aluno >>>" + a1);

		Disciplina d1 = new Disciplina("logica de Programação", "Ciência da Computação", 75);
		System.out.println("\n<<< Disciplina >>> " + d1);

		Professor p1 = new Professor("Marcos", "2211221", "Mestrado", "221112221122");
		System.out.println("\n<<< Professor >>>" + p1);

	}

}
