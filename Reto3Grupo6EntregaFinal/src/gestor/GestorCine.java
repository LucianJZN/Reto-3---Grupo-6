package gestor;

import java.util.Objects;

import baseDatos.pojos.Cine;
import baseDatos.pojos.Cliente;
import baseDatos.utils.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GestorCine {

	public static ArrayList<Cine> listaCines = new ArrayList<>();
	Object ret = null;
	
	public Object pedirCines(){
	// Pedir a la BBDD los cines para luego mostrar sus nombres en la tabla.

	// SQL que queremos lanzar
	String sql = "select * from cine";

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
				ret = new ArrayList<Cine>();

			// Sacamos las columnas del RS
			String codigoCine = resultSet.getString("idCine");
			
			String nombre = resultSet.getString("nombreCine");
			
			String direccionCine = resultSet.getString("direccion");

			Cine cine = new Cine(nombre, codigoCine, direccionCine, 0);
			
			System.out.println("el cine es: " + cine.getNombre());
			
			// Metemos los datos a Ejemplo
			cine.setCodigoCine(codigoCine);
			// cine.setDireccionCine(nombre); //La BBDD no tiene direccion?
			cine.setNombre(nombre);
			cine.setDireccionCine(direccionCine);

			// Lo guardamos en ret
			listaCines.add(cine);
			
			System.out.println("Añade cines a la lista cines");
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
}}
/*
 * private void preguntarUsuarioSiTieneCuenta(){
 * 
 * }
 * 
 * public void mostrarMensajeBienvenida() { //Supongo que irá en el package
 * vista
 * 
 * }
 * 
 * public void pasarALaPantallaSiguiente() { //Supongo que irá en el package
 * vista
 * 
 * }
 * 
 * public void finalizarSesión() { //Supongo que irá en el package vista
 * 
 * }
 * 
 * //variables → atributoEntidad → nombreCine, edadUsuario //metodos → verbo +
 * descripcion de la accion public void mostrarPelisQueProyectaEsteCine(String
 * nombreCine) { //Habrá que mostrar las pelis ordenadas, antes las del lunes
 * que las del viernes y antes las de las 9 que las de las 14. }
 * 
 * public void finalizarSeleccionPeliculas() {
 * 
 * }
 * 
 * public void mostrarResumenCompra() {
 * 
 * }
 * 
 * public void mostrarFechasDisponiblesParaPelicula() { //Al escoger una
 * peliculas
 * 
 * }
 * 
 * public void mostrarHorasDisponiblesParaFechaPelicula() { //Seleccionar una
 * fecha concreta hará que se muestren las horas en las que se proyecta, la sala
 * y el precio de la entrada. //se muestren las horas en las que se proyecta, la
 * sala y el precio de la entrada. A esto es lo que se le llama sesión. }
 * 
 * public void mostrarMensajeConfirmacion() { //Una vez seleccionada la sesión
 * //nos mostrará un mensaje de confirmación con la información de la selección
 * que hemos realizado, y volveremos al menú. //Allí podremos volver a realizar
 * el proceso de compra para otros cines, películas o sesiones; o finalizar la
 * compra. }
 
 * private void seleccionarCine(){
 * 
 * }
 * 
 * private void finalizarSesion(){
 * 
 * }
 * 
 * private void finalizarCompra(){
 * 
 * }
 */

