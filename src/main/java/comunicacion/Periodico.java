package comunicacion;

public class Periodico extends Escrito {

	private String fecha;
	private String primicia;
	private String interpretacion;

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;

	}

	public String getPrimicia() {
		return primicia;
	}

	public String getFecha() {
		return fecha;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * 10 * palabrasPagina;
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n"
				+ this.fecha + "\n" + this.primicia;
	}

}
