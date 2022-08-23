package thp.autobus;

public class Asiento {
	private Estado estado;
	
	public Asiento(Estado estado) {
		this.estado = estado;
	}
	
	public Estado getEstado() {
		return estado;
	}
}
