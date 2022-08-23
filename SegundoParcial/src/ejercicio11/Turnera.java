package ejercicio11;

public class Turnera {
private int valor;
	public Turnera() {
		this.valor = 0;
	}
	public void otorgarProximoNumero() {
		this.valor += 1;
	}
	public int obtenerUltimoNumeroOtorgado() {
		return this.valor;
	}
	public void resetearContador() {
		this.valor = 0;
	}
	public void resetearContador(int valor) {
		this.valor = valor;
	}
	

}
