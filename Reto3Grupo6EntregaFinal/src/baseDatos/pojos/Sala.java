package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Sala {
	
	private String idSala = null;
	private String nombreSala = null;
	
	public Sala(String idSala, String nombreSala) {
		super();
		this.idSala = idSala;
		this.nombreSala = nombreSala;
	}

	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", nombreSala=" + nombreSala + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idSala, nombreSala);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return Objects.equals(idSala, other.idSala) && Objects.equals(nombreSala, other.nombreSala);
	}

}