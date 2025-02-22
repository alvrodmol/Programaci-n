package model;

public class Casa {
	
	private Integer id;
	private Double precio;
	private Componente componente;
	
	public Casa() {
		this.id = null;
		this.precio = null;
		this.componente = null;

	}
	
	public Casa(Integer id, Double precio, Componente componente) {
		setId(id);
		setPrecio(precio);
		setComponente(componente);
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	@Override
	public String toString() {
		return "Casa [getId()=" + getId() + ", getPrecio()=" + getPrecio() + ", getComponente()=" + getComponente()
				+ "]";
	}

	
	
}
