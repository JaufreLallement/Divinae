package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteIllusionniste decrit le comportement general de la carte Illusionnistes
 */
public class CarteIllusionniste extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private CarteIllusionniste() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private CarteIllusionniste(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 4);
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteIllusionnisteHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteIllusionniste instance = new CarteIllusionniste(new Dogme[]{Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe CartePillard
	 * @return {CartePillard} instance : retourtne l'instance de la classe CartePillard
	 */
	public final static CarteIllusionniste getInstance() {
		return CarteIllusionnisteHolder.instance;
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
