package gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import baseDatos.pojos.Cine;
import baseDatos.pojos.Pelicula;
import baseDatos.utils.DBUtils;

public class GestorPelicula {
	
	//private ArrayList<Pelicula> listaPelis = new ArrayList<>();
	
	public static ArrayList<Pelicula> listaPelis = new ArrayList<>();
	Object ret = null;// lo acabo de crear
	
	//Ahora hay que pillar los datos que recibe esta funcion y mostrarlos en la tabla
	//cine del panel Cines
	
	public Object pedirPelis(){
	// Pedir a la BBDD las pelis teniendo en cuenta el nombre del cine.

	// ArrayList <Cine> ret = null;

	// SQL que queremos lanzar
	String sql = "SELECT p.* "
			+"FROM pelicula p "
			+"JOIN sesion s ON p.idPelicula = s.idPelicula "
			+"JOIN sala sa ON s.idCine = sa.idCine AND s.idSala = sa.idSala "
			+"JOIN cine c ON sa.idCine = c.idCine "
			+"WHERE c.nombreCine = " + "'" + vista.PanelCines.nombreCineSeleccionado + "'" + ";"; //Script BBDD
	
	// La conexion con BBDD
	Connection connection = null;

	// Vamos a lanzar una sentencia SQL contra la BBDD
	// Result set va a contener todo lo que devuelve la BBDD
	Statement statement = null;
	ResultSet resultSet = null; // antes era null

	try
	{
		// El Driver que vamos a usar
		Class.forName(DBUtils.DRIVER);

		// Abrimos la conexion con BBDD
		connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

		// Vamos a lanzar la sentencia...
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		// No es posible saber cuantas cosas nos ha devuelto el resultSet.
		// Hay que ir 1 por 1 y guardandolo todo en su objeto Ejemplo correspondiente
		while (resultSet.next()) {

			// Si es necesario, inicializamos la lista
			if (null == ret)
				ret = new ArrayList<Pelicula>();

			// Sacamos las columnas del RS
			String codigoPeli = resultSet.getString("idPelicula");
			String nombrePeli = resultSet.getString("titulo");
			String duracionPeli = resultSet.getString("duracion");
			String generoPeli = resultSet.getString("genero");
			

			Pelicula pelicula = new Pelicula(nombrePeli, codigoPeli, duracionPeli, generoPeli);
			
			System.out.println("la peli es: " + pelicula.getNombrePeli());
			
			// Metemos los datos a Ejemplo
			pelicula.setCodigoPeli(codigoPeli);
			pelicula.setNombrePeli(nombrePeli);
			pelicula.setDuracionPeli(duracionPeli);
			pelicula.setGeneroPeli(generoPeli);
			
			//Borramos las pelis que ya se han solicitado a la BBDD porque si no se añaden también
			gestor.GestorPelicula.listaPelis.clear();
			
			// Lo guardamos en ret
			listaPelis.add(pelicula);
			
			System.out.println("Añade pelis a la lista pelis");
		}
	}catch(
	SQLException sqle)
	{
		System.out.println("Error con la BBDD - " + sqle.getMessage());
	}catch(
	Exception e)
	{
		System.out.println("Error generico - " + e.getMessage());
	}finally
	{
		// Cerramos al reves de como las abrimos
		try {
			if (resultSet != null)
				resultSet.close();
		} catch (Exception e) {
			// No hace falta
		}
		;
		try {
			if (statement != null)
				statement.close();
		} catch (Exception e) {
			// No hace falta
		}
		;
		try {
			if (connection != null)
				connection.close();
		} catch (Exception e) {
			// No hace falta
		}
		;
	}return ret;
}
	
	private void mostrarPeliculas() {
		
	}
	
	private void seleccionarPelicula(){
		
	}
	
	private void finalizarSesion(){
		
	}
}
