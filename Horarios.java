
package administradordehorarios;
public class Horarios {
    String materiaHorario;
    String profesorHorario;
    String tandaHorario;
    String diaHorario;
    String aulaHorario;
    int criditosHorario;
    

    public Horarios(String materiaHorario, String profesorHorario, String tandaHorario, String diaHorario,String aulaHorario, int criditosHorario) {
        this.materiaHorario = materiaHorario;
        this.profesorHorario = profesorHorario;
        this.tandaHorario = tandaHorario;
        this.diaHorario = diaHorario;        
        this.aulaHorario = aulaHorario;
        this.criditosHorario = criditosHorario;
    }

    public String getDiaHorario() {
        return diaHorario;
    }

    public void setDiaHorario(String diaHorario) {
        this.diaHorario = diaHorario;
    }

    public String getMateriaHorario() {
        return materiaHorario;
    }

    public void setMateriaHorario(String materiaHorario) {
        this.materiaHorario = materiaHorario;
    }

    public String getProfesorHorario() {
        return profesorHorario;
    }

    public void setProfesorHorario(String profesorHorario) {
        this.profesorHorario = profesorHorario;
    }

    public String getTandaHorario() {
        return tandaHorario;
    }

    public void setTandaHorario(String tandaHorario) {
        this.tandaHorario = tandaHorario;
    }

    public String getAulaHorario() {
        return aulaHorario;
    }

    public void setAulaHorario(String aulaHorario) {
        this.aulaHorario = aulaHorario;
    }

    public int getCriditosHorario() {
        return criditosHorario;
    }

    public void setCriditosHorario(int criditosHorario) {
        this.criditosHorario = criditosHorario;
    }
    
}
