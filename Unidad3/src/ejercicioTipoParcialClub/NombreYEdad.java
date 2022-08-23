package ejercicioTipoParcialClub;

public class NombreYEdad {
	private String nombre;
	private int edad;
	public NombreYEdad(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
