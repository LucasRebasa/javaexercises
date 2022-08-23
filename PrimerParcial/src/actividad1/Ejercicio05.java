package actividad1;

import java.util.Scanner;

public class Ejercicio05 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int aux;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("El primer numero es: " + num1);
		System.out.println("El segundo numero es: " + num2);
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("El primer numero es: " + num1);
		System.out.println("El segundo numero es: " + num2);
	}

}
