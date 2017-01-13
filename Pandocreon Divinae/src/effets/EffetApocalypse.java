/**
 * 
 */
package effets;

import java.util.ArrayList;

import cartes.cartes_apocalypse.CarteApocalypse;
import partie.Partie;
import joueur.Joueur;

/**
 * @author Lallement
 * Cette classe 
 */
public class EffetApocalypse extends Effet {
	
	/* ------------ Attributs ------------ */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut prive
	 */
	public EffetApocalypse() {}
	
	/* -------- Getters & Setters -------- */
	
	/* -------- Methodes de classe ------- */
	/**
	 * Methode permettant d'appliquer l'effet souhaite
	 * @param {CartesActionEffet} carte : carte apocalypse utilisee
	 */
	public void appliquerEffet(CarteApocalypse carte) {
		boolean egalite = false;
		Joueur elimine = carte.getJoueur().getPartie().getParticipants().get(0);
		Joueur gagnant = carte.getJoueur().getPartie().getParticipants().get(0);
		for (int i = 0; i < carte.getJoueur().getPartie().getParticipants().size(); i++) {
			if (carte.getJoueur().getPartie().getParticipants().get(i).getPrieres() <  elimine.getPrieres()) {
				elimine = carte.getJoueur().getPartie().getParticipants().get(i);
			} else if (carte.getJoueur().getPartie().getParticipants().get(i).getPrieres() >  elimine.getPrieres()) {
				gagnant = carte.getJoueur().getPartie().getParticipants().get(i);
			}
			egalite = (carte.getJoueur().getPartie().getParticipants().get(i).getPrieres() == elimine.getPrieres()) ? true : false;
		}	
		
		if (!egalite) {
			if (carte.getJoueur().getPartie().getParticipants().size() >= 4) {
				carte.getJoueur().getPartie().getParticipants().remove(elimine);
				carte.getJoueur().getPartie().setDernierJoueurApo(carte.getJoueur());
				carte.getJoueur().getPartie().setDernierTourApo(carte.getJoueur().getPartie().getTourAnt(0));
				System.out.println("Le joueur " + elimine.toString() + " est elimine!");
			} else {
				carte.getJoueur().getPartie().setGagnant(gagnant);
				System.out.println("Le joueur " + gagnant.toString() + " remporte la partie!");
			}
		} else {
			System.out.println("Il y a une egalite, aucun effet!");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
