package ejercicio05;

public class Domicilio {
	private String calle;
	private int altura;
	public Domicilio(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return calle + " " + altura;
	}
	
}
