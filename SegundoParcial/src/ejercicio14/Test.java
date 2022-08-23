package ejercicio14;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int nota;
		Acumulador acum = new Acumulador();
		Contador cont = new Contador();
		Promedio prom = new Promedio(cont, acum);
		do {				
			System.out.println("Ingrese una nota: ");
			nota = Integer.parseInt(input.nextLine());
		} while ( !(nota > 0 && nota <= 10) && nota != -1  );
		while (nota != -1) {
			prom.incrementar(nota);
			do {				
				System.out.println("Ingrese otra nota: ");
				nota = Integer.parseInt(input.nextLine());
			} while ( !(nota > 0 && nota <= 10) && nota != -1 );
		}
		System.out.println(prom.obtenerValor());		
		
	}
}
