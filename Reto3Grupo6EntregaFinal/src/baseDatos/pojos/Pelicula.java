package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private ArrayList<Pelicula> listaPelis = new ArrayList<>();

	private String nombrePeli = null;
	private String codigoPeli = null;
	private String duracionPeli = null;
	private String generoPeli = null;

	public Pelicula(String nombrePeli, String codigoPeli, String duracionPeli, String generoPeli) {
		super();
		this.nombrePeli = nombrePeli;
		this.codigoPeli = codigoPeli;
		this.duracionPeli = duracionPeli;
		this.generoPeli = generoPeli;

		listaPelis.add(this);
	}

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

	@Override
	public String toString() {
		return "Pelicula [nombrePeli=" + nombrePeli + ", codigoPeli=" + codigoPeli + ", duracionPeli=" + duracionPeli
				+ ", generoPeli=" + generoPeli + ", costePeli=" + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPeli, duracionPeli, generoPeli, nombrePeli);
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
		return Objects.equals(codigoPeli, other.codigoPeli) && Objects.equals(duracionPeli, other.duracionPeli)
				&& Objects.equals(generoPeli, other.generoPeli) && Objects.equals(nombrePeli, other.nombrePeli);
	}

}
