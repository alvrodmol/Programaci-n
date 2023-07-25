package model;

import java.util.List;

public class Cartelera {
	
	private List<Categoria> categoria;
	
	public Cartelera(List<Categoria> categoria) {
		super();
		setCategoria(categoria);;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	

}
