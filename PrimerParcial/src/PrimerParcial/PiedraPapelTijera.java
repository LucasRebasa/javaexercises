package PrimerParcial;

import java.util.Scanner;

public class PiedraPapelTijera {
	public static Scanner input = new Scanner(System.in);
	public static final String PIEDRA = "Piedra";
	public static final String PAPEL = "Papel";
	public static final String TIJERA = "Tijera";
	
	public static void main(String[] args) {
		int cantPuntos;
		int puntajeAna = 0;
		int puntajeBartolo = 0;
		String eleccionAna;
		String eleccionBartolo;
		String ganador = "";
		
		System.out.println("Ingrese la cantidad de puntos");
		cantPuntos = Integer.parseInt(input.nextLine());
		while(puntajeBartolo < cantPuntos && puntajeAna < cantPuntos) {
			int eligioTijera = 0;
			int eligioPiedra = 0;
			int eligioPapel = 0;
			do {			
				System.out.println("Ingrese la eleccion de Ana:");
				eleccionAna = input.nextLine();
			} while (!eleccionAna.equals(PIEDRA) && !eleccionAna.equals(PAPEL) && !eleccionAna.equals(TIJERA));
			do {			
				System.out.println("Ingrese la eleccion de Bartolo:");
				eleccionBartolo = input.nextLine();
			} while (!eleccionBartolo.equals(PIEDRA) && !eleccionBartolo.equals(PAPEL) && !eleccionBartolo.equals(TIJERA));
			switch(eleccionAna) {
				case PIEDRA:
					eligioPiedra++;
					break;
				case PAPEL:
					eligioPapel++;
					break;
				case TIJERA:
					eligioTijera++;
					break;
			}
			switch(eleccionBartolo) {
			case PIEDRA:
				eligioPiedra++;
				break;
			case PAPEL:
				eligioPapel++;
				break;
			case TIJERA:
				eligioTijera++;
				break;
			}
			if(eligioPiedra == 2 || eligioPapel == 2 || eligioTijera == 2) {
				ganador = "EMPATE";
			}
			if(eligioPiedra == 1 && eligioTijera == 1) {
				if(eleccionBartolo.equals(PIEDRA)) {
					puntajeBartolo++;
					ganador = "BARTOLO";
				}else{
					puntajeAna++;
					ganador = "ANA";
				}
			}
			if(eligioPiedra == 1 && eligioPapel == 1) {
				if(eleccionBartolo.equals(PAPEL)) {
					puntajeBartolo++;
					ganador = "BARTOLO";
				}else{
					puntajeAna++;
					ganador = "ANA";
				}		
			}
			if(eligioPapel == 1 && eligioTijera == 1) {
				if(eleccionBartolo.equals(TIJERA)) {
					puntajeBartolo++;
					ganador = "BARTOLO";
				}else{
					puntajeAna++;
					ganador = "ANA";
				}
			}
			if(ganador.equals("EMPATE")) {
				System.out.println(ganador);
			}else{
				System.out.println("Ganador de la ronda: " + ganador);				
				}
		}
		if(puntajeBartolo > puntajeAna) {
			System.out.println("El ganador es Bartolo");
		}else {
			System.out.println("La ganadora es Ana");
		}
	}

}
