package administradordehorarios;

public class Materia {
    String idMateria;
    String materia;
    String aula;
    int creditos;
    boolean dada = false;

    public Materia(String idMateria, String materia, String aula, int creditos, boolean dada) {
        this.idMateria = idMateria;
        this.materia = materia;
        this.aula = aula;
        this.creditos = creditos;
        this.dada =  dada;
    }

    public boolean isDada() {
        return dada;
    }

    public void setDada(boolean dada) {
        this.dada = dada;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    


    
}
