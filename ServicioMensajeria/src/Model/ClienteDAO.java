package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Cliente;

import Util.SMException;
import Util.ServiceLocator; 
        
public class ClienteDAO {

    public ClienteDAO() {
    }
    
    public boolean validarCliente(Cliente cliente) throws SMException{
        try{
            boolean existe = false;
            String strSQL = "SELECT k_tipdocc, k_numdocc FROM \"Cliente\" WHERE k_tipdocc = ? AND k_numdocc = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, cliente.getTipdocc());
            prepStmt.setString(2, cliente.getNumdocc());
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()){
               existe = true;
            }
            return existe;
        } catch (SQLException e){
            throw new SMException("ClienteDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public int registrarCliente(Cliente cliente) throws SMException{
        try{
            String strSQL = "INSERT INTO \"Cliente\" (k_tipdocc,k_numdocc,n_1,n_2,n_a1,n_a2,o_correoc,t_celular,d_residencia) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, cliente.getTipdocc());
            prepStmt.setString(2, cliente.getNumdocc());
            prepStmt.setString(3, cliente.getN1());
            prepStmt.setString(4, cliente.getN2());
            prepStmt.setString(5, cliente.getA1());
            prepStmt.setString(6, cliente.getA2());
            prepStmt.setString(7, cliente.getCorreoc());
            prepStmt.setLong(8, cliente.getCelular());
            prepStmt.setString(9, cliente.getDresidencia());
            int r = prepStmt.executeUpdate();
            
            return r;
        } catch (SQLException e){
            throw new SMException("ClienteDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
