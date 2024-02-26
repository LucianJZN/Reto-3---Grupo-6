package baseDatos.pojos;

import java.util.Objects;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sesion {

	private int idSesion;
	private Double coste;
	private int idCine;
	private int idSala;
	private Date fecha; 
	private Time hora;
	private int idPelicula;
	@Override
	public int hashCode() {
		return Objects.hash(coste, fecha, hora, idCine, idPelicula, idSala, idSesion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sesion other = (Sesion) obj;
		return Objects.equals(coste, other.coste) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(hora, other.hora) && idCine == other.idCine && idPelicula == other.idPelicula
				&& idSala == other.idSala && idSesion == other.idSesion;
	}
	public int getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(int idSesion) {
		this.idSesion = idSesion;
	}
	public Double getCoste() {
		return coste;
	}
	public void setCoste(Double coste) {
		this.coste = coste;
	}
	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", coste=" + coste + ", idCine=" + idCine + ", idSala=" + idSala
				+ ", fecha=" + fecha + ", hora=" + hora + ", idPelicula=" + idPelicula + "]";
	}

	
}