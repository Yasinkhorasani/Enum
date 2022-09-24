package de.atsa.alt;

/**
 * Erklärungshilfe für Enums (enum-Schlüsselwort)
 * 
 * Ein Objekt dieser Klasse (Blick aus dem Fenster) Die Erde heisst Erde hat ein
 * Masse von 5.976*10^24 kg und einen Durchmesser von 6.37814 * 10^6 m.
 * 
 * Hier: nur Value-Klasse(Zwischenschritt: Methoden kommen später...)
 * 
 * @author Alfa
 *
 */
public class Planet {
	/** Enthält den Namen des Planeten, wird in der toString-Methode ausgegeben */
	private String name;

	/** Enthält die Masse des Planeten im kg */
	private double masse;

	/** Enthält den Radius des Planeten in m */
	private double radius;

	/**
	 * @param name
	 * @param masse
	 * @param radius
	 */
	public Planet(String name, double masse, double radius) {
		this.name = name;
		this.masse = masse;
		this.radius = radius;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the masse
	 */
	public double getMasse() {
		return masse;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return name;
	
	} 
	
}