package actividad1;

import java.util.Scanner;

public class Ejercicio08 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int multiplicacion;
		double division;
		int suma;
		int resta;
		
		System.out.println("Ingrese un numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		suma = num1 + num2;
		resta = num1 - num2;
		division = (num1+0.0)/num2;
		multiplicacion = num1*num2;
		
		System.out.println("Los resultados de las 4 operaciones basicas son: " + suma + ", " + resta + ", " + division + " y " + multiplicacion);
		
		
	}

}
