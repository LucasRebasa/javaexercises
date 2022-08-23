package actividad2;
import java.util.Scanner;

public class Ejercicio21 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		final int DOMINGO = 1;
		final int LUNES = 2;
		final int MARTES = 3;
		final int MIERCOLES = 4;
		final int JUEVES = 5;
		final int VIERNES = 6;
		final int SABADO = 7;
		
		System.out.println("Ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		switch (numero) {
		case DOMINGO:
			System.out.println("Domingo");
			break;
		case LUNES:
			System.out.println("Lunes");
			break;
		case MARTES:
			System.out.println("Martes");
			break;
		case MIERCOLES:
			System.out.println("Miercoles");
			break;
		case JUEVES:
			System.out.println("Jueves");
			break;
		case VIERNES:
			System.out.println("Viernes");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Error");
		}
	}

}
