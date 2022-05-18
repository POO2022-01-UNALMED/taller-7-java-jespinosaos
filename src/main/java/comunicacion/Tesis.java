package comunicacion;

public class Tesis extends Escrito {

	private String ideas;
	private String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String ideas, String[] argumentos,
			String conclusion, String referencia, String interpretacion) {

		super(origen, titulo, autor, paginas);
		this.ideas = ideas;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencia = referencia;
		this.interpretacion = interpretacion;

	}

	public String getIdea() {
		return ideas;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public String getReferencias() {
		return referencia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * 5 * palabrasPagina;
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n"
				+ this.ideas + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencia;
	}

}