package ejercicio05;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<>();
	}
	
	public ArrayList<Libro> getLibros(){
		return this.libros;
	}
	
	public Resultado prestar(Libro libro, Lector lector, Fecha fechaHoy) {
		Resultado resultado;
		Ejemplar ejemplar = libro.buscarEjemplar();
		if(lector.tienePrestamos()) {
			if(ejemplar == null) {
				resultado = Resultado.NO_HAY_EJEMPLARES;
			}else if(lector.obtenerCantRetiros() >= Lector.MAXIMO_RETIROS) {
				resultado = Resultado.TOPE_PRESTAMOS_ALCANZADOS;
			}else if(!lector.puedeRetirar(fechaHoy)) {
				resultado = Resultado.MULTA_VIGENTE;
			}else {
				ejemplar.actualizarEstado(Estado.PRESTADO);
				lector.procesarPrestamo(ejemplar, fechaHoy);
				resultado = Resultado.PRESTAMO_EXITOSO;
			}
		}else if(ejemplar == null){
			resultado = Resultado.NO_HAY_EJEMPLARES;
		}else {
			lector.agregarPrestamo(fechaHoy);
			ejemplar.actualizarEstado(Estado.PRESTADO);
			lector.procesarPrestamo(ejemplar, fechaHoy);
			resultado = Resultado.PRESTAMO_EXITOSO;			
		}
		return resultado;
	}
	
}
