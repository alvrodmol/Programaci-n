package model;

@SuppressWarnings("serial")
public class Camion extends Exception{
	

	private Integer num_ejes;
	private Double capacidad;
	private String frenos;
	private Double precio;
	
	public Camion(Integer num_ejes) {
		this.num_ejes = num_ejes;
	}
	public Camion(Integer num_ejes, Double capacidad, String frenos, Double precio) {
		this.num_ejes = num_ejes;
		this.capacidad = capacidad;
		this.frenos = frenos;
		this.precio = precio;
	}
	public Integer getNum_ejes() {
		return num_ejes;
	}
	public void setNum_ejes(Integer num_ejes) throws EjesException {
		if (num_ejes != 4 || num_ejes != 8  ||num_ejes != 16 ) {
			throw new EjesException(num_ejes);
			
		}
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
	
	

}
