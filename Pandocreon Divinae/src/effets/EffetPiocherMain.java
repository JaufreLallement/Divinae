/**
 * 
 */
package effets;

import cartes.Carte;
import cartes.divinites.Divinite;

/**
 * @author Lallement
 *
 */
public class EffetPiocherMain extends Effet {
	
	/* ------------ Attributs ------------ */
	/**
	 * Nombre de carte
	 */
	private int nombreDeCartes = 2;
	/* ---------- Constructeurs ---------- */
	private EffetPiocherMain() {}
	
	
	/**
	 * Constructeur avec un argument
	 * @param {int} pioche : nombre de carte a piocher
	 */
	public EffetPiocherMain(int pioche) {
		this.nombreDeCartes = pioche;
	}
	/* -------- Getters & Setters -------- */
	/**
	 * Accesseur pour l'attribut nombreDeCartes
	 * @return {int} nombreDeCartes : nombre de carte que l'effet fera piocher
	 */
	public int getNombreDeCartes() {
		return this.nombreDeCartes;
	}

	/**
	 * Modificateur pour l'attribut nombreDeCartes
	 * @param {int} nombreDeCartes : nombre de cartes a piocher
	 */
	public void setNombreDeCartes(int nombreDeCartes) {
		this.nombreDeCartes = nombreDeCartes;
	}
	
	/* -------- Methodes de classe ------- */
	/**
	 * Methode permettant d'appliquer l'effet souhaite
	 * @param {Carte} carte : carte 
	 */
	public void appliquerEffet(Carte carte, Divinite d) {
		for (int i = 0; i <= this.nombreDeCartes; i++) {
			carte.getJoueur().getJeu().add(d.getJoueur().getRandomCarte());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
