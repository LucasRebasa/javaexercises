package ejercicio09;

public class Domicilio {
	private String calle;
	private int altura;
	private String barrio;
	public Domicilio(String calle,int altura,String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}
	
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + "]";
	}
	

}
