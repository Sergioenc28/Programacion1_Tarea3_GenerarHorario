package administradordehorarios;

public class Profesor {
    String idProfesor;
    String nombre;
    String tanda;
    int horasLaborables;
    int secciones;
    boolean disponible = true;
    boolean disponibleLun = true;
    boolean disponibleMar = true;
    boolean disponibleMie = true;
    boolean disponibleJue = true;
    boolean disponibleVie = true;
    boolean disponibleSab = true;

    public Profesor(String idProfesor, String nombre, String tanda, int horasLaborables, int secciones, boolean disponible,boolean disponibleLun,boolean disponibleMar,boolean disponibleMie,boolean disponibleJue,boolean disponibleVie,boolean disponibleSab) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.tanda = tanda;
        this.horasLaborables = horasLaborables;
        this.secciones = secciones;
        this.disponible = disponible;
        this.disponibleLun = disponibleLun;
        this.disponibleMar = disponibleMar;
        this.disponibleMie = disponibleMie;
        this.disponibleJue = disponibleJue;
        this.disponibleVie = disponibleVie;
        this.disponibleSab = disponibleSab;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTanda() {
        return tanda;
    }

    public void setTanda(String tanda) {
        this.tanda = tanda;
    }

    public int getHorasLaborables() {
        return horasLaborables;
    }

    public void setHorasLaborables(int horasLaborables) {
        this.horasLaborables = horasLaborables;
    }

    public int getSecciones() {
        return secciones;
    }

    public void setSecciones(int secciones) {
        this.secciones = secciones;
    }

    
}
