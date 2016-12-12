/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;

/**
 * @author Lallement
 * La classe CarteMoine décrit le comportement général des cartes Moine
 */
public class CarteMoine extends CarteCroyant {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteMoine(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 2, "Moine");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		this.getJoueur().setPointsActionJour(this.getJoueur().getPointsActionJour() + 1);
	}
	
	/**
	 * Methode retournant toutes les cartes moines
	 * @return {ArrayList<CarteMoine>} divinites : retourne un ArrayList contenant tous les moines
	 */
	public static ArrayList<CarteMoine> getAllMoines() {
		ArrayList<CarteMoine> moines = new ArrayList<CarteMoine>();
		moines.add(new CarteMoine(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}));
		moines.add(new CarteMoine(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		return moines;
	}

	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
