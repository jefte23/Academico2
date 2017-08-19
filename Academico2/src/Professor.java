
public class Professor {

	private String nome;
	private String matricula;
	private String titula��o;
	private String CPF;

	public Professor(String nome, String matricula, String titula��o, String CPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titula��o = titula��o;
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return "\n - Professor: " + getNome() + "\n - Matricula: " + getMatricula() + "\n - titula��o: "
				+ getTitula��o() + "\n - CPF: " + getCPF();
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

	public String getTitula��o() {
		return titula��o;
	}

	public void setTitula��o(String titula��o) {
		this.titula��o = titula��o;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
