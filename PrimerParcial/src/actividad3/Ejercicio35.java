package actividad3;

import java.util.Scanner;

public class Ejercicio35 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		int minimo = Integer.MAX_VALUE;
		String nombre,joven = "s";
		System.out.println("Ingrese un nombre:");
		nombre = input.nextLine();
		System.out.println("Ingrese una edad:");
		edad = Integer.parseInt(input.nextLine());
		
		while( !(nombre.equals("*")) ) {
			if(edad < minimo) {
				joven = nombre;
				minimo = edad;
			}
			System.out.println("Ingrese un nombre:");
			nombre = input.nextLine();
			System.out.println("Ingrese una edad:");
			edad = Integer.parseInt(input.nextLine());
		}
		System.out.println("La persona mas joven se llama " + joven + " y tiene " + minimo);
	}

}
