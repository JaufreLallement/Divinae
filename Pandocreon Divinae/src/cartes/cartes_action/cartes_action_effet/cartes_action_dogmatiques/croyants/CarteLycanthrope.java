package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteLycanthrope decrit le comportement general de la carte Lycanthropes
 */
public class CarteLycanthrope extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteLycanthrope() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private CarteLycanthrope(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 4);
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteLycanthropeHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteLycanthrope instance = new CarteLycanthrope(new Dogme[]{Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteLycanthrope
	 * @return {CarteLycanthrope} instance : retourtne l'instance de la classe CarteLycanthrope
	 */
	public final static CarteLycanthrope getInstance() {
		return CarteLycanthropeHolder.instance;
	}
	
	/* ---------- M�thodes ---------- */ 	
	/**
	 * Impl�mentation de la m�thode appliquerEffet
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