package actividad2;

import java.util.Scanner;

public class Ejercicio11 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int numero1 = 455/100;
		System.out.println(numero1%10);
		System.out.println("Ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		
		if(numero%2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero no es par");
		}
	}

}
