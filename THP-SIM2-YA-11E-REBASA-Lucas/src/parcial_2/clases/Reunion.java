package parcial_2.clases;

import java.util.ArrayList;

public class Reunion {

	private String motivo;
	private ArrayList<Amigo> amigos;
	private ArrayList<PropuestaReunion> propuestasExistentes;

	public Reunion(String tema) {
		this.motivo = tema;
		this.amigos = new ArrayList<>();
		this.propuestasExistentes = new ArrayList<>();
	}

	public ResultadoOperacion anotarAmigo(String nombre, String domicilio) {
		Amigo amigo = buscarAmigo(nombre);
		ResultadoOperacion res = ResultadoOperacion.AMIGO_YA_EXISTENTE;
		if (amigo == null) {
			amigos.add(new Amigo(nombre, domicilio));
			res = ResultadoOperacion.OPERACION_OK;
		}
		return res;
	}

	private ResultadoOperacion bajarDePropuesta(Amigo amigo, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion resultado = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		PropuestaReunion propuesta = buscarPropuesta(diaSemana, momento);
		if(propuesta != null) {
			resultado = propuesta.borrarAmigo(amigo);
			if(propuesta.sinAnotados()) {
				this.propuestasExistentes.remove(propuesta);
			}
		}
		return resultado;
	}

	public ResultadoOperacion bajarDePropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = bajarDePropuesta(amigo, diaSemana, momento);
		}
		return res;
	}
	
	private Amigo buscarAmigo(String nombre) {
		Amigo amigo = null;
		int pos = 0;
		while (pos < amigos.size() && !amigos.get(pos).mismoNombre(nombre)) {
			pos++;
		}
		if (pos < amigos.size())
			amigo = amigos.get(pos);
		return amigo;
	}

	private PropuestaReunion buscarPropuesta(DiaSemana diaSemana, MomentoDia momento) {
		PropuestaReunion propuesta = null;
		PropuestaReunion aux;
		int i = 0;
		int limite = propuestasExistentes.size();
		while(i < limite && propuesta == null) {
			aux = propuestasExistentes.get(i);
			if(aux.mismaPropuesta(diaSemana, momento)) {
				propuesta = aux;
			}else {
				i++;
			}
		}
		return propuesta;
	}

	public ResultadoOperacion cambiarDePropuesta(String nombre, DiaSemana diaOriginal, MomentoDia momentoOriginal, DiaSemana diaNuevo, MomentoDia momentoNuevo) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = unirAPropuesta(diaNuevo, momentoNuevo, amigo);
			if (res.equals(ResultadoOperacion.OPERACION_OK))
				res = bajarDePropuesta(amigo, diaOriginal, momentoOriginal);
		}
		return res;
	}

	public ResultadoOperacion crearPropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			PropuestaReunion propuesta = buscarPropuesta(diaSemana, momento);
			if (propuesta == null) {
				propuesta = new PropuestaReunion(diaSemana, momento);
				propuestasExistentes.add(propuesta);
			}
			res = propuesta.anotarAmigo(amigo);
		}
		return res;
	}

	public void listar() {
		listarAmigos();
		listarPropuestas();
		listarAmigosFaltantes();
		System.out.println();
	}

	private void listarAmigos() {
		System.out.println("Amigos registrados para " + motivo);
		for (Amigo amigo : amigos) {
			System.out.println(amigo.getNombre());
		}		
	}

	private void listarPropuestas() {
		System.out.println("Propuestas registradas para " + motivo);
		for (PropuestaReunion propuesta : propuestasExistentes) {
			propuesta.listar();
		}		
	}
	private void listarAmigosFaltantes() {
		System.out.println("Amigos no registrados a ninguna propuesta: ");
		for (Amigo amigo : amigos) {
			int limite = propuestasExistentes.size();
			int i = 0;
			boolean estaAnotado = false;
			while(i < limite && !estaAnotado) {
				PropuestaReunion propuesta = propuestasExistentes.get(i);
				if( propuesta.buscarAmigo(amigo.getNombre()) != null ) {
					estaAnotado = true;
				}else {
					i++;
				}
			}
			if(!estaAnotado) {
				System.out.println(amigo.getNombre());
			}
		}
	}

	private ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, Amigo amigo) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		PropuestaReunion fechaReunion = buscarPropuesta(diaSemana, momento);
		if (fechaReunion != null) {
			res = fechaReunion.anotarAmigo(amigo);
		}
		return res;
	}

	public ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, String nombre) {
		ResultadoOperacion resultado = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = this.buscarAmigo(nombre);
		if(amigo != null) {
			resultado = unirAPropuesta(diaSemana, momento, amigo);
		}
		return resultado;
	}

}