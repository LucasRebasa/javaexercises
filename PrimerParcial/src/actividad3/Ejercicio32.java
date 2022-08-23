package actividad3;

import java.util.Scanner;

public class Ejercicio32 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	int nota;
		
		do{
			System.out.println("Ingrese una nota:");
			nota = Integer.parseInt(input.nextLine());
		} while( (nota<4 || nota>10) && (nota!=2) );
		System.out.println("La nota ingresada fue correcta");
	}

}
