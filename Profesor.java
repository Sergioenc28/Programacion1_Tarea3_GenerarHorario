package administradordehorarios;

public class Profesor {
    String idProfesor;
    String nombre;
    String tanda;
    int horasLaborables;
    int secciones;

    public Profesor(String idProfesor, String nombre, String tanda, int horasLaborables, int secciones) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.tanda = tanda;
        this.horasLaborables = horasLaborables;
        this.secciones = secciones;
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
