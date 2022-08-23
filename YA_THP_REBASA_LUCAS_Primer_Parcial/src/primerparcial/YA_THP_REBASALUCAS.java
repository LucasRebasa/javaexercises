package primerparcial;

import java.util.Scanner;

public class YA_THP_REBASALUCAS {
	public static Scanner input = new Scanner(System.in);
	public static final char SI = 'S';
	public static final char NO = 'N';
	public static final char BLANCO = 'B';
	public static final char FIN = 'F';
	public static final int MINIMO_EDAD = 18;
	
	
	
	public static void main(String[] args) {
		char opcion;
		int edad;
		int acumuladorEdad = 0;
		String opcionGanadora = "";
		int cantVotosS = 0;
		int cantVotosN = 0;
		int cantVotosB = 0;
		int contador = 0;
		double promedioEdad;
		double porcentajeN;
		do {
			System.out.println("Desea que poden los arboles. Las opciones es a elegir son SI ('S'), NO ('N'), VOTO EN BLANCO ('B'): ");
			opcion = input.nextLine().charAt(0);
		} while (opcion!=SI && opcion!=NO && opcion!=BLANCO && opcion!=FIN);
		while(opcion!=FIN) {
			contador++;
			do {
				System.out.println("Ingrese la edad del votante (mayor o igual a 18 años):");
				edad = Integer.parseInt(input.nextLine());
			} while (edad<MINIMO_EDAD);
			acumuladorEdad += edad;
			switch(opcion) {
				case SI:
					cantVotosS++;
					break;
				case NO:
					cantVotosN++;
					break;
				case BLANCO:
					cantVotosB++;
					break;
			}
			do {
				System.out.println("Desea que poden los arboles. Las opciones es a elegir son SI ('S'), NO ('N'), VOTO EN BLANCO ('B'): ");
				opcion = input.nextLine().charAt(0);
			} while (opcion!=SI && opcion!=NO && opcion!=BLANCO && opcion!=FIN);
		}
		promedioEdad = (double) acumuladorEdad / contador;
		porcentajeN =  ((cantVotosN+0.0) / contador)*100;
		if(cantVotosS > cantVotosN && cantVotosS > cantVotosB) {
			opcionGanadora = "La opcion ganadora es el SI";
		}else if(cantVotosN > cantVotosS && cantVotosN > cantVotosB) {
			opcionGanadora = "La opcion ganadora es el NO";
		}else if(cantVotosB > cantVotosS && cantVotosB > cantVotosN) {
			opcionGanadora = "La votacion es indeterminada";
		}
		System.out.println(opcionGanadora);
		System.out.println("El porcentaje de votos NO es " + porcentajeN + "%");
		System.out.println("El promedio de edad de los votantes es " + promedioEdad);
	}

}
