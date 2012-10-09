package administradordehorarios;
import java.util.Scanner;
public class AdministradorDeHorarios {

    public static void main(String[] args) {
        boolean inicio = true;
        Scanner teclado = new Scanner(System.in);
        Administradora objAdministradora = new Administradora();
        
        while(inicio==true)
        {
            int opcion = 0;
            System.out.println("\n\n\tBienvenido al Generador de Horarios SyC");
            System.out.println("\n\nSeleccionesun la operacion que desea realizar");
            System.out.println("1- Agregar nuevo profesor");
            System.out.println("2- Agregar nueva materia");
            System.out.println("3- Ver lista de profesores registrados");
            System.out.println("4- Ver lista de materias seleccionadas");
            System.out.println("5- Generar Horario");
            System.out.println("6- Generar PDF");
            System.out.println("7- Salir del sistema");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(teclado.next());
            
            switch(opcion)
            {
                case 1:
                {
                    objAdministradora.agregarProfesor();
                }
                    break;
                    
                case 2:
                {
                    objAdministradora.agregarMateria();
                }
                    break;
                    
                case 3:
                {
                    objAdministradora.muestraProfesores();
                }
                    break;
                    
                case 4:
                {
                    objAdministradora.muestraMaterias();
                }
                    break;
                    
                case 5:
                {

                    System.out.println("Generar Horario");
                    objAdministradora.genraHorario();

                }
                    break;
                    
                case 6:
                {
                    objAdministradora.generaPDF();
                }
                    break;
                    
                case 7:
                {
                    for(int x=0;x<100;x++)
                    {
                        System.out.println();
                    }
                    System.out.println("\tGracias por utilizar nuestro sistema");
                    System.out.println("\t\t    Hasta Luego..."); 
                    for(int x=0;x<15;x++)
                    {
                        System.out.println();
                    }
                    inicio = false;
                }
                    break;
            }
        }
        
        
        
        
        
    }
}
