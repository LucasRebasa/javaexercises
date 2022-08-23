package ar.edu.ort.thp.colegio;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Colegio colegio = new Colegio("ORT");
		
		ArrayList<Materia> materiasIdiomas = new ArrayList<>();
		materiasIdiomas.add(Materia.FRANCES);
		materiasIdiomas.add(Materia.INGLES);
		colegio.registrarProfesor("José", "Sabiondo", materiasIdiomas);
		colegio.registrarProfesor("Juana", "Idiomas", materiasIdiomas);
		
		colegio.registrarAlumno(22333444, "María", "Pugliese");
		colegio.registrarAlumno(15666777, "Pedro", "Beconi");
		colegio.registrarAlumno(17555666, "Juan", "Andrada");
		colegio.registrarAlumno(33444555, "Pablo", "Pérez");
		
		System.out.println(colegio.registrarCurso(101, Materia.FRANCES, "Juana", "Idiomas"));
		System.out.println(colegio.registrarCurso(101, Materia.FRANCES, "Juana", "Idiomas"));
		System.out.println(colegio.registrarCurso(102, Materia.FRANCES, "María", "Idiomas"));
		System.out.println(colegio.registrarCurso(103, Materia.GEOGRAFIA, "Juana", "Idiomas"));

		
	}

}
