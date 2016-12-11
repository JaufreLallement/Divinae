package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteRevenant decrit le comportement de la carte Revenant
 */
public class CarteRevenant extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteRevenant() {
		super("Revenant");
	}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private CarteRevenant(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 1, "Revenant");
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteRevenantHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteRevenant instance = new CarteRevenant(new Dogme[]{Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CarteRevenant
	 * @return {CarteRevenant} instance : retourtne l'instance de la classe CarteRevenant
	 */
	public final static CarteRevenant getInstance() {
		return CarteRevenantHolder.instance;
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
