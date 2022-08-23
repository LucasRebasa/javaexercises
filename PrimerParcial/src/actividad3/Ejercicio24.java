package actividad3;

import java.util.Scanner;

public class Ejercicio24 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		int aux;
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero menor o igual al anterior: ");
		num2 = Integer.parseInt(input.nextLine());
		if(num1<=num2) {
			System.out.println("Rango de numeros entre: " + num1 + " y " + num2);
			for(aux=num1;aux<=num2;aux++) {
				System.out.println(aux);
			}
			System.out.println("Rango de numeros entre: " + (num1+1) + " y " + (num2-1));
			for(aux=num1+1;aux<=num2-1;aux++) {
				System.out.println(aux);
			}
		}else {
			System.out.println("Error");
		}
	}

}
