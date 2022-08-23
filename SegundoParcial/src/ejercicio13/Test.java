package ejercicio13;

public class Test {

	public static void main(String[] args) {
		SuperHeroe heroe1 = new SuperHeroe("Batman",90,70,0);
		SuperHeroe heroe2 = new SuperHeroe("Superman",95,60,70);
		
		heroe1.competir(heroe2);
		heroe2.competir(heroe1);
		heroe1.competir(heroe2);

	}

}
