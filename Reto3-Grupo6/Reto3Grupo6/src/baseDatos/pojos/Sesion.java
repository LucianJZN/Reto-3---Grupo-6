package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Sesion {
	
	private String idSesion = null;
	private Double costeSesion = 0.0;
	private Date fechaSesion = null;	//no creo que es Date
	private Date horaSesion = null;
	private String nombrePeliculaSesion = null;

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public Double getCosteSesion() {
		return costeSesion;
	}

	public void setCosteSesion(Double costeSesion) {
		this.costeSesion = costeSesion;
	}

	public Date getFechaSesion() {
		return fechaSesion;
	}

	public void setFechaSesion(Date fechaSesion) {
		this.fechaSesion = fechaSesion;
	}

	public Date getHoraSesion() {
		return horaSesion;
	}

	public void setHoraSesion(Date horaSesion) {
		this.horaSesion = horaSesion;
	}

	public String getNombrePeliculaSesion() {
		return nombrePeliculaSesion;
	}

	public void setNombrePeliculaSesion(String nombrePeliculaSesion) {
		this.nombrePeliculaSesion = nombrePeliculaSesion;
	}

	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", costeSesion=" + costeSesion + ", nombrePeliculaSesion="
				+ nombrePeliculaSesion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(costeSesion, idSesion, nombrePeliculaSesion);
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
		return Objects.equals(costeSesion, other.costeSesion) && Objects.equals(idSesion, other.idSesion)
				&& Objects.equals(nombrePeliculaSesion, other.nombrePeliculaSesion);
	}

	
	
}