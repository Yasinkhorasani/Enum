package de.atsa.alt;

public class AltesTeleskop {

	public static void main(String[] args) {
	     // Wunsch: masse der erde ausgeben
		System.out.println("Der Planet" + Sonnensystem.ERDE + "hat masse von" + Sonnensystem.ERDE.getMasse() + "kg");
		
		// Alle planete
		for(int i = 0 ; i< Sonnensystem.UNSER_SONNENSYSTEM.length; i++) {
			
			System.out.println("der planet" + Sonnensystem.UNSER_SONNENSYSTEM[i] + " hat eine " +
			Sonnensystem.UNSER_SONNENSYSTEM[i].getRadius() + "m");
		}
		
		// wie heißen die Nachbarplaneten von SATORN
		//1.Schritt: index von Satorn
		  //1a. Schleife über das gesamte von Array 
		  //1b. Wenn Saturn gefunden ist:index zurück geben: Sonnensystem.UNSERE....[i]= Sonnensystem.Saturn
		//2. Schritt: index - 1(prüfung ob >0), index + 1 (prüfung <sonnensystem.unserensonnensystem.length): planetem an diesem Stellen ausgeben.
		
		int saturnindex = -1;// sonst bekommen wir vielleicht "0".
		for (int i = 0; i < Sonnensystem.UNSER_SONNENSYSTEM.length; i++) {
			if (Sonnensystem.UNSER_SONNENSYSTEM[i]== Sonnensystem.SATURN) {
				saturnindex = i;
				break ;
			}
		}
		if(saturnindex > 0){
			System.out.println("Nachbar näher zu Sonne ist"+ Sonnensystem.UNSER_SONNENSYSTEM[saturnindex -1]);
		}if(saturnindex < Sonnensystem.UNSER_SONNENSYSTEM.length -1){
			System.out.println("Nachbar weiter entfern ist"+ Sonnensystem.UNSER_SONNENSYSTEM[saturnindex +1]);
		}
	
	
	}
}
