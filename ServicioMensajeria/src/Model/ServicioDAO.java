package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Servicio;

import Util.SMException;
import Util.ServiceLocator;
import Util.SesionController;

public class ServicioDAO {
    public boolean registrarServicio(Servicio servicio) throws SMException {
        try{
            String strSQL = "INSERT INTO \"Servicio\"(i_paquete,f_servicio,h_inicio,i_servicio,k_cpostal,k_tipdocc,k_numdocc,k_tipdocm,k_numdocm)  VALUES (?,?,?,'S',?,?,?,null,null)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, servicio.getTipopaquete());
            //java.sql.Date feca = new java.sql.Date(servicio.getFservicio());
            //SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            //String d = formato.format(servicio.getFservicio());
            //System.out.println(d);
            //Date fecha = formato.parse("25-05-2015");
            //java.sql.Date f = new java.sql.Date(fecha.getTime()); 
            prepStmt.setDate(2,servicio.getFservicio());
            //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            //java.sql.Time timeValue = new java.sql.Time(sdf.parse(servicio.getH_inicio()).getTime());
            prepStmt.setTime(3, java.sql.Time.valueOf(servicio.getH_inicio()+":00"));
            prepStmt.setString(4, servicio.getCpostal());
            prepStmt.setString(5, SesionController.getK_tipdoc());
            prepStmt.setString(6, SesionController.getK_numdoc());
            int r = prepStmt.executeUpdate();
            ServiceLocator.getInstance().commit();
            prepStmt.close();
            if(r == 1){
                int idServicio = 0;
                strSQL = "SELECT k_servicio FROM \"Servicio\" WHERE k_tipdocc = ? AND k_numdocc = ? AND i_servicio = 'S' ORDER BY k_servicio DESC LIMIT 1;";
                //Connection conexion = ServiceLocator.getInstance().tomarConexion();
                prepStmt = conexion.prepareStatement(strSQL);
                prepStmt.setString(1, SesionController.getK_tipdoc());
                prepStmt.setString(2, SesionController.getK_numdoc());
                //aca se muere :)
                ResultSet rs = prepStmt.executeQuery();
                //aca se muere :)

            while (rs.next()){
               idServicio = rs.getInt(1);
            }
            
            Servicio.setKservicio(idServicio);
                //ServiceLocator.getInstance().liberarConexion();
                //boolean res = consultarServicio();
                
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e){
            throw new SMException("ServicioDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public int registrarIndicacion(Servicio servicio) throws SMException{
        try{
            String strSQL = "INSERT INTO \"Indicacion\"(k_servicio,d_indicacion,n_descripcion) VALUES (?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setLong(1, Servicio.getKservicio());
            prepStmt.setString(2, servicio.getDirecccioni());
            prepStmt.setString(3, servicio.getDescripcioni());
            int r = prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
            return r;
        } catch (SQLException e){
            throw new SMException("ClienteDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    public void DetalleServicio() {
        try {
            String SQL = "SELECT s.k_servicio, s.i_paquete, s.f_servicio, s.h_inicio, m.n_ciudad FROM \"Servicio\" s INNER JOIN \"Ciudad\" m ON m.k_cpostal = s.k_cpostal WHERE s.k_servicio = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement stmt = conexion.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
            //holi   
            }
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
        e.printStackTrace();
        }
    }
}
