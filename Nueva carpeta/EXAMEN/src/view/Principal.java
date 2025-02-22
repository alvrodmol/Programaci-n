package view;

import java.util.HashMap;
import java.util.Map;

import model.*;
import controller.*;

public class Principal {
	
	
	//aquí vamos a hacer las cosas:
	Pais p = new Pais("España");
	
	
	Map<String, Pais> paises = new HashMap<String, Pais>();

	Pais espana = new Pais("España");
	Pais francia = new Pais("Francia");

	Ciudad madrid = new Ciudad("Madrid", 3200000);
	Ciudad barcelona = new Ciudad("Barcelona", 1600000);
	Ciudad paris = new Ciudad("París", 2200000);
	Ciudad marsella = new Ciudad("Marsella", 860000);

	Lugar alhambra = new Lugar("La Alhambra");
	Lugar sagradaFamilia = new Lugar("La Sagrada Familia");
	Lugar torreEiffel = new Lugar("La Torre Eiffel");
	Lugar notreDame = new Lugar("Notre Dame");


 /*
  *  COMPROVACIÓN DEL CONTROLLER
  *  
  *  No me dió tiempo a cambiarlo :(
  */
	// Añadir un país
	Pais portugal = new Pais("Portugal");
	paises.put(portugal.getNombre(), portugal);

	// Añadir una ciudad a un país
	Ciudad lisboa = new Ciudad("Lisboa", 550000);
	paises.get("Portugal").addCiudad(lisboa);

	// Añadir un lugar a una ciudad de un país
	Lugar torreDeBelem = new Lugar("Torre de Belém");
	paises.get("Portugal").getCiudad("Lisboa").addLugar(torreDeBelem);

	// Obtener las ciudades de un país
	List<String> ciudadesDeEspana = paises.get("España").getCiudades();

	// Obtener los lugares de una ciudad
	List<String> lugaresDeParis = paises.get("Francia").getCiudad("París").getLugares();

	// Obtener la ubicación de un lugar
	String ubicacion = paises.get("España").getCiudadDeLugar("La Alhambra");

	// Obtener las ciudades de un país con menos habitantes de los indicados
	List<Ciudad> ciudadesDeFrancia = paises.get("Francia").getCiudadesConHabitantes(1000000);


}
