package view;

import java.io.FileWriter;
import java.io.IOException;

import controller.RecorridoDOM;

public class Principal {

	final static String FCH_NAME = "desayunos.xml";
	
	public static void main(String[] args) throws IOException {

//		try {
//			
//		FileWriter desayunos= new FileWriter("desayunos.xml");
//			desayunos.write("ejemplo");
//			desayunos.close();
//			System.out.println("archivo creado correctamente");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}}

		mostrarXML();
	}
		public static void mostrarXML() {
			System.out.println("Mostrando el fichero XML:");
			try {
				RecorridoDOM dom = new RecorridoDOM(FCH_NAME);

			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		
	}


