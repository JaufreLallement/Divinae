package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author alexis
 * @author Lallement
 * La classe CarteAscete decrit le comportement general de la carte Ascete
 */
public class CarteAscete extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteAscete() {
		super("Ascete");
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	private CarteAscete(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 1, "Ascete");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteAsceteHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteAscete instance = new CarteAscete(new Dogme[]{Dogme.HUMAIN, Dogme.SYMBOLES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteAscete
	 * @return {CarteAscete} instance : retourtne l'instance de la classe CarteAscete
	 */
	public final static CarteAscete getInstance() {
		return CarteAsceteHolder.instance;
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
