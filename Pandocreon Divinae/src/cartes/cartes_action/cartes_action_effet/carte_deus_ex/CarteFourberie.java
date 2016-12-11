package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/**
 * @author alexis
 * @author Lallement
 * La classe CarteFourberie decrit le comportement de la carte Fourberie
 */
public class CarteFourberie extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine à attribuer à la carte nouvellement creee
	 */
	private CarteFourberie(Origine origine) {
		super (origine, "Fourberie");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteFourberieHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteFourberie instance = new CarteFourberie(Origine.NUIT);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteFourberie
	 * @return {CarteFourberie} instance : instance unique de la classe
	 */
	public final static CarteFourberie getInstance() {
		return CarteFourberieHolder.instance;
	}	
	
	/* ---------- Methodes ---------- */
	/**
	 * Implémentation de la methode appliquerEffet 
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant à la carte
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
