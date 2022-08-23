package ejercicioTipoParcialClub;

import java.util.ArrayList;

public class Socio {
	private String nombre;
	private int edad;
	private ArrayList<NombreYEdad> amigos;
	
	public Socio(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.amigos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	public NombreYEdad sonAmigos(String nombre) {
		int i = 0;
		int limite = amigos.size();
		NombreYEdad sonAmigos = null;
		while(i < limite && sonAmigos == null) {
			NombreYEdad aux = amigos.get(i);
			if(aux.getNombre().equals(nombre)) {
				sonAmigos = aux;
			}else {
				i++;
			}
		}
		return sonAmigos;
	}
	public NombreYEdad buscarAmigo(String nombre) {
		int i = 0;
		int limite = amigos.size();
		NombreYEdad buscado = null;
		while(i < limite && buscado == null) {
			NombreYEdad aux = amigos.get(i);
			if(aux.getNombre().equals(nombre)) {
				buscado = aux;
			}else {
				i++;
			}
		}
		return buscado;
	}
	public void agregarAmigo(NombreYEdad socio) {
		amigos.add(socio);
	}
	public void eliminarAmigo(String nombre) {
		NombreYEdad amigoAEliminar = buscarAmigo(nombre);
		if(amigoAEliminar != null) {
			amigos.remove(amigoAEliminar);
		}
	}
	public ArrayList<NombreYEdad> obtenerNombreYEdadAmigos() {
		ArrayList<NombreYEdad> lista = new ArrayList<>();
		for (NombreYEdad socio : amigos) {
			lista.add(new NombreYEdad(socio.getNombre(), socio.getEdad()));
		}
		return lista;
	}
	public double calcularPromedioEdades() {
		int acumulador = 0;
		int contador = amigos.size();
		for (NombreYEdad socio : amigos) {
			acumulador += socio.getEdad();
		}
		return (double) acumulador / contador;
	}
	
}
