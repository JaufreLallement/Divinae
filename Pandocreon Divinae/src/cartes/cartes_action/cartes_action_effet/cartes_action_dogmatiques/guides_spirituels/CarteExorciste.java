package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * @author alexis
 * La classe CarteExorciste decrit le comportement de la carte Exorciste
 */
public class CarteExorciste extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteExorciste() {
		super("Exorciste");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteExorciste(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 1, "Exorciste");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privee, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteExorcisteHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteExorciste instance = new CarteExorciste(new Dogme[]{Dogme.MYSTIQUES, Dogme.CHAOS});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteExorciste
	 * @return {CarteExorciste} instance : retourtne l'instance de la classe CarteExorciste
	 */
	public final static CarteExorciste getInstance() {
		return CarteExorcisteHolder.instance;
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
