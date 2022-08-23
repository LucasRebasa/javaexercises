package actividad3;
import java.util.Scanner;

public class Ejercicio38 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final String user = "usuario";
		final String password = "123456";
		String userIngresado;
		String passwordIngresada;
		boolean ingreso = false;
		
		for(int i=1;i<=3;i++) {
			System.out.println("Ingrese su nombre de usuario");
			userIngresado = input.nextLine();
			System.out.println("Ingrese su contraseña");
			passwordIngresada = input.nextLine();
			if(userIngresado.equals(user) && passwordIngresada.equals(password)) {
				ingreso = true;
				i = 4;
			}else if(i==3){
				ingreso = false;
			}else {
				System.out.println("Ingrese los datos nuevamente");
			}
		}
		if(ingreso) {
			System.out.println("Ingreso aceptado");
		}else {
			System.out.println("Ingreso denegado");
		}
		
		
	}

}
