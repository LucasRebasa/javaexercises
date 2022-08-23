package ar.edu.ort.thp.colegio;

import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias;
	
	public Profesor(String nombre, String apellido, ArrayList<Materia> materias) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = materias;
	}
	
	public boolean mismoNombreApellido(String nombre, String apellido) {
		return this.nombre.equals(nombre)
				&& this.apellido.equals(apellido);
	}

	public boolean dicta(Materia materia) {
		// devuelve true si el profe dicta dicha materia
		boolean buscado = false;
		int index = 0;
		while (index < materias.size() && buscado == false) {
			Materia aux = materias.get(index);
			if (aux == materia) {
				buscado = true;
			}
			index++;
		}
		return buscado;
	}
	@Override
	public String toString() {
		return "Profesor [" + nombre + " " + apellido + "]";
	}
	
}
