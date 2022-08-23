package ejercicio05;

public class Test {

	public static void main(String[] args) {
		Persona p = new Persona();
		Persona p1 = new Persona();
		p.setNombre("Fulano");
		p.setApellido("Gomez");
		p1.setNombre("Lucas");
		p1.setApellido("Rebasa");
		System.out.println(p.getNombreCompleto());
		Domicilio domicilioFulano = new Domicilio("Corrientes",299);
		p.setDomicilio(domicilioFulano);
		p.mostrarDomicilio();
		p1.setDomicilio(domicilioFulano);
		p1.mostrarDomicilio();
		domicilioFulano.setAltura(545);
		domicilioFulano.setCalle("Yatay");
		p.mostrarDomicilio();
		p1.mostrarDomicilio();
		//Cambian ambos domicilios ya que apuntan a la misma direccion de memoria dond estan guardados los datos de la calle y la altura.
	}

}
