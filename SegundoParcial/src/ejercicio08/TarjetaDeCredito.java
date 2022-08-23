package ejercicio08;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	public TarjetaDeCredito(String numero,String titular,double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
	}
	public String getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	public double getAcumuladoActual() {
		return acumuladoActual;
	}
	private void setNumero(String numero) {
		this.numero = numero;
	}
	private void setTitular(String titular) {
		this.titular = titular;
	}
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	public double montoDisponible() {
		if(this.limiteDeCompra - this.acumuladoActual > 0) {
			return this.limiteDeCompra - this.acumuladoActual;
		}else {
			return 0;
		}
	}
	private boolean compraPosible(double monto) {
		if(montoDisponible() >= monto) {
			return true;
		}else {
			return false;
		}
	}
	public void actualizarLimite(double nuevoLimite) {
		this.limiteDeCompra = nuevoLimite;
	}
	private void acumularGastoActual(double monto) {
		this.acumuladoActual += monto;
	}
	public boolean realizarCompra(double monto) {
		if(compraPosible(monto)) {
			acumularGastoActual(monto);
			System.out.println("Se realizo la compra");
			return true;
		}else {
			System.out.println("No se pudo realizar la compra");
			return false;
		}
	}
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + "]";
	}

}
