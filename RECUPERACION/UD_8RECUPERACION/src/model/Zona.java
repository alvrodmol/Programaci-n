package model;

public class Zona {
	private TipoZona tipo;
    private String descripcion;

    public Zona(TipoZona tipo, String descripcion) {
    	setTipo(tipo);
        setDescripcion(descripcion);
    }

	public TipoZona getTipo() {
		return tipo;
	}

	public void setTipo(TipoZona tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

