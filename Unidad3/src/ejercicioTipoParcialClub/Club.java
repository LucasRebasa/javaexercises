package ejercicioTipoParcialClub;

import java.util.ArrayList;

public class Club {
	private ArrayList<Socio> socios;
	public Club() {
		socios = new ArrayList<>();
	}
	public Socio buscarSocio(String nombre) {
		int i = 0;
		int limite = socios.size();
		Socio buscado = null;
		while(i < limite && buscado == null) {
			Socio aux = socios.get(i);
			if(aux.getNombre().equals(nombre)) {
				buscado = aux;
			}else {
				i++;
			}
		}
		return buscado;
	}
	public Resultado agregarSocio(String nombre, int edad) {
		Resultado resultado;
		if(buscarSocio(nombre) == null) {
			if(!nombre.isEmpty() && (edad > 0 && edad < 120)) {
				socios.add(new Socio(nombre, edad));
				resultado = Resultado.OK;
			}else {
				resultado = Resultado.DATOS_INCORRECTOS;
			}
		}else {
			resultado = Resultado.YA_EXISTE;
		}
		return resultado;
	}
	public Resultado establecerAmistad(String nombre1, String nombre2) {
		Socio socio1 = buscarSocio(nombre1);
		Socio socio2 = buscarSocio(nombre2);
		Resultado resultado;
		if(socio1 != null && socio2 !=null) {
			if(!socio1.getNombre().equals(socio2.getNombre())) {
				if(socio1.sonAmigos(nombre2) == null && socio2.sonAmigos(nombre1) == null) {
					socio1.agregarAmigo(new NombreYEdad(socio2.getNombre(), socio2.getEdad()));
					socio2.agregarAmigo(new NombreYEdad(socio1.getNombre(), socio1.getEdad()));
					resultado = Resultado.OK;
				}else {
					resultado = Resultado.YA_SON_AMIGOS;
				}
			}else {
				resultado = Resultado.NOMBRES_IGUALES;
			}
		}else {
			resultado = Resultado.NO_EXISTE;	
		}
		return resultado;
	}
	public Resultado deshacerAmistad(String nombre1, String nombre2) {
		Socio socio1 = buscarSocio(nombre1);
		Socio socio2 = buscarSocio(nombre2);
		NombreYEdad amigosSocio1 = socio1.sonAmigos(nombre2);
		NombreYEdad amigosSocio2 = socio2.sonAmigos(nombre1);
		Resultado resultado;
		if(socio1 != null && socio2 !=null) {
			if(amigosSocio1 != null && amigosSocio2 != null) {
				socio1.eliminarAmigo(socio2.getNombre());
				socio2.eliminarAmigo(socio1.getNombre());
				resultado = Resultado.OK;
			}else {
				resultado = Resultado.NO_SON_AMIGOS;
			}
		}else {
			resultado = Resultado.NO_EXISTE;
		}
		return resultado;
	}
	public ArrayList<NombreYEdad> obtenerNombreYEdadAmigos(String nombre) {
		ArrayList<NombreYEdad> lista = null;
		Socio socio = buscarSocio(nombre);
		if(socio != null) {
			lista = socio.obtenerNombreYEdadAmigos();
		}
		return lista;
	}
	public void generarListado() {
		for (Socio socio : socios) {
			double promedio = socio.calcularPromedioEdades();
			if(promedio > 0) {
				System.out.println(socio.getNombre() + " - " + promedio);				
			}else {
				System.out.println(socio.getNombre() + " - no tiene amigos");
			}
		}			
	}
	
}
