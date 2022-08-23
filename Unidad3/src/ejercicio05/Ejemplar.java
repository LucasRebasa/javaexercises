package ejercicio05;

public class Ejemplar {
	private int id;
	private Fecha fecha;
	private Estado estado;
	
	public Ejemplar(int id, Fecha fecha, Estado estado) {
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public Estado getEstado() {
		return estado;
	}
	public void actualizarEstado(Estado estado) {
		this.estado = estado;
	}
}
