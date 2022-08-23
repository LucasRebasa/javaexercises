package actividad1;

import java.util.Scanner;

public class Ejercicio09 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int GRADOS_TRIANGULO = 180;
		int ang1;
		int ang2;
		int ang3;
		
		System.out.println("Ingrese un valor de un angulo del triangulo: ");
		ang1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro valor de un angulo del triangulo: ");
		ang2 = Integer.parseInt(input.nextLine());
		
		ang3 = GRADOS_TRIANGULO - (ang1 + ang2);
		
		System.out.println("El tercer angulo es de: " + ang3);
	}

}
