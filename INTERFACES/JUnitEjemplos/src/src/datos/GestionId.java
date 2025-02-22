package datos;

// Generated 13-feb-2014 0:31:32 by Hibernate Tools 3.4.0.CR1

/**
 * GestionId generated by hbm2java
 */
public class GestionId implements java.io.Serializable {

	private String codproveedor;
	private String codpieza;
	private String codproyecto;

	public GestionId() {
	}

	public GestionId(String codproveedor, String codpieza, String codproyecto) {
		this.codproveedor = codproveedor;
		this.codpieza = codpieza;
		this.codproyecto = codproyecto;
	}

	public String getCodproveedor() {
		return this.codproveedor;
	}

	public void setCodproveedor(String codproveedor) {
		this.codproveedor = codproveedor;
	}

	public String getCodpieza() {
		return this.codpieza;
	}

	public void setCodpieza(String codpieza) {
		this.codpieza = codpieza;
	}

	public String getCodproyecto() {
		return this.codproyecto;
	}

	public void setCodproyecto(String codproyecto) {
		this.codproyecto = codproyecto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GestionId))
			return false;
		GestionId castOther = (GestionId) other;

		return ((this.getCodproveedor() == castOther.getCodproveedor()) || (this
				.getCodproveedor() != null
				&& castOther.getCodproveedor() != null && this
				.getCodproveedor().equals(castOther.getCodproveedor())))
				&& ((this.getCodpieza() == castOther.getCodpieza()) || (this
						.getCodpieza() != null
						&& castOther.getCodpieza() != null && this
						.getCodpieza().equals(castOther.getCodpieza())))
				&& ((this.getCodproyecto() == castOther.getCodproyecto()) || (this
						.getCodproyecto() != null
						&& castOther.getCodproyecto() != null && this
						.getCodproyecto().equals(castOther.getCodproyecto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodproveedor() == null ? 0 : this.getCodproveedor()
						.hashCode());
		result = 37 * result
				+ (getCodpieza() == null ? 0 : this.getCodpieza().hashCode());
		result = 37
				* result
				+ (getCodproyecto() == null ? 0 : this.getCodproyecto()
						.hashCode());
		return result;
	}

}
