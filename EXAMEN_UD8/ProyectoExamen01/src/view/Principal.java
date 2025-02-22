package view;

import java.util.List;

import controller.ParseJSON;
import model.Casa;

public class Principal {

	public static void main(String[] args) throws Exception {

		final String FILE_NAME = "casas.json";

		System.out.println("\nLeer un objeto casa del fichero: " + FILE_NAME +  " y mostrarlo por pantalla.");

		
		//LEER EL ARCHIVO JSON
		
		ParseJSON.leerCasa(FILE_NAME);
		
		List<Casa> list = ParseJSON.leerCasa(FILE_NAME);
		
		System.out.println(list);

		

	}

}




/*




public class Principal {

	public static void main(String[] args) {
		
		final String FILE_JSON = "personas.json";
		final String FILE_XML = "personas.xml";
		
		try {
			List<Persona> listado = new ArrayList<Persona>();
			listado.add(new Persona("Pepe", 39));
			listado.add(new Persona("Juan", 42));
			listado.add(new Persona("Margarita", 28));
			listado.add(new Persona("Carlos", 31));
			
			// Escribir la List en un fichero en formato JSON
			ParseandoJSONPersona.writeJson(FILE_JSON, listado);
			
			// Leer una List del fichero en formato JSON
			List<Persona> listado2 = ParseandoJSONPersona.readListadoPersonas(FILE_JSON);
			
			// Escribir la List leida antes en formato XML
			ParseadorDOMPersonas.writeXML(FILE_XML, listado2);

			System.out.println("Fin del programa.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
*/