/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteTyran decrit le comportement de la carte Tyran
 */
public class CarteTyran extends CarteGuideSpirituel implements Effet {
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private CarteTyran() {
		super("Tyran");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteTyran(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 3, "Tyran");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privee, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteTyranHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteTyran instance = new CarteTyran(new Dogme[]{Dogme.SYMBOLES, Dogme.CHAOS});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe CarteTyran
	 * @return {CarteTyran} instance : retourtne l'instance de la classe CarteTyran
	 */
	public final static CarteTyran getInstance() {
		return CarteTyranHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant à la classe.
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
