package de.atsa.neu;

//ENUM
import java.util.Scanner;

public class NeuesTeleskop {

	public static void main(String[] args) {
		System.out.println("der planet " + PlanetImSonnensystem.ERDE + " hat eine oberflächekraft von " + PlanetImSonnensystem.ERDE.brechnenOberflaechen(1));
		System.out.println(PlanetImSonnensystem.SATURN);// ruft println toStrin-methode
		 
		PlanetImSonnensystem[] diePlaneten = PlanetImSonnensystem.values();
		//Liest die Enum-Elemente des Arrays
		for( PlanetImSonnensystem planet: diePlaneten) {
			System.out.println(" der Planet " + planet + " ist immer eine Reise wert");
		}
		// Frage nach der Nachbarplanete
		System.out.println(" Welche planet intressiert dich");
		Scanner leser = new Scanner(System.in);
		String wunschplanerName = leser.nextLine().toUpperCase();
		PlanetImSonnensystem wunschplanet = PlanetImSonnensystem.valueOf( wunschplanerName);
		System.out.println("Du willst mehr wissen" + wunschplanet);
		
		int indexWuschPlanet = wunschplanet.ordinal();
		System.out.println("der planet " + wunschplanet + "hat den index" + indexWuschPlanet);
		
		switch(wunschplanet) {
		case MERKUR:
			System.out.println(" da ist sehr heiß");
			break;
		case JUPITER:
			System.out.println(" da ist seh kalt");
			break;
			default:
				System.out.println(" der planet" + wunschplanet + " ist ein planet");
				break;
		}
	}

}
