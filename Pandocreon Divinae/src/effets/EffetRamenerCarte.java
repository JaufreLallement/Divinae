/**
 * 
 */
package effets;

import java.util.ArrayList;

import joueur.Joueur;
import cartes.Carte;

/**
 * @author Lallement
 *
 */
public class EffetRamenerCarte extends Effet {
	
	/* ------------ Attributs ------------ */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 */
	public EffetRamenerCarte() {
		// TODO Auto-generated constructor stub
	}
	
	/* -------- Getters & Setters -------- */
	
	/* -------- Methodes de classe ------- */
	/**
	 * Methode permettant d'appliquer l'effet souhaite
	 */
	public void appliquerEffet(Joueur joueur) {
		int i = 0;
		boolean found = false;
		while(i < joueur.getPartie().getCimetiere().size() && found) {
			if (joueur.getPartie().getCimetiere().get(i).getJoueur() == joueur) {
				joueur.getJeu().add(joueur.getPartie().getCimetiere().get(i));
				joueur.getPartie().getCimetiere().remove(joueur.getPartie().getCimetiere().get(i));
				found = true;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
