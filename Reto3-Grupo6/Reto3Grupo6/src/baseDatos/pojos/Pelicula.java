package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


public class Pelicula {
	
	private String nombrePeli = null;
	private String codigoPeli = null;
	private String duracionPeli = null;
	private String generoPeli = null;
	private Double costePeli = 0.0;

	public String getNombrePeli() {
		return nombrePeli;
	}

	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
	}

	public String getCodigoPeli() {
		return codigoPeli;
	}

	public void setCodigoPeli(String codigoPeli) {
		this.codigoPeli = codigoPeli;
	}

	public String getDuracionPeli() {
		return duracionPeli;
	}

	public void setDuracionPeli(String duracionPeli) {
		this.duracionPeli = duracionPeli;
	}

	public String getGeneroPeli() {
		return generoPeli;
	}

	public void setGeneroPeli(String generoPeli) {
		this.generoPeli = generoPeli;
	}

	public Double getCostePeli() {
		return costePeli;
	}

	public void setCostePeli(Double costePeli) {
		this.costePeli = costePeli;
	}

	@Override
	public String toString() {
		return "Pelicula [nombrePeli=" + nombrePeli + ", codigoPeli=" + codigoPeli + ", duracionPeli=" + duracionPeli
				+ ", generoPeli=" + generoPeli + ", costePeli=" + costePeli + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoPeli, costePeli, duracionPeli, generoPeli, nombrePeli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(codigoPeli, other.codigoPeli) && Objects.equals(costePeli, other.costePeli)
				&& Objects.equals(duracionPeli, other.duracionPeli) && Objects.equals(generoPeli, other.generoPeli)
				&& Objects.equals(nombrePeli, other.nombrePeli);
	}
	
}
