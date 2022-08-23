package ejercicio01;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private Domicilio domicilio;
	public Persona(String nombre,String apellido,int dni,Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public int getDNI() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio
				+ "]";
	}
	

}
