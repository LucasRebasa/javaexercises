package ejercicio03;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	public Barrio(String nombre) {
		this.nombre = nombre;
		propiedades = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Barrio [nombre=" + nombre + ", propiedades=" + propiedades + "]";
	}
	public void mostrarPropiedades(Tipo tipo) {
		for (Propiedad propiedad : propiedades) {
			if(propiedad.getTipo() == tipo ) {
				System.out.println(propiedad);
			}
		}
	}
	public void mostrarPropiedades() {
		for (Propiedad propiedad : propiedades) {
			System.out.println(propiedad);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}
	public Propiedad buscarPropiedad(String domicilio) {
		for (Propiedad propiedad : this.propiedades) {
			if(propiedad.getDomicilio().equals(domicilio)) {
				return propiedad;
			}
		}
		return null;
	}
	public boolean removerPropiedad(String domicilio) {
		Propiedad aux = buscarPropiedad(domicilio);
		if(aux!=null) {
			this.propiedades.remove(aux);
			return true;
		}
		return false;
	}
	public void agregarPropiedad(String domicilio, double precio, Tipo tipo) {
		propiedades.add(new Propiedad(domicilio, precio, tipo));
	}
	public int obtenerNroProps() {
		return propiedades.size();
	}
}
