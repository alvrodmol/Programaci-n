package view.menu.concurso;

import java.util.Scanner;

import controller.COAC;
import controller.COAC.ConcursoHace;
import controller.COAC.TipoOrdenacion;
import controller.COAC.TiposAgrupacion;
import model.AgrupacionOficial;
import view.Util;

public class MenuConcurso {

	private static final int INTDEFECTO = 0;
	private static final String MSGINTDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ INTDEFECTO + " ]";

	private static Scanner entrada = new Scanner(System.in);
	public static COAC coac = view.menu.Menu.coac;

	// Opcion 5. Gestión del Concurso.

	// Comprobado
	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			try {
				opc = Util.leerInt("Opción [0 - Salir] : ");
			} catch (Exception e) {
				System.err.println(MSGINTDEFECTO);
				opc = INTDEFECTO;
			}
			switch (opc) {
			case 1 -> concursoHace(ConcursoHace.FALLA);

			case 2 -> concursoHace(ConcursoHace.TIPO);

			case 3 -> concursoHace(ConcursoHace.PRESENTACION);

			case 4 -> concOpc4();

			case 5 -> {
				System.out.println(coac.listarConcurso());
				introVolver();
			}
			case 6 -> {
				System.out.println(coac.listasIndividuales(TiposAgrupacion.CHIRIGOTA));
				introVolver();
			}
			case 7 -> {
				System.out.println(coac.listasIndividuales(TiposAgrupacion.CORO));
				introVolver();
			}
			case 8 -> {
				System.out.println(coac.listasIndividuales(TiposAgrupacion.CUARTETO));
				introVolver();
			}
			case 9 -> {
				System.out.println(coac.listasIndividuales(TiposAgrupacion.COMPARSA));
				introVolver();
			}
			case 10 -> {
				ordenarConcurso(TipoOrdenacion.PUNTOS);

			}
			case 11 -> {
				ordenarConcurso(TipoOrdenacion.NOMBRE);

			}
			case 12 -> {
				ordenarConcurso(TipoOrdenacion.AUTOR);

			}
			case 13 -> {
				ordenarConcurso(TipoOrdenacion.MUSICALETRA);
			}
			}
			if (opc > 13 || opc < 0)
				System.err.print("\nOpcion incorrecta!");
		} while (opc != 0);
	}

	// Comprobado
	public static void ordenarConcurso(TipoOrdenacion item) {
		if (coac.getNumeroDeAgrupacionesConcurso() != 1) {
			if (!(coac.listarConcurso()).contains("VACIA")) {
				System.out.println("Lista antes de ordenar");
				System.out.println(coac.listarConcurso());
				coac.ordenarAgrupaciones(item);
				System.out.println("Lista depues de ordenar");
				System.out.println(coac.listarConcurso());
				introVolver();
			} else {
				System.out.println("\n***Lista De Participantes***\n---------------------------\n        LISTA VACIA");
				introVolver();
			}
		} else {
			System.err.println("Solo hay un participante, no se puede ordenar!");
			introVolver();
		}
	}

	private static void concOpc4() {
		int opcT;
		int puntos;
		do {
			System.out.println(coac.listarConcurso());
			if (!coac.listarConcurso().contains("VACIA")) {
				try {
					if (!coac.listarConcurso().contains("VACIA")) {
						opcT = Util.leerInt("A que agrupacion quieres asignar los puntos?\n[0 - Volver] : ");
					} else {
						opcT = Util.leerInt("[0 - Volver] : ");
					}
				} catch (Exception e) {
					System.err.println(MSGINTDEFECTO);
					opcT = INTDEFECTO;
				}
				if (opcT > coac.getNumeroDeAgrupacionesConcurso()) {
					System.err.println("Opcion incorrecta");
				}
				if (opcT > 0 && opcT <= coac.getNumeroDeAgrupacionesConcurso()) {
					do {
						System.out.print("Cuantos puntos quieres asignarle["
								+ ((AgrupacionOficial) coac.getAgrupacion()[opcT-1]).getPuntosObtenidos() + "]? : ");
						puntos = Integer.parseInt(entrada.nextLine());
						if (puntos < 0)
							System.err.print("No se pueden poner menos de 0 puntos\n");

					} while (puntos < 0);

					if (coac.asignarPuntos(opcT-1, puntos)) {
						System.out.print("Puntos asignados correctamente");
					} else {
						System.err.print("No se han podido asignar los puntos");

					}
					introVolver();
					opcT = 0;
				}
			} else {
				introVolver();
				opcT = 0;
			}

		} while (opcT != 0);
	}

	// Comprobado
	private static void concursoHace(ConcursoHace item) {
		int opcT = 0;
		do {
			System.out.println(coac.listarConcurso());
			if (!coac.listarConcurso().contains("VACIA")) {
				try {
					if (!coac.listarConcurso().contains("VACIA")) {
						switch (item) {
						case FALLA -> System.out.print("Que agrupacion va a camino de falla?\n[0 - Volver] : ");
						case PRESENTACION ->
							System.out.print("Que agrupacion va a cantar la presentación?\n[0 - Volver] : ");
						case TIPO -> System.out.print("Que agrupacion hace tipo?\n[0 - Volver] : ");
						}
						opcT = Integer.parseInt(entrada.nextLine());
					} else {
						opcT = Util.leerInt("[0 - Volver] : ");
					}
				} catch (Exception e) {
					System.err.println(MSGINTDEFECTO);
					opcT = INTDEFECTO;
				}

				if (opcT > coac.getNumeroDeAgrupacionesConcurso()) {
					System.err.println("Opcion incorrecta");
					opcT = 0;
				} else {
					if (opcT > 0) {
						System.out.println("\n" + coac.concursoHace(opcT - 1, item));
						introVolver();
						opcT = 0;
					}
				}

			} else {
				introVolver();
				opcT = 0;
			}

		} while (opcT != 0);
	}

	// Comprobado
	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

	// Comprobado
	private static void introVolver() {
		System.out.print("\nPulsa Intro para volver");
		entrada.nextLine();
	}
}
