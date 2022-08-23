package ejercicio05;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public int cantDias() {
		int cantDias = this.dia;
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			cantDias += 31;
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			cantDias += 30;
		}else {
			cantDias += 28;
		}
		return cantDias;
	}
	public int diferenciaDias(Fecha fechaPrestado) {
		int diferenciaDias;
		if(this.anio == fechaPrestado.anio) {
			diferenciaDias =  cantDias() - fechaPrestado.cantDias();
		}else if(this.anio > fechaPrestado.anio) {
			diferenciaDias = 365 - fechaPrestado.cantDias() + cantDias();
		}else {
			diferenciaDias = -1;
		}
		return diferenciaDias;
	}
	
}
