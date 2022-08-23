package actividad1;

import java.util.Scanner;

public class Ejercicio02 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota1;
		int nota2;
		int nota3;
		double promedio;
		
		System.out.println("Ingrese una nota: ");
		nota1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese una nota: ");
		nota2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese una nota: ");
		nota3 = Integer.parseInt(input.nextLine());
		promedio = (nota1 + nota2 + nota3 + 0.0) / 3;
		
		System.out.println("Su promedio es: " + promedio);
	}

}
