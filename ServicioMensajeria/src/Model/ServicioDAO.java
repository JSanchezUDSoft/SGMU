package Model;

import Util.SMException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Controller.Servicio;

import Util.SMException;
import Util.ServiceLocator;
import Util.SesionController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioDAO {
    public boolean registrarServicio(Servicio servicio) throws SMException{
        try{
            
            String strSQL = "INSERT INTO \"Servicio\"(i_paquete,f_servicio,h_inicio,i_servicio,k_cpostal,k_tipdocc,k_numdocc,k_tipdocm,k_numdocm)  VALUES (?,?,?,'S',?,?,?,null,null)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, servicio.getTipopaquete());
            java.sql.Date feca = new java.sql.Date(servicio.getFservicio());
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd"); 
            Date fecha = formato.parse("23-11-2015");
            java.sql.Date f = new java.sql.Date(fecha.getTime());
            prepStmt.setDate(2, f);
            //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            //java.sql.Time timeValue = new java.sql.Time(sdf.parse(servicio.getH_inicio()).getTime());
            prepStmt.setTime(3, java.sql.Time.valueOf(servicio.getH_inicio()+":00"));
            prepStmt.setString(4, servicio.getCpostal());
            prepStmt.setString(5, SesionController.getK_tipdoc());
            prepStmt.setString(6, SesionController.getK_numdoc());
            int r = prepStmt.executeUpdate();
            ServiceLocator.getInstance().commit();
            if(r == 1){
                int idServicio = 0;
                strSQL = "SELECT k_servicio FROM \"Servicio\" WHERE k_tipdocc = ? AND k_numdocc = ? AND i_servicio = 'S' ORDER BY k_servicio DESC LIMIT 1;";
                //Connection conexion = ServiceLocator.getInstance().tomarConexion();
                //PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
                prepStmt.setString(1, SesionController.getK_tipdoc());
                prepStmt.setString(2, SesionController.getK_numdoc());
                ResultSet rs = prepStmt.executeQuery();
                prepStmt.close();
                while (rs.next()){
                   idServicio = rs.getInt(1);
                }
                Servicio.setKservicio(idServicio);
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException e){
            throw new SMException("ServicioDAO", e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
