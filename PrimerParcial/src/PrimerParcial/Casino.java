package PrimerParcial;

import java.util.Scanner;

public class Casino {
	public static final String RULETA = "RUL";
	public static final String POKER = "PKR";
	public static final String BLACKJACK = "BJK";
	public static final int COSTO_RULETA = 100;
	public static final int COSTO_POKER = 500;
	public static final int COSTO_BLACKJACK = 200;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double dineroInicial;
		double dineroRestante;
		double dineroNecesario;
		String juegoDeseado;
		String nombre;
		int cantidadJuegos = 0;
		int cantRuleta = 0;
		int cantBlackJack = 0;
		int cantPoker = 0;
		int suerte;
		int costo = 0;
		boolean dineroSuficiente = false;
		do {
			System.out.println("Ingrese el dinero inicial:");
			dineroInicial = Double.parseDouble(input.nextLine());	
		} while (dineroInicial < 500);
		do {
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
		} while (nombre.isEmpty());
		dineroNecesario = dineroInicial * 0.2;
		dineroRestante = dineroInicial;
		while(dineroRestante > dineroNecesario && dineroRestante > 100 && dineroRestante < (dineroInicial+5000) ) {
			do {
				System.out.println("Ingrese el juego que desea jugar:");
				juegoDeseado = input.nextLine();
			} while ((!juegoDeseado.equals(RULETA))  && (!juegoDeseado.equals(POKER))  && (!juegoDeseado.equals(BLACKJACK)));
			do {
				switch(juegoDeseado) {
				case RULETA:
					costo = COSTO_RULETA;
					System.out.println("El costo del juego es " + costo);
					dineroRestante -= COSTO_RULETA;
					dineroSuficiente = true;
					cantRuleta++;
					cantidadJuegos++;
					break;
				case BLACKJACK:
					if(dineroRestante >= 200) {
						costo = COSTO_BLACKJACK;
						System.out.println("El costo del juego es " + costo);
						dineroRestante -= COSTO_BLACKJACK;
						dineroSuficiente = true;
						cantBlackJack++;
						cantidadJuegos++;
					}else {
						System.out.println("El dinero es insuficiente");
						dineroSuficiente = false;
					}
					break;
				case POKER:
					if(dineroRestante >= 500) {
						costo = COSTO_POKER;
						System.out.println("El costo del juego es " + costo);
						dineroRestante -= COSTO_POKER;
						dineroSuficiente = true;
						cantPoker++;
						cantidadJuegos++;
					}else {
						dineroSuficiente = false;
						System.out.println("El dinero es insuficiente");
					}
					
					break;
				}	
			} while (!dineroSuficiente);
			suerte = (int) Math.random() * 3;
			switch(suerte) {
				case 0:
					System.out.println("Perdio el dinero");
					break;
				case 1:
					System.out.println("Recupero el dinero");
					dineroRestante += costo;
					break;
				case 2:
					System.out.println("Duplico la apuesta");
					dineroRestante += 2*costo;
					break;
			}
			System.out.println("El dinero restante es " + dineroRestante);
			
		}
		System.out.println("El dinero restante es " + dineroRestante);
		System.out.println("La cantidad de veces que jugo al Poker fue " + cantPoker + " y el promedio es " + (cantPoker/(cantidadJuegos+0.0))*100);
		System.out.println("La cantidad de veces que jugo al BlackJack fue " + cantBlackJack + " y el promedio es " + (cantBlackJack/(cantidadJuegos+0.0))*100);
		System.out.println("La cantidad de veces que jugo al ruleta fue " + cantRuleta + " y el promedio es " + (cantRuleta/(cantidadJuegos+0.0))*100);
	}

}
