package baseDatos.pojos;

import java.util.Objects;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

public class Cliente {

	private String DNICliente = null;
	private String nombreCliente = null;
	private String apellidosCliente = null;
	private String sexoCliente = null; // H,M → java con string y bbdd con enum, se puede parsear
	private String contraseñaCliente = null;
	// No se hacer el ENUM

	public Cliente(String dNICliente, String nombreCliente, String apellidosCliente, String sexoCliente,
			String contraseñaCliente) {
		super();
		DNICliente = dNICliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.sexoCliente = sexoCliente;
		this.contraseñaCliente = contraseñaCliente;
	}

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

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public String getContraseñaCliente() {
		return contraseñaCliente;
	}

	public void setContraseñaCliente(String contraseñaCliente) {
		this.contraseñaCliente = contraseñaCliente;
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

	@Override
	public String toString() {
		return "Cliente [DNICliente=" + DNICliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + ", sexoCliente=" + sexoCliente + ", contraseñaCliente=" + contraseñaCliente + "]";
	}
}