package modelo;

import java.util.Objects;

public class Peliculas {
	private String idPeliculas;
	private String tituloPeliculas;
	private String duracionPeliculas;
	private String generoPeliculas;

	public String getIdPeliculas() {
		return idPeliculas;
	}

	public void setIdPeliculas(String idPeliculas) {
		this.idPeliculas = idPeliculas;
	}

	public String getTituloPeliculas() {
		return tituloPeliculas;
	}

	public void setTituloPeliculas(String tituloPeliculas) {
		this.tituloPeliculas = tituloPeliculas;
	}

	public String getDuracionPeliculas() {
		return duracionPeliculas;
	}

	public void setDuracionPeliculas(String duracionPeliculas) {
		this.duracionPeliculas = duracionPeliculas;
	}

	public String getGeneroPeliculas() {
		return generoPeliculas;
	}

	public void setGeneroPeliculas(String generoPeliculas) {
		this.generoPeliculas = generoPeliculas;
	}

	@Override
	public String toString() {
		return "Peliculas [idPeliculas=" + idPeliculas + ", tituloPeliculas=" + tituloPeliculas + ", duracionPeliculas="
				+ duracionPeliculas + ", generoPeliculas=" + generoPeliculas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracionPeliculas, generoPeliculas, idPeliculas, tituloPeliculas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		return Objects.equals(duracionPeliculas, other.duracionPeliculas)
				&& Objects.equals(generoPeliculas, other.generoPeliculas)
				&& Objects.equals(idPeliculas, other.idPeliculas)
				&& Objects.equals(tituloPeliculas, other.tituloPeliculas);
	}
}
