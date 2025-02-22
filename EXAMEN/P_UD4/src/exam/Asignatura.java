package exam;

import java.time.LocalDateTime;

import exam.Alumno.Tipo;

public class Asignatura {
	
	private String nombre;
	private String aula;
	private int maxAlumn;
	private Alumno alumno;
	
	public Asignatura() {
		setNombre("");
		setAula("A1");
		setMaxAlumn(0);
//		setAlumno("", "","","", 0, "","", LocalDateTime.now(), Tipo.NORMAL);
	}

	public Asignatura(String nombre, String aula, int maxAlumn, Alumno alumno) {
		setNombre(nombre);
		setAula(aula);
		setMaxAlumn(maxAlumn);
	    setAlumno(alumno);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public int getMaxAlumn() {
		return maxAlumn;
	}
	public void setMaxAlumn(int maxAlumn) {
		this.maxAlumn = maxAlumn;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", aula=" + aula + ", maxAlumn=" + maxAlumn + ", alumno=" + alumno
				+ "]";
	}
	

}
