package ejercicio09;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	public Persona(String nombre,String apellido,String dni,Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public String getDNI() {
		return this.dni;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio
				+ "]";
	}

}
