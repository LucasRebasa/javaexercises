package actividad1;

import java.util.Scanner;

public class Ejercicio10 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int capital1,capital2,capital3;
		int total;
		String nombre1,nombre2,nombre3;
		
		System.out.println("Ingrese un nombre:");
		nombre1 = input.nextLine();
		System.out.println("Ingrese el capital aportado:");
		capital1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un nombre:");
		nombre2 = input.nextLine();
		System.out.println("Ingrese el capital aportado:");
		capital2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un nombre:");
		nombre3 = input.nextLine();
		System.out.println("Ingrese el capital aportado:");
		capital3 = Integer.parseInt(input.nextLine());
		
		total = capital1 + capital2 + capital3;
		
		System.out.println("El primer socio se llama: " + nombre1 + " Aporto:" + capital1 + " Porcentaje: " + ((capital1+0.0)/total)*100 );
		System.out.println("El segundo socio se llama: " + nombre2 + " Aporto:" + capital2 + " Porcentaje: " + ((capital2+0.0)/total)*100 );
		System.out.println("El tercer socio se llama: " + nombre3 + " Aporto:" + capital3 + " Porcentaje: " + ((capital3+0.0)/total)*100 );
	
	}

}
