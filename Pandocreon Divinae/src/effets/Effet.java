/**
 * 
 */
package effets;

/**
 * @author Lallement
 * 
 */
public class Effet implements ApplicationEffet {
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut
	 */
	public Effet() {}
	
	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Methodes ---------- */
	
	/**
	 * M�thode permettant � une carte d'activer son effet sp�cial
	 */
	public void appliquerEffet() {
		System.out.println("L'effet est applique!");
	}
}
