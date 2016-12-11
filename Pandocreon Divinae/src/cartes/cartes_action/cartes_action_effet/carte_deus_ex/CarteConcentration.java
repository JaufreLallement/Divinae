package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/**
 * @author alexis
 * @author Lallement
 * La classe Concentration decrit le comportement de la carte Concentration
*/

public class CarteConcentration extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	private CarteConcentration(Origine origine) {
		super(origine, "Concentration");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteConcentrationHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteConcentration instance = new CarteConcentration(Origine.NEANT);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteConcentration
	 * @return {CarteConcentration} instance : instance unique de la classe
	 */
	public final static CarteConcentration getInstance() {
		return CarteConcentrationHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Impl�mentation de la methode appliquerEffet 
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		CarteConcentration conc = CarteConcentration.getInstance();
		System.out.println(conc.getOrigineCarte());
	}

}
