package gestor;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import baseDatos.pojos.Sesion;

public class GestorTablas {
	public String[] tablaColumnaHora = { "Hora" };
	public String[][] datoTabHora = null;

	public String[] tablaColumnaFecha = { "Fecha" };
	public String[][] datoTabFecha = null;

	public String[] tablaColumnaSesion = { "Pelicula", "Cines", "Sala", "Precio", "hora", "fecha" };
	public String[][] datoTabSesion = null;

	public DefaultTableModel modelHora = new DefaultTableModel(datoTabHora, tablaColumnaHora);
	public DefaultTableModel modelFecha = new DefaultTableModel(datoTabFecha, tablaColumnaFecha);
	public DefaultTableModel modelSesion = new DefaultTableModel(datoTabSesion, tablaColumnaSesion);

	GestorSesiones gestorSesiones = new GestorSesiones();

	public void anadirFechas() {
		/*String pattern = "yyyy/dd/mm";
		DateFormat df = new SimpleDateFormat(pattern);
		GestorSesiones gestorSesiones = new GestorSesiones();*/
		ArrayList<Sesion> sesiones = gestorSesiones.getFechaSesiones();

		modelFecha.setRowCount(0);
		modelHora.setRowCount(0);
		for (int i = 0; i < sesiones.size(); i++) {
			//String fechaString = df.format(sesiones.get(i).getFecha());

			Object[] filaDato = { sesiones.get(i).getFecha() };
			modelFecha.addRow(filaDato);
		}

	}

	public void anadirHoras() {
		ArrayList<Sesion> sesiones = gestorSesiones.getHoraSesiones();
		
		modelHora.setRowCount(0);

		for (int i = 0; i < sesiones.size(); i++) {
			Time horaSesion = sesiones.get(i).getHora();
			Object[] filaDato = { horaSesion };
			modelHora.addRow(filaDato);
		}
	}
	
	public void anadirAllSesiones(){
	    ArrayList<Sesion> sesiones = gestorSesiones.getAllSesiones();
	    
	    for(int i = 0; i < sesiones.size(); i++) {
	        Sesion sesion = sesiones.get(i);
	        Object[] filaDato = { sesion.getIdPelicula(), sesion.getIdCine(), sesion.getIdSala(), sesion.getCoste(), sesion.getHora(), sesion.getFecha()};
	        modelSesion.addRow(filaDato);
	    }
	}
}
