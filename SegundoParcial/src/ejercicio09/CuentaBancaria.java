package ejercicio09;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	public CuentaBancaria(TipoCuenta tipo, Persona titular) {
		this.tipo = tipo;
		this.saldo = 0;
		this.titular = titular;
		this.cbu = generarCBU();
	}
	
	public String generarCBU() {
		return (10 + tipo.ordinal()) + "-" + titular.getDNI() + "-" + titular.getDNI().charAt(titular.getDNI().length() - 1);
	}
	public double obtenerSaldo() {
		return this.saldo;
	}
	public void depositar(double monto) {
		this.saldo += monto;
	}
	public boolean extraer(double monto) {
		if(monto <= obtenerSaldo() ) {
			this.saldo -= monto;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
}
