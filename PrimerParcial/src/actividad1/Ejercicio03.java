package actividad1;

import java.util.Scanner;

public class Ejercicio03 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int multiplicado;
		double dividido;
		
		System.out.println("Ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		multiplicado = numero * 5;
		dividido = (numero + 0.0) / 2;
		System.out.println("El numero multiplicado es: " + multiplicado);
		System.out.println("El numero dividido es: " + dividido);
	}

}
