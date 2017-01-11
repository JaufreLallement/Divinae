/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteMessie decrit le comportement de la carte Messie
 */
public class CarteMessie extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private CarteMessie() {
		super("Messie");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteMessie(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 3, "Messie");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privee, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteMessieHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteMessie instance = new CarteMessie(new Dogme[]{Dogme.HUMAIN, Dogme.MYSTIQUES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe CarteMessie
	 * @return {CarteMessie} instance : retourtne l'instance de la classe CarteMessie
	 */
	public final static CarteMessie getInstance() {
		return CarteMessieHolder.instance;
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
