package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Tren;

public class Principal {

    public static void main(String[] args) {
        final String FILE_NAME = "trenes.dat";

        ObjectOutputStream ficheroEsc = null;
        ObjectInputStream ficheroLec = null;

        try {
            System.out.println("Escribiendo en el fichero: " + FILE_NAME);

            ficheroEsc = new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del tren: ");
            String nombreTren = scanner.nextLine();
            Tren t1 = new Tren(nombreTren, 845);
            Tren t2 = new Tren("AVANT-01", 217);
            Tren t3 = new Tren("AVANT-02", 304);
            Tren t4 = new Tren("AVE", 791);

            ficheroEsc.writeObject(t1);
            ficheroEsc.writeObject(t2);
            ficheroEsc.writeObject(t3);
            ficheroEsc.writeObject(t4);

            System.out.println("Fin de la escritura.");
        } catch (IOException ioe) {
            System.err.println("Fallo con el dispositivo E/S. " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Fallo general. " + e.getMessage());
        } finally {
            try {
                if (ficheroEsc != null)
                    ficheroEsc.close();
            } catch (IOException ioe) {
                System.err.println("Fallo cerrando el dispositivo E/S. " + ioe.getMessage());
            }
        }

        try {

            System.out.println("\nLeyendo del fichero: " + FILE_NAME);

            ficheroLec = new ObjectInputStream(new FileInputStream(FILE_NAME));

            Tren t1 = (Tren) ficheroLec.readObject();
            Tren t2 = (Tren) ficheroLec.readObject();
            Tren t3 = (Tren) ficheroLec.readObject();
            Tren t4 = (Tren) ficheroLec.readObject();

            System.out.println("\t" + t1.toString());
            System.out.println("\t" + t2.toString());
            System.out.println("\t" + t3.toString());
            System.out.println("\t" + t4.toString());

            System.out.println("Fin de la lectura.");

        } catch (FileNotFoundException fnfe) 	{ System.err.println("Fallo al acceder al fichero: " + FILE_NAME + " " + fnfe.getMessage());
        } catch (ClassNotFoundException cnfe) 	{ System.err.println("Fallo en el casting de lectura. " + cnfe.getMessage());
        } catch (IOException ioe) 				{ System.err.println("Fallo con el dispositivo E/S. " + ioe.getMessage());
        } catch (Exception e) 					{ System.err.println("Fallo general. " + e.getMessage()); }
		finally {
			try {
				if (ficheroLec != null)
					ficheroLec.close();
			} catch (IOException ioe) {
				System.err.println("Fallo cerrando el dispositivo E/S. " + ioe.getMessage());
			}
		}

		System.out.println("\nPrograma finalizado con éxito.");
	}
}
