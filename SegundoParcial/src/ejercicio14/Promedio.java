package ejercicio14;

public class Promedio {
	private Contador contador;
	private Acumulador acumulador;
	public Promedio(Contador contador, Acumulador acumulador) {
		this.contador = contador;
		this.acumulador = acumulador;
	}
	public void incrementar(int num) {
		acumulador.incrementar(num);
		contador.incrementar();
	}
	public double obtenerValor() {
		if(contador.getValor() != 0) {
			return (double) acumulador.getValor() / contador.getValor();
		}else {
			return 0;
		}
	}
	
	
	
	

}
