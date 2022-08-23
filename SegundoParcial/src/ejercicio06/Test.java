package ejercicio06;

public class Test {

	public static void main(String[] args) {
		int acumulador = 0;
		double promedio = 0;
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		for(int i=1;i<=100;i++) {
			dado1.tirarDado();
			dado2.tirarDado();
			int valor1 = dado1.getValor();
			int valor2 = dado2.getValor();
			if(valor1 == valor2) {
				System.out.println("El valor es el mismo en ambos dados y es " + valor1);
			}else {
				if(valor1 > valor2) {
					System.out.println("El valor mayor fue el " + valor1);
				}else {
					System.out.println("El valor mayor fue el " + valor2);
				}
			}
			acumulador += valor1 + valor2;
		}
		promedio = (double) acumulador / 200;
		System.out.println("El promedio fue " + promedio);
	}

}
