package ejercicio08;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez",10000);
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta);
		System.out.println("El monto disponible es "+ tarjeta.montoDisponible());
		tarjeta.actualizarLimite(3000);
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta);
	}

}
