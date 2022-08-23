package ejercicio05;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private boolean tieneDomicilio = false;
	public Persona() {}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
		tieneDomicilio = true;
	}
	public void mostrarDomicilio() {
		if(tieneDomicilio) {
		System.out.println(domicilio);
		}else{
		System.out.println("La persona no tiene domicilio asignado");
		}
	}
}
