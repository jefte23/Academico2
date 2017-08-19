
public class Turma {

	private String codigo;
	private String professor;
	private String diciplina;

	public Turma(String codigo, String professor, String diciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.diciplina = diciplina;
	}

	@Override
	public String toString() {
		return "\n\tTurma \n - codigo: " + getCodigo() + "\n - professor: " + getProfessor() + "\n diciplina: "
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

}
