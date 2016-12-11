/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteSorcier decrit le comportement de la carte Sorcier
 */
public class CarteSorcier extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteSorcier() {
		super("Sorcier");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteSorcier(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 3, "Sorcier");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privee, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteSorcierHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteSorcier instance = new CarteSorcier(new Dogme[]{Dogme.MYSTIQUES, Dogme.SYMBOLES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteSorcier
	 * @return {CarteSorcier} instance : retourtne l'instance de la classe CarteSorcier
	 */
	public final static CarteSorcier getInstance() {
		return CarteSorcierHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant � la classe.
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
