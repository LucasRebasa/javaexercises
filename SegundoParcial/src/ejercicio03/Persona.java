package ejercicio03;

public class Persona {
	private String nombre;
	private String apellido;
	public Persona() {}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}
}
