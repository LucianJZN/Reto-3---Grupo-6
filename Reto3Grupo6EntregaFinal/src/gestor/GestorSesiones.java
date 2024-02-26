package gestor;

import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import baseDatos.utils.DBUtils;
import baseDatos.pojos.Sesion;
import vista.PanelCines;
public class GestorSesiones {
	
	public ArrayList<Sesion> getFechaSesiones() {
		ArrayList<Sesion> ret = null;
		String sql = "SELECT * FROM sesion "
	            + "JOIN cine ON cine.idcine = sesion.idcine "
	            + "JOIN pelicula ON pelicula.idpelicula = sesion.idpelicula "
	            + "JOIN sala ON sala.idsala = sesion.idsala "
	            + "WHERE cine.nombrecine= '" + vista.PanelCines.nombreCineSeleccionado + "' "
	            + "AND pelicula.titulo = '" + vista.PanelCines.nombrePeliculaSeleccionado + "';";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				if (null == ret)
					ret = new <Sesion>ArrayList();

				Sesion sesion = new Sesion();

				int idSesion = resultSet.getInt("idSesion");
				int idCine = resultSet.getInt("idCine");
				int idSala = resultSet.getInt("idSala");
				double coste = resultSet.getDouble("coste");
				Date fecha = resultSet.getDate("fecha");
				Time hora = resultSet.getTime("hora");
				int idPelicula = resultSet.getInt("idPelicula");

				sesion.setIdSesion(idSesion);
				sesion.setIdCine(idCine);
				sesion.setIdSala(idSala);
				sesion.setCoste(coste);
				sesion.setFecha(fecha);
				sesion.setHora(hora);
				sesion.setIdPelicula(idPelicula);
				
				ret.add(sesion);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la base de datos - " + sqle.getMessage());

		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());

		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
			};

			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
			};

			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			};
		}
		return ret;
	}
	
	public ArrayList<Sesion> getHoraSesiones() {
		ArrayList<Sesion> ret = null;
		String sql = "SELECT * FROM sesion "
	            + "JOIN cine ON cine.idcine = sesion.idcine "
	            + "JOIN pelicula ON pelicula.idpelicula = sesion.idpelicula "
	            + "JOIN sala ON sala.idsala = sesion.idpelicula "
	            + "WHERE cine.nombrecine = '" + vista.PanelCines.nombreCineSeleccionado + "' "
	            + "AND pelicula.titulo = '" + vista.PanelCines.nombrePeliculaSeleccionado + "' "
	            + "AND sesion.fecha = '" + vista.PanelCines.fechaSeleccionada + "';";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				if (null == ret)
					ret = new <Sesion>ArrayList();

				Sesion sesion = new Sesion();

				int idSesion = resultSet.getInt("idSesion");
				int idCine = resultSet.getInt("idCine");
				int idSala = resultSet.getInt("idSala");
				double coste = resultSet.getDouble("coste");
				Date fecha = resultSet.getDate("fecha");
				Time hora = resultSet.getTime("hora");
				int idpelicula = resultSet.getInt("idPelicula");

				sesion.setIdSesion(idSesion);
				sesion.setIdCine(idCine);
				sesion.setIdSala(idSala);
				sesion.setCoste(coste);
				sesion.setFecha(fecha);
				sesion.setHora(hora);
				sesion.setIdPelicula(idpelicula);

				ret.add(sesion);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la base de datos - " + sqle.getMessage());

		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());

		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
			};

			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
			};

			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			};
		}
		return ret;
	}
	
	public ArrayList<Sesion> getAllSesiones() {
		ArrayList<Sesion> ret = null;
		String sql = "SELECT * FROM sesion "
	            + "JOIN cine ON cine.idcine = sesion.idcine "
	            + "JOIN pelicula ON pelicula.idpelicula = sesion.idpelicula "
	            + "JOIN sala ON sala.idsala = sesion.idpelicula "
	            + "WHERE cine.nombrecine = '" + vista.PanelCines.nombreCineSeleccionado + "' "
	            + "AND pelicula.titulo = '" + vista.PanelCines.nombrePeliculaSeleccionado + "' "
	            + "AND sesion.fecha = '" + vista.PanelCines.fechaSeleccionada + "' "
	            + "AND sesion.hora = '" + vista.PanelCines.horaSeleccionada + "';";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				if (null == ret)
					ret = new <Sesion>ArrayList();

				Sesion sesion = new Sesion();

				int idSesion = resultSet.getInt("idSesion");
				int idCine = resultSet.getInt("idCine");
				int idSala = resultSet.getInt("idSala");
				double coste = resultSet.getDouble("coste");
				Date fecha = resultSet.getDate("fecha");
				Time hora = resultSet.getTime("hora");
				int idPelicula = resultSet.getInt("idPelicula");

				sesion.setIdSesion(idSesion);
				sesion.setIdCine(idCine);
				sesion.setIdSala(idSala);
				sesion.setCoste(coste);
				sesion.setFecha(fecha);
				sesion.setHora(hora);
				sesion.setIdPelicula(idPelicula);

				ret.add(sesion);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la base de datos - " + sqle.getMessage());

		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());

		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
			};

			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
			};

			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			};
		}
		return ret;
	}
}
