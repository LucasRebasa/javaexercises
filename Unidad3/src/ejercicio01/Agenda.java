package ejercicio01;
import java.util.ArrayList;
public class Agenda {
	ArrayList<Persona> coleccion;
	public Agenda() {
		coleccion = new ArrayList<>();
	}
	private Persona buscarPersona(int dni) {
		for (Persona persona : coleccion) {
			if(persona.getDNI() == dni) {
				return persona;
			}
		}
		return null;
	}
	public boolean agregarPersona(String nombre,String apellido,int dni,Domicilio domicilio) {
		if(buscarPersona(dni)==null) {
			coleccion.add(new Persona(nombre,apellido,dni,domicilio));
			return true;
		}
		return false;
	}
	public Persona removerPersona(int dni) {
		Persona personaBorrar = buscarPersona(dni);
		if(personaBorrar!=null) {
			coleccion.remove(personaBorrar);
			return personaBorrar;
		}
		return null;
	}
	public boolean modificarDomicilio(int dni,Domicilio domicilio) {
		Persona persona = buscarPersona(dni);
		if(persona!=null) {
			persona.setDomicilio(domicilio);
			return true;
		}
		return false;
	}
	public void listarPersonas() {
		if(!coleccion.isEmpty()) {
			for (Persona persona : coleccion) {
				System.out.println(persona);
			}			
		}else {
			System.out.println("La lista esta vacia");
		}
	}
	public Persona devolverUltimo() {
		if(!coleccion.isEmpty()) {
			return coleccion.get(coleccion.size()-1);
		}
		return null;
	}
	public void eliminarTodosElementos() {
		while(!coleccion.isEmpty()) {
			coleccion.remove(0);
		}
	}
	
}
