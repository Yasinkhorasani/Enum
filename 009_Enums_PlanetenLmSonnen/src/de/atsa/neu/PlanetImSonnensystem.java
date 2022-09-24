package de.atsa.neu;

/**
 * ENUM erstellt wie eine Klasse einen Refrenztyp zur Verfugung
 * Enthält alle Objecte des typ des Enums
 * @author Alfa
 *
 */
public enum PlanetImSonnensystem {
	MERKUR(5.976e24, 6.37814e6),
	VENUS(5.976e24, 6.37814e6),
	SATURN(5.976e24, 6.37814e6),
	ERDE(5.976e24, 6.37814e6),
	JUPITER(5.976e24, 6.37814e6),
	HURANUS(5.976e24, 6.37814e6);
	
	//ENUM erzeugt : public stetic, final PlanetImSonnensystem MERKUR = new PlanetImSonnensystem
	//enum erzeugt : public stetic, final PlanetImSonnensystem VENUS = new PlanetImSonnensystem
	//enum erzeugt : public stetic, final PlanetImSonnensystem JUPITER = new PlanetImSonnensystem
	//enum erzeugt  :public stetic, final PlanetImSonnensystem VENUS = new PlanetImSonnensystem
	//enum erzeugt : public stetic, final PlanetImSonnensystem VENUS = new PlanetImSonnensystem
	//enum erzeugt : public stetic, final PlanetImSonnensystem []...= UNSER_SONNENSYSTEM = {MERKUR,VENUS,ERDE,JUPITER,SATURN,HURANUS }
	
	private final double masse;
	private final  double radius;
	
	public static final double G = 6.67300E-11;
	/**
	 * jeder konstruktor in enom ist private
	 * @param masse
	 * @param radius
	 */
	private PlanetImSonnensystem ( double masse , double radius) {
		this.masse = masse;
		this.radius = radius;
	}
	
	// methoden des objecte dieses typs
	public double brechnenGravigationfel() {
		return G * masse/(radius * radius);
	}
	public double brechnenOberflaechen(double kilos) {
		return kilos * brechnenGravigationfel();
	}
	// enum erzeugt : toString mit Rückgabe des variable-bezeichnes
}
