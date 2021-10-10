package Model;

import Util.SMException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Servicio;

import Util.SMException;
import Util.ServiceLocator; 

public class ServicioDAO {
    public void registrarServicio(Servicio servicio) throws SMException{
        try{
            String strSQL = "INSERT INTO \"Servicio\"(i_paquete,f_servicio,h_inicio,i_servicio,k_cpostal,k_tipdocc,k_numdocc)  VALUES (?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, servicio.getTipopaquete());
            prepStmt.setString(2, servicio.getFservicio());
            prepStmt.setString(3, servicio.getH_inicio());
            prepStmt.setString(4, servicio.getCpostal());
            prepStmt.setString(5, servicio.getTipdocc());
            prepStmt.setString(6, servicio.getNumdocc());
            
        } catch (SQLException e){
            throw new SMException("ServicioDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
