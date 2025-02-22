package model;

public class Chirigota extends AgrupacionOficial implements Callejera {

	private int numeroCupies;

	public Chirigota() {
		this(0, 0, "", "", "", "", "");
	}

	public Chirigota(int numeroCupies, int puntosObtenidos, String nombre, String autor, String autorMusica,
			String autorLetra, String tipo) {
		super(puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo);
		this.numeroCupies = numeroCupies;
	}

	public int getNumeroCupies() {
		return numeroCupies;
	}

	public void setNumeroCupies(int numeroCupies) {
		this.numeroCupies = numeroCupies;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota de nombre " + getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La Chirigota " + getNombre() + " va de " + getTipo();
	}

	@Override
	public String caminitoFalla() {
		return "La Chirigota " + getNombre() + " va caminito del Falla";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + getNombre();
	}

	@Override
	public String toString() {
		return "Chirigota [getNumeroCupies()=" + getNumeroCupies() + ", toString()=" + super.toString() + "]";
	}

}
