
public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Jefté", "21750454", 28, "Ciencia da Computação", "noturno", "Masculino");
		Disciplina d1 = new Disciplina("Linguagem de programação", "Ciencia da computação", 90);
		Disciplina d2 = new Disciplina("Estrutura de dados", "Ciencia da Computação", 75);

		System.out.println("<<< Dados do Aluno >>>" + a1);
		System.out.println("\n<<< Diciplinas 1 >>>" + d1 + "\n\n<<< Diciplina 2 >>>" + d2);

		System.out.println(a1.imprimirAluno());

		System.out.println(a1.getNome());

	}

}
