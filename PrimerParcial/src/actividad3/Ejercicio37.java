package actividad3;
import java.util.Scanner;

public class Ejercicio37 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int salarioMensual;
		int salarioTotal = 0;
		int contador = 0;
		double promedio;
		for(int i=1;i<=12;i++) {
			System.out.println("Ingrese su salario:");
			salarioMensual = Integer.parseInt(input.nextLine());
			if(salarioMensual>=0) {
				contador++;
				salarioTotal += salarioMensual;
			}else {
				i = 13;
			}
		}
		promedio = (double) salarioTotal / contador;
		System.out.println("El promedio es " + promedio);
	}

}
