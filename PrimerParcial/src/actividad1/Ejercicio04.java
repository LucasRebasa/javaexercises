package actividad1;

import java.util.Scanner;

public class Ejercicio04 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int valorHora;
		int horas;
		double salario;
		
		System.out.println("Ingrese las horas trabajadas: ");
		horas = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el valor de la hora de trabajo: ");
		valorHora = Integer.parseInt(input.nextLine());
		
		salario = (5 * horas * valorHora) + (horas * valorHora + 0.0)/2;
		System.out.println("Su salario es: " + salario);
	}

}
