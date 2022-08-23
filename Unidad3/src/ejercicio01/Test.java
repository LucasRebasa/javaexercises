package ejercicio01;

public class Test {

	public static void main(String[] args) {
		Domicilio domicilio = new Domicilio("Corrientes", 456, "Almagro");
		Domicilio domicilio2 = new Domicilio("Pringles", 769, "Almagro");
		Agenda agenda = new Agenda();
		System.out.println("Personas creadas");
		agenda.agregarPersona("Lucas", "Rebasa", 44554081, domicilio);
		agenda.agregarPersona("Juan", "Perez", 44954081, domicilio);
		agenda.agregarPersona("Pepe", "Lopez", 20954081, domicilio2);
		agenda.agregarPersona("Juan", "Rebasa", 44587081, domicilio);
		agenda.listarPersonas();
		System.out.println();
		System.out.println("Domicilio modificado");
		agenda.modificarDomicilio(44554081, domicilio2);
		agenda.listarPersonas();
		System.out.println();
		System.out.println("Persona removida");
		Persona personaRemovida = agenda.removerPersona(44954081);
		System.out.println("La persona removida fue " + personaRemovida);
		agenda.listarPersonas();
		System.out.println();
		System.out.println(agenda.devolverUltimo());
		System.out.println();
		System.out.println("Coleccion vacia");
		agenda.eliminarTodosElementos();
		agenda.listarPersonas();
	}

}
