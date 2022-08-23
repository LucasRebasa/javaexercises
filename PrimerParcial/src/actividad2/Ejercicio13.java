package actividad2;

import java.util.Scanner;

public class Ejercicio13 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2,num3;
		int mayor;
		String posicion = "primera";
		
		System.out.println("Ingrese un numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		num3 = Integer.parseInt(input.nextLine());
		
		mayor = num1;
		
		if(num2 > mayor) {
			mayor = num2;
			posicion = "segunda";
			if(num3 > mayor) {
				mayor = num3;
				posicion = "tercera";
			}
		}else if(num3>mayor) {
			mayor = num3;
			posicion = "tercera";
		}
		System.out.println("El numero mayor es el " + mayor + " ingresado en la " + posicion + " posicion.");
	}

}
