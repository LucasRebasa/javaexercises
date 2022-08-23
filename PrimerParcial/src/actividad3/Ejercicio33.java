package actividad3;

import java.util.Scanner;

public class Ejercicio33 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int numero;
		do {
			System.out.println("Ingrese un numero");
			numero = Integer.parseInt(input.nextLine());
			if(numero>maximo) {
				maximo = numero;
			}
			if(numero<minimo) {
				minimo = numero;
			}
		}while(numero!=0);
		System.out.println("El numero maximo fue el: " + maximo);
		System.out.println("El numero minimo fue el: " + minimo);
	}

}
