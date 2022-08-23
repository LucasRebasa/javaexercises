package thp.autobus;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Asiento> asientos = new ArrayList<>();
		ArrayList<Asiento> asientos2 = new ArrayList<>();
		asientos.add(new Asiento(Estado.SANO));
		asientos.add(new Asiento(Estado.SANO));
		asientos.add(new Asiento(Estado.SANO));
		asientos.add(new Asiento(Estado.DESCARTABLE));
		asientos.add(new Asiento(Estado.SANO));
		asientos.add(new Asiento(Estado.REPARABLE));
		asientos.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		asientos2.add(new Asiento(Estado.SANO));
		Autobus autobus1 = new Autobus("BMX345", 10, asientos);
		Autobus autobus2 = new Autobus("ABC123", 10, asientos2);
		Reparadora reparadora = new Reparadora();
		reparadora.agregarAutobusRoto(autobus2);
		
		ArrayList<Asiento> quitados = reparadora.completarAutobus(autobus1);	
		System.out.println("Cant de asientos quitados al reparar: " + quitados.size());

		
		
	}

}
