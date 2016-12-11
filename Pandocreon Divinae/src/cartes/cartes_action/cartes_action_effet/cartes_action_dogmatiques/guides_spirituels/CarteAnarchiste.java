package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteAnarchiste decrit le comportement de la carte Anarchiste
 */
public class CarteAnarchiste extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private CarteAnarchiste() {
		super("Anarchiste");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteAnarchiste(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 3, "Anarchiste");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteAnarchisteHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteAnarchiste instance = new CarteAnarchiste(new Dogme[]{Dogme.HUMAIN, Dogme.CHAOS});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe CarteAnarchiste
	 * @return {CarteAnarchiste} instance : retourtne l'instance de la classe CarteAnarchiste
	 */
	public final static CarteAnarchiste getInstance() {
		return CarteAnarchisteHolder.instance;
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
