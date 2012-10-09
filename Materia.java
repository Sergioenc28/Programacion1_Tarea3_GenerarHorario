package administradordehorarios;

public class Materia {
    String idMateria;
    String materia;
    String aula;
    String dias;
    int creditos;

    public Materia(String idMateria, String materia, String aula, String dias, int creditos) {
        this.idMateria = idMateria;
        this.materia = materia;
        this.aula = aula;
        this.dias = dias;
        this.creditos = creditos;
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

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    


    
}
