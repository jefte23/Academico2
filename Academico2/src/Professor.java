
public class Professor {

	private String nome;
	private String matricula;
	private String titulação;
	private String CPF;

	public Professor(String nome, String matricula, String titulação, String CPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulação = titulação;
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return "\n- Professor: " + getNome() + "\n- Matricula: " + getMatricula() + "\n- titulação: " + getTitulação()
				+ "\n- CPF: " + getCPF();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitulação() {
		return titulação;
	}

	public void setTitulação(String titulação) {
		this.titulação = titulação;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
