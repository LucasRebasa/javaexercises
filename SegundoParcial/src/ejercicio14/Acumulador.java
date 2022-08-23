package ejercicio14;

public class Acumulador {
	private double valor;
	public Acumulador() {
		this.valor = 0;
	}
	public void incrementar(double valor) {
		this.valor += valor;
	}
	public double getValor() {
		return this.valor;
	}

}
