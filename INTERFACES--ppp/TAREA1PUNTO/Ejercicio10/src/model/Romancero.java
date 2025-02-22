package model;

public class Romancero extends Agrupacion implements Callejera {

	private String tematica;

	public Romancero() {
		this("", "", "", "", "", "");
	}

	public Romancero(String tematica, String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		this.tematica = tematica;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero de nombre " + getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El Romancero " + getNombre() + " va de " + getTipo();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Romancero " + getNombre();
	}

	@Override
	public String toString() {
		return "Romancero [getTematica()=" + getTematica() + ", toString()=" + super.toString() + "]";
	}

}
