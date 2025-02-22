package view.menu.agrupacion;

import java.util.Scanner;

import controller.COAC;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Romancero;
import view.Util;

public class MenuAgrupacion {
	public static final COAC coac = view.menu.Menu.coac;
	private static final int INTDEFECTO = 0;
	private static final String STRINGDEFECTO = "VACIO";
	private static final String MSGSTRINGDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ STRINGDEFECTO + " ]";
	private static final String MSGINTDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ INTDEFECTO + " ]";

	private static Scanner entrada = new Scanner(System.in);
	// Opcion 2. Añadir una agrupación.

	public static void opcAñadirAgrupacion() {
		int opc;
		int opcT;
		int temp;
		boolean addOther = false;
		String nombre = "";
		String autor = "";
		String autorMusica = "";
		String autorLetra = "";
		String tipo = "";
		int puntosObtenidos = 0;
		int numeroBandurrias = 0;
		int numeroGuitarras = 0;
		String empresaAtrezzo = "";
		int numeroCupies = 0;
		int numeroMiembros = 0;
		String tematica = "";
		do {
			mostrarMenuAddAgrupacion();
			try {
				opc = Util.leerInt("Opción [0 - Volver] : ");

			} catch (Exception e) {
				opc = INTDEFECTO;
				System.err.println(MSGINTDEFECTO);
			}
			if (opc > 0 && opc < 6) {
				// Datos Agrupacion
				System.out.print("Indica el nombre: ");
				try {
					nombre = entrada.nextLine();
				} catch (Exception e) {
					nombre = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (nombre.length() <= 0)
					nombre = STRINGDEFECTO;

				System.out.print("Indica el autor: ");
				try {
					autor = entrada.nextLine();
				} catch (Exception e) {
					autor = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (autor.length() <= 0)
					autor = STRINGDEFECTO;
				System.out.print("Indica el autor de la musica: ");
				try {
					autorMusica = entrada.nextLine();
				} catch (Exception e) {
					autorMusica = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (autorMusica.length() <= 0)
					autorMusica = STRINGDEFECTO;

				System.out.print("Indica el autor de la letra: ");
				try {
					autorLetra = entrada.nextLine();
				} catch (Exception e) {
					autorLetra = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (autorLetra.length() <= 0)
					autorLetra = STRINGDEFECTO;
				System.out.print("Indica el tipo: ");
				try {
					tipo = entrada.nextLine();
				} catch (Exception e) {
					tipo = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (tipo.length() <= 0)
					tipo = STRINGDEFECTO;
			}
			switch (opc) {
			case 1 -> {
				// Datos Coro
				System.out.print("Indica el numero de bandurrias: ");
				do {
					try {
						numeroBandurrias = Integer.parseInt(entrada.nextLine());
					} catch (Exception e) {
						numeroBandurrias = INTDEFECTO;
						System.err.println(MSGINTDEFECTO);
					}
					if (numeroBandurrias < 0)
						System.out.println("Introduce un valor valido!");
				} while (numeroBandurrias < 0);
				do {

					System.out.println("Indica el numero de guitarras: ");
					try {
						numeroGuitarras = Integer.parseInt(entrada.nextLine());

					} catch (Exception e) {
						numeroGuitarras = INTDEFECTO;
						System.err.println(MSGINTDEFECTO);
					}
					if (numeroGuitarras < 0)
						System.out.println("Introduce un valor valido!");
				} while (numeroGuitarras < 0);
				coac.inscribirAgrupacion(new Coro(numeroBandurrias, numeroGuitarras, puntosObtenidos, nombre, autor,
						autorMusica, autorLetra, tipo));
			}
			case 2 -> {
				// Datos comparza
				System.out.print("Indica la empresa de atrezzo: ");
				try {
					empresaAtrezzo = entrada.nextLine();

				} catch (Exception e) {
					empresaAtrezzo = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (empresaAtrezzo.length() <= 0)
					empresaAtrezzo = STRINGDEFECTO;
				coac.inscribirAgrupacion(
						new Comparsa(empresaAtrezzo, puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo));
			}
			case 3 -> {
				// Datos chirigota
				System.out.print("Indica el numero de cupies: ");
				do {

					try {
						numeroCupies = Integer.parseInt(entrada.nextLine());

					} catch (Exception e) {
						numeroCupies = INTDEFECTO;
						System.err.println(MSGINTDEFECTO);
					}
					if (numeroCupies < 0)
						System.err.println("Introduce un valor valido!");
				} while (numeroCupies < 0);
				coac.inscribirAgrupacion(
						new Chirigota(numeroCupies, puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo));
			}
			case 4 -> {
				// Datos Cuarteto
				do {

					System.out.print("Indica el numero de miembros: ");
					numeroMiembros = Integer.parseInt(entrada.nextLine());
					if (numeroMiembros < 0)
						System.err.println("Introduce un valor valido!");
				} while (numeroMiembros < 0);
				coac.inscribirAgrupacion(
						new Cuarteto(numeroMiembros, puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo));
			}
			case 5 -> {
				// Datos romancero
				System.out.print("Indica la tematica: ");
				try {

					tematica = entrada.nextLine();
				} catch (Exception e) {
					tematica = STRINGDEFECTO;
					System.err.println(MSGSTRINGDEFECTO);
				}
				if (tematica.length() <= 0)
					tematica = STRINGDEFECTO;
				coac.inscribirAgrupacion(new Romancero(tematica, nombre, autor, autorMusica, autorLetra, tipo));
			}
			}
			if (opc > 5) {
				System.err.println("Opcion incorrecta");
				opc = 0;
			}
			if (opc > 0 && opc < 6 && opc != 5 && coac.getNumeroDeIntegrantesActual() > 0) {
				do {
					if (!addOther)
						System.out.print("Quieres añadir algun participante?\n1. Si\n2. No\nOpcion[ 0 - Volver ]: ");
					try {
						opcT = Integer.parseInt(entrada.nextLine());
						if (opcT == 0)
							opcT = 2;
					} catch (Exception e) {
						opcT = 2;
						System.err.println(MSGINTDEFECTO);
					}
					if (opcT < 1) {
						System.err.println("Nada, el listo que pone otra opcion, vota bien merluzo");
					}
					if (opcT > 2) {
						System.err.println("Nada, el listo que pone otra opcion, vota bien merluzo");
					}
				} while (opcT < 1 || opcT > 2);
				// AÑADIMOS AQUI INTEGRANTES
				if (opcT == 1) {
					do {
						int pos;
						System.out.println(coac.listarParticipante());
						System.out.print(
								"Introduce la posicion del integrante que deseas añadir\nOpcion: [0 - Volver]:  ");
						try {
							pos = Integer.parseInt(entrada.nextLine());
						} catch (Exception e) {
							pos = INTDEFECTO;
							System.err.println(MSGINTDEFECTO);
						}
						if (pos != 0) {
							if (pos > 0 && pos <= coac.getNumeroDeIntegrantesActual()) {
								if (coac.addIntegranteToAgrupacion(pos-1)) {
									System.out.println("Integrante añadido correctamente");
									do {
										System.out.println("Quieres añadir otro participante?\n1. Si\n2. No");
										temp = Integer.parseInt(entrada.nextLine());
										addOther = switch (temp) {
										case 1 -> true;
										case 2 -> false;
										default -> false;
										};
										if (!addOther)
											opc = 0;
										if (temp < 1 || temp > 2)
											System.err.println("Introduce una opcion correcta");
									} while (temp < 1 || temp > 2);

								} else {
									System.err.println("No se ha podido añadir el integrante");
								}
							} else {
								System.err.print("\nPon un numero correcto ¬¬");

							}
						} else {
							break;
						}

					} while (opc != 0);

				}
			}

		} while (opc != 0);
	}

	// Opcion 4. Editar datos de una agrupación.

	public static void opcEditarAgrupacion() {
		int opc;
		String nombre = "";
		String autor = "";
		String autorMusica = "";
		String autorLetra = "";
		String tipo = "";
		int numeroBandurrias = 0;
		int numeroGuitarras = 0;
		String empresaAtrezzo = "";
		int numeroCupies = 0;
		int numeroMiembros = 0;
		String tematica = "";
		do {
			Util.escribir("\n");
			Util.escribir("┌──────────────────────────┐");
			Util.escribir("│   MODIFICAR AGRUPACION   │");
			Util.escribir("└──────────────────────────┘");
			System.out.println(coac.listarTodo());
			if (!coac.listarTodo().contains("VACIA")) {
				System.out.print("Selecciona la posicion de la agrupacion que quieres modificar:\n ");
				try {
					opc = Util.leerInt("Opción [0 - Salir] : ");
				} catch (Exception e) {
					System.err.println(MSGINTDEFECTO);
					opc = INTDEFECTO;
				}
				if (opc > 0 && opc <= coac.getNumeroDeAgrupacionesActual()) {
					// Datos Agrupacion
					System.out.print("Indica el nombre[" + coac.getAgrupacion()[opc - 1].getNombre() + "]: ");
					nombre = entrada.nextLine();
					if (nombre.length() <= 0)
						nombre = coac.getAgrupacion()[opc - 1].getNombre();
					System.out.print("Indica el autor[" + coac.getAgrupacion()[opc - 1].getAutor() + "]: ");
					autor = entrada.nextLine();
					if (autor.length() <= 0)
						autor = coac.getAgrupacion()[opc - 1].getAutor();
					System.out.print(
							"Indica el autor de la musica[" + coac.getAgrupacion()[opc - 1].getAutorMusica() + "]: ");
					autorMusica = entrada.nextLine();
					if (autorMusica.length() <= 0)
						autorMusica = coac.getAgrupacion()[opc - 1].getAutorMusica();
					System.out.print(
							"Indica el autor de la letra[" + coac.getAgrupacion()[opc - 1].getAutorMusica() + "]: ");
					autorLetra = entrada.nextLine();
					if (autorLetra.length() <= 0)
						autorLetra = coac.getAgrupacion()[opc - 1].getAutorLetra();
					System.out.print("Indica el tipo[" + coac.getAgrupacion()[opc - 1].getTipo() + "]: ");
					tipo = entrada.nextLine();
					if (tipo.length() <= 0)
						tipo = coac.getAgrupacion()[opc - 1].getTipo();
					if (coac.getAgrupacion()[opc - 1] instanceof Coro) {
						System.out.print("Indica el numero de bandurrias["
								+ (((Coro) coac.getAgrupacion()[opc - 1]).getNumeroBandurrias()) + "]: ");
						try {
							numeroBandurrias = Integer.parseInt(entrada.nextLine());
						} catch (Exception e) {
							numeroBandurrias = INTDEFECTO;
							System.err.println(MSGINTDEFECTO);
						}
						System.out.print("Indica el numero de guitarras["
								+ (((Coro) coac.getAgrupacion()[opc - 1]).getNumeroGuitarras()) + "]: ");
						try {
							numeroGuitarras = Integer.parseInt(entrada.nextLine());

						} catch (Exception e) {
							numeroGuitarras = INTDEFECTO;
							System.err.println(MSGINTDEFECTO);
						}
					}
					if (coac.getAgrupacion()[opc - 1] instanceof Comparsa) {
						System.out.print("Indica la empresa de atrezzo["
								+ (((Comparsa) coac.getAgrupacion()[opc - 1]).getEmpresaAtrezzo()) + "]: ");
						empresaAtrezzo = entrada.nextLine();
						if (empresaAtrezzo.length() <= 0)
							empresaAtrezzo = ((Comparsa) coac.getAgrupacion()[opc - 1]).getEmpresaAtrezzo();
					}
					if (coac.getAgrupacion()[opc - 1] instanceof Chirigota) {
						System.out.print("Indica el numero de cupies["
								+ (((Chirigota) coac.getAgrupacion()[opc - 1]).getNumeroCupies()) + "]: ");

						try {
							numeroCupies = Integer.parseInt(entrada.nextLine());
						} catch (Exception e) {
							numeroCupies = INTDEFECTO;
							System.err.println(MSGINTDEFECTO);
						}
					}
					if (coac.getAgrupacion()[opc - 1] instanceof Cuarteto) {
						System.out.print("Indica el numero de miembros["
								+ (((Cuarteto) coac.getAgrupacion()[opc - 1]).getNumeroMiembros()) + "]: ");
						try {
							numeroMiembros = Integer.parseInt(entrada.nextLine());
						} catch (Exception e) {
							numeroMiembros = INTDEFECTO;
							System.err.println(MSGINTDEFECTO);
						}
					}
					if (coac.getAgrupacion()[opc - 1] instanceof Romancero) {
						System.out.print("Indica la tematica["
								+ (((Romancero) coac.getAgrupacion()[opc - 1]).getTematica()) + "]: ");
						tematica = entrada.nextLine();
						if (tematica.length() <= 0)
							tematica = ((Romancero) coac.getAgrupacion()[opc - 1]).getTematica();
					}
					coac.editarAgrupacion(opc-1, nombre, autor, autorMusica, autorLetra, tipo, numeroBandurrias,
							numeroGuitarras, empresaAtrezzo, numeroCupies, numeroMiembros, tematica);
					opc = 0;
				} else {
					System.err.print("La posicion introducida no se encuentra.");
					opc = 0;
				}
			} else {
				introVolver();
				opc = 0;
			}

		} while (opc != 0);
	}

	private static void mostrarMenuAddAgrupacion() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│    AÑADIR AGRUPACION     │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("1. Coro");
		Util.escribir("2. Comparsa");
		Util.escribir("3. Chirigota");
		Util.escribir("4. Cuarteto");
		Util.escribir("5. Romancero");
	}

	private static void introVolver() {
		System.out.print("\nPulsa Intro para volver");
		entrada.nextLine();
	}

}
