package ejercicio10;

public class Robot {
	private String nombre;
	
	public Robot(String nombre) {
		this.nombre = nombre;
	}
	public void saludar() {
		System.out.println("Hola mi nombre es " + this.nombre + " en que puedo ayudarte?");
	}
	public void saludar(Persona persona) {
		System.out.println("Hola," + persona.getNombreCompleto() + " mi nombre es " + this.nombre + " en que puedo ayudarte?");
	}

}
