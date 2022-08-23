package thp.autobus;

public class PatenteFaltante {
	private String patente;
	private int cantFaltante;
	
	public PatenteFaltante(String patente, int cantFaltante) {
		this.patente = patente;
		this.cantFaltante = cantFaltante;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public int getCantFaltante() {
		return cantFaltante;
	}
	
	@Override
	public String toString() {
		return "PatenteFaltante [patente=" + patente + ", cantFaltante=" + cantFaltante + "]";
	}	
}
