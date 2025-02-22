package model;

public class Pelicula {

	public Integer codigo;
	private String titulo;
	private String director;
	private String year;
	private String pais;
	
	
	public Pelicula() {
		
	}
	
	public Pelicula(Integer codigo, String titulo, String director, String year, String pais) {
		setCodigo(codigo);
		setTitulo(titulo);
		setDirector(director);
		setYear(year);
		setPais(pais);
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pelicula [getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo() + ", getDirector()="
				+ getDirector() + ", getYear()=" + getYear() + ", getPais()=" + getPais() + "]";
	}


}
