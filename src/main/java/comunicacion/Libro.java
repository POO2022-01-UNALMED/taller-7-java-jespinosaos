package comunicacion;

public class Libro extends Escrito {

	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
			String edicion, String interpretacion) {

		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;

	}

	public String getCo_autor() {
		return co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * 2 * palabrasPagina;
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n"
				+ this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
	}

}