package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/** 
 * @author alexis
 * @author Lallement
 * La classe CarteDiversion decrit le comportement de la carte Diversion
 */
public class CarteDiversion extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	private CarteDiversion(Origine origine) {
		super (origine, "Diversion");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteDiversionHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteDiversion instance = new CarteDiversion(Origine.NUIT);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteDiversion
	 * @return {CarteDiversion} instance : instance unique de la classe
	 */
	public final static CarteDiversion getInstance() {
		return CarteDiversionHolder.instance;
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
	 * M�thode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		CarteDiversion div = CarteDiversion.getInstance();
		System.out.println(div.getOrigineCarte());
	}

}
