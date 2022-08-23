package actividad1;

import java.util.Scanner;

public class Ejercicio06 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int MONTO_FIJO = 44000;
		double montoVendido;
		double salario;
		
		System.out.println("Ingrese el monto vendido: ");
		montoVendido = Integer.parseInt(input.nextLine());
		salario = MONTO_FIJO + montoVendido * 0.16;
		System.out.println("Su salario es: " + salario);
	}

}
