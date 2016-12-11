package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteClerc decrit le comportement general de la carte Clerc
 */

public class CarteClerc extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine a attribuer à la carte
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteClerc(Origine origine, Dogme[] dogmes) {
		super(origine, dogmes, 2, "Clerc");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant à la carte
	}
	
	/**
	 * Methode retournant toutes les cartes clercs
	 * @return {ArrayList<CarteClerc>} divinites : retourne un ArrayList contenant tous les clercs
	 */
	public static ArrayList<CarteClerc> getAllClercs() {
		ArrayList<CarteClerc> clercs = new ArrayList<CarteClerc>();
		clercs.add(new CarteClerc(Origine.JOUR, new Dogme[] {Dogme.HUMAIN, Dogme.CHAOS}));
		clercs.add(new CarteClerc(Origine.NUIT, new Dogme[] {Dogme.NATURE, Dogme.SYMBOLES}));
		clercs.add(new CarteClerc(Origine.NEANT, new Dogme[] {Dogme.NATURE, Dogme.MYSTIQUES}));
		clercs.add(new CarteClerc(Origine.JOUR, new Dogme[] {Dogme.NATURE, Dogme.CHAOS}));
		clercs.add(new CarteClerc(Origine.NUIT, new Dogme[] {Dogme.MYSTIQUES, Dogme.SYMBOLES}));
		clercs.add(new CarteClerc(Origine.NEANT, new Dogme[] {Dogme.SYMBOLES, Dogme.CHAOS}));
		clercs.add(new CarteClerc(Origine.JOUR, new Dogme[] {Dogme.MYSTIQUES, Dogme.CHAOS}));
		clercs.add(new CarteClerc(Origine.NUIT, new Dogme[] {Dogme.NATURE, Dogme.HUMAIN}));
		return clercs;
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
