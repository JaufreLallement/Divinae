package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CartePaladin decrit le comportement de la carte Paladin
 */
public class CartePaladin extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CartePaladin() {
		super("Paladin");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CartePaladin(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 3, "Paladin");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CartePaladinHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CartePaladin instance = new CartePaladin(new Dogme[]{Dogme.HUMAIN, Dogme.MYSTIQUES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CartePaladin
	 * @return {CartePaladin} instance : retourtne l'instance de la classe CartePaladin
	 */
	public final static CartePaladin getInstance() {
		return CartePaladinHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
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
