package view;

import model.Camion;
import model.CapacidadException;
import model.EjesException;

@SuppressWarnings("serial")
public class Principal extends Exception {

	public static void main(String[] args) {

	    // Crear objetos Camion
        Camion camion1 = new Camion(4, 3000.0, "ABS", 60000.0);
        Camion camion2 = new Camion(8, 3500.0, "HDS", 70000.0);

        // Intentar crear objeto Camion con atributos no válidos
        Camion camion3 = null;
        camion3 = new Camion(6, 2500.0, "HDS", 40000.0);

        // Mostrar atributos de los camiones válidos
        System.out.println("Camión 1:");
        System.out.println("Número de ejes: " + camion1.getNum_ejes());
        System.out.println("Capacidad: " + camion1.getCapacidad());
        System.out.println("Frenos: " + camion1.getFrenos());
        System.out.println("Precio: " + camion1.getPrecio());

        System.out.println("Camión 2:");
        System.out.println("Número de ejes: " + camion2.getNum_ejes());
        System.out.println("Capacidad: " + camion2.getCapacidad());
        System.out.println("Frenos: " + camion2.getFrenos());
        System.out.println("Precio: " + camion2.getPrecio());

        // Intentar modificar atributos de los camiones válidos con valores no válidos
        try {
            camion1.setNum_ejes(6);
        } catch (EjesException e) {
            System.out.println("Error al modificar el número de ejes del camión 1: " + e.getMessage());
        }

        camion2.setCapacidad(3000.0);

        // Mostrar atributos actualizados de los camiones válidos
        System.out.println("Camión 1 (actualizado):");
        System.out.println("Número de ejes: " + camion1.getNum_ejes());
        System.out.println("Capacidad: " + camion1.getCapacidad());
        System.out.println("Frenos: " + camion1.getFrenos());
        System.out.println("Precio: " + camion1.getPrecio());

        System.out.println("Camión 2 (actualizado):");
        System.out.println("Número de ejes: " + camion2.getNum_ejes());
        System.out.println("Capacidad: " + camion2.getCapacidad());
        System.out.println("Frenos: " + camion2.getFrenos());
        System.out.println("Precio: " + camion2.getPrecio());



	}}
