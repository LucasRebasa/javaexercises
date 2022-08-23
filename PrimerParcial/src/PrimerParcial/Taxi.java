package PrimerParcial;

import java.util.Scanner;

public class Taxi {
	public static Scanner input = new Scanner(System.in);
	
	public static final char CORTO = 'C';
	public static final char MEDIANO = 'M';
	public static final char LARGO = 'L';
	public static final char FIN = 'Z';
	public static final int BAJADA_DE_BANDERA = 80;
	public static final int MAX_VIAJES = 30;
	
	
	public static void main(String[] args) {
		String nombre;
		String nombreMax = "";
		char viaje;
		int cantPasajeros;
		int edad;
		double porcentajeViajesC;
		double importeViaje;
		int cantViajesC = 0;
		int cantViajesM = 0;
		int cantViajesL = 0;
		int edadMax = Integer.MIN_VALUE;
		double recaudacionTotal = 0;
		double promedio = 0;
		int contador = 0;
		
		do {
			System.out.println("Ingrese la distancia del viaje: ");
			viaje = input.nextLine().charAt(0);
		} while (viaje != CORTO && viaje != MEDIANO && viaje != LARGO && viaje != FIN);
		while ( contador < 30 && viaje != FIN ) {
			switch(viaje) {
			case CORTO:
				cantViajesC++;
				break;
			case MEDIANO:
				cantViajesM++;
				break;
			case LARGO:
				cantViajesL++;
				break;
			}
			contador++;
			do {
				System.out.println("Ingrese la cantidad de pasajeros");
				cantPasajeros = Integer.parseInt(input.nextLine());				
			} while (cantPasajeros <= 0 || cantPasajeros > 4);
			System.out.println("Ingrese el importe a cobrar: ");
			importeViaje = Double.parseDouble(input.nextLine()) + BAJADA_DE_BANDERA;
			recaudacionTotal += importeViaje;
			for(int i=1;i<=cantPasajeros;i++) {
				do {
					System.out.println("Ingrese el nombre del pasajero");
					nombre = input.nextLine();					
				} while (nombre.isEmpty());
				do {
					System.out.println("Ingrese la edad del pasajero");
					edad = Integer.parseInt(input.nextLine());					
				} while (edad < 18 || edad > 120);
				if(edad > edadMax) {
					edadMax = edad;
					nombreMax = nombre;
				}
			}
			System.out.println("El pasajero con mayor edad tiene " + edadMax + " y se llama " + nombreMax);
			edadMax = Integer.MIN_VALUE;
			do {
				System.out.println("Ingrese la distancia del otro viaje: ");
				viaje = input.nextLine().charAt(0);
			} while (viaje != CORTO && viaje != MEDIANO && viaje != LARGO && viaje != FIN);
		} 
		promedio = (double) recaudacionTotal / contador;
		porcentajeViajesC = (cantViajesC / contador) * 100;
		System.out.println("La cantidad de viajes cortos fueron " + cantViajesC);
		System.out.println("La cantidad de viajes medianos fueron " + cantViajesM);
		System.out.println("La cantidad de viajes largos fueron " + cantViajesL);
		System.out.println("El promedio de valor por viaje fue " + (promedio));
		System.out.println("El porcentaje de viajes cortos fue " + porcentajeViajesC);
	}

}
