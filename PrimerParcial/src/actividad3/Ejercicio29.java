package actividad3;

import java.util.Scanner;

public class Ejercicio29 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota;
		
		do{
			System.out.println("Ingrese una nota:");
			nota = Integer.parseInt(input.nextLine());
		} while(nota<0 || nota>10);
		System.out.println("La nota ingresada fue correcta");
	}

}
