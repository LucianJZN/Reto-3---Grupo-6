package gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import baseDatos.pojos.Cliente;
import baseDatos.utils.DBUtils;

//import baseDatos.pojos.Cliente;
//import baseDatos.utils.DBUtils;

public class GestorCliente {
	
	//Lista para guardar  
	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	// Inserta un Cliente en la BBDD
		public static void anadirCliente(Cliente cliente){
			//JTextField nombreCampo, JTextField contrasenaCampo, JTextField apellidosCampo, JTextField DNICampo , JTextField hombreCampo
			
			//usuario, contraseña, sexo, apellidos, dni
			// La conexion con BBDD
			Connection connection = null;
			
			// Vamos a lanzar una sentencia SQL contra la BBDD
			Statement statement = null;
			
			try {
				// El Driver que vamos a usar
				Class.forName(DBUtils.DRIVER);
				
				// Abrimos la conexion con BBDD
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				
				// Vamos a lanzar la sentencia...
				statement = connection.createStatement();
				
				// Montamos la SQL 
				String sql = "insert into cliente (DNI, nombre, apellidos, sexo, contrasena) VALUES ('" +  
						cliente.getDNICliente() + "', '" + 
						cliente.getNombreCliente() + "', '" + 
						cliente.getApellidosCliente() + "', '" + 
						cliente.getSexoCliente() + "', '" + 
						cliente.getContraseñaCliente() + "')";
				
				// La ejecutamos...
				statement.executeUpdate(sql);
				
			} catch (SQLException sqle) {  
				System.out.println("Error con la BBDD - " + sqle.getMessage());
			} catch(Exception e){ 
				System.out.println("Error generico - " + e.getMessage());
			} finally {
				// Cerramos al reves de como las abrimos
				
				try {
					if (statement != null) 
						statement.close(); 
				} catch(Exception e){ 
					// No hace falta				
				};
				try {
					if (connection != null) 
						connection.close(); 
				} catch(Exception e){ 
					// No hace falta
				};					
			}
		}

	private void login() {
		
	}
	
	private void generarFactura() {
		
	}

	private void finalizarSesion() {
	
	}
}
