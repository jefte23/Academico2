import java.util.Calendar;

public class Aluno {

	private String nome;
	private String RA;
	private String sexo;
	private Calendar dataNascimento;

	public Aluno(String nome, String rA, String sexo, Calendar dataNascimento) {
		super();
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "\n - nome: " + getNome() + "\n -  RA: " + getRA() + "\n - Sexo: " + getSexo() + "\n - dataNascimento: ="
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

	public void setRA(String rA) {
		RA = rA;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataComoString() {
		return this.dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" + this.dataNascimento.get(Calendar.MONTH) + "/"
				+ this.dataNascimento.get(Calendar.YEAR);

	}

}
