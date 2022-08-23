package actividad3;

import java.util.Scanner;

public class Ejercicio27 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		int contador = 0;
		int acumulador = 0;
		double promedio;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Ingrese una edad: ");
			edad = Integer.parseInt(input.nextLine());
			acumulador += edad;
			if( (edad%2!=0) && (edad>18) ) {
				contador++;
			}
		}
		promedio = (acumulador+0.0) / 5;
		System.out.println("El promedio de todas las edades es " + promedio);
		System.out.println("Las edades impares mayores de 18 fueron " + contador);
	}

}
