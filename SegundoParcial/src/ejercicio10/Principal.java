package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Lucas","Rebasa");
		Robot r = new Robot("Marcos");
		r.saludar();
		r.saludar(p);
	}

}
