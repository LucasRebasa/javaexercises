package actividad3;

import java.util.Scanner;

public class Ejercicio36 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		double promedio = 0;
		int acumulador = 0;
		int contador = 0;
		
		while(promedio<20) {
			System.out.println("Ingrese un numero");
			numero = Integer.parseInt(input.nextLine());
			acumulador += numero;
			contador++;
			promedio = (double) acumulador / contador;
		}
		System.out.println("La cantidad de valores leidos fueron " + contador);
	}

}
