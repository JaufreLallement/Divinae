/**
 * 
 */
package effets;

import java.util.Arrays;

import joueur.Joueur;
import de.De;
import dogme.Dogme;

/**
 * @author Lallement
 *
 */
public class EffetRelancerDe {
	
	/* ------------ Attributs ------------ */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut
	 */
	public EffetRelancerDe() {}
	
	/* -------- Getters & Setters -------- */
	
	/* -------- Methodes de classe ------- */
	/**
	 * Methode permettant d'appliquer l'effet souhaite
	 */
	public void appliquerEffet(Joueur j) {
		De.getInstance().lancerDe(j);
	}	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
