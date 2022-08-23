package actividad3;

import java.util.Scanner;

public class Ejercicio34 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double promedio;
		double estatura;
		int contador = 0;
		double acumulador = 0;
		System.out.println("Ingrese una estatura: ");
		estatura = Double.parseDouble(input.nextLine());
		
		while(estatura!=0) {
			acumulador += estatura;
			contador++;
			System.out.println("Ingrese otra estatura: ");
			estatura = Double.parseDouble(input.nextLine());
		}
		promedio =  acumulador / (contador+0.0);
		System.out.println("El promedio del equipo es " + promedio);
	}

}
