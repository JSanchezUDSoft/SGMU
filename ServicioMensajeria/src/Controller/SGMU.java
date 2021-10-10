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
    private SesionController sesioncontroller;
    //Vistas
    public ValidarCliente validarcliente;
    public RegistrarCliente registrarcliente;
    public RegistrarServicio registrarservicio;
    public RegistrarIndicacion registrarindicacion;
    

    public SGMU() {
        clienteDAO = new ClienteDAO();
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
            System.out.print("Mostrar formulario servicio");
            registrarservicio.setVisible(true);
            SesionController.setK_tipdoc(tipdocc);
            SesionController.setK_numdoc(numdocc);
        }
        else{
            System.out.print("Mostrar formulario cliente");
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
            SesionController.setK_tipdoc(tipdocc);
            SesionController.setK_numdoc(numdocc);            
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean registrarServicio(String tipopaquete, String fservicio, String h_inicio, String cpostal){
        servicio = new Servicio();
        servicio.setTipopaquete(tipopaquete);
        servicio.setFservicio(fservicio);
        servicio.setH_inicio(h_inicio);
        servicio.setCpostal(cpostal);
        servicio.setTipdocc(SesionController.getK_tipdoc());
        servicio.setNumdocc(SesionController.getK_numdoc());
        boolean result = servicioDAO.registrarServicio(servicio);
        
        if(result == true){
            Servicio.setKservicio(0);
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public boolean registrarIndicacion(String direccioni, String descripcion){
        servicio = new Servicio();
        servicio.setDirecccioni(direccioni);
        servicio.setDescripcioni(descripcion);
        boolean result = servicioDAO.registrarIndicacion(servicio);
        return result == true;
    }
}
