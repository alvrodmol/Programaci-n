package exam;

public class Academia {

	private String nombre;
	private Asignatura[] asignatura;
	
	public Academia() {

	
	}
	
	public Academia(String nombre, Asignatura[] asignatura) {
		setNombre(nombre);
		setAsignatura(asignatura);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asignatura[] getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + ", asignatura=" + asignatura + "]";
	}

}
