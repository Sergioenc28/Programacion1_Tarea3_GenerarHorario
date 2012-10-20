package administradordehorarios;

import java.util.Scanner;

public class AdministradorDeHorarios {

    public static void main(String[] args) {
        boolean inicio = true;
        Scanner teclado = new Scanner(System.in);
        Administradora objAdministradora = new Administradora();
        int errorInicio = 0;

        while (inicio == true) {
            int opcion;
            System.out.println("\n\n\tBienvenido al Generador de Horarios SyC");
            System.out.println("\n\nSeleccionesun la operacion que desea realizar");
            System.out.println("1- Agregar nuevo profesor");
            System.out.println("2- Agregar nueva materia");
            System.out.println("3- Ver lista de profesores registrados");
            System.out.println("4- Ver lista de materias seleccionadas");
            System.out.println("5- Generar Horario");
            System.out.println("6- Generar PDF");
            System.out.println("7- Salir del sistema");

            try {
                System.out.print("Opción: ");
                opcion = Integer.parseInt(teclado.next());

                switch (opcion) {
                    case 1: {
                        objAdministradora.agregarProfesor();
                    }
                    break;

                    case 2: {
                        objAdministradora.agregarMateria();
                    }
                    break;

                    case 3: {
                        objAdministradora.muestraProfesores();
                    }
                    break;

                    case 4: {
                        objAdministradora.muestraMaterias();
                    }
                    break;

                    case 5: {
                        objAdministradora.generaHorario();
                    }
                    break;

                    case 6: {
                        objAdministradora.generaPDF();
                    }
                    break;

                    case 7: {
                        for (int x = 0; x < 100; x++) {
                            System.out.println();
                        }
                        System.out.println("\tGracias por utilizar nuestro sistema");
                        System.out.println("\t\t    Hasta Luego...");
                        for (int x = 0; x < 15; x++) {
                            System.out.println();
                        }
                        inicio = false;
                    }
                    break;
                    default: {
                        System.out.println("\nDigitó un numero fuera del rango de las opciones");
                        errorInicio += 1;
                        if (errorInicio >= 3) {
                            for (int x = 0; x < 100; x++) {
                                System.out.println();
                            }
                            System.out.println("\n\tExedió el numero de errores del sistema\n \t\t\tAdios...");
                            inicio = false;
                            for (int x = 0; x < 15; x++) {
                                System.out.println();
                            }
                        }
                    }
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nDigite una opcion valida...\nUsted no me explotará por aquí");
                errorInicio += 1;
                if (errorInicio >= 3) {
                    System.out.println("\nLe dije que no me iva ha explotar por aqui\n \t\tAdios...");
                    inicio = false;
                }
            }

        }





    }
}
