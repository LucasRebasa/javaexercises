package ejercicio03;

import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	private ArrayList<Barrio> barrios;
	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		barrios = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarPropiedades() {
		for (Barrio barrio : barrios) {
			barrio.mostrarPropiedades();
		}
	}
	
	private ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> resultado = new ArrayList<>();
		int maximo = 0;
		for (Barrio barrio : barrios) {
			int cant = barrio.obtenerNroProps();
			if(cant >= maximo ) {
				if(cant > maximo) {
					resultado.clear();
					maximo = cant;
				}
				resultado.add(barrio);
			}
		}
		return resultado;
	}
	public void mostrarBarrioMaxProp() {
		System.out.println("Barrio con mas propiedades:");
		for (Barrio barrio : obtenerBarrioMaxProp()) {
			System.out.println(barrio);
		}
	}
	private Propiedad buscarPropiedad(String domicilio) {
		Propiedad propBuscada;
		for (Barrio barrio : barrios) {
			propBuscada = barrio.buscarPropiedad(domicilio);
			if(propBuscada != null) {
				return propBuscada;
			}
		}
		return null;
	}
	private Barrio buscarBarrio(String nombre) {
		for (Barrio barrio : barrios) {
			if(barrio.getNombre()==nombre) {
				return barrio;
			}
		}
		return null;
	}
	public void agregarPropiedad(String nombre, String domicilio, Tipo tipo, double precio) {
		Barrio aux = buscarBarrio(nombre);
		if(aux == null) {
			Barrio barrio = new Barrio(nombre);
			barrio.agregarPropiedad(domicilio, precio, tipo);
			barrios.add(barrio);
		}else {
			aux.agregarPropiedad(domicilio, precio, tipo);
		}
	}
	public void removerPropiedad(String domicilio) {
		boolean aux = false;
		int index = 0;
		while( index < barrios.size() && !aux) {
			aux = barrios.get(index).removerPropiedad(domicilio);
			if(!aux) {
				index++;
			}
		}
	}
	public void cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		Propiedad aux = buscarPropiedad(domicilio);
		removerPropiedad(domicilio);
		if(buscarBarrio(domicilio) == null) {
			barrios.add(barrio);
		}
		barrio.agregarPropiedad(domicilio, aux.getPrecio(), aux.getTipo());
		
	}
	public void listarProps() {
		
	}
	
}
