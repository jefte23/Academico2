
public class Aluno {
	// Atributos
	private String nome;
	private String RA;
	private int idade;
	private String curso;
	private String turno;
	private String sexo;

	// Construtor
	public Aluno(String nome, String RA, int idade, String curso, String turno, String sexo) {
		super();
		this.nome = nome;
		this.RA = RA;
		this.idade = idade;
		this.curso = curso;
		this.turno = turno;
		this.sexo = sexo;
	}

	// ToString
	@Override
	public String toString() {
		return "\n - nome= " + nome + "\n - RA= " + RA + "\n - idade=" + idade + "\n - curso= " + curso + "\n - turno= "
				+ turno + "\n - sexo= " + sexo;
	}

	// Metodo Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String imprimirAluno() {
		return "\n --------- Dados do Aluno--------- " + "\n - Nome" + getNome() + "\n - RA= " + getRA() + "\n - idade="
				+ getIdade() + "\n - curso= " + getCurso() + "\n - turno= " + getTurno() + "\n - sexo= " + getSexo();
	}

}
