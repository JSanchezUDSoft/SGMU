
package Util;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;


/**
 * Recursos Humanos
 * @author Alba Consuelo Nieto
 */
public class ServiceLocator {        
	/**
	 * Instancia del ServiceLocator
	 */
	private static ServiceLocator instance = null;

	/**
	 * Conexion compartida a la Base de Datos
	 */
	private Connection conexion = null;

	/**
	 * Bandera que indica el estado de la conexion
	 */
	private boolean conexionLibre = true;

	/**
	 * @return instancia del ServiceLocator para el manejo de la conexion
	 */
	public static ServiceLocator getInstance() {
		if (instance == null) {
			try {
				instance = new ServiceLocator();
			} catch (Exception e) {
			}
		}

		return instance;
	}

	/**
	 * @throws Exception
	 *             dice si no se pudo crear la conexion
	 */
	private ServiceLocator() throws Exception {
                try {
                    // Se registra el Driver y se crea la conexion
                    String url = "jdbc:postgresql://localhost:5432/SGMU";
                    String usuario = "postgres";
                    String password = "julian1234"; //Debe reemplazarse por el password en su propia instalación
                    Class.forName("org.postgresql.Driver").newInstance();
                    conexion = DriverManager.getConnection(url, usuario, password);
                    conexion.setAutoCommit(false);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
                    throw new SMException("ServiceLocator", "ERROR_CONEXION_BD " + e);
                }
         }

	/**
	 * Toma la conexion para que ningun otro proceso la puedan utilizar
	 * @return da la conexion a la base de datos
	 */
	public synchronized Connection tomarConexion() {
		while (!conexionLibre) {
			try {
			  wait();
			} catch (InterruptedException e) {
			}
		}

		conexionLibre = false;
		notify();
		return conexion;
	}

	/**
	 * Libera la conexion de la bases de datos para que ningun otro
	 * proceso la pueda utilizar
	 */
	public synchronized void liberarConexion() {
		while (conexionLibre) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		conexionLibre = true;
		notify();
	}

	/**
	 * Cierra la conexion a la base de datos cuando se termina de
	 * ejecutar el programa
	 */
	public void close() {
		try {
			conexion.close();
		} catch (SQLException e) {
		}
	}

	/**
	 * Realiza los cambios en la base de datos. Con este metodo
	 * se asegura que no halla inconsitencias en el modelo relacional
	 * de la Base de datos.
	 * 
	 * Se utiliza cuando el procedimiento de insercion es terminado
	 * correctamente y se asegura que los datos en el modelo estan bien
	 * relacionados.
	 */
	public void commit() {
		try {
			conexion.commit();
		} catch (SQLException e) {
		}
	}

	/**
	 * Deshace los cambios en la base de datos. Con este metodo
	 * se asegura que no halla inconsitencias en el modelo relacional
	 * de la Base de datos.
	 * 
	 * Se utiliza por lo general cuando se devuelve una Exepcion.
	 * Los procedimientos intermedios no deberia quedar almacenados en la
	 * base de datos. 
	 */

	public void rollback() {
		try {
			conexion.rollback();
		} catch (SQLException e) {
		}
	}

}
