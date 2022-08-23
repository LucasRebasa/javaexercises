package actividad1;

import java.util.Scanner;

public class Ejercicio07 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int valorMetro;
		int ancho;
		int largo;
		int perimetro;
		int valorTotal;
		int valorCerco;
		
		System.out.println("Ingrese el valor del metro cuadrado: ");
		valorMetro = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el ancho del terreno: ");
		ancho = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el largo del terreno: ");
		largo = Integer.parseInt(input.nextLine());
		
		perimetro = ancho*2 + largo*2;
		valorTotal = (ancho*largo)*valorMetro;
		valorCerco = perimetro * valorMetro;
		
		System.out.println("El valor total del terreno es: " + valorTotal);
		System.out.println("El valor del cerco a 3 alturas es: " + valorCerco + ", " + (valorCerco*2) + " y " + (valorCerco*3));
	}

}
