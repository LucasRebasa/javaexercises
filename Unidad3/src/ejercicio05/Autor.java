package ejercicio05;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private Fecha fechaDeNacimiento;
	
	public Autor(String nombre, String nacionalidad, Fecha fechaDeNacimiento) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
}
