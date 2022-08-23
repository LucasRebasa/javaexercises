package ejercicio04;

public class Test {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.ponerNombre("Fulano");
		p.ponerApellido("Gomez");
		System.out.println(p.obtenerNombreCompleto());
		
		Persona p1 = new Persona();
		p1.ponerNombre("Lucas");
		p1.ponerApellido("Rebasa");
		System.out.println(p1.obtenerNombreCompleto());
		
	}

}
