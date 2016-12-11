package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * @author alexis
 * La classe CarteDevin decrit le comportement de la carte Devin
 */

public class CarteDevin extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private CarteDevin() {
		super("Devin");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteDevin(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 1, "Devin");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteDevinHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteDevin instance = new CarteDevin(new Dogme[]{Dogme.NATURE, Dogme.MYSTIQUES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe CarteDevin
	 * @return {CarteDevin} instance : retourtne l'instance de la classe CarteDevin
	 */
	public final static CarteDevin getInstance() {
		return CarteDevinHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
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
