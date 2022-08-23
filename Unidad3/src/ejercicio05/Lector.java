package ejercicio05;

public class Lector {
	private String dni;
	private String nombre;
	private String direccion;
	private String telefono;
	private Prestamo prestamo;
	public static final int MAXIMO_RETIROS = 3;
	public Lector(String dni, String nombre, String direccion, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.prestamo = null;
	}
	
	public int obtenerCantRetiros() {
		return this.prestamo.getLibrosRetirados().size();
	}
	public boolean tienePrestamos() {
		boolean tienePrestamos = false;
		if(this.prestamo != null) {
			tienePrestamos = true;
		}
		return tienePrestamos;
	}
	public void agregarPrestamo(Fecha fecha) {
		this.prestamo = new Prestamo(fecha);
	}
	public boolean puedeRetirar(Fecha fechaHoy) {
		boolean puedeRetirar = false;
		
		if(this.prestamo.puedeRetirar(fechaHoy) && obtenerCantRetiros() < this.MAXIMO_RETIROS) {
			puedeRetirar = true;
		}
		return puedeRetirar;
	}
	public void actualizarFechaPrestamo(int dia,int mes,int anio) {
		this.prestamo.actualizarFechaRetiro(dia, mes, anio);
	}
	public void procesarPrestamo(Ejemplar ejemplar, Fecha fechaHoy) {
		this.prestamo.agregarLibro(ejemplar);
		actualizarFechaPrestamo(fechaHoy.getDia(),fechaHoy.getMes(), fechaHoy.getAnio());
	}
}
