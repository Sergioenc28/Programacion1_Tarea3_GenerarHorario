
//Esta clase fue sustituida por la clase Administradora


/*package administradordehorarios;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministraTodo {
    String idProfesor;
    String nombre;
    String tanda;
    int horasLaborables;
    int secciones;
    

    ArrayList<AdministraTodo> todosLosProfesores = new ArrayList<>();//Esto lo hare al final

    ArrayList<AdministraTodo> todosLosProfesores = new ArrayList<>();

    
    Scanner teclado = new Scanner(System.in);
    public void crearProfesor(String idProfesor, String nombre, String tanda, int horasLaborables, int secciones)
    {
        int error =0;
        boolean sigue=true;
        
        while(sigue == true)
        {
            for(int x=0;x<50;x++)
                    {
                        System.out.println();
                    }
        
            boolean dameId = true;
            while(dameId == true)
            {
                System.out.println("\nDigite los 4 digitos del ID del nuevo profesor...\nEj: 0001 o EG01 ");
                for(int x=0;x<15;x++)
                        {
                            System.out.println();
                        }
                String pa_idProfesor;
                System.out.print("\nEscriba aquí: ");
                pa_idProfesor = teclado.next();
                if(pa_idProfesor.length()!= 4)
                {
                    System.out.println("\nError al digitar los digitos del ID del Profesor. Son exactamente 4 digitos "
                            + "\nEj: 0001 o EG01 ");
                    error += 1;
                    if(error >= 3)
                    {
                        System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                                + "\nEl sistema volvera el menú INICIO");
                        dameId = false;
                    }
                }
                else
                {
                    this.idProfesor = pa_idProfesor;
                    dameId = false;
                }
            }
            
            System.out.println("\nDigite el primer nombre y el primer apellido del nuevo profesor...\nEj: Edgar Garcia");
            System.out.print("\nEscriba aquí: ");
            
            this.nombre = teclado.next();
            String pa_nombre = this.nombre;
            try
            {
                int pa_tanda = 0;
                boolean dameTanda = true;
                while(dameTanda == true)
                {
                    System.out.println("\nSeleccione la tanda de "+pa_nombre+"\n 1- Matutina\n 2- Vespertina");
                    System.out.print("\nEscriba aquí: ");
                    pa_tanda = Integer.parseInt(teclado.next());
            
                    if (pa_tanda == 1)
                    {
                        this.tanda = "Matutina";
                        dameTanda = false;
                        System.out.println("\nMatutita");
                    }
                    else if (pa_tanda == 2)
                    {
                        this.tanda = "Vespertina";
                        dameTanda = false;
                        System.out.println("\nVeespertita");
                    }
                    else
                    {
                        System.out.println("\nUsted digitó un numero diferente de 1 o 2...");
                        error += 1;
                        if(error >=3)
                        {
                            System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                                    + "\nEl sistema volverá al menú INICIO");
                            dameTanda = false;
                            sigue=false;
                        }
                    }
                }
            }
            catch(NumberFormatException e)
            {
                System.out.printf("\nPara asignar la tanda del profesor "+pa_nombre+" no puede digitar letras..."
                        + "\nSe le pide digitar un numero según la opción\n 1- Matutina\n 2- Vespertina");
                error += 1;
                if(error >= 3)
                {
                    System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                            + "\nEl sistema volverá al menú INICIO");
                }
            }
            try
            {
                int pa_horasLaborables;
                boolean dameHora=true;
                while(dameHora==true)
                {
                    System.out.printf("\nSeleccione las horas laborables del profesor "+pa_nombre+"\n 1- 20 Horas Laborables"
                            + "\n 2- 40 Horas Laborables");
                    System.out.print("\nEscriba aquí: ");
                    pa_horasLaborables = Integer.parseInt(teclado.next());
                    if (pa_horasLaborables == 1)
                    {
                        this.horasLaborables = 20;
                        dameHora = false;
                        System.out.println("\n20 Horas");
                    }
                    else if (pa_horasLaborables == 2)
                    {
                        this.horasLaborables = 40;
                        dameHora = false;
                        System.out.println("\n40 Horas");
                    }
                    else
                    {
                        System.out.println("\nError... Usted digito un numero diferente de 1 o 2...");
                        error += 1;
                        if(error >= 3)
                        {
                            System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                                    + "\nEl sistema volverá al menú INICIO");
                            dameHora = false;
                            sigue = false;
                        }
                    }
                }
            }
            catch(NumberFormatException e)
            {
                System.out.printf("\nPara asignar las horas laborables del profesor "+pa_nombre+" no puede digitar letras..."
                        + "\nSe le pide digitar un numero según la opción\n 1- 20 Horas Laborables\n 2- 40 Horas Laborables");
                error += 1;
                if(error >= 3)
                {
                    System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                            + "\nEl sistema volverá al menú INICIO");
                    sigue=false;
                }
            }
            
                int paSecciones = this.horasLaborables/4;
                this.secciones = paSecciones;
            
            //todosLosProfesores.add();
            System.out.println("\nLos datos se registraron satisfactoriamente\nSe Digitó\n");
            System.out.println("El ID del nuevo profesor es: "+this.idProfesor);
            System.out.println("El nombre del nuevo profesor es: "+this.nombre);
            System.out.println("La tanda del nuevo profesor es: "+this.tanda);
            System.out.println("Las horas laborables del nuevo profesor son: "+this.horasLaborables);
            System.out.println("Las secciones del nuevo profesor son: "+this.secciones);
            
            try
            {
                System.out.println("\nDesea seguir agregando profesores\n1- Si\n2- No");
                System.out.print("\nEscriba aquí: ");
                int dime =0;
                dime = Integer.parseInt(teclado.next());
            
                switch(dime)
                {
                    case 1:
                    {
                        sigue = true;
                    }
                        break;
                    case 2:
                    {
                        sigue = false;
                    }
                    default:
                    {
                        System.out.println("\nDigito una opción incorrecta\nEl sistema volvera al menú inicio");
                        sigue = false;
                    }
                        break;
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("\nDigito algo diferente a un número\nEl sistema volvera al menú inicio");
                sigue = false;
            }
        }
    }
}*/