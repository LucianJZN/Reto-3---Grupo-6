package gestor;

import java.util.Objects;

import baseDatos.pojos.Cine;

import java.util.ArrayList;
import java.util.List;

public class GestorCine {
	
	private List<Cine> cines = null;
	private List<Sala> salas = null;
	private List<Pelicula> peliculas = null;
	private List<Sesion> sesiones = null;
	private List<Cliente> usuarios = null;
	
	private ArrayList<Cine> listaCines = new ArrayList<>();
	
	private void preguntarUsuarioSiTieneCuenta(){
		
	}
	
	public void mostrarMensajeBienvenida() {	//Supongo que irá en el package vista 
		
	}
	
	public void pasarALaPantallaSiguiente() {	//Supongo que irá en el package vista 
		
	}
	
	public void finalizarSesión() {		//Supongo que irá en el package vista 
		
	}
	
	//variables → atributoEntidad → nombreCine, edadUsuario
	//metodos → verbo + descripcion de la accion
	public void mostrarPelisQueProyectaEsteCine(String nombreCine) {	
		//Habrá que mostrar las pelis ordenadas, antes las del lunes que las del viernes y antes las de las 9 que las de las 14.
	}
	
	public void finalizarSeleccionPeliculas() {	
		
	}
	
	public void mostrarResumenCompra() {	
		
	}
	
	public void mostrarFechasDisponiblesParaPelicula() {	//Al escoger una peliculas
		
	}
	
	public void mostrarHorasDisponiblesParaFechaPelicula() {	//Seleccionar una fecha concreta hará que se muestren las horas en las que se proyecta, la sala y el precio de la entrada.
		//se muestren las horas en las que se proyecta, la sala y el precio de la entrada. A esto es lo que se le llama sesión.
	}
	
	public void mostrarMensajeConfirmacion() {	//Una vez seleccionada la sesión
		//nos mostrará un mensaje de confirmación con la información de la selección que hemos realizado, y volveremos al menú.
		//Allí podremos volver a realizar el proceso de compra para otros cines, películas o sesiones; o finalizar la compra.
	}
	
	private void mostrarCines(Cine listaCines) {
		
	}
	
	private void seleccionarCine(){
		
	}
	
	private void finalizarSesion(){
		
	}
	
	private void finalizarCompra(){
		
	}
}
