package model;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;

	public Alumno() {

	}

	public Alumno(String dni, String nombre, String apellido, String direccion) {
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		setDireccion(direccion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	

}
