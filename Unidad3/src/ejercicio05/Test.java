package ejercicio05;

public class Test {

	public static void main(String[] args) {
		Biblioteca nacional = new Biblioteca();
		Fecha fechaNacimiento = new Fecha(12, 6, 1987);
		Fecha fechaHoy = new Fecha(20,5,2022);
		Fecha fechaManana = new Fecha(27,5,2022);
		Lector lector1 = new Lector("44554081", "Lucas", "Corrientes 564", "115549873");
		Autor jk = new Autor("J.K Rowling", "Inglaterra", fechaNacimiento);
		Editorial planeta = new Editorial("Planeta","USA");
		Libro harryPotter = new Libro("Harry Potter", Genero.NOVELA, planeta, 2006, jk);
		harryPotter.agregarEjemplares(45, null, Estado.BIBLIOTECA);
		harryPotter.agregarEjemplares(54, null, Estado.BIBLIOTECA);
		harryPotter.agregarEjemplares(48, null, Estado.BIBLIOTECA);
		harryPotter.agregarEjemplares(48, null, Estado.BIBLIOTECA);
		Resultado resultado = nacional.prestar(harryPotter, lector1, fechaHoy);
		Resultado resultado1 = nacional.prestar(harryPotter, lector1, fechaHoy);
		Resultado resultado2 = nacional.prestar(harryPotter, lector1, fechaManana);
		Resultado resultado3 = nacional.prestar(harryPotter, lector1, fechaManana);
		System.out.println(resultado);
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
	}

}
