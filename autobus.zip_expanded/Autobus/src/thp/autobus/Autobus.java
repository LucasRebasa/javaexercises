package thp.autobus;

import java.util.ArrayList;

public class Autobus {
	private String patente;
	private int cantAsientosFabrica;
	private ArrayList<Asiento> asientos;
	
	public Autobus(String patente, int cantidad, ArrayList<Asiento> asientos) {
		this.patente = patente;
		this.cantAsientosFabrica = cantidad;
		this.asientos = asientos;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public int getCantFaltante() {
		return cantAsientosFabrica - asientos.size();
	}
	
	public ArrayList<Asiento> quitarAsientosRotos() {
		ArrayList<Asiento> quitados = new ArrayList<>();
		int indice = 0;
		while (indice < asientos.size()) {
			Asiento asiento = asientos.get(indice);
			Estado estado = asiento.getEstado();
			if (estado == Estado.DESCARTABLE || estado == Estado.REPARABLE) {
				asientos.remove(indice);
				quitados.add(asiento);
			}
			else {
				indice++;
			}
		}
		return quitados;
	}
	public int quitarAsientosSanos() {
		int contador = 0;
		int i = 0;
		int limite = asientos.size();
		while(!asientos.isEmpty() && i < limite) {
			Asiento aux = asientos.get(i);
			if(aux.getEstado().equals(Estado.SANO)) {
				asientos.remove(aux);
				contador++;
			}else {
				i++;
			}
		}
		return contador;
	}
	public boolean estaCompleto() {
		boolean completo = false;
		if (getCantFaltante() == 0) {
			int i = 0;
			int limite = asientos.size();
			while(i < limite && !completo) {
				Estado estado = asientos.get(i).getEstado();
				if(estado == Estado.DESCARTABLE || estado == Estado.REPARABLE) {
					completo = true;
				}else {
					i++;
				}
			}

		}
		return completo;
	}
	public boolean tieneAsientosSanos() {
		boolean tieneSanos = false;
		int i = 0;
		int limite = asientos.size();
		while(i < limite && !tieneSanos) {
			Estado estado = asientos.get(i).getEstado();
			if(estado == Estado.SANO) {
				tieneSanos = true;
			}else {
				i++;
			}
		}
		return tieneSanos;
	}
	public void agregarAsientos(int cantidad) {
		for(int i=1;i<=cantidad;i++) {
			asientos.add(new Asiento(Estado.SANO));
		}
	}
}
