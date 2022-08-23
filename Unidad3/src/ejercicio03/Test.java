package ejercicio03;

public class Test {

	public static void main(String[] args) {
		Inmobiliaria remax = new Inmobiliaria("ReMax");
		remax.agregarPropiedad("Almagro", "Portela 693", Tipo.CASA, 500);
		remax.agregarPropiedad("Flores", "Corrientes 123", Tipo.DEPARTAMENTO, 56800);
		remax.agregarPropiedad("Almagro", "Pringles 769", Tipo.CASA, 500);
		remax.agregarPropiedad("Almagro", "Rivadavia 7680", Tipo.CASA, 500);
		remax.mostrarPropiedades();
		remax.mostrarBarrioMaxProp();
		remax.cambiarPropiedadDeBarrio("Rivadavia 7680", new Barrio("Recoleta"));
		remax.mostrarPropiedades();
	}

}
