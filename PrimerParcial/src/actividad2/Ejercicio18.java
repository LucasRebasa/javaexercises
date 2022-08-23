package actividad2;

import java.util.Scanner;

public class Ejercicio18 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2,aux;
		
		System.out.println("Ingrese un numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1 < num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if( num1%num2 == 0) {
			System.out.println("Los numeros son divisibles.");
		}else {
			System.out.println("Los numeros no son divisibles.");
		}
	}

}
