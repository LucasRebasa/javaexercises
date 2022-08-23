package ejercicio05;

import java.util.ArrayList;

public class Libro {
	private String titulo;
	private Genero genero;
	private Editorial editorial;
	private int anio;
	private Autor autor;
	private ArrayList<Ejemplar> ejemplares;
	
	public Libro(String titulo, Genero genero, Editorial editorial, int anio, Autor autor) {
		this.titulo = titulo;
		this.genero = genero;
		this.editorial = editorial;
		this.anio = anio;
		this.autor = autor;
		this.ejemplares = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public int getAnio() {
		return anio;
	}

	public Autor getAutor() {
		return autor;
	}

	public ArrayList<Ejemplar> getEjemplares() {
		return ejemplares;
	}
	public void agregarEjemplares(int id, Fecha fecha, Estado estado) {
		this.ejemplares.add(new Ejemplar(id,fecha,estado));
	}
	
	public Ejemplar buscarEjemplar() {
		int i = 0;
		Ejemplar buscado = null;
		int tope = ejemplares.size();
		while(i < tope && buscado == null) {
			Ejemplar ejemplar = ejemplares.get(i);
			if(ejemplar.getEstado().equals(Estado.BIBLIOTECA)) {
				buscado = ejemplar;
			}else {
				i++;
			}
		}
		return buscado;
	}
	
	
}
