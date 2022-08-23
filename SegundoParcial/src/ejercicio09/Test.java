package ejercicio09;

public class Test {

	public static void main(String[] args) {
		Domicilio domicilio = new Domicilio("Yatay", 240, "Almagro");
		
		Persona p1 = new Persona("Fulano", "Gomez", "12345678", domicilio);
		Persona p2 = new Persona("Mengana", "Torres", "9126456", domicilio);
		
		CuentaBancaria cuenta1 = new CuentaBancaria(TipoCuenta.CAJA_DE_AHORRO,p1);
		CuentaBancaria cuenta2 = new CuentaBancaria(TipoCuenta.CUENTA_CORRIENTE,p2);

		System.out.println(cuenta1);
		System.out.println(cuenta2);
		cuenta1.depositar(5000);
		cuenta2.depositar(4500);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		cuenta1.extraer(4700);
		cuenta2.extraer(9000);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}

}
