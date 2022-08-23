package ejercicio13;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	public SuperHeroe(String nombre,int fuerza,int resistencia,int superpoderes) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.superpoderes = superpoderes;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFuerza(int fuerza) {
		if(fuerza > 100) {
			this.fuerza = 100;			
		}else if(fuerza < 0){
			this.fuerza = 0;
		}else {
			this.fuerza = fuerza;
		}
		
	}
	public void setResistencia(int resistencia) {
		if(resistencia > 100) {
			this.resistencia = 100;			
		}else if(resistencia < 0){
			this.resistencia = 0;
		}else {
			this.resistencia = resistencia;
		}
	}
	public void setSuperpoderes(int superpoderes) {
		if(superpoderes > 100) {
			this.superpoderes = 100;			
		}else if(superpoderes < 0){
			this.superpoderes = 0;
		}else {
			this.superpoderes = superpoderes;
		}
	}
	public void competir(SuperHeroe heroe) {
		int contador1 = 0;
		int contador2 = 0;
		
		if(this.fuerza > heroe.fuerza) {
			contador1++;
		}else if(this.fuerza != heroe.fuerza){
			contador2++;
		}
		if(this.resistencia > heroe.resistencia) {
			contador1++;
		}else if(this.resistencia != heroe.resistencia){
			contador2++;
		}
		if(this.superpoderes > heroe.superpoderes) {
			contador1++;
		}else if(this.superpoderes != heroe.superpoderes){
			contador2++;
		}
		if(contador1 > contador2) {
			System.out.println(Resultado.TRIUNFO);
		}else if(contador1 < contador2){
			System.out.println(Resultado.DERROTA);
		}else {
			System.out.println(Resultado.EMPATE);
		}
	}
	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	

}
