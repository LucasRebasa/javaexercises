package ejercicio05;

import java.util.ArrayList;

public class Prestamo {
	private Fecha fechaRetiro;
	private ArrayList<Ejemplar> librosRetirados;
	
	public Prestamo(Fecha fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
		this.librosRetirados = new ArrayList<>();
	}
	
	
	public ArrayList<Ejemplar> getLibrosRetirados() {
		return librosRetirados;
	}
	public void agregarLibro(Ejemplar ejemplar) {
		librosRetirados.add(ejemplar);
	}
	public void actualizarFechaRetiro(int dia, int mes, int anio) {
		this.fechaRetiro = new Fecha(dia,mes,anio);
	}

	public boolean puedeRetirar(Fecha fechaHoy) {
		boolean puedeRetirar = false;
		if(fechaHoy.diferenciaDias(fechaRetiro) < 7) {
			puedeRetirar = true;
		}
		return puedeRetirar;
	}
}
