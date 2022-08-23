package ar.edu.ort.thp.colegio;

import java.util.ArrayList;

public class Colegio {
	private String nombre;
	private ArrayList<Profesor> profesores;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Curso> cursos;
	
	public Colegio (String nombre) {
		this.nombre = nombre;
		this.profesores = new ArrayList<>();
		this.alumnos = new ArrayList<>();
		this.cursos = new ArrayList<>();
	}
	
	private Profesor buscarProfesor(String nombre, String apellido) {
		Profesor buscado = null;
		int index = 0;
		while (index < profesores.size() && buscado == null) {
			Profesor aux = profesores.get(index);
			if (aux.mismoNombreApellido(nombre, apellido)) {
				buscado = aux;	
			}
			index++;
		}
		return buscado;
	}
	public boolean registrarProfesor(String nombre, String apellido, ArrayList<Materia> materias) {
		// validar que no esté duplicado (nombre y apellido)
		boolean pudoAgregar = false;
		if (buscarProfesor(nombre, apellido) == null) {
			profesores.add(new Profesor (nombre, apellido, materias));
			pudoAgregar = true;
		}
		return pudoAgregar;
	}
	
	private Alumno buscarAlumno(int dni) {
		Alumno buscado = null;
		int index = 0;
		while (index < alumnos.size() && buscado == null) {
			Alumno aux = alumnos.get(index);
			if (aux.getDni() == dni) {
				buscado = aux;	
			}
			index++;
		}
		return buscado;
	}
	public boolean registrarAlumno(int dni, String nombre, String apellido) {
		// validar que no esté duplicado (dni)
		boolean pudoAgregar = false;
		if (buscarAlumno(dni) == null) {
			alumnos.add(new Alumno(dni, nombre, apellido));
			pudoAgregar = true;
		}
		return false;
	}
	
	private Curso buscarCurso(int codigo) {
		Curso buscado = null;
		int index = 0;
		while (index < cursos.size() && buscado == null) {
			Curso aux = cursos.get(index);
			if (aux.getCodigo() == codigo) {
				buscado = aux;	
			}
			index++;
		}
		return buscado;
	}
	public Resultado registrarCurso(int codigo, Materia materia, String nombreProf, String apellidoProf) {
		// validar que no esté duplicado (codigo) - CURSO DUPLICADO
		// validar que el profesor exista - PROFESOR INEXISTENTE
		// validar que el profesor dicte la materia - MATERIA INCOMPATIBLE
		// si está todo bien devuelve OK
		Resultado resultado;
		
		if (buscarCurso(codigo) != null) {
			resultado = Resultado.DUPLICADO;
		}
		else {
			Profesor profesor = buscarProfesor(nombreProf, apellidoProf);
			if (profesor == null) {
				resultado = Resultado.INEXISTENTE;
			}
			else if (!profesor.dicta(materia)) {
				resultado = Resultado.INCOMPATIBLE;
			}
			else {
				cursos.add(new Curso(codigo, materia, profesor));
				resultado = Resultado.OK;
			}
		}
		
		return resultado;
	}
	
	public boolean inscribirAlumno(int codigo, int dni) {
		// solo se puede anotar máximo 4 materias
		return false;
	}
	
	public boolean darDeBaja(int dni) {
		// a criterio de ustedes
		return false;
	}

	@Override
	public String toString() {
		return "Colegio [profesores=" + profesores + ", alumnos=" + alumnos + ", cursos=" + cursos + "]";
	}
	
	
}
