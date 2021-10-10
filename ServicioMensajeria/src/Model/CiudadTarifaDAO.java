package Model;

public class CiudadTarifaDAO {
    private String  cpostal;
    private String  nciudad;
    private float   pcomision;
    private String  tipopaquete;
    private float   vpaquete;

    public CiudadTarifaDAO() {
    }

    public String getCpostal() {
        return cpostal;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }

    public String getNciudad() {
        return nciudad;
    }

    public void setNciudad(String nciudad) {
        this.nciudad = nciudad;
    }

    public float getPcomision() {
        return pcomision;
    }

    public void setPcomision(float pcomision) {
        this.pcomision = pcomision;
    }

    public String getTipopaquete() {
        return tipopaquete;
    }

    public void setTipopaquete(String tipopaquete) {
        this.tipopaquete = tipopaquete;
    }

    public float getVpaquete() {
        return vpaquete;
    }

    public void setVpaquete(float vpaquete) {
        this.vpaquete = vpaquete;
    } 
}
