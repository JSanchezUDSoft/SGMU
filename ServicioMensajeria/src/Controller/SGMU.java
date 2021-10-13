package Controller;

/*import Model.LoginDAO;
import Model.ClienteDAO;
import Model.ServicioDAO;
import Model.MensajeroDAO;
import Model.HorarioDAO;
import Model.CiudadTarifaDAO;
import Model.PagoMensajeroDAO;
import Model.CalificacionDAO;*/
import Model.*;

import View.*;
import Util.SMException;
import Util.SesionController;
import java.util.Date; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SGMU {
    private LoginDAO loginDAO;
    private Login login;
    private ClienteDAO clienteDAO;
    private Cliente cliente;
    private ServicioDAO servicioDAO;
    private Servicio servicio;
    private MensajeroDAO mensajeroDAO;
    private Mensajero mensajero;
    private HorarioDAO horarioDAO;
    private Horario horario;
    private CiudadTarifaDAO ciudadtarifaDAO;
    private CiudadTarifa ciudadtarifa;
    private PagoMensajeroDAO pagomensajeroDAO;
    private PagoMensajero pagomensajero;
    private CalificacionDAO calificacionDAO;
    private Calificacion calificacion;
    //Vistas
    public ValidarCliente validarcliente;
    public RegistrarCliente registrarcliente;
    public RegistrarServicio registrarservicio;
    public RegistrarIndicacion registrarindicacion;
    

    public SGMU() {
        clienteDAO = new ClienteDAO();
        servicioDAO = new ServicioDAO();
    }

    public void validarCliente(String tipdocc, String numdocc) throws SMException{
        validarcliente = new ValidarCliente();
        registrarcliente = new RegistrarCliente();
        registrarservicio = new RegistrarServicio();
        cliente = new Cliente();
        cliente.setTipdocc(tipdocc);
        cliente.setNumdocc(numdocc);
        boolean result = clienteDAO.validarCliente(cliente);
        if(result == true){
            System.out.println("Mostrar formulario servicio");
            registrarservicio.setVisible(true);
            SesionController.setK_tipdoc(tipdocc);
            SesionController.setK_numdoc(numdocc);
        }
        else{
            SesionController.setK_tipdoc(tipdocc);
            SesionController.setK_numdoc(numdocc);
            System.out.println("Mostrar formulario cliente");
            registrarcliente.actualizar();
            registrarcliente.setVisible(true);
        }
    }
    
    public boolean registrarCliente(String tipdocc, String numdocc, String n1, String n2, String a1, String a2, String correo, long celular, String dresidencia) throws SMException{
        cliente = new Cliente();
        cliente.setTipdocc(tipdocc);
        cliente.setNumdocc(numdocc);
        cliente.setN1(n1);
        cliente.setN2(n2);
        cliente.setA1(a1);
        cliente.setA2(a2);
        cliente.setCorreoc(correo);
        cliente.setCelular(celular);
        cliente.setDresidencia(dresidencia);
        int result = clienteDAO.registrarCliente(cliente);
        if(result == 1){  
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean registrarServicio(String tipopaquete, java.sql.Date fservicio, String h_inicio, String cpostal) throws SMException{
        servicio = new Servicio();
        servicio.setTipopaquete(tipopaquete);
        servicio.setFservicio(fservicio);
        servicio.setH_inicio(h_inicio);
        servicio.setCpostal(cpostal);
        servicio.setTipdocc(SesionController.getK_tipdoc());
        servicio.setNumdocc(SesionController.getK_numdoc());
        boolean result = servicioDAO.registrarServicio(servicio);
        
        return result == true;
    }
    
    public boolean registrarIndicacion(String direccioni, String descripcion) throws SMException{
        servicio = new Servicio();
        servicio.setDirecccioni(direccioni);
        servicio.setDescripcioni(descripcion);
        int result = servicioDAO.registrarIndicacion(servicio);
        
        return result != 0;
    }
    
    public void DetalleServicio() throws SMException{
        try {
            ResultSet rs = servicioDAO.DetalleServicio(servicio);
            DetalleServicio d = new DetalleServicio();
            d.setVisible(true);
            d.setLabels(servicio);
            d.tablaDetalleServicio(rs);
        } catch (SQLException ex) {
            Logger.getLogger(SGMU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
