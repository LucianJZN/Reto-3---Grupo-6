package baseDatos.pojos;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cliente {
	
	private String DNICliente = null;
	private String nombreCliente = null;
	private String apellidosCliente = null;
	private String contraseñaCliente = null;
	private Enum sexoCliente = null;

	public String getDNICliente() {
		return DNICliente;
	}

	public void setDNICliente(String dNICliente) {
		DNICliente = dNICliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public String getContraseñaCliente() {
		return contraseñaCliente;
	}

	public void setContraseñaCliente(String contraseñaCliente) {
		this.contraseñaCliente = contraseñaCliente;
	}

	public Enum getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(Enum sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [DNICliente=" + DNICliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + ", contraseñaCliente=" + contraseñaCliente + ", sexoCliente=" + sexoCliente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNICliente, apellidosCliente, contraseñaCliente, nombreCliente, sexoCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNICliente, other.DNICliente) && Objects.equals(apellidosCliente, other.apellidosCliente)
				&& Objects.equals(contraseñaCliente, other.contraseñaCliente)
				&& Objects.equals(nombreCliente, other.nombreCliente) && Objects.equals(sexoCliente, other.sexoCliente);
	}
	
	
}