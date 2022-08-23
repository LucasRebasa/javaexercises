package actividad3;

import java.util.Scanner;

public class Ejercicio26 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		int contador = 0;
		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		int aux = num;
		while(contador<=aux) {
			if((num%3==0) && (num%5!=0)) {
				System.out.println(num);
				contador++;
			}
			num++;
		}
	}

}
