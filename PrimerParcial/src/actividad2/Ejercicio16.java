package actividad2;

import java.util.Scanner;

public class Ejercicio16 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int inscriptos,asientosTotales,asientosDisponibles;
		
		System.out.println("Ingrese la cantidad de inscriptos: ");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese los asientos disponibles: ");
		asientosTotales = Integer.parseInt(input.nextLine());
		
		asientosDisponibles = asientosTotales - inscriptos;
		
		if(asientosDisponibles >= 0) {
			System.out.println("Los asientos alcanzan");
		}else {
			System.out.println("Faltan " + (-asientosDisponibles) + " asientos.");
		}
	}

}
