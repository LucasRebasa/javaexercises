package actividad3;

import java.util.Scanner;

public class Ejercicio23 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		final int CANT_MULTIPLOS = 10;
		
		System.out.println("Ingrese un numero entero: ");
		numero = Integer.parseInt(input.nextLine());
		
		for(int i=1;i<=CANT_MULTIPLOS;i++) {
			System.out.println(numero*i);
		}
	}

}
