package actividad2;
import java.util.Scanner;
public class Ejercicio17 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		char genero;
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 120;
		final int EDAD_TOPE_M = 65;
		final int EDAD_TOPE_F = 60;
		final char MASCULINO = 'M';
		final char FEMENINO = 'F';
		
		System.out.println("Ingrese su edad (entre 1 y 120): ");
		edad = Integer.parseInt(input.nextLine());
		
		
		if( (edad<EDAD_MINIMA) || (edad>EDAD_MAXIMA) ) {
			System.out.println("Edad invalida");
		}else {
			System.out.println("Ingrese su genero ('F' para mujeres y 'M' para varones): ");
			genero = input.nextLine().charAt(0);
			switch (genero) {
			case MASCULINO:
				if(edad>=EDAD_TOPE_M) {
					System.out.println("Puede jubilarse");
				}else {
					System.out.println("No puede jubilarse");
				}
				break;
			case FEMENINO:
				if(edad>=EDAD_TOPE_F) {
					System.out.println("Puede jubilarse");
				}else {
					System.out.println("No puede jubilarse");
				}
				break;
			default:
				System.out.println("Genero incorrecto");
			}
		}
		
	}

}
