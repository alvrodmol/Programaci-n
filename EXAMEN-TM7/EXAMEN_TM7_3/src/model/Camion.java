package model;

import java.io.Serializable;

public class Camion implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//VARIABLES
	Integer num_ejes;
	Double capacidad;
	String frenos;
	Double precio;
	
	

	public Camion(Integer num_ejes, Double capacidad, String frenos, Double precio) {
		super();
		this.num_ejes = num_ejes;
		this.capacidad = capacidad;
		this.frenos = frenos;
		this.precio = precio;
	}
	
	public Integer getNum_ejes() {
		return num_ejes;
	}
	public void setNum_ejes(Integer num_ejes) {
		this.num_ejes = num_ejes;
	}
	public Double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}
	public String getFrenos() {
		return frenos;
	}
	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	
	public String toString() {
		return "Camion [getNum_ejes()=" + getNum_ejes() + ", getCapacidad()=" + getCapacidad() + ", getFrenos()="
				+ getFrenos() + ", getPrecio()=" + getPrecio() + "]";
	}
	
}
