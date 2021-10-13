package Controller;

import java.util.Date;

public class Servicio {
    private static long     kservicio;
    private String          tipopaquete;
    private java.sql.Date   fservicio;
    private String          h_inicio;
    private String          cpostal;
    private float           pcomision;
    private float           vpaquete;
    private String          tipdocc;
    private String          numdocc;
    private String          mpago;
    private String          direcccioni;
    private String          descripcioni;

    public Servicio() {
    }

    public java.sql.Date getFservicio() {
        return fservicio;
    }

    public void setFservicio(java.sql.Date fservicio) {
        this.fservicio = fservicio;
    }
    
    public static long getKservicio() {
        return kservicio;
    }

    public static void setKservicio(long kservicio) {
        Servicio.kservicio = kservicio;
    }

    public String getTipopaquete() {
        return tipopaquete;
    }

    public void setTipopaquete(String tipopaquete) {
        this.tipopaquete = tipopaquete;
    }

    public String getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getCpostal() {
        return cpostal;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }

    public String getTipdocc() {
        return tipdocc;
    }

    public void setTipdocc(String tipdocc) {
        this.tipdocc = tipdocc;
    }

    public String getNumdocc() {
        return numdocc;
    }

    public void setNumdocc(String numdocc) {
        this.numdocc = numdocc;
    }

    public String getMpago() {
        return mpago;
    }

    public void setMpago(String mpago) {
        this.mpago = mpago;
    }

    public String getDirecccioni() {
        return direcccioni;
    }

    public void setDirecccioni(String direcccioni) {
        this.direcccioni = direcccioni;
    }

    public String getDescripcioni() {
        return descripcioni;
    }

    public void setDescripcioni(String descripcioni) {
        this.descripcioni = descripcioni;
    } 

    public float getPcomision() {
        return pcomision;
    }

    public void setPcomision(float pcomision) {
        this.pcomision = pcomision;
    }

    public float getVpaquete() {
        return vpaquete;
    }

    public void setVpaquete(float vpaquete) {
        this.vpaquete = vpaquete;
    }
    
    
}
