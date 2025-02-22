package view;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import controller.AlumnosDOM;
import controller.AlumnosJSON;
import controller.AlumnosSAX;
import model.*;

public class Principal {

	final static String FCH_NAME = "alumnos.xml";

	public static void main(String[] args) {

		//DOM();
		SAX();

	}

	public static void DOM() {
		System.out.println("LECTURA CON DOM");

		try {
			AlumnosDOM a = new AlumnosDOM(FCH_NAME);
			List<Alumno> lstAlumnos = a.getAlumnos();
			lstAlumnos.stream().forEach(System.out::println);
			for (Alumno alumno : lstAlumnos) {
				System.out.println(AlumnosJSON.printJson(FCH_NAME, lstAlumnos));
			}
		} catch (Exception e) {
		}
	}

	public static void SAX() {
		System.out.println("LECTURA CON SAX");
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			AlumnosSAX handler = new AlumnosSAX();
			saxParser.parse(FCH_NAME, handler);
			List<Alumno> lstAlumnos = handler.getAlumnos();
			// Asi se ve con toString
			lstAlumnos.stream().forEach(System.out::println);
			// Mejor hacerlo con Json
			for (Alumno alumno : lstAlumnos) {
				System.out.println(AlumnosJSON.printJson(FCH_NAME, lstAlumnos));
			}
			System.out.println("FIN DEL PROGRAMA");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
