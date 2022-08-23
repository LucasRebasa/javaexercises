package actividad2;

import java.util.Scanner;

public class Ejercicio12 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1>num2) {
			System.out.println("El primer numero es mayor");
		}else {
			System.out.println("El segundo numero es mayor");
		}
	}

}
