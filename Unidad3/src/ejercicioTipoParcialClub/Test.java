package ejercicioTipoParcialClub;

public class Test {

	public static void main(String[] args) {
		Club club = new Club();
		System.out.println(club.agregarSocio("Lucas", 20));
		System.out.println(club.agregarSocio("Lucas", 20));
		System.out.println(club.agregarSocio("", 20));
		System.out.println(club.agregarSocio("Ana", 17));
		System.out.println(club.agregarSocio("Pablo", 38));
		System.out.println(club.agregarSocio("Joaquin", 26));
		System.out.println(club.agregarSocio("Martin", 30));
		System.out.println(club.establecerAmistad("Lucas", "Ana"));
		System.out.println(club.establecerAmistad("Lucas", "Ana"));
		System.out.println(club.establecerAmistad("Lucas", "Martin"));
		System.out.println(club.establecerAmistad("Lucas", "Pablo"));
		System.out.println(club.establecerAmistad("Lucas", "Joaquin"));
		System.out.println(club.deshacerAmistad("Lucas", "Ana"));
		System.out.println(club.deshacerAmistad("Lucas", "Ana"));
		System.out.println("Amigos de Lucas " + club.obtenerNombreYEdadAmigos("Lucas"));
		club.generarListado();
	}

}
