package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


public class Cine {
	
	private String nombre = null;
	private String codigoCine = null;
	private String direccionCine = null;
	private int numeroSalas = 0;
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, codigoCine, direccionCine, numeroSalas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cine other = (Cine) obj;
		return nombre == other.nombre && Objects.equals(codigoCine, other.codigoCine) && Objects.equals(direccionCine, other.direccionCine) && Objects.equals(numeroSalas, other.numeroSalas);
	}
	
	@Override
	public String toString() {
		return "Cine [nombre = " + nombre + ", codigoCine = " + codigoCine + ", direccionCine = " + direccionCine + ", numeroSalas = " + numeroSalas + "]";
	}

	
}
