package administradordehorarios;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Administradora implements ProfMate{
    String idProfesor;
    String nombre;
    String tanda;
    int horasLaborables;
    int secciones;
    
    Scanner teclado = new Scanner(System.in);
    BufferedReader esc = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Profesor> listaDeProfesores = new ArrayList<>();

    @Override
    public void agregarProfesor() {
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
            
                Profesor objProfesor = new Profesor(this.idProfesor, this.nombre, this.tanda, this.horasLaborables, this.secciones);
                listaDeProfesores.add(objProfesor);
            
            //Esto fue probando que las variables se estaba leyendo bien...jeje
            /*System.out.println("\nLos datos se registraron satisfactoriamente\nSe Digitó\n");
            System.out.println("El ID del nuevo profesor es: "+this.idProfesor);
            System.out.println("El nombre del nuevo profesor es: "+this.nombre);
            System.out.println("La tanda del nuevo profesor es: "+this.tanda);
            System.out.println("Las horas laborables del nuevo profesor son: "+this.horasLaborables);
            System.out.println("Las secciones del nuevo profesor son: "+this.secciones);*/
            
            
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
                        break;
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
    
    String idMateria;
    String materia;
    String aula;
    String dias;
    int creditos;
    
    ArrayList<Materia> listaDeMatarias = new ArrayList<>();
    
    @Override
    public void agregarMateria() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        
        
        int dime =0;
        int errorMateria=0;
        boolean stop=true;
        
        while(stop == true)
        {
                for (int i = 0; i < 20; i++) 
                {
                    System.out.println("");
                }
                System.out.println("\t\tBienvenido al Generador de Horarios SyC");
                System.out.println("\n\t\t\t   Agregando Materia\n\n");
        
                System.out.println("Seleccione la materia que desee ingresar de la siguiente lista\n"
                + "Digite el número de acuerdo a la materia\n");
        
                System.out.println("No.  Materia             \t\tAula   \t\tCreditos\tDias\t\tCodigo"
                + "\n1-  Programacion 1\t\t\tCAD\t\t4\t\tMartes\t\tSof-1"
                + "\n2-  Programacion 2\t\t\t2-1A\t\t4\t\tLunes\t\tSof-2"
                + "\n3-  Programacion 3\t\t\t4-1C\t\t4\t\tMiercoles\tSof-3"
                + "\n4-  Introd. a Base de Datos\t\t1-1B\t\t4\t\tJueves\t\tSof-4"
                + "\n5-  Base de Dato Avanzada\t\t1-1C\t\t4\t\tViernes\t\tSof-5"
                + "\n6-  Progamacion WEB\t\t\tCAD\t\t4\t\tMartes\t\tSof-6"
                + "\n7-  Auditoria Informatica\t\tAud-4\t\t4\t\tSabados\t\tSof-7"
                + "\n8-  Analisis y Diseño\t\t\tAud-2\t\t4\t\tMiercoles\tSof-8"
                + "\n9-  Estructura de Datos\t\t\t4-1C\t\t4\t\tJueves\t\tSof-9"
                + "\n10- Introd. a la Ing. de Software\tAud-4\t\t4\t\tLunes\t\tSof-10");
                for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
                
            try
            {
                System.out.print("\n\n\nEscriba aquí: ");
                dime = Integer.parseInt(teclado.next());
                
                    switch(dime)
                    {
                        case 1:
                        {
                            this.materia = "Programacion 1            ";
                            this.idMateria = "Sof-1";
                            this.aula = "CAD";
                            this.creditos=4;
                            this.dias = "Martes   ";
                            //stop = false;
                        }
                            break;
                        
                        case 2:
                        {
                            this.materia = "Programacion 2            ";
                            this.idMateria = "Sof-2";
                            this.aula = "2-1A";
                            this.creditos=4;
                            this.dias = "Lunes    ";
                            //stop = false;
                        }
                            break;
                        
                        case 3:
                        {
                            this.materia = "Programacion 3            ";
                            this.idMateria = "Sof-3";
                            this.aula = "4-1C";
                            this.creditos=4;
                            this.dias = "Miercoles";
                            //stop = false;
                        }
                            break;
                        
                        case 4:
                        {
                            this.materia = "Introd. a Base de Datos   ";
                            this.idMateria = "Sof-4";
                            this.aula = "1-1B";
                            this.creditos=4;
                            this.dias = "Jueves   ";
                            //stop = false;
                        }
                            break;
                        
                        case 5:
                        {
                            this.materia = "Base de Dato Avanzada     ";
                            this.idMateria = "Sof-5";
                            this.aula = "1-1C";
                            this.creditos=4;
                            this.dias = "Viernes  ";
                            //stop = false;
                        }
                            break;
                        
                        case 6:
                        {
                            this.materia = "Progamacion WEB           ";
                            this.idMateria = "Sof-6";
                            this.aula = "CAD";
                            this.creditos=4;
                            this.dias = "Martes   ";
                            //stop = false;
                        }
                            break;
                        
                        case 7:
                        {
                            this.materia = "Auditoria Informatica     ";
                            this.idMateria = "Sof-7";
                            this.aula = "Aud-4";
                            this.creditos=4;
                            this.dias = "Sabados  ";
                            //stop = false;
                        }
                            break;
                        
                        case 8:
                        {
                            this.materia = "Analisis y Diseño        ";
                            this.idMateria = "Sof-8";
                            this.aula = "Aud-2";
                            this.creditos=4;
                            this.dias = "MIercoles";
                            //stop = false;
                        }
                            break;
                        
                        case 9:
                        {
                            this.materia = "Estructura de Datos      ";
                            this.idMateria = "Sof-9";
                            this.aula = "4-1C";
                            this.creditos=4;
                            this.dias = "Jueves   ";
                            //stop = false;
                        }
                            break;
                        
                        case 10:
                        {
                            this.materia = "Introd. a la Ing. de Soft";
                            this.idMateria = "Sof-10";
                            this.aula = "Aud-4";
                            this.creditos=4;
                            this.dias = "Lunes    ";
                            //stop = false;
                        }
                            break;
                        
                        default:
                        {
                            System.out.print("Digitó un número fuera del rango de la selección..."
                                    + "\nDigite un número del 1 al 10 de acuerdo a la materia que desee ingresar");
                            errorMateria+=1;
                            if(errorMateria >=3)
                            {
                                stop = false;
                                System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                                + "\nEl sistema volverá al menú INICIO");
                            }
                        }
                            break;
                        
                    }
                    Materia objMateria = new Materia(this.idMateria, this.materia, this.aula, this.dias, this.creditos);
                    listaDeMatarias.add(objMateria);
                    
                    System.out.println("La materia se seleccionó correctamente\n\n"
                            + "Desea seguir seleccionando materia?"
                            + "\n1- Si"
                            + "\n2- No");
                    System.out.print("Escriba aquí: ");
                    int sigues=0;
                    sigues = Integer.parseInt(teclado.next());
                    switch(sigues)
                    {
                        case 1:
                        {
                            stop = true;
                        }
                            break;
                        case 2:
                        {
                            stop = false;
                        }
                            break;
                        default:
                        {
                            System.out.println("\nDigito una opción incorrecta\nEl sistema volvera al menú inicio");
                            stop = false;
                        }
                            break;
                    }
            }
            catch(NumberFormatException e)
            {
                System.out.print("Error al seleccionar la materia... Introdujo un digito diferente a un numero"
                    + "Digite un numero del 1 al 10 de acuerdo a la materia que desee ingresar");
                errorMateria+=1;
                if(errorMateria >=3)
                {
                    stop = false;
                    System.out.println("\nUsted excedió el nivel de errores para agregar un nuevo profesor"
                            + "\nEl sistema volverá al menú INICIO");
                }
            } 
        }
        
        
    }

    @Override
    public void generaHorario() {
       
    }

    @Override
    public void muestraProfesores() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        System.out.println("Bienvenido al Generador de Horarios SyC");
        System.out.println("\nListado de Profesores");
        System.out.println("IDs   \t\tNombres\t\tTandas\t\tHoras Laborables\t\t");
        
        for (Profesor profesor : listaDeProfesores) {
            System.out.println(profesor.idProfesor+"\t\t"+profesor.nombre+"\t\t"+profesor.tanda+"\t\t"+profesor.horasLaborables);
        }
    }

    @Override
    public void muestraMaterias() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        System.out.println("\t\tBienvenido al Generador de Horarios SyC");
        System.out.println("\n\t\t   Listado de Materias Seleccionadas\n\n");
        System.out.println("Codigo\tMateria             \t\tAula\t\tDias\t\tCreditos");
        
        for (Materia m : listaDeMatarias) {
            System.out.println(m.idMateria+"\t"+m.materia+"\t"+m.aula+"\t\t"+m.dias+"\t"+m.creditos);
        }
    }

    @Override
    public void generaPDF() {
        Document doc = new Document();
        
        try
        {
            PdfWriter.getInstance(doc, new  FileOutputStream("Horario.pdf"));
            doc.open();
            Paragraph escribe = new Paragraph();
            
            escribe.add("                                                 Generador de Horarios SyC\n");
            escribe.add("                                                            Programacion 1\n");
            
                        
            for (Materia m : listaDeMatarias) 
            {
                escribe.add(("Aquí imprimirá el horario"));
            }
            
            
            doc.add(escribe);
            doc.close();
            System.out.println("Se guardo el ejemplo");
            
        }
        catch(Exception e)
        {
            System.out.println("So Sorry");
        }
    }
    
    
}
