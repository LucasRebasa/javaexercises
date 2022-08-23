package ejercicio10;

public class Persona {
	private String nombre;
	private String apellido;
	public Persona(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
}
