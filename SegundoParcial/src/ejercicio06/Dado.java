package ejercicio06;

public class Dado {
	private int valor;
	
	public Dado() {
		this.valor = (int) (Math.random()*6);
	}
	
	public int getValor() {
		return this.valor;
	}
	public void tirarDado() {
		this.valor = (int) (Math.random()*6) + 1;
	}
}
