import java.util.ArrayList;

public class Turma {

	private String codigo;
	private String professor;
	private String diciplina;
	private ArrayList<Aluno> alunos;

	public Turma(String codigo, String professor, String diciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.diciplina = diciplina;
		this.alunos = new ArrayList<Aluno>();
	}

	@Override
	public String toString() {
		return "\n\tTurma\n- codigo: " + getCodigo() + "\n- professor: " + getProfessor() + "\n- diciplina: "
				+ getDiciplina();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	// Metodo que adiciona 1 aluno à turma
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String listarAlunos() {
		String returno = "";

		// verificar se exite alunos na turma
		if (this.alunos.size() == 0) {
			return "Nenhum aluno registrado na turma";
		} else {

			// Navegar pela Estrutura de alunos
			for (int i = 0; i < this.alunos.size(); i++) {
				returno = returno + "Nome: " + this.alunos.get(i).getNome() + "\n";
			}
		}
		return returno;
	}
}