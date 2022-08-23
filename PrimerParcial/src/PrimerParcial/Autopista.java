package PrimerParcial;

import java.util.Scanner;

public class Autopista {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int nroAutopista,cantCabinas,turno,nroCabina;
		int nroAutopistaMaximo = 0;
		double recaudadoCabina;
		int nroCabinaMaximo = 0; 
		int contador = 0;
		double recaudadoAutopista = 0;
		double recaudadoCabinaMaximo = Double.MIN_VALUE;
		double recaudadoGeneral = 0;
		double promedioTurno1 = 0;
		double promedioTurno2 = 0;
		double promedioTurno3 = 0;
		double recaudadoAutopistaMaximo = Double.MIN_VALUE;
		double cabinaMaximo = Double.MIN_VALUE;
		
		do {
			System.out.println("Ingrese el numero de autopista");
			nroAutopista = Integer.parseInt(input.nextLine());
		} while (nroAutopista < 0);
		while(nroAutopista > 0) {
			do {
				System.out.println("Ingrese la cantidad de cabinas");
				cantCabinas = Integer.parseInt(input.nextLine());
			} while (cantCabinas<=0);
			for(int i=1;i<=cantCabinas;i++) {
				System.out.println("Ingrese el numero de cabina");
				nroCabina = Integer.parseInt(input.nextLine());
				System.out.println("Ingrese el turno");
				turno = Integer.parseInt(input.nextLine());
				System.out.println("Ingrese el total recaudado");
				recaudadoCabina = Integer.parseInt(input.nextLine());
				if(recaudadoCabina>cabinaMaximo) {
					recaudadoCabinaMaximo = recaudadoCabina;
					nroCabinaMaximo = nroCabina;
				}
				switch(turno) {
				case 1:
					promedioTurno1 += recaudadoCabina;
					break;
				case 2:
					promedioTurno2 += recaudadoCabina;
					break;
				case 3:
					promedioTurno3 += recaudadoCabina;
					break;
				}
				contador++;
				recaudadoAutopista += recaudadoCabina;
				if(recaudadoAutopista > recaudadoAutopistaMaximo) {
					recaudadoAutopistaMaximo = recaudadoAutopista;
					nroAutopistaMaximo = nroAutopista;
				}
			}
			recaudadoGeneral +=  recaudadoAutopista;
			System.out.println("El total recaudado por la autopista es " + recaudadoAutopista);
			System.out.println("La cabina con mayor recaudacion fue la " + nroCabinaMaximo + " con " + recaudadoCabinaMaximo);
			do {
				System.out.println("Ingrese el siguiente numero de autopista");
				nroAutopista = Integer.parseInt(input.nextLine());
			} while (nroAutopista < 0);
			recaudadoAutopista = 0;
			recaudadoCabinaMaximo = Double.MIN_VALUE;
		}
		promedioTurno1 = (double) promedioTurno1/contador;
		promedioTurno2 = (double) promedioTurno2/contador;
		promedioTurno3 = (double) promedioTurno3/contador;
		System.out.println("El total recaudado fue " + recaudadoGeneral);
		System.out.println("El numero de autopista con mayor recaudacion fue la " + nroAutopistaMaximo + " con " + recaudadoAutopistaMaximo);
		System.out.println("El promedio del turno 1 fue " + promedioTurno1);
		System.out.println("El promedio del turno 2 fue " + promedioTurno2);
		System.out.println("El promedio del turno 3 fue " + promedioTurno3);
	}

}
