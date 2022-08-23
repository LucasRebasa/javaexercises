package actividad3;

import java.util.Scanner;

public class Ejercicio25 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int ancho;
		int alto;
		
		System.out.println("Ingrese el alto de la matriz");
		alto = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el ancho de la matriz");
		ancho = Integer.parseInt(input.nextLine());
		
		for(int i=1;i<=alto;i++) {
			for(int j=1;j<=ancho;j++) {
				System.out.print("X");
			}
			System.out.println("");
		}
	}

}
