package thp.autobus;

import java.util.ArrayList;

public class Reparadora {
	private ArrayList<Autobus> sanos; // autobuses a la venta
	private ArrayList<Autobus> rotos; // para canibalizar
	
	public Reparadora() {
		sanos = new ArrayList<>();
		rotos = new ArrayList<>();
	}
	
	public ArrayList<Asiento> completarAutobus(Autobus autobus) {
		ArrayList<Asiento> quitados = autobus.quitarAsientosRotos();
		int asientosParaAgregar = autobus.getCantFaltante();
		Autobus autobusSacar = this.buscarAutobusConAsientos();
		if(autobusSacar != null) {
			int asientosDisponibles = autobusSacar.quitarAsientosSanos();
			if(asientosParaAgregar < asientosDisponibles) {
				autobus.agregarAsientos(asientosParaAgregar);
				autobusSacar.agregarAsientos(asientosDisponibles - asientosParaAgregar);
			}else {
				autobus.agregarAsientos(asientosDisponibles);
			}
		}
		if (autobus.estaCompleto()) {
			sanos.add(autobus);
		}
		else {
			rotos.add(autobus);
		}
		return quitados;
	}
	private Autobus buscarAutobusConAsientos() {
		int i = 0;
		int limite = rotos.size();		
		Autobus buscado = null;
		while(i < limite && buscado == null) {
			Autobus aux = rotos.get(i);
			if(aux.tieneAsientosSanos()) {
				buscado = aux;
			}else {
				i++;
			}
		}
		return buscado;
	}
	private ArrayList<PatenteFaltante> obtenerInforme() {
		ArrayList<PatenteFaltante> lista = new ArrayList<>();
		for (Autobus a: rotos) {
			lista.add(new PatenteFaltante(a.getPatente(), a.getCantFaltante()));
		}
		return lista;
	}
	public void agregarAutobusRoto(Autobus autobus) {
		rotos.add(autobus);
	}
	public void mostrarInforme() {
		for (PatenteFaltante a: obtenerInforme()) {
			System.out.println(a.getPatente() + "   " + a.getCantFaltante());
		}
	}
	
}
