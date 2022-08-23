package actividad2;

import java.util.Scanner;

public class Ejercicio20 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2;
		char operacion;
		final char SUMA = '+';
		final char RESTA = '-';
		final char PRODUCTO = '*';
		final char DIVISION = '/';
		
		System.out.println("Ingrese un numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la operacion: ");
		operacion = input.nextLine().charAt(0);
		
		switch(operacion) {
		case SUMA:
			System.out.println(num1+num2);
			break;
		case RESTA:
			System.out.println(num1-num2);
			break;
		case PRODUCTO:
			System.out.println(num1*num2);
			break;
		case DIVISION:
			System.out.println((num1+0.0)/num2);
			break;
		default:
			System.out.println("ERROR");
		
		}
		
	}

}
