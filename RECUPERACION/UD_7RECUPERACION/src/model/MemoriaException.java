package model;

@SuppressWarnings("serial")
public class MemoriaException extends ComponenteException {
	
	public MemoriaException(String mensaje) {
		super(mensaje);
	}
	
//	public MemoriaException(Integer memoria) {
//		String mensaje = "ERROR ";
//		if (memoria < 0 ) {
//			mensaje += "la memoria no puede ser negativa";
//			
//		}
//		if (memoria >1000.0) {
//			mensaje += "la memoria no puede ser mayor de 1000";
//			
//		}
//		System.out.println(mensaje);
	
}

