package de.atsa.alt;

/**
 * 
 * unsere sonnessystem mit dem planeten Atribute des final=> nach der erste
 * zuweisung keine Enderung Sonensystem static : Klassenatribut
 * 
 * @author Alfa
 * @param <planet>
 *
 */
public class Sonnensystem {
	public static final Planet ERDE = new Planet(" Erde", 5.976e24, 6.37814e6);
	public static final Planet MERKUR = new Planet("Merkur", 5.976e24, 6.37814e6);
	public static final Planet VENUS = new Planet(" VENUS", 5.976e24, 6.37814e6);
	public static final Planet JUPITER = new Planet("JUPITER", 5.976e24, 6.37814e6);
	public static final Planet SATURN = new Planet(" SATURN", 5.976e24, 6.37814e6);
	public static final Planet HURANUS = new Planet("HURANUS", 5.976e24, 6.37814e6);
	
	public static final Planet[] UNSER_SONNENSYSTEM = {MERKUR,VENUS,ERDE,JUPITER,SATURN,HURANUS };
	
}
