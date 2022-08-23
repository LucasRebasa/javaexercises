package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner input = new Scanner(System.in);

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}
	
	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void pedirNumero(String texto,int minimo,int maximo) {
		int numero;
		do {
			System.out.println(texto);
			numero = Integer.parseInt(input.nextLine());
		} while (numero<minimo || numero>maximo);
	}
}
