package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteShaman decrit le comportement general de la carte Shaman
 */
public class CarteShaman extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteShaman() {
		super("Shaman");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteShaman(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 3, "Shaman");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteShamanHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteShaman instance = new CarteShaman(new Dogme[]{Dogme.NATURE, Dogme.SYMBOLES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteShaman
	 * @return {CarteShaman} instance : retourtne l'instance de la classe CarteShaman
	 */
	public final static CarteShaman getInstance() {
		return CarteShamanHolder.instance;
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
