package PrimerParcial;

import java.util.Scanner;

public class Electrodomesticos {
	public static Scanner input = new Scanner(System.in);
	public static final char MANIANA = 'M';
	public static final char TARDE = 'T';
	public static final char FIN = 'F';
	public static final int LIMITE_SUCURSALES = 3;
	public static void main(String[] args) {
		double recaudadoMax = Double.MIN_VALUE;
		double recaudadoSucursalM = 0;
		double recaudadoSucursalT = 0;
		double recaudadoTotal = 0;
		int contador = 0;
		int codigo,codigoMax=0;
		char turno;
		double promedio,recaudadoDia,porcentajeM,porcentajeT,recaudadoTotalSucursalT=0,recaudadoTotalSucursalM=0;
		
		
		for(int i=1;i<=LIMITE_SUCURSALES;i++) {
			do {
				System.out.println("Ingrese el turno en el que trabaja:");
				turno = input.nextLine().charAt(0);
			} while (turno!=MANIANA && turno!=TARDE && turno!=FIN);
			while(turno != FIN) {
				contador++;
				do {
					System.out.println("Ingrese el codigo del vendedor:");
					codigo = Integer.parseInt(input.nextLine());
				} while(codigo<=0);
				do {
					System.out.println("Total vendido");
					recaudadoDia = Double.parseDouble(input.nextLine());
				} while (recaudadoDia<0);
				recaudadoTotal += recaudadoDia;
				if(recaudadoDia>recaudadoMax) {
					recaudadoMax = recaudadoDia;
					codigoMax = codigo;
				}
				switch(turno) {
					case MANIANA:
						recaudadoSucursalM += recaudadoDia;
						recaudadoTotalSucursalM += recaudadoDia;
						break;
					case TARDE:
						recaudadoSucursalT += recaudadoDia;
						recaudadoTotalSucursalT += recaudadoDia;
						break;	
				}
				do {
					System.out.println("Ingrese el turno en el que trabaja:");
					turno = input.nextLine().charAt(0);
				} while (turno!=MANIANA && turno!=TARDE && turno!=FIN);
			}
			System.out.println("El total recaudado a la mañana es " + recaudadoSucursalM);
			System.out.println("El total recaudado a la tarde es " + recaudadoSucursalT);
			System.out.println("El vendedor con mas recaudacion recaudo " + recaudadoMax + " y tiene el codigo " + codigoMax);
			recaudadoSucursalM = 0;
			recaudadoSucursalT = 0;
			recaudadoMax = Double.MIN_VALUE;
		}
		promedio = (double) recaudadoTotal / contador;
		porcentajeM = (recaudadoTotalSucursalM/recaudadoTotal)*100;
		porcentajeT = (recaudadoTotalSucursalT/recaudadoTotal)*100;
		System.out.println("El promedio de la venta de los vendedores es " + promedio);
		System.out.println("El porcentaje del turno mañana es " + porcentajeM);
		System.out.println("El porcentaje del turno tarde es " + porcentajeT);
	}

}
