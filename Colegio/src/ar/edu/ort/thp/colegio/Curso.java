package ar.edu.ort.thp.colegio;

import java.util.ArrayList;

public class Curso {
	private int codigo;
	private Materia materia;
	private Profesor profesor;
	private ArrayList<Alumno> alumnos;
	
	public Curso(int codigo, Materia materia, Profesor profesor) {
		this.codigo = codigo;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = new ArrayList<>();
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	
}
