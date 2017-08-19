import java.time.LocalDate;

public class Aluno {

	private String nome;
	private String RA;
	private String sexo;
	private LocalDate dataNascimento;

	public Aluno(String nome, String RA, String sexo, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.RA = RA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "- nome: " + getNome() + "\n- RA: " + getRA() + "\n- Sexo: " + getSexo() + "\n- dataNascimento: "
				+ getDataComoString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String RA) {
		this.RA = RA;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataComoString() {
		return dataNascimento.getDayOfMonth() + "/" + dataNascimento.getMonthValue() + "/" + dataNascimento.getYear();
	}

}
