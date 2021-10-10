package Model;

public class CalificacionDAO {
    private long    kservicio;
    private String  vcalificacion;
    private String  descripcion;

    public CalificacionDAO() {
    }

    public long getKservicio() {
        return kservicio;
    }

    public void setKservicio(long kservicio) {
        this.kservicio = kservicio;
    }

    public String getVcalificacion() {
        return vcalificacion;
    }

    public void setVcalificacion(String vcalificacion) {
        this.vcalificacion = vcalificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
}
