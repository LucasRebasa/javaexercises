package actividad3;

import java.util.Scanner;

public class Ejercicio30 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final char SUMA = '+';
		final char RESTA = '-';
		final char PRODUCTO = '*';
		final char DIVISION = '/';
		final char FIN = 'F';
		int num1,num2;
		char operacion;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese una operacion");
		operacion = input.nextLine().charAt(0);
		
		while(operacion != FIN) {
			switch(operacion) {
			case SUMA:
				System.out.println(num1+num2);
				break;
			case RESTA:
				System.out.println(num1-num2);
				break;
			case PRODUCTO:
				System.out.println(num1*num2);
				break;
			case DIVISION:
				if(num2 !=0) {
					System.out.println((num1+0.0)/num2);
				}else {
					System.out.println("No se puede dividir por 0.");
				}
				break;
			default:
				System.out.println("ERROR");
			}
			System.out.println("Ingrese un numero");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese otro numero");
			num2 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese una operacion");
			operacion = input.nextLine().charAt(0);	
	    }
		System.out.println("No se realizan mas operaciones.");
	}
}
