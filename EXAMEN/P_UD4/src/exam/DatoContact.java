package exam;

public class DatoContact {

	private Integer telefono;
	private String correo;
	private String insta;

	public DatoContact() {

	}

	public DatoContact(Integer tlf, String correo, String insta) {

		setTelefono(tlf);
		setCorreo(correo);
		setInsta(insta);
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

}
