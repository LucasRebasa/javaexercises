package actividad2;

import java.util.Scanner;

public class Ejercicio19 {
	public static Scanner input = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numero,contador=0;
		boolean esDeUnSoloDigito,esImpar,estaEnAmbos,noEstaEnNinguno;
		
		System.out.println("Ingrese un numero: ");
		numero = Integer.parseInt(input.nextLine());
		System.out.println("El numero ingresado es " + numero);
		if(numero>=10 || numero<=-10) {
			esDeUnSoloDigito = false;
			System.out.println("El numero no es de un solo digito");
		}else {
			esDeUnSoloDigito = true;
			contador++;
			System.out.println("El numero es de un solo digito");
		}
		if(numero%2==0) {
			esImpar = false;
			System.out.println("El numero no es impar");
		}else {
			esImpar = true;
			contador++;
			System.out.println("El numero es impar");
		}
		if(contador==0) {
			noEstaEnNinguno = true;
			estaEnAmbos = false;
			System.out.println("El numero no esta en ningun grupo");
		}
		if(contador==2) {
			noEstaEnNinguno = false;
			estaEnAmbos = true;
			System.out.println("El numero esta en ambos grupos");
		}
	}

}
